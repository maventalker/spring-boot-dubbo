package com.guooo.boot.portal.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guooo.boot.acc.serv.HelloDubboService;

/**
 * test controller from service account
 * @author guooo
 *
 */
@RestController
@RequestMapping("/boot/hello")
public class HelloController {

	@Autowired
	HelloDubboService helloService;
	
	
	@RequestMapping(value="say",method={RequestMethod.POST,RequestMethod.GET})
	public String say(String words){
		return helloService.sayHello("portal invoke!");
	}
	
}
