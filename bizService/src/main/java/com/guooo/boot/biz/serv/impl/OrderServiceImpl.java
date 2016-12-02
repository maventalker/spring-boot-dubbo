package com.guooo.boot.biz.serv.impl;

import org.springframework.stereotype.Service;

import com.guooo.boot.I.order.OrderService;

@Service("txOrderService")
public class OrderServiceImpl implements OrderService {

	@Override
	public String queryOrder(String serialNo) {
		System.out.println("serialNo = " +serialNo);
		return "QueryRestult = " +serialNo;
	}

}
