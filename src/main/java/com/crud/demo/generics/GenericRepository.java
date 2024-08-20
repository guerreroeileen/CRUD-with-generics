package com.crud.demo.generics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface GenericRepository <T extends BaseEntity, ID extends Serializable> extends JpaRepository<T, ID>
{
}
