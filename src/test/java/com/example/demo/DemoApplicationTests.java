package com.example.demo;

import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "com.example.demo")
@EnableJpaRepositories("com.example.demo.repository")
@SpringBootTest
public class DemoApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplicationTests.class, args);
	}

}
