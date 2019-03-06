package com.wener.example.annotations;

import org.springframework.stereotype.Component;

/**
 * @author zhangwei
 */
@Component("mysql")
@MysqlQualifier
public class MysqlDataSource implements DataSource {
    @Override
    public void connection() {
        System.out.println("mysql database connecting");
    }
}
