package com.dking.user.dto;


import com.dking.user.common.CommonResponse;

/**
 * 登录请求响应对象
 *
 * Created by xinfei on 2018/7/4.
 */
public class UserLoginResponse extends CommonResponse {

    private Integer uid;
    private String avatar;
    private String mobile;

    private String token;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "UserLoginResponse{" +
                "uid=" + uid +
                ", avatar='" + avatar + '\'' +
                ", mobile='" + mobile + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
