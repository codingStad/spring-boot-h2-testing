package com.example.springbooth2.test.controller;

import com.example.springbooth2.test.business.GenericBusiness;
import com.example.springbooth2.test.entity.GenericEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GenericController {
    private final GenericBusiness business;

    public GenericController(GenericBusiness business) {
        this.business = business;
    }

    @PostMapping("/createGeneric")
    public void create(@RequestBody GenericEntity entity) {
        business.save(entity);
    }

    @GetMapping("/getGeneric")
    public List<GenericEntity> getGeneric() {
        return business.fetchData();
    }
}
