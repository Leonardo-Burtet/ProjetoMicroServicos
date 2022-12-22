package br.edu.infnet.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApplication {
    
	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p
					.path("/alunos/**")
					.uri("http://localhost:8181")
						)
				.route(p -> p 
						.path("/turmas/**")
						.uri("http://localhost:8989")
						)
				.build();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}
