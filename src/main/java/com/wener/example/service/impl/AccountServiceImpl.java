package com.wener.example.service.impl;

import com.wener.example.annotations.User;
import com.wener.example.service.AccountService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author zhangwei
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Override
    public User login(String username, String password) {
        return null;
    }
}
