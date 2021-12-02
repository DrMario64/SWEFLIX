package com.springboot.movies;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MovieController {
	private final MovieService movieService;
	
	@Autowired
	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}
	
	@PostMapping
	public void addMovie(@RequestBody Movie movie) {
		movieService.addNewMovie(movie);
	}
	
	public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }
	
	public void addMovieentry(Movie movie) {
		
	}
	public void updateMovie(UUID movieId) {
		
	}
	
}
