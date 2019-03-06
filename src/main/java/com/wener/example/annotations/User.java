package com.wener.example.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;


/**
 * @author zhangwei
 */
@Component
public class User {
    private String name;
    private String password;
            @Resource
//    @Resource(name = "address")
//    @Resource(name = "address", type = Address.class)
    @Inject
    @Named("address")
            @Autowired

    private Address address1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress1() {
        return address1;
    }

    public void setAddress1(Address address1) {
        this.address1 = address1;
    }

    //    @Resource
//    public void initAddress(Address address, String name) {
//        this.address = address;
//        this.name = name;
//    }

//    @Resource
//    public void setAddress(Address address, String name) {
//        this.address = address;
//        this.name = name;
//    }
}