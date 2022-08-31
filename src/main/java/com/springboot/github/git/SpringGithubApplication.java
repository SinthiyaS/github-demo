package com.springboot.github.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringGithubApplication {

	public void dataInfo(String data) {
		System.out.println("data :"+data);
		if(data.equals("sinthiya")) {
			System.out.println("Welcome to Github Tutorial");
		}
	}
	public String newInfo(){
		return "New method added";
	}
	
	public void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringGithubApplication.class, args);
	}

	
}
