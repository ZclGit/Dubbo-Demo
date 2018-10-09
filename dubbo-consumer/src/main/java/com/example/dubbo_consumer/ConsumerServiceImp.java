package com.example.dubbo_consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dubbo_interface.ConsumerService;
import com.example.dubbo_interface.ProvideService;

@Service
public class ConsumerServiceImp implements ConsumerService{
	@Autowired
	ProvideService provideService;
	
	public String getUserInfo(String userId) {
		System.out.println("用户ID："+userId);
		String userName = provideService.getUserName(userId);
		String userAge = provideService.getUserAge(userId);
		return "姓名："+userName+"，年龄： "+userAge;
	}
	
}
