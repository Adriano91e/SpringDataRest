package it.adriano.springdatarest.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import it.adriano.springdatarest.model.Person;


@RepositoryRestResource(collectionResourceRel = "people", path = "people")
//public interface PersonRepository extends CrudRepository<Person, Integer>{
  public interface PersonRepository extends PagingAndSortingRepository<Person,Integer>{


//	@RestResource(exported = false) con questa annotation il metodo non verrà esportato
	List<Person> findByFirstName(@Param(value = "name") String name);
	
	@RestResource(path = "nameStartsWith", rel = "nameStartsWith")
	public Page findByFirstNameStartsWith(@Param("name") String name, Pageable p);
}
