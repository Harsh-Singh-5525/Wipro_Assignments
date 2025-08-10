package com.booking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
