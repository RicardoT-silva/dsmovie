package com.devsuperior.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.entities.Movie;
import com.devsuperior.dsmovie.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository repository;
	
	@Transactional
	public Page<MovieDTO> findAll(Pageable pageable) {
		Page<Movie> moviePage = repository.findAll(pageable);
		Page<MovieDTO> movieDTO = moviePage.map(x -> new MovieDTO(x));
		return movieDTO;
	}
	
	@Transactional
	public MovieDTO findById(Long id) {
		Movie movie = repository.findById(id).get();
		MovieDTO movieDTO = new MovieDTO(movie);
		return movieDTO;
	}	

}
