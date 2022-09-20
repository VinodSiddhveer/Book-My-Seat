package com.BookMySeat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BookMySeat.beans.MovieDetails;

@Repository
public class MovieDetailsDao {
    @Autowired
    MovieDetailsRepo repo ;
    
    public void saveMovie(MovieDetails mh) {
    	repo.save(mh) ;
    }
}
