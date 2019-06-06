package com.qianfeng.service;

import com.qianfeng.api.IUserService;

/**
 * @author huangguizhao
 */
public class UserServiceImpl implements IUserService{

    @Override
    public String hello() {
        return "hello,dubbo!";
    }
}
