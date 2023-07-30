package com.yuxin.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication(scanBasePackages = {"com.yuxin"})
@ServletComponentScan
@MapperScan("com.yuxin.dao")
public class YUXINApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(YUXINApiApplication.class, args);
    }

}
