package com.example.springbooth2;

import com.example.springbooth2.test.business.GenericBusiness;
import com.example.springbooth2.test.entity.GenericEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessResourceFailureException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class SpringBootJpaIntegrationTest {

    private final GenericBusiness genericBusiness;

    @Autowired
    public SpringBootJpaIntegrationTest(GenericBusiness genericBusiness) {
        this.genericBusiness = genericBusiness;
    }

    @Test
    public void givenGenericEntityRepository_whenSaveAndRetrieveEntity_thenOK() {
        GenericEntity genericEntity = new GenericEntity("test");
        genericBusiness.save(genericEntity);
        GenericEntity foundEntity = genericBusiness.fetchById(genericEntity.getId()).orElseThrow(() -> new DataAccessResourceFailureException("fuck"));

        assertNotNull(foundEntity);
        assertEquals(genericEntity.getMyValue(), foundEntity.getMyValue());
    }
}