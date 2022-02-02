package com.nitin.movie.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nitin.movie.model.Movie;
import com.nitin.oauth2.OAuth2Keycloak.customAnnotation.AllowedRolesType;



@RestController
public class MovieController {

	Map<Long,Movie> movies;
	
	public MovieController() {
		movies = new HashMap<Long, Movie>();
		movies.put(1L,new Movie("Spider-Man: No Way Home","Tom Holland", 2021));
		movies.put(2L,new Movie("No Time To Die","Daniel Craig" , 2021));
		movies.put(3L,new Movie("The Suicide Squad","Margot Robbie" , 2021));
	}
	
	
	@GetMapping("/movies")
	@AllowedRolesType("ADMIN")
	public List<Movie> getAllMovies(){
		return new ArrayList<Movie>(movies.values());
	}
	
	
	@GetMapping("/movies/{id}")
	@AllowedRolesType("VISITOR")
	public Movie getMovieById(@PathVariable("id") String id ){
		return movies.get(Long.valueOf(id));
	}
	
}
