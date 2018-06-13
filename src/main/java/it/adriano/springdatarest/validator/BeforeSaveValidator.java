package it.adriano.springdatarest.validator;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.rest.webmvc.RepositoryRestExceptionHandler;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import it.adriano.springdatarest.model.Person;
@PropertySource(value = { "classpath:application.properties" })

public class BeforeSaveValidator implements Validator {

	@Override
	public boolean supports(Class<?> classe) {
		return Person.class.equals(classe);
	}

	@Override
	public void validate(Object obj, Errors error) {
		
		System.out.println("siamo nel validator "+obj);
        Person person= (Person) obj;
	    
       
		if(person.getFirstName()!=null && person.getFirstName().contentEquals("ciccio")) {
			System.out.println("la person è "+person);
			person.setLastName("bello");
			obj=person;
		}
		
        if(person.getFirstName()==null || person.getFirstName().isEmpty()) {			
			error.rejectValue("firstName","firstName.empty");
			 System.out.println("errore "+error);
		 }	
		
		 if(person.getLastName()==null || person.getLastName().isEmpty()) {			
			error.rejectValue("lastName","lastName.empty");
			 System.out.println("errore "+error);
		 }		
	}
	
}
