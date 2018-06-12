package it.adriano.springdatarest;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import it.adriano.springdatarest.validator.BeforeSaveValidator;


@SpringBootApplication
public class SpringDataRestApplication { //extends RepositoryRestConfigurerAdapter per la configurazione manuale del Validation

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);
	}

	
    // Configurazione Validation manuale	
//	@Override 
//	 public void configureValidatingRepositoryEventListener (
//	      ValidatingRepositoryEventListener v) {
//	        v.addValidator("beforeCreate", new BeforeSaveValidator());
//	    }

	//Configurazione Validation tramite been
	@Bean
	public BeforeSaveValidator beforeCreateWebsiteUserValidator() {
	    return new BeforeSaveValidator();
	}
	
}
