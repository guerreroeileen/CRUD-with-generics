package com.crud.demo.generics;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface GenericRepository <T extends BaseEntity, ID extends Serializable> extends JpaRepository<T, ID>
{
}
