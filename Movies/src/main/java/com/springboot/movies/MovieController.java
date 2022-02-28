package com.springboot.movies;

import java.util.List;
//yes


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/movie")
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
	
	@GetMapping
	public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }
	

	
}
