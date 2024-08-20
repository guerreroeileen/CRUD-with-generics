package com.crud.demo.model;

import com.crud.demo.generics.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "person")
public  class Person extends BaseEntity<Long> implements Serializable {
    private String name;
    private String lastName;
    private Integer age;
    private String city;
    private String address;
}
