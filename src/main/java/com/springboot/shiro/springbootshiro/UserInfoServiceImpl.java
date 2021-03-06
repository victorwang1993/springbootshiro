package com.springboot.shiro.springbootshiro;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    UserInfoDao userInfoDao;

    @Override
    public UserInfo findByUsername(String username) {
        return userInfoDao.findByUsername(username);
    }
}
