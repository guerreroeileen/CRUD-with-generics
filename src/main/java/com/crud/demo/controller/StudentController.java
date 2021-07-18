package com.crud.demo.controller;

import com.crud.demo.generics.GenericController;
import com.crud.demo.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/student/")
public class StudentController extends GenericController<Student, Long>
{
}
