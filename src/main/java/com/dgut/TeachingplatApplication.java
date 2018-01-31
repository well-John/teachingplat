package com.dgut;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.dgut.dao")
@ServletComponentScan("com.dgut.utils")
public class TeachingplatApplication {


	public static void main(String[] args) {
		SpringApplication.run(TeachingplatApplication.class, args);
	}
}
