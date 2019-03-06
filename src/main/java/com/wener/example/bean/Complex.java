package com.wener.example.bean;

import com.wener.example.annotations.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Complex {
    private List<Object> list;
    private Map<String, Object> map;
    private Set<String> set;
    private Properties properties;
    private String[] array;
    private User[] users;

    public void setUsers(User[] users) {
        this.users = users;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
