package com.crud.demo.repository;

import com.crud.demo.generics.GenericRepository;
import com.crud.demo.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends GenericRepository<Student, Long> {
}
