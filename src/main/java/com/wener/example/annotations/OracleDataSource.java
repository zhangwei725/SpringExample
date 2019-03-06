package com.wener.example.annotations;

import org.springframework.stereotype.Component;

/**
 * @author zhangwei
 */
@Component("oracle")
@OracleQualifier
public class OracleDataSource implements DataSource {
    @Override
    public void connection() {
        System.out.println("oracle database connecting");
    }
}
