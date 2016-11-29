package com.weixin.yaavi.service;

import com.weixin.yaavi.entity.SystemConfig;
import com.weixin.yaavi.entity.ValidParam;
import org.framework.basic.service.BaseService;

/**
 * Created with IntelliJ IDEA.
 * User: snowxuyu
 * Date: 2016/11/24
 * Time: 0:29
 */
public interface SystemConfigService extends BaseService<SystemConfig> {
    /**
     * 根据url获取参数
     * @param url
     * @return
     */
    ValidParam getParamsByUrl(String url);
}
