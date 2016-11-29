package com.weixin.yaavi.job;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;
import com.weixin.yaavi.constants.WeiXinConstan;
import com.weixin.yaavi.entity.AccessToken;
import com.weixin.yaavi.entity.Ticket;
import com.weixin.yaavi.entity.WeixinContext;
import org.framework.common.util.HttpClientUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/**
 * Created by snow on 2015/8/28.
 * 刷新access_token
 */
@Component
public class RefrushAccessTokenTask {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void refreshToken() {
        Map<String, String> params = Maps.newHashMap();
        params.put("appid", WeiXinConstan.Biz.APPID);
        params.put("secret", WeiXinConstan.Biz.SECRET);
        params.put("grant_type", WeiXinConstan.Biz.GRANT_TYPE);

        String tokenResult = null;
        try {
            //获取token
            tokenResult = HttpClientUtils.doGet(WeiXinConstan.Biz.ACCESS_TOKEN_URL, params);
        } catch (IOException e) {
            logger.debug("获取token异常: ", e);
        }

        logger.debug("获取access_token结果 =====>> {}", tokenResult);

        AccessToken accessToken = JSONObject.parseObject(tokenResult, AccessToken.class);

        Map<String, String> map = Maps.newHashMap();
        map.put("access_token", accessToken.getAccess_token());
        map.put("type", "jsapi");
        //根据参数获取ticket
        String ticketResult = null;
        try {
            ticketResult = HttpClientUtils.doGet(WeiXinConstan.Biz.TICKET_URL, map);
        } catch (IOException e) {
            logger.debug("获取ticket异常: ", e);
        }
        logger.debug("获取ticket结果 =====>> {}", ticketResult);
        Ticket ticket = JSONObject.parseObject(ticketResult, Ticket.class);
        if ("ok".equals(ticket.getErrmsg())) {
            //当前秒数时间戳
            long current = System.currentTimeMillis()/1000;
            String currentStr = Long.toString(current);
            //随机字符串
            String random = UUID.randomUUID().toString().replace("-", "");
            WeixinContext.setJsapi_ticket(ticket.getTicket());
            WeixinContext.setNoncestr(random);
            WeixinContext.setTimestamp(currentStr);
        }
    }
}
