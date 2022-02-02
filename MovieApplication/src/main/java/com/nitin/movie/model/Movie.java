package com.nitin.movie.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
	
	
	private String title;
	private String actor;
	private Integer year;
	
	public Movie(String title, String actor, int year) {
		this.title= title;
		this.actor=actor;
		this.year=year;
	}

}
