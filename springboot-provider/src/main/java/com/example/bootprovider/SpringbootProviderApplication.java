package com.example.bootprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@EnableDubbo //开启基于注解的dubbo功能
@SpringBootApplication
public class SpringbootProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProviderApplication.class, args);
	}
}
