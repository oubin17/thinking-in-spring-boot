package thinkinginspringboot.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.web.servlet.function.RequestPredicates.GET;
import static org.springframework.web.servlet.function.RouterFunctions.route;

@SpringBootApplication
public class BootstrapApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapApplication.class, args);
	}

	@Bean
	public RouterFunction<ServerResponse> helloWorld() {
		return route(GET("hello-world"), request -> ServerResponse.ok().body(
				"hello-world"));
	}

}
