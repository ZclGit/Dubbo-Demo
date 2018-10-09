package com.example.dubbo_consumer;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.dubbo_interface.ConsumerService;

public class MainApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		ConsumerService bean = context.getBean(ConsumerService.class);
		String userInfo = bean.getUserInfo("1");
		System.out.println(userInfo);
		System.out.println("µ÷ÓÃ½áÊø");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
