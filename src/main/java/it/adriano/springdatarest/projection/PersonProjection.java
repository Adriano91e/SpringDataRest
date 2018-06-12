package it.adriano.springdatarest.projection;

import org.springframework.data.rest.core.config.Projection;

import it.adriano.springdatarest.model.Person;

@Projection(name = "projectionPerson", types = { Person.class }) 
public interface PersonProjection {
  
  String getFirstName();
  
  String getLastName();
    
  
}
