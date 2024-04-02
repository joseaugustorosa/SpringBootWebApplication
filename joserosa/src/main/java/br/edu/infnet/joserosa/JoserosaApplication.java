package br.edu.infnet.joserosa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class JoserosaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JoserosaApplication.class, args);
	}

}
