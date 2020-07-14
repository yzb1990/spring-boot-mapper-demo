package com.yuzebo.springbootmapperdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages ="com.yuzebo.demo.mapper")//这里要注意  是
@ComponentScan(basePackages = "com.yuzebo.demo")
public class SpringBootMapperDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMapperDemoApplication.class, args);
    }

}
