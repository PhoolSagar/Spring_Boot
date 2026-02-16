package in.scalive.Appconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.scalive.service.EmailService;

@Configuration
public class AppConfig {

	@Bean
	public EmailService emailService() {
		return new EmailService();
	}
	
}
