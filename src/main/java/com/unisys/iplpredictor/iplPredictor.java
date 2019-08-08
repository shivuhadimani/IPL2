package com.unisys.iplpredictor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.unisys.iplpredictor")
@SpringBootApplication
public class iplPredictor {

	 public static void main(String[] args) throws Exception {
	        SpringApplication.run(iplPredictor.class, args);
	  }
}
