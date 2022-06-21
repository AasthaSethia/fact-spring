package com.aastha.fact.service;
import com.aastha.fact.entity.AnimalFact;

import java.util.ArrayList;

public interface FactService {
    AnimalFact saveDetails(AnimalFact department);

    ArrayList<AnimalFact> findAll();
}





