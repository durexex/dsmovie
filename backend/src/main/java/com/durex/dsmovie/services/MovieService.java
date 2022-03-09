package com.durex.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.durex.dsmovie.dto.MovieDTO;
import com.durex.dsmovie.entities.Movie;
import com.durex.dsmovie.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository repository;
	
	@Transactional(readOnly = true)	
	public Page<MovieDTO> findAll(Pageable pageable) {
		Page<Movie> result = repository.findAll(pageable);
		Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
		
		return page;
	}
	
	@Transactional(readOnly = true)	
	public MovieDTO findById(Long id) {
		Movie result = repository.findById(id).get();
		MovieDTO movieDto = new MovieDTO(result);
		
		return movieDto;
	}
	
}