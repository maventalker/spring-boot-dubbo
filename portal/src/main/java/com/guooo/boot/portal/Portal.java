package com.guooo.boot.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Entrypoint
 * @author guooo
 *
 */
@SpringBootApplication
@ComponentScan("com.guooo.boot.portal.*")
@ImportResource("classpath:dubbo-portal-consumer.xml")
@EnableAutoConfiguration
@Configuration
public class Portal {

	public static void main(String[] args) {
		SpringApplication.run(Portal.class, args);
	}
}
