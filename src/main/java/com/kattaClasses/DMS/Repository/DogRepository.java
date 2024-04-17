package com.kattaClasses.DMS.Repository;

import org.springframework.data.repository.CrudRepository;

import com.kattaClasses.DMS.Models.Dog;


public interface DogRepository extends CrudRepository<Dog, Integer> {

}

	