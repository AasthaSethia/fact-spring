package com.aastha.fact.controllers;

import com.aastha.fact.entity.AnimalFact;
import com.aastha.fact.model.CatFact;
import com.aastha.fact.model.DogFact;
import com.aastha.fact.service.FactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Random;


import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/aastha")
public class factController {
	CatFact catFact = new CatFact();
	DogFact dogFact = new DogFact();
	AnimalFact animalFact = new AnimalFact();


	@Autowired
	FactService factService;
		
	@GetMapping("/fact")
	public String returnFact(@RequestParam("animal") String animalName, HttpServletRequest request) {
		Random random = new Random();
		int x = random.nextInt(5);
		if(animalName.equalsIgnoreCase("cat")){
			animalFact.setAnimalName(animalName);
			animalFact.setIpAddress(request.getRemoteAddr());
			animalFact.setAccessTime(System.currentTimeMillis());
			animalFact.setFact(catFact.getFactByNumber(x));
			factService.saveDetails(animalFact);
			return catFact.getFactByNumber(x);
		}
		else if (animalName.equalsIgnoreCase("dog")){
			animalFact.setAnimalName(animalName);
			animalFact.setIpAddress(request.getRemoteAddr());
			animalFact.setAccessTime(System.currentTimeMillis());
			animalFact.setFact(dogFact.getFactByNumber(x));
			factService.saveDetails(animalFact);
			return dogFact.getFactByNumber(x);
		}
		else
			return "Animal not found!";
	}

	@GetMapping("/find")
	public ArrayList<AnimalFact> findAll(){
		return factService.findAll();
	}


}
