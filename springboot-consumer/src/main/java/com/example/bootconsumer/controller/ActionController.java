package com.example.bootconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dubbo_interface.ConsumerService;

@Controller
public class ActionController {
	
	@Autowired
	ConsumerService consumerService;
	
	@ResponseBody
	@RequestMapping("/initService")
	public String initService(@RequestParam("userId") String userId) {
		String userInfo = consumerService.getUserInfo(userId);
		return userInfo;
	}
}
