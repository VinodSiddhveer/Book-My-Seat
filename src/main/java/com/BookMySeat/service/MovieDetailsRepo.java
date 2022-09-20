package com.BookMySeat.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookMySeat.beans.MovieDetails;

public interface MovieDetailsRepo extends JpaRepository<MovieDetails, Long > {

}
