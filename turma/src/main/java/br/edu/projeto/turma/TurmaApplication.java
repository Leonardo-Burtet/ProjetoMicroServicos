package br.edu.projeto.turma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TurmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurmaApplication.class, args);
	}
}
