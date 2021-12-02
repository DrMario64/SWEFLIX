package com.springboot.movies;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



@Repository("fakeDao")
public class MovieDataAccessService implements MovieDao{
	private static List<Movie> DB = new ArrayList<>();

	@Override
	public int addMovie(UUID id, Movie movie) {
		DB.add(new Movie(id, movie.getName()));
		return 1;
	}

	@Override
	public List<Movie> selectMovies() {
		return DB;
	}
	
	
}
