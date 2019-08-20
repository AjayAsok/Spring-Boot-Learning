package com.ajay.springboot.learning;
/**
 * 
 */

/**
 * @author AJayAsok
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSampleApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringSampleApplication.class, args);
		System.out.println("Hello to Springboot World");
	}

}
