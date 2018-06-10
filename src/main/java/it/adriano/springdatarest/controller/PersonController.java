package it.adriano.springdatarest.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import it.adriano.springdatarest.repository.PersonRepository;


@RepositoryRestController
public class PersonController {

	private final PersonRepository repository;
	
	@Autowired
    public PersonController(PersonRepository repo) { 
        repository = repo;
    }
	
	 @GetMapping("/people/prova")
	 public @ResponseBody String getProva() {
		return "Stai nel controller custom";
	 
	 }
	 	  
}
	
	 
	       

