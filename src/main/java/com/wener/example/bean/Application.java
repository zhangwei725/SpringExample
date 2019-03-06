package com.wener.example.bean;

import com.wener.example.annotations.User;

/**
 * @author zhangwei
 */

public class Application {
    public static final Integer ERROR = -1;

    private User user;

    public Application() {
    }

    public Application(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
