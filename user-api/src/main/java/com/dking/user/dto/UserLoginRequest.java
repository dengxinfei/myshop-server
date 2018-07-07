package com.dking.user.dto;

import java.io.Serializable;

/**
 * 登录请求对象
 *
 * Created by xinfei on 2018/7/4.
 */
public class UserLoginRequest implements Serializable{
    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "UserLoginRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
