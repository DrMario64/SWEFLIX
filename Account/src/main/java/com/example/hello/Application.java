package com.example.hello;

//import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
	//private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
    //@Autowired
    //AccountService srvc;
	
	/*@Bean
	public CommandLineRunner demo(AccountRepository repository) {
		return (args) -> {
	    	
	    	//check new service works before by adding a record to see if it comes up
	    	Account a1 = new Account();
		      long lid = 1;
	    	a1.setSid(lid);
	    	a1.setContent("DrMario64");
	    	srvc.saveAccount(a1);
	    	
	    	
	      // save a few customers - good to initialize system with dummy data when only building part of app
	    	lid = 2; 	
	      repository.save(new Account(lid, "mracew"));
	      
	    	lid = 3; 	
		      repository.save(new Account(lid, "naterium"));

	      // fetch all customers
	      log.info("Customers found with findAll():");
	      log.info("-------------------------------");
	      for (Account account : repository.findAll()) {
	        log.info(account.toString());
	      }
	      log.info("");

	      // fetch an individual customer by ID
	     Optional<Account> account = repository.findById(1L);
	      log.info("Customer found with findById(1L):");
	      log.info("--------------------------------");
	      log.info(account.toString());
	      log.info("");


	    };
	  }*/
}
