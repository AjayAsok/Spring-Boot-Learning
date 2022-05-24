package com.ajprojects.springbootbackend.Basics;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BasicsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("This is the CommandLineStarter");
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}

	}

}
