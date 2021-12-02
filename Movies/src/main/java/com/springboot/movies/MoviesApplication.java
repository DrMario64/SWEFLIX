package com.springboot.movies;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;




@SpringBootApplication
public class MoviesApplication {
	
	private static final Logger log = LoggerFactory.getLogger(MoviesApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}
	
	@Autowired
	MovieService movieService;
	
	@Bean
	public CommandLineRunner demo(MovieDao movieDao) {
		return (args) -> {
			
			//creates and initializes a new movie then adds to repository
			Movie movie1 = new Movie(UUID.randomUUID(), "Titanic");
			movieDao.addMovie(movie1);
			
			//display movie info
			log.info("\nID:" +  movie1.getId() + "\nMovie: " + movie1.getName()); 
			
		};
	}
}
