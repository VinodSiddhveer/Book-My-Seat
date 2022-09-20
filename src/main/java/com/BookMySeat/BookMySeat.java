package com.BookMySeat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class BookMySeat {

	public static void main(String[] args) {
		SpringApplication.run(BookMySeat.class, args);
	}

}
