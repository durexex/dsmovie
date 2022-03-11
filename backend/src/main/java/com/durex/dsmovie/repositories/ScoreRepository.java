package com.durex.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.durex.dsmovie.entities.Score;
import com.durex.dsmovie.entities.ScorePK;
import com.durex.dsmovie.entities.User;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
	

}