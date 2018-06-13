package it.adriano.springdatarest.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import it.adriano.springdatarest.model.Person;

@RepositoryEventHandler(Person.class)
public class PersonEventHandler {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());


	@HandleBeforeSave
	public void handlePersonSave(Person p) {
		logger.info("eventsSave");
	}

	@HandleBeforeSave
	public void handleProfileSave(Profile p) {
		logger.info("events profile");
	}
	
	@HandleBeforeCreate
	public void handlePersonCreate(Person p) {
		logger.info("eventsCreate");
	}

	@HandleBeforeCreate
	public void handleProfileCreate(Profile p) {
		logger.info("events profile");
	}
	
	

}
