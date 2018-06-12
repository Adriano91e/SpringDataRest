package it.adriano.springdatarest.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import it.adriano.springdatarest.model.Person;

public class BeforeSaveValidator implements Validator {

	@Override
	public boolean supports(Class<?> classe) {
		return Person.class.equals(classe);
	}

	@Override
	public void validate(Object obj, Errors error) {
		
		System.out.println("siamo nel validator "+obj);

		Person person=new Person();
		person=(Person) obj;
        
		if(person.getFirstName().contentEquals("ciccio")) {
			System.out.println("la person è "+person);
			person.setLastName("bello");
			obj=person;
		}
		
		 if(person.getFirstName().isEmpty()) {
			 error.rejectValue("firstName", "firstName.empty");
		 }
		 if(error!=null) {
			 System.out.println("errore "+error);
		 }
			
	}

}
