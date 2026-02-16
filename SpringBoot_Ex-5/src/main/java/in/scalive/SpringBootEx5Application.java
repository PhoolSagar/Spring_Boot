package in.scalive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import in.scalive.service.EmailService;

@SpringBootApplication
public class SpringBootEx5Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEx5Application.class, args);
	}
	
	@Bean
	public EmailService emailService() {
		return new EmailService();
	}

}
