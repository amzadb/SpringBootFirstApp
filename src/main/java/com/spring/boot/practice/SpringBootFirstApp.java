package com.spring.boot.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApp {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootFirstApp.class, args);

		int beanCount = context.getBeanDefinitionCount();
		System.out.println("Bean Count: " + beanCount);
		
		String[] beans = context.getBeanDefinitionNames();
		for (int i = 0; i < beanCount; i++) {
			System.out.println("beans[" + i + "]: " + beans[i]);
		}


	}

}
