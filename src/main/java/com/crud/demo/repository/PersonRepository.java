package com.crud.demo.repository;

import com.crud.demo.generics.GenericRepository;
import com.crud.demo.model.Person;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface PersonRepository extends GenericRepository<Person, Long> {
}
