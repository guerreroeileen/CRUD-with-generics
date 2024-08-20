package com.crud.demo.repository;

import com.crud.demo.generics.GenericRepository;
import com.crud.demo.model.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends GenericRepository<Teacher, Long> {
}
