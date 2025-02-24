package me.dev.API_development;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class ApiDevelopmentApplication {

	@RequestMapping("/")
	String home(){
		return "hello world!, testing many things";
	}
	public static void main(String[] args) {
		SpringApplication.run(ApiDevelopmentApplication.class, args);
	}

}
