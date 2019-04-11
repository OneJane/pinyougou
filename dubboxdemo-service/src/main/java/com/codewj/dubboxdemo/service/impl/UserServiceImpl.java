package com.codewj.dubboxdemo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.codewj.dubboxdemo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "codewj";
    }
}
