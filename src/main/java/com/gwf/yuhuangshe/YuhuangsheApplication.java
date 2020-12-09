package com.gwf.yuhuangshe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
    @MapperScan("com.gwf.yuhuangshe.dao")//使用MapperScan批量扫描所有的Mapper接口；
public class YuhuangsheApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuhuangsheApplication.class, args);
    }

}
