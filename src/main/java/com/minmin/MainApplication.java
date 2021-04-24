package com.minmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @SpringBootApplication :这是一个Springboot 应用
 * 一定要标注，主程序入口
 */

@SpringBootApplication(scanBasePackages = "com")
public class MainApplication {
    public static void main(String[] args) {
        //1.返回我们ioc容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        //
    }
}
