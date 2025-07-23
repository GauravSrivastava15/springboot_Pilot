package com.javaDev.week1.introduction.introToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroToSpringBootApplication implements CommandLineRunner {
	// we can also use ApplicationRunner instead of CommandLineRunner
//	@Autowired // used for dependency injection
//	Apple apple1;
//
//	@Autowired
//	Apple apple2;

	@Autowired
	DBService dbService;

	public static void main(String[] args) {
		SpringApplication.run(IntroToSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(dbService.getData());
//		apple1.eatApple();
//		apple2.eatApple();
	}
}
