package dev.gerardo.microservices.ruletas.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoutingConfiguration {
	
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		System.out.println("Creando el router");
		return builder.routes()
				.route("ruletasModule", 
						p -> p.path("/ruletas-module/**")
						.uri("lb://RULETAS-SERVICE"))
				.build();
	}
	
}
