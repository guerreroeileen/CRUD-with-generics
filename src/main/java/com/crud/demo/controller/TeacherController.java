package com.crud.demo.controller;

import com.crud.demo.generics.GenericController;
import com.crud.demo.model.Teacher;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/teacher/")
public class TeacherController extends GenericController<Teacher, Long>
{
}
