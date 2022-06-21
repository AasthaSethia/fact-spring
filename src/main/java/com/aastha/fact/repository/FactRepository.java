package com.aastha.fact.repository;

import com.aastha.fact.entity.AnimalFact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface FactRepository
        extends CrudRepository<AnimalFact, Long> {

}