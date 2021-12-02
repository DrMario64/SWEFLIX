package com.springboot.movies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
//import java.util.UUID;

@Service
public class MovieService {
	private final MovieDao movieDao;
	
	@Autowired
	public MovieService(@Qualifier("fakeDao")MovieDao movieDao) {
		this.movieDao = movieDao;
	}
	
	List<Movie> getAllMovies(){
		return movieDao.selectMovies();
	}
	public int addNewMovie(Movie movie) {
		return movieDao.addMovie(movie);
	}

}
