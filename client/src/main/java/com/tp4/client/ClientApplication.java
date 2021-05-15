package com.tp4.client;

import com.tp4.client.web.EmployeeClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientApplication {

	private final EmployeeClient employeeClient;

	public ClientApplication(EmployeeClient employeeClient) {
		this.employeeClient = employeeClient;
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return args -> {
			employeeClient.getAll();
			employeeClient.getOne("129d5b16-ef92-4da4-943a-bc085360d811");
		};
	}
}
