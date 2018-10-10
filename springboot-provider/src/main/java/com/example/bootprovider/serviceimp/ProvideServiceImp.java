package com.example.bootprovider.serviceimp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbo_interface.ProvideService;

@Service//暴露服务
@Component
public class ProvideServiceImp implements ProvideService{

	public String getUserName(String userId) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("1", "朱超良");
		map.put("2", "刘子健");
		map.put("3", "赵雪冬");
		return (String)map.get(userId);
	}

	public String getUserAge(String userId) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("1", "20");
		map.put("2", "25");
		map.put("3", "30");
		return (String)map.get(userId);
	}

}
