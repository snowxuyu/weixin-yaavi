package com.weixin.yaavi.entity;

/**
 * Created with IntelliJ IDEA.
 * User: snowxuyu
 * Date: 2016/11/25
 * Time: 0:04
 */
public class WeixinContext {

    private static String jsapi_ticket;
    private static String noncestr;
    private static String timestamp;

    public static String getJsapi_ticket() {
        return jsapi_ticket;
    }

    public static void setJsapi_ticket(String jsapi_ticket) {
        WeixinContext.jsapi_ticket = jsapi_ticket;
    }

    public static String getNoncestr() {
        return noncestr;
    }

    public static void setNoncestr(String noncestr) {
        WeixinContext.noncestr = noncestr;
    }

    public static String getTimestamp() {
        return timestamp;
    }

    public static void setTimestamp(String timestamp) {
        WeixinContext.timestamp = timestamp;
    }
}
