package com.buba;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = {"com.buba.java2012a.liumaoxiang.dao",
        "com.buba.java2012a.liumaoxiang.service"})
public class LmxApplication {

    public static void main(String[] args) {
        SpringApplication.run(LmxApplication.class, args);
    }

}
