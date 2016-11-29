package com.weixin.yaavi.constants;

/**
 * Created with IntelliJ IDEA.
 * User: snowxuyu
 * Date: 2016/11/24
 * Time: 23:28
 */
public interface WeiXinConstan {

    public interface Biz {
        public final static String TOKEN = "yaavi"; //token

        public final static String APPID = "wx4a98822e5fa4735f"; //APPID

        public final static String SECRET = "56f082752c9fa811ab08fe43f914752c"; //SECRET

        public final static String GRANT_TYPE = "client_credential"; //grant_type

        public final static String ACCESS_TOKEN_URL = "https://api.weixin.qq.com/cgi-bin/token"; //获取token的url

        //https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=GT1gBI8ROTy0uEtmo7ttBUry4pyPvRDhDUO7F1YOf-ObD69BYu7XNZNB4CzZ8YIRTSL6KXBBcv6i-VglozpNB0Fz_K0IOcx231ZQm7HoQDntoysEPb71qMi5ra6u6uIvKFKbAFADYD&type=jsapi
        public final static String TICKET_URL = "https://api.weixin.qq.com/cgi-bin/ticket/getticket"; //获取ticket的url
    }
}
