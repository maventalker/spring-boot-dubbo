package com.guooo.boot.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 入口类
 * @author guooo
 *
 */
@SpringBootApplication
@Configuration
@ComponentScan("com.guooo.boot.biz.*")
@EnableAutoConfiguration
@ImportResource("classpath:dubbo-biz-provider.xml")
public class BizApplication {

	public static void main(String[] args) {
		SpringApplication.run(BizApplication.class, args);
	}
}
