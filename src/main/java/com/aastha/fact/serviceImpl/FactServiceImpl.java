package com.aastha.fact.serviceImpl;

import com.aastha.fact.entity.AnimalFact;
import com.aastha.fact.repository.FactRepository;
import com.aastha.fact.service.FactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FactServiceImpl implements FactService {
    @Autowired
    FactRepository factRepository;
    @Override
    public AnimalFact saveDetails(AnimalFact animalFact) {
       return factRepository.save(animalFact);
    }

    @Override
    public ArrayList<AnimalFact> findAll(){return (ArrayList<AnimalFact>) factRepository.findAll();}
}
