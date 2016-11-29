package com.weixin.yaavi.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: snowxuyu   获取ticket返回结果的存储对象
 * Date: 2016/11/25
 * Time: 1:04
 */
@Data
public class Ticket implements Serializable {
    private Integer errcode;
    private String errmsg;
    private String ticket;
    private String expires_in;
}
