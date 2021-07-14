package com.f5.greenfarm.config;

import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 支付宝配置信息
 * @author linhongcun
 *
 */
public class AlipayConfig {

    //开发者中心 / 研发服务 / 沙箱环境 / 沙箱应用/ 信息配置/ 必看部分/ APPID（填自己的，下面都是改过的~）
    public static String app_id = "2016101300678418";

    //开发者中心 / 研发服务 / 沙箱环境 / 沙箱应用/ 信息配置/ 必看部分/ 生成公钥时对应的私钥（填自己的，下面都是改过的~）
   // public static String private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCPJB+nBrc9ahEXeZ596lxQuGCQEPVQSUWVCadVi862pifc2q7TLRD/tHF3d+MOy/XMBzFtKsgTCy+Q576nEA3lJGzxIBqDjYy4CHAB6TAgIbiZZ1Rsr8MUrbnXWfKjBTWVYIL85Q/onYOWw8pSwcU5ikP8YIMDHISruHbdvAcjwO1gV9JyE4U8s2Yl1v0RqVKGxReSv+vajuiEoG+xJy9z0whKtk/SJuyoEj8siiyn4sk058YWaMOOjJ/ar1qESCpZGHxEZd1vRCidGsO/cEiDfEDvwLZdn8lejTWqnnGNBs7MMMA9U7QJRlxTKX8wMpNcebGs/t7R7J38CeMZeNtBAgMBAAECggEAGiuSlekGa3YO9enIbmEAy8lJ7k0LbMhYrmz7aQqMmpw6QYjB2d4tc3K8JAmJO9VSdSEDil/+AG1VHvsfwk+PGsvUFym1b0Pb7HGueMr3f4hqxbE8oDpqQkeY6KSLVf7H0y24BSCkDfVub4wQW50Nv/1lfKjwiwsVvoeVQ+jyrTh8rYEF7sIA42VmhbHh9yjm8Qm7wC3Jb5X0SxnVC5ayStWpgBLy8oaBrdSRHR8KEeTUvlyhZG8rcWrlJ2o1nRTJa8bXJhQAG9aRP4CErf/8jWFgE75Afocf7td2EjNlmUMlSZ7Pf+Gd1Rmn702cKVlK+wcnhVtbVQOJb90w0AscOQKBgQDBeYQIYt3u+xrShnn4U7Q6NNUR6Q3J+hVpYH00TaenuTjKfsgRpGf0t4l/LNziv7ezmekzJwdKcEv+/a0dxKA9tJFEjjsWp9t724QVNwdVW3RN4zvNdGAdecKkovSt0K4YdqYR4KD09mptc9mmoE8G7UxPBiHD8aY6aHrnh3QODwKBgQC9Zm2A/pai1PfeNP9yBmkFeiIAESgptcHBx1LfqHicP+xnznwhQt3bxddE2vfJI6FZeqkeIRCLLkTulX21DQhmU+6xFw5QVSzUHBjr1yYFi0vRRIg83ERGyx9+61gRUhoZlNLqNo78oiVzXCNf6aKXPQIsPp/mWh/hAQV17MfRrwKBgAv3DOBL5PfDlbwRTve5jXrQC6FI7W5hRfO3YObcKpMn1EhJoOveZANxWlKAHsTzIFQ+H3rnXf8PhNOnMo6Vu2c1hIpd1W+oP92gDMIXHh/8QOwUMn2ZRdxszEnMPh+FuU6P/+M5JhsgJiLQuFQis+B0ynRUp7/rcOFJ1tf8u4OnAoGARYbmR+YtchTv8NhPtZH415PgC1pA/h7Ew9fh6ky0CdfFds3r72HWg6j6v0IKmAHGZ0yJ7I+CvTT9BQBHp0DjhnzlMIkgLgk2bZ7q3xiZ0osyB946jOzm+33xT+wg5irXffCOBICGuOLlEJYQPlNL5mz08T0EAdGvxi9Ty9hh+e0CgYA7D7MyrIyxXzge73CgomWnRY/YrqMjv1duj6TdbBb8gjEXXHWDeAa45VvS38E5pNG8evYzWHK62iB/712pVX+D07vFFLwJ2DVH47bPoDJOjZ0S4ApKWfps9rE0YP0sw0ArZIWPt8FD5gjS5l7sYpia9XWpwrxGRu0qjYxALp9YrQ==";
    public static String private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCGam2laSAE1qPtz94zD2tjE7I8xAd/uMGgW9WEfvNbDdS7JVlU76n6pxk21JNTic3OGa1WSu/9uRVedaW+Y0796+cunwQnSMdmuokJ79jLEUgF5Om0keSDSXglrwbLfrZ0l+XntV/9oD/bOr1gwGUCpHMUjzmvrQ+s78FhDtUz6PdTgZItsYDuVoekhPYk51+ELM+dak4L+9NEz0GUrS13aCrLz3GulDDWScAJ3gytEevcNgLFXqT6pCr9SeCspNIZ0s7Q4QULWJE10tUKmaQRfeIJ/HykASv78CiPVjfSrZoYF2gjJ7gqPRs/dOqK2ZeiKvKoj8OXmZ1Vlrdr4AP7AgMBAAECggEAaTBqpBKzqvWqDdYpZj3/5OYqCuHBmJMme+7CFlEe8rfNLbOZyB1SIUSZN859iNeDxnFTs/8q9pzb+zMIRQkEbTQqk9J/dpq+6Ua7LZqURr48ZdhxiAzQDmn1a1AgeimscWvZ0E2hVCMPNeou/8MwiTPWl1VKaI9/f++UnvbzpA3c2nQKW/GIVte4vaWLi4Q4qYGPQIUuAGuDCDCJEBdRedAi+6Vtvg6DnF90iIq28CYEHmuUv5poMPjG+1bo9EDwBHYickoD91zK3OZFnZezWjtbNXGTdlCIGAvZMp2on+GaFXwI+g5f0izxGYzn12n90M58D7T7bEbOmFfQAmAceQKBgQDRf3RzbX9vEFF2r5rLDLMvoZJ/63bxUzmRa+IkzxL+JJlgQHzsDYbcioOmP+U2BURARgcB3FAt3z1Qz0OjYZHEu+0goMVPzTkxYJLVVKd6sLWo/TWg47cB44WzvH/LnueEPffPcDQoY8PqG/ZgR7TmyBiwTRqYG81Nw5EQoAKpTQKBgQCkQH4ViBEGR7MtbnTufLqteR7zvvdjQznYxHVKK+52vIj50KMz9JlMUKuQ+LD/iB4SgnQhWCbmV1SA8NqWTmJkG36H+cnJMR7wX7qgv22h0ZjNHUPNM48R/5kqbsNrM4Sgc3tz/a7DnpPPcnrk8lOUeyavZqiP13264JdunGJ+ZwKBgFGv0uZXIcNap4kRu9fEofHGnGsIkx5SBzZuzITxwUQbXTqsqokYVSeVUvP2IhfIQe6V35GYKCNa0nu59XO1TbNaW4HHbmhJay2XrGlGUu+CC7NS2CBd6jPwVWfZ7jKlSTzFNOVLqOq+y9ty/8RW8XCzQP0tc1swLANQaDYFTkRZAoGAKJx5kEFQVEkuGDGTX9QfI/0qlgHFkRlyGBKbHXe3QkxjYcEgWRxFOwVHJlUXDldNeC4hII13MMSu9CKZKUjAMxhJNL2iEsi+aZiBwHUUWkpEiZKOzRHOchjMeh1g3ASk6jcjcw5qQ5vV2BjqIel4mOHKMtwjGU2inK4jQwoPoEkCgYEApIT51gYEXwY30CslKPnh27lxLSRtfONIDp5efEWXgA1v2Ta7Pq8+UQQYdzMHgssIVjbEGwmKF2HK6bsEyIUkjOJ3N3MC/esdUl+Bb7eZebOLbwL01j4WTth5cLliuLHgiSgFS0PPYt9apxnRNLKltQ6sZKwG0yXzEa/hNlw3/u4=";

    //Controller Mapping:得放到服务器上，且使用域名解析 IP
    public static String notify_url = "http://localhost:8080/alipay/notifyUrl";

    //Controller Mapping:得放到服务器上，且使用域名解析 IP
    public static String return_url = "http://localhost:8080/alipay/returnUrl";

    //开发者中心 / 研发服务 / 沙箱环境 / 沙箱应用/ 信息配置/ 必看部分/ 支付宝网关（注意沙箱alipaydev，正式则为 alipay）
    public static String url = "https://openapi.alipaydev.com/gateway.do";

    public static String charset = "UTF-8";

    public static String format = "json";

    //开发者中心 / 研发服务 / 沙箱环境 / 沙箱应用/ 信息配置/ 必看部分/ 公钥（填自己的，下面都是改过的~）
    //public static String public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmxWY84ghJ8a0JQhCa/Oh5qcyK0lNHM9da1FehT+lvb8HpY4sTjgvcEF0ll+ELFrYCgrgCxZsbDmw81jml3OZB78UUKoUa/McaRwdkQYbMpn+Xb499pTJ7zP+Cx7GVC4RuNYnKp9wl2ZL2w02LAG7fsEikXw3rg5yCPSZr8gA1rG6R2mgKzLc0o0U/1XGPQckMbKs0j+lpy8NDNgnJwOXRHIA9RfCWEItmmwb2TBEGP1Yb7cmK4XavhxaBeTFmCJuKPlVUPz1NuvocbiZDfVielfvuq08bCwwqO4jCW22LaQAhVKoujOBGNdC0ZLcOa5NujiougMNrjBuK8PxIjJhOQIDAQAB";
    public static String public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuXi9l63mpB6uZSXK+Qpl3db3py2bS2l8Xpt5AEhkWSIjjIJhNCXD+zxRisl32lIm5dzYadtnKyTHkaTQ6rN4m6qwTdRFk9HKdhLfDIygxTU3rF6LdmRO2ypFXO8eriM6pQmcSHDsmekhCEKALyZX+LtSoS3MbLqOFtalsIrsVYbgKma7RZ5/5NLlUCl40ywYB/7mPQYZUlzvm+Eo+cY7QFBspSI7agu3cjEXg/GPrYoN4k6JNei2d1aUUNQVVuKLai0IfJZPrTZrLgobZd3xY/0HJ/YNEEwWMp4WD5LmpKNegyk0ypmAbXBo+PCxiKPOX5+yqCWha+WxQyrRjHWjUQIDAQAB";

    public static String signtype = "RSA2";

}

/*@Component
public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号 按照我文章图上的信息填写
    public static String app_id = "2016101300678418";

    // 商户私钥，您的PKCS8格式RSA2私钥  刚刚生成的私钥直接复制填写
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCGam2laSAE1qPtz94zD2tjE7I8xAd/uMGgW9WEfvNbDdS7JVlU76n6pxk21JNTic3OGa1WSu/9uRVedaW+Y0796+cunwQnSMdmuokJ79jLEUgF5Om0keSDSXglrwbLfrZ0l+XntV/9oD/bOr1gwGUCpHMUjzmvrQ+s78FhDtUz6PdTgZItsYDuVoekhPYk51+ELM+dak4L+9NEz0GUrS13aCrLz3GulDDWScAJ3gytEevcNgLFXqT6pCr9SeCspNIZ0s7Q4QULWJE10tUKmaQRfeIJ/HykASv78CiPVjfSrZoYF2gjJ7gqPRs/dOqK2ZeiKvKoj8OXmZ1Vlrdr4AP7AgMBAAECggEAaTBqpBKzqvWqDdYpZj3/5OYqCuHBmJMme+7CFlEe8rfNLbOZyB1SIUSZN859iNeDxnFTs/8q9pzb+zMIRQkEbTQqk9J/dpq+6Ua7LZqURr48ZdhxiAzQDmn1a1AgeimscWvZ0E2hVCMPNeou/8MwiTPWl1VKaI9/f++UnvbzpA3c2nQKW/GIVte4vaWLi4Q4qYGPQIUuAGuDCDCJEBdRedAi+6Vtvg6DnF90iIq28CYEHmuUv5poMPjG+1bo9EDwBHYickoD91zK3OZFnZezWjtbNXGTdlCIGAvZMp2on+GaFXwI+g5f0izxGYzn12n90M58D7T7bEbOmFfQAmAceQKBgQDRf3RzbX9vEFF2r5rLDLMvoZJ/63bxUzmRa+IkzxL+JJlgQHzsDYbcioOmP+U2BURARgcB3FAt3z1Qz0OjYZHEu+0goMVPzTkxYJLVVKd6sLWo/TWg47cB44WzvH/LnueEPffPcDQoY8PqG/ZgR7TmyBiwTRqYG81Nw5EQoAKpTQKBgQCkQH4ViBEGR7MtbnTufLqteR7zvvdjQznYxHVKK+52vIj50KMz9JlMUKuQ+LD/iB4SgnQhWCbmV1SA8NqWTmJkG36H+cnJMR7wX7qgv22h0ZjNHUPNM48R/5kqbsNrM4Sgc3tz/a7DnpPPcnrk8lOUeyavZqiP13264JdunGJ+ZwKBgFGv0uZXIcNap4kRu9fEofHGnGsIkx5SBzZuzITxwUQbXTqsqokYVSeVUvP2IhfIQe6V35GYKCNa0nu59XO1TbNaW4HHbmhJay2XrGlGUu+CC7NS2CBd6jPwVWfZ7jKlSTzFNOVLqOq+y9ty/8RW8XCzQP0tc1swLANQaDYFTkRZAoGAKJx5kEFQVEkuGDGTX9QfI/0qlgHFkRlyGBKbHXe3QkxjYcEgWRxFOwVHJlUXDldNeC4hII13MMSu9CKZKUjAMxhJNL2iEsi+aZiBwHUUWkpEiZKOzRHOchjMeh1g3ASk6jcjcw5qQ5vV2BjqIel4mOHKMtwjGU2inK4jQwoPoEkCgYEApIT51gYEXwY30CslKPnh27lxLSRtfONIDp5efEWXgA1v2Ta7Pq8+UQQYdzMHgssIVjbEGwmKF2HK6bsEyIUkjOJ3N3MC/esdUl+Bb7eZebOLbwL01j4WTth5cLliuLHgiSgFS0PPYt9apxnRNLKltQ6sZKwG0yXzEa/hNlw3/u4=";

    // 支付宝公钥,对应APPID下的支付宝公钥。 按照我文章图上的信息填写支付宝公钥，别填成商户公钥
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuXi9l63mpB6uZSXK+Qpl3db3py2bS2l8Xpt5AEhkWSIjjIJhNCXD+zxRisl32lIm5dzYadtnKyTHkaTQ6rN4m6qwTdRFk9HKdhLfDIygxTU3rF6LdmRO2ypFXO8eriM6pQmcSHDsmekhCEKALyZX+LtSoS3MbLqOFtalsIrsVYbgKma7RZ5/5NLlUCl40ywYB/7mPQYZUlzvm+Eo+cY7QFBspSI7agu3cjEXg/GPrYoN4k6JNei2d1aUUNQVVuKLai0IfJZPrTZrLgobZd3xY/0HJ/YNEEwWMp4WD5LmpKNegyk0ypmAbXBo+PCxiKPOX5+yqCWha+WxQyrRjHWjUQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，其实就是你的一个支付完成后返回的页面URL
    public static String notify_url = "http://localhost:8080/alipay/notifyurl";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，其实就是你的一个支付完成后返回的页面URL
    public static String return_url = "http://localhost:8080/orders/addOrders";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "F:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    *//**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     *//*
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}*/



