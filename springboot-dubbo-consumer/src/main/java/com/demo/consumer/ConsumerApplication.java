package com.demo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 继承SpringBootServletInitializer并重写configure为了tomcat启动
 *
 */
@SpringBootApplication
public class ConsumerApplication extends SpringBootServletInitializer
{
    //tomcat启动
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ConsumerApplication.class);
    }

    //boot启动
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);

    }
}
