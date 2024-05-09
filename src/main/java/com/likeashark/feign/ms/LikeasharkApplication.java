package com.likeashark.feign.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LikeasharkApplication {

	public static void main(String[] args) {
		SpringApplication.run(LikeasharkApplication.class, args);
	}

}
