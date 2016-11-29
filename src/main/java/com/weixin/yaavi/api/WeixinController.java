package com.weixin.yaavi.api;

import com.weixin.yaavi.entity.ValidParam;
import com.weixin.yaavi.service.SystemConfigService;
import org.framework.basic.system.BaseResponse;
import org.framework.basic.system.ResponseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * Created with IntelliJ IDEA.
 * User: snowxuyu
 * Date: 2016/11/24
 * Time: 0:31
 */
@RestController
@RequestMapping(value = "/openapi")
public class WeixinController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private SystemConfigService systemConfigService;

    /**
     * 获取参数
     * @param url
     * @return
     */
    @RequestMapping(value = "/getParamsByUrl", method = RequestMethod.GET)
    public ResponseEntity getParamsByUrl(@RequestParam(value = "url", required = true) String url) {
        logger.debug("获取参数的url=====>> url:{}", url);
        ValidParam validParam = null;
        try {
            validParam = systemConfigService.getParamsByUrl(url);
            if (validParam != null) {
                return BaseResponse.buildSuccess(validParam, "请求成功");
            }
            return BaseResponse.buildError("请求失败，获取ticket失败", "412");
        } catch (Exception e) {
            logger.debug("获取验证参数异常 =====>> {}", e);
            return BaseResponse.buildError(e.getMessage());
        }
    }


}
