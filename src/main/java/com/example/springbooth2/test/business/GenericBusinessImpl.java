package com.example.springbooth2.test.business;

import com.example.springbooth2.test.entity.GenericEntity;
import com.example.springbooth2.test.repository.GenericRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class GenericBusinessImpl implements GenericBusiness {

    private final GenericRepository repo;

    public GenericBusinessImpl(GenericRepository repo) {
        this.repo = repo;
    }

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
        log.info("try this shit here {}", genericEntity.getMyValue());
        repo.save(genericEntity);
    }
}
