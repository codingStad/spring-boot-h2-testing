package com.example.springbooth2.test.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class GenericEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String myValue;

    public GenericEntity() {

    }

    public GenericEntity(String myValue) {
        this.myValue = myValue;
    }

}
