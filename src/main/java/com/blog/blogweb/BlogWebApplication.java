package com.blog.blogweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.blog.*"})
public class BlogWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogWebApplication.class, args);
	}
}
