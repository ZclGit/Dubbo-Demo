package com.example.bootconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@EnableDubbo
@SpringBootApplication
public class SpringbootConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootConsumerApplication.class, args);
	}
}
