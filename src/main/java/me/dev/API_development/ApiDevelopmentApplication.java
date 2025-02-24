package me.dev.API_development;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ApiDevelopmentApplication {

	@RequestMapping("/")
	public ResponseEntity<Void> home() {
		return ResponseEntity.status(302) // Código de redirecionamento
				.header("Location", "/swagger-ui/index.html")
				.build();
	}
	public static void main(String[] args) {
		SpringApplication.run(ApiDevelopmentApplication.class, args);
	}

}
