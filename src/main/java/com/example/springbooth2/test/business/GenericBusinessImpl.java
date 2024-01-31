package com.example.springbooth2.test.business;

import com.example.springbooth2.test.entity.GenericEntity;
import com.example.springbooth2.test.repository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenericBusinessImpl implements GenericBusiness {

    @Autowired
    private GenericRepository repo;

    @Override
    public List<GenericEntity> fetchData() {
        return repo.findAll();
    }

    @Override
    public Optional<GenericEntity> fetchById(Long id) {
        return repo.findById(id);
    }

    @Override
    public void save(GenericEntity genericEntity) {
        repo.save(genericEntity);
    }
}
