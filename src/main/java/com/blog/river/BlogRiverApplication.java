package com.blog.river;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.blog.river.admin.Admin;
import com.blog.river.admin.AdminDao;

@SpringBootApplication
public class BlogRiverApplication{

	public static void main(String[] args) {
		SpringApplication.run(BlogRiverApplication.class, args);
		
	}

}
