package com.f5.greenfarm.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import com.f5.greenfarm.config.AlipayConfig;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.f5.greenfarm.entity.Goods;
import com.f5.greenfarm.entity.Order;
import com.f5.greenfarm.service.OrderService;
import com.f5.greenfarm.service.SellerService;
import com.f5.greenfarm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradePayModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;


/**
 * 支付宝支付Controller
 * @author linhongcun
 *
 */
@Controller
@RequestMapping("/alipay")
public class AlipayController {

    // 获取配置文件的信息
    String app_id = AlipayConfig.app_id;
    String private_key = AlipayConfig.private_key;
    String notify_url = AlipayConfig.notify_url;
    String return_url = AlipayConfig.return_url;
    String url = AlipayConfig.url;
    String charset = AlipayConfig.charset;
    String format = AlipayConfig.format;
    String public_key = AlipayConfig.public_key;
    String signtype = AlipayConfig.signtype;
    @Resource
    private UserService userService;
    @Resource
    private OrderService orderService;
    @Resource
    private SellerService sellerService;
   /* @Resource
    private ProduceServiceInter produceServiceInter;*/

    @RequestMapping("/pay")
    public void pay(HttpSession session,HttpServletRequest request, HttpServletResponse response, int order_id) throws Exception {
        System.out.println(order_id);
        Order order = orderService.selOrderByOrderId(order_id);
        Goods goods = sellerService.selGoodsById(order.getGoods_id());
       // System.out.println(order.toString());
        //System.out.println(goods.toString());
        session.setAttribute("order_id", order_id);
        // 模拟从前台传来的数据
        String orderNo = ""+order_id;
        String totle_price = ""+order.getGoods_price();// 支付总金额
        String subject = order.getUser_name(); // 订单名称
        String body = goods.getDescription();// 商品描述
        // 封装请求客户端
        AlipayClient client = new DefaultAlipayClient(url, app_id, private_key, format, charset, public_key, signtype);
        // 支付请求
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(return_url);
        alipayRequest.setNotifyUrl(notify_url);
        AlipayTradePayModel model = new AlipayTradePayModel();
        model.setProductCode("FAST_INSTANT_TRADE_PAY"); // 设置销售产品码
        model.setOutTradeNo(orderNo); // 设置订单号
        model.setSubject(subject); // 订单名称
        model.setTotalAmount(totle_price); // 支付总金额
        model.setBody(body); // 设置商品描述
        alipayRequest.setBizModel(model);

        String form = client.pageExecute(alipayRequest).getBody(); // 生成表单

        response.setContentType("text/html;charset=" + charset);
        response.getWriter().write(form); // 直接将完整的表单html输出到页面
        response.getWriter().flush();
        response.getWriter().close();
    }

    /**
     * 同步跳转
     *
     * @param request
     * @throws Exception
     */
    @RequestMapping("/returnUrl")
    public ModelAndView returnUrl(HttpSession session,HttpServletRequest request) throws Exception {
        ModelAndView mav = new ModelAndView();

        // 获取支付宝GET过来反馈信息（官方固定代码）
        Map<String, String> params = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
            }
            params.put(name, valueStr);
        }
        boolean signVerified = AlipaySignature.rsaCheckV1(params, public_key, charset, signtype); // 调用SDK验证签名

        // 返回界面
        if (signVerified) {
            System.out.println("前往支付成功页面");
            int order_id= (int) session.getAttribute("order_id");
            //String ProOrd_id_suc="已付款";
            orderService.delOrderById(order_id);//支付完成删除订单
            //proOrdServiceInter.update_ProOrdType(ProOrd_id,ProOrd_id_suc);
            mav.setViewName("User/successReturn");
        } else {
            System.out.println("前往支付失败页面");
            mav.setViewName("User/successReturn");
        }
        return mav;
    }

    /**
     * 支付宝服务器异步通知
     *
     * @param request
     * @throws Exception
     */
    @RequestMapping("/notifyUrl")
    public void notifyUrl(HttpServletRequest request) throws Exception {
        // 获取支付宝GET过来反馈信息
        Map<String, String> params = new HashMap<String, String>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
            }
            params.put(name, valueStr);
        }

        boolean signVerified = AlipaySignature.rsaCheckV1(params, public_key, charset, signtype); // 调用SDK验证签名

        if (signVerified) { // 验证成功 更新订单信息
            System.out.println("异步通知成功");
            // 商户订单号
            String out_trade_no = request.getParameter("out_trade_no");
            System.out.println(out_trade_no);
            // 交易状态
            String trade_status = request.getParameter("trade_status");
            System.out.println(trade_status);
            // 修改数据库
        } else {
            System.out.println("异步通知失败");
        }
    }

}


