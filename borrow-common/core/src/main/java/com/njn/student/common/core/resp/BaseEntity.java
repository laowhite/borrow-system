package com.njn.student.common.core.resp;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @Description:
 * @CreateTime: 2022-08-12 12:56
 */
public abstract class BaseEntity implements Serializable {

    /**
     * @Fields serialVersionUID : 默认序列化id
     */
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }

}
