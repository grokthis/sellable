package com.grokthis.sellable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.reactive.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.server.SecurityWebFilterChain;

import javax.servlet.Filter;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@SpringBootApplication
public class SellableApplication {
	public static final String version = "0.0.1";

	public static void main(String[] args) {
		SpringApplication.run(SellableApplication.class, args);
	}
}
