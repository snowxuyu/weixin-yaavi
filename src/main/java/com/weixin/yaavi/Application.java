package com.weixin.yaavi;

import org.framework.basic.server.NettyServerBootstrap;

/**
 * Created with IntelliJ IDEA.
 * User: snowxuyu
 * Date: 2016/11/30
 * Time: 1:25
 */
public class Application {
    public static void main(String[] args){
        // 创建->设置application父容器->设置springmvc子容器->设置server参数->启动
        NettyServerBootstrap.createServer()
                .setSpringApplicationContext("classpath:/springs/applicationContext.xml")
                .setSpringServletContext("classpath:/springs/springmvc-servlet.xml")
                .parseCommondArguments(args)
                .start();
    }
}
