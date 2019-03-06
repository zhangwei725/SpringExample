package com.wener.example.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author zhangwei
 */
@Component
public class DataSourceManager {
    //    @Autowired
//    @Qualifier("oracle")

    @Autowired()
    @MysqlQualifier
    private DataSource dataSource;

//    @Autowired
//    public DataSourceManager(@Qualifier("oracle") DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

    // 在方法上使用
//    @Autowired()

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public DataSource getDataSource() {
        return dataSource;
    }
}
