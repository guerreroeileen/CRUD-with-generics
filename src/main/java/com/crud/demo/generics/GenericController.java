package com.crud.demo.generics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

public class GenericController <T extends BaseEntity, ID extends Serializable>{

    @Autowired
    private GenericService<T, ID> genericService;

    @GetMapping
    private ResponseEntity<Iterable<T>> getAll (){
        return ResponseEntity.ok(genericService.findAll());
    }

    @PostMapping
    private ResponseEntity<T> saveEntity (@RequestBody T entity){
        try {
            T entitySaved = (T) genericService.save(entity);
            return ResponseEntity.status(HttpStatus.CREATED).body(entitySaved);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PutMapping
    private ResponseEntity<T> updateEntity(@RequestBody T entity, ID id){
        T entityToBeUpdated = (T) genericService.update(entity, id);
        return ResponseEntity.ok(entityToBeUpdated);
    }

    @DeleteMapping(value = "delete/{id}")
    private ResponseEntity<Boolean> deleteEntitById (@PathVariable ("id") ID id){
        genericService.deleteById(id);
        return ResponseEntity.ok(genericService.findById(id).isEmpty());

    }

}
