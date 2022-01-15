package thinkinginspringboot.bootstrap;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;
import thinkinginspringboot.bootstrap.annotation.NameRepository;

import static org.springframework.web.servlet.function.RequestPredicates.GET;
import static org.springframework.web.servlet.function.RouterFunctions.route;

@SpringBootApplication
public class BootstrapApplication {

	public static void main(String[] args) {
//		SpringApplication.run(BootstrapApplication.class, args);
		ConfigurableApplicationContext context = new SpringApplicationBuilder(BootstrapApplication.class)
				.bannerMode(Banner.Mode.CONSOLE)
				.run(args);

	}

	/**
	 * 验证@Component注解的派生性
	 *
	 * @param context
	 */
	public static void stereotypeAnnotation(ConfigurableApplicationContext context) {
		NameRepository nameRepository = (NameRepository) context.getBean("nameRepository");
		System.out.println(nameRepository.findAll());
	}

	@Bean
	public RouterFunction<ServerResponse> helloWorld() {
		return route(GET("hello-world"), request -> ServerResponse.ok().body(
				"hello-world"));
	}

}
