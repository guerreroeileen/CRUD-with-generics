package com.crud.demo.service;

import com.crud.demo.generics.GenericService;
import com.crud.demo.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends GenericService<Person, Long> {
}
