package com.guooo.boot.portal;

import java.io.IOException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.guooo.boot.I.acc.HelloDubboService;

/**
 * Entrypoint
 * @author guooo
 *
 */
@SpringBootApplication
public class Portal {

	public static void main(String[] args){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"classpath:dubbo-portal-consumer.xml"});
        HelloDubboService helloService =  (HelloDubboService) ctx.getBean("helloDubboService");
        System.out.println(helloService.sayHello("lxy"));
        try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
