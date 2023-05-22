package com.example.songsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SongsAppApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SongsAppApplication.class, args);
		String[] bNames = applicationContext.getBeanDefinitionNames();
		System.out.println(applicationContext.getBeanDefinitionCount());
		Arrays.stream(bNames).forEach(bean-> System.out.println(bean));
	}

}
