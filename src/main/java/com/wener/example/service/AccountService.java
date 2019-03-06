package com.wener.example.service;

import com.wener.example.annotations.User;
import com.wener.example.service.impl.AccountServiceImpl;
import org.springframework.stereotype.Component;

/**
 * @author zhangwei
 */

public interface AccountService {
    public User login(String username, String password);
}
