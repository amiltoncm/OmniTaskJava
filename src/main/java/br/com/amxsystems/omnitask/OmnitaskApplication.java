package br.com.amxsystems.omnitask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class OmnitaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmnitaskApplication.class, args);
	}

}
