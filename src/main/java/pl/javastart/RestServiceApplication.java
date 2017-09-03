package pl.javastart;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import pl.javastart.model.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestServiceApplication {
	

public static void main(String[] args) {
		  RestTemplate restTemplate = new RestTemplate();
	        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
	        System.out.println(quote.toString());

	}
}
