package com.guooo.boot.portal.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guooo.boot.I.order.OrderService;
/**
 * test controller from service biz
 * @author guooo
 *
 */
@RestController
@RequestMapping("/boot/hello")
public class BizOrderController {

	@Autowired
	OrderService orderService;
	
	@RequestMapping(value="query")
	public String query(String serialNo){
		return orderService.queryOrder(serialNo);
	}
}
