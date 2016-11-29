package com.weixin.yaavi.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: snowxuyu    获取token返回结果的存储对象
 * Date: 2016/11/24
 * Time: 23:45
 */
@Data
public class AccessToken implements Serializable {
    private String access_token;
    private String expires_in;
}
