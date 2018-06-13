package it.adriano.springdatarest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.adriano.springdatarest.events.PersonEventHandler;

@Configuration
public class RepositoryConfig  {

	@Bean
	  PersonEventHandler personEventHandler() {
	    return new PersonEventHandler();
	  }
}
