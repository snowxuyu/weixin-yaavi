package com.weixin.yaavi.job;


import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by snow on 2015/8/28.
 */
@Component
public class WeixinQuartzjob {
    @Resource
    private RefrushAccessTokenTask refrushAccessTokenTask;

    public void execute() {
        refrushAccessTokenTask.refreshToken();
    }


}
