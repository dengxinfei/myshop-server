package com.dking.user.common;

import java.io.Serializable;

/**
 * 通用的返回信息
 *
 * Created by xinfei on 2018/7/4.
 */
public class CommonResponse implements Serializable {

    private String code;

    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
