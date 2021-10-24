package com.joe.usermailer;

import com.joe.usermailer.config.DBProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(DBProperties.class)
public class UserMailerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserMailerApplication.class, args);
	}

}
