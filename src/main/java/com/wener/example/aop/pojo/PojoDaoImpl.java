package com.wener.example.aop.pojo;


import org.aspectj.lang.annotation.Before;

import javax.crypto.interfaces.PBEKey;

/**
 * @author zhangwei
 */
public class PojoDaoImpl implements PojoDao {

    @Override
    public void test() {
        System.out.println("核心测试方法");
    }


}