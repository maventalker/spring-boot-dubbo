package com.guooo.boot.acc;

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
@ImportResource("classpath:dubbo-provider.xml")
@EnableAutoConfiguration
@ComponentScan("com.guooo.boot.acc.*")
@Configuration
public class AccountBizApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountBizApplication.class, args);
	}
}
