package com.lazyallen.demo.openfeignplayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenfeignPlayerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenfeignPlayerApplication.class, args);
	}

}
