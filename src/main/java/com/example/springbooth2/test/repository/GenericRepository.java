package com.example.springbooth2.test.repository;

import com.example.springbooth2.test.entity.GenericEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenericRepository extends JpaRepository<GenericEntity, Long> {
}
