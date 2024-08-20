package com.crud.demo.controller;

import com.crud.demo.generics.GenericController;
import com.crud.demo.model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
public class PersonController extends GenericController<Person, Long>
{
}
