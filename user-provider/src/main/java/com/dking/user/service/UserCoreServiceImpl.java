package com.dking.user.service;

import org.springframework.stereotype.Service;
import com.dking.user.dto.UserLoginRequest;
import com.dking.user.dto.UserLoginResponse;

/**
 *
 *
 * Created by xinfei on 2018/7/4.
 */
@Service("userCoreServiceImpl")
public class UserCoreServiceImpl implements IUserCoreService{


    @Override
    public UserLoginResponse login(UserLoginRequest loginRequest) {
        return null;
    }
}
