package com.example.dubbo_provider;

import java.util.HashMap;
import java.util.Map;

import com.example.dubbo_interface.ProvideService;

public class ProvideServiceImp implements ProvideService{

	public String getUserName(String userId) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("1", "÷Ï≥¨¡º");
		map.put("2", "¡ı◊”Ω°");
		map.put("3", "’‘—©∂¨");
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
