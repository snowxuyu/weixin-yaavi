package com.weixin.yaavi.entity;

import com.weixin.yaavi.constants.WeiXinConstan;
import lombok.Data;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: snowxuyu  返回所需的验证参数
 * Date: 2016/11/25
 * Time: 1:24
 */
@Data
public class ValidParam implements Serializable {

    private String appId = WeiXinConstan.Biz.APPID;

    private String signature;

    private String nonceStr;

    private Long timestamp;
}
