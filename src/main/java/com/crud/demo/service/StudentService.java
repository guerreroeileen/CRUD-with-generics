package com.crud.demo.service;

import com.crud.demo.generics.GenericService;
import com.crud.demo.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService extends GenericService<Student, Long> {
}
