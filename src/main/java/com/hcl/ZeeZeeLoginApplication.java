package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc 	
@ComponentScan("com.hcl")
public class ZeeZeeLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZeeZeeLoginApplication.class, args);
	}

}
