package com.dgut;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.proxy.MethodInterceptor;

@SpringBootApplication
@MapperScan("com.dgut.dao")
public class TeachingplatApplication {


	public static void main(String[] args) {
		SpringApplication.run(TeachingplatApplication.class, args);
	}
}
