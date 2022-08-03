package com.grokthis.sellable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SellableApplication {
	public static final String version = "0.0.1";

	public static void main(String[] args) {
		SpringApplication.run(SellableApplication.class, args);
	}
}
