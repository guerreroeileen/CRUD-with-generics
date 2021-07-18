package com.crud.demo.model;

import com.crud.demo.generics.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "teacher")
public class Teacher extends BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String lastName;
    private Integer age;
    private String city;
    private String address;
    private Double salary;
    private Boolean isCompleteTimeTeacher;
}
