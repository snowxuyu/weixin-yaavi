package com.weixin.yaavi.entity;

import lombok.Data;
import org.framework.basic.entity.BaseEntity;

/**
 * Created with IntelliJ IDEA.
 * User: snowxuyu
 * Date: 2016/11/24
 * Time: 0:26
 */
@Data
public class SystemConfig extends BaseEntity {
    private String key;
    private String value;
    private String status;
}
