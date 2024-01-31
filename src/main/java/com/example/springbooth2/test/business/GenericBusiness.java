package com.example.springbooth2.test.business;

import com.example.springbooth2.test.entity.GenericEntity;

import java.util.List;
import java.util.Optional;

public interface GenericBusiness {
    List<GenericEntity> fetchData();

    Optional<GenericEntity> fetchById(Long id);

    void save(GenericEntity genericEntity);
}
