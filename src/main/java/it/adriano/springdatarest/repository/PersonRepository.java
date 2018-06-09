package it.adriano.springdatarest.repository;

import org.springframework.data.repository.CrudRepository;

import it.adriano.springdatarest.model.Person;

public interface PersonRepository extends CrudRepository<Person,Integer>{
	


}
