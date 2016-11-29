package com.weixin.yaavi.service.impl;

import com.google.common.collect.Maps;
import com.weixin.yaavi.entity.SystemConfig;
import com.weixin.yaavi.entity.ValidParam;
import com.weixin.yaavi.entity.WeixinContext;
import com.weixin.yaavi.service.SystemConfigService;
import com.weixin.yaavi.util.SecurityUtils;
import org.framework.basic.service.impl.BaseServiceImpl;
import org.framework.common.crypto.Tools;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: snowxuyu
 * Date: 2016/11/24
 * Time: 0:30
 */
@Service
public class SystemConfigServiceImpl extends BaseServiceImpl<SystemConfig> implements SystemConfigService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public ValidParam getParamsByUrl(String url) {
        logger.debug("根据url获取参数=====>> url:{}", url);
        Map<String, String> params = Maps.newHashMap();
        String jsapi_ticket = WeixinContext.getJsapi_ticket();
        String noncestr = WeixinContext.getNoncestr();
        String timestamp = WeixinContext.getTimestamp();
        if (!StringUtils.isEmpty(jsapi_ticket) && !StringUtils.isEmpty(noncestr) && !StringUtils.isEmpty(timestamp)) {
            params.put("jsapi_ticket", jsapi_ticket);
            params.put("noncestr", noncestr);
            params.put("timestamp", timestamp);
            params.put("url", url);

            String linkString = Tools.createLinkString(params);
            logger.debug("------------linkString----------: {}", linkString);
            String signature = SecurityUtils.shal(linkString);

            ValidParam validParam = new ValidParam();
            validParam.setNonceStr(noncestr);
            validParam.setSignature(signature);
            validParam.setTimestamp(Long.valueOf(timestamp));
            return validParam;
        }
        return null;
    }
}
