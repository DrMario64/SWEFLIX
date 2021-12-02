package com.springboot.movies;

import java.util.List;
import java.util.UUID;

public interface MovieDao {
	
	int addMovie(UUID id, Movie movie);
	
	default int addMovie(Movie movie) {
		UUID id = UUID.randomUUID();
		return addMovie(id, movie);
	}
	List<Movie> selectMovies();
}
