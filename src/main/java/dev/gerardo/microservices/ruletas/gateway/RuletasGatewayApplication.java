package dev.gerardo.microservices.ruletas.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RuletasGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RuletasGatewayApplication.class, args);
	}

}
