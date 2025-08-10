package com.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.model.Theater;
import com.booking.repo.TheaterRepository;

@Service
public class TheaterService {
	

	@Autowired
	private TheaterRepository theaterRepo;
	
	public List<Theater> getAllTheaters() {
		return theaterRepo.findAll();
	}
	
	public Theater saveTheater(Theater theater) {	
		return theaterRepo.save(theater);
		
	}
	
	public Theater getTheaterById(Long id) { 
		return theaterRepo.findById(id).get();
	}
	
	public void deleteTheater(Long id) {
		theaterRepo.deleteById(id);
	}

}
