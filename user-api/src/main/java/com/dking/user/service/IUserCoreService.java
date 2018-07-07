package com.dking.user.service;

import com.dking.user.dto.UserLoginRequest;
import com.dking.user.dto.UserLoginResponse;

/**
 * 会员鉴权核心接口
 *
 * Created by xinfei on 2018/7/4.
 */
public interface IUserCoreService {

    /**
     * 用户登录
     *
     * @param loginRequest
     * @return
     */
    UserLoginResponse login(UserLoginRequest loginRequest);




}
