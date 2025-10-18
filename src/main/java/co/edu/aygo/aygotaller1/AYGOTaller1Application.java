package co.edu.aygo.aygotaller1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class AYGOTaller1Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(AYGOTaller1Application.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", getPort()));
		app.run(args);
	}
	private static int getPort() {
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		return 33025;
	}

}
