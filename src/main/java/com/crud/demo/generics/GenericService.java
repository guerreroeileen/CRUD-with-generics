package com.crud.demo.generics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Optional;

@Service
public class GenericService <T extends BaseEntity, ID extends Serializable>
{

    @Autowired
    private GenericRepository <T, ID> genericRepository;

    public <S extends T> S save(S entity) {
        return genericRepository.save(entity);
    }

    public Optional<T> findById(ID id) {
        return genericRepository.findById(id);
    }

    public boolean existsById(ID id) {
        return genericRepository.existsById(id);
    }

    public Iterable<T> findAll() {
        return genericRepository.findAll();
    }

    public Iterable<T> findAllById(Iterable<ID> ids) {
        return genericRepository.findAllById(ids);
    }

    public long count() {
        return genericRepository.count();
    }

    public void deleteById(ID id) {
        genericRepository.deleteById(id);
    }

    public void delete(T entity) {
        genericRepository.delete(entity);
    }

    public void deleteAllById(Iterable<? extends ID> ids) {
        genericRepository.deleteAllById(ids);
    }


    public T update(T entity, ID id) {
        Optional<T> object = genericRepository.findById(id);
        if (object.isPresent()){
            genericRepository.save(entity);
            return entity;
        }
        return null;
    }
}
