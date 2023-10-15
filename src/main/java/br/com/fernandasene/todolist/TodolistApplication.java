package br.com.fernandasene.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistApplication {
	// mvn spring-boot:run -> executa aplicação

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

}
