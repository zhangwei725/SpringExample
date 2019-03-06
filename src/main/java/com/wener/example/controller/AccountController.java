package com.wener.example.controller;


import com.wener.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author zhangwei
 */
@Controller()
public class AccountController {

    @Autowired
    AccountService accountService;

}
