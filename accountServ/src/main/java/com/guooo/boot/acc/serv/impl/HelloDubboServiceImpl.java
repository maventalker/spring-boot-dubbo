package com.guooo.boot.acc.serv.impl;

import org.springframework.stereotype.Service;

import com.guooo.boot.acc.serv.HelloDubboService;

@Service("helloDubboService")
public class HelloDubboServiceImpl implements HelloDubboService {

	public String sayHello(String words) {
		System.out.println("hello ,spring boot dubbo applicatoin");
		return "spring boot dubbo server suc!";
	}

}
