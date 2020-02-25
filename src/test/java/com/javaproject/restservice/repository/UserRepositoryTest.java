package com.javaproject.restservice.repository;

import static com.javaproject.restservice.entity.User.*;
import static org.junit.jupiter.api.Assertions.*;

import com.javaproject.restservice.entity.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.mock.mockito.*;
import org.springframework.data.repository.query.*;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.*;
import java.util.*;

@RunWith(SpringRunner.class)
@DataJpaTest
class UserRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private UserRepository userRepository;

    @Before
    public void init(){
    }

    @Test
    public void whenFindByName_thenReturnUser(){
        User kelly = new User();
        entityManager.persist(kelly);
        entityManager.flush();

        List<User> user = userRepository.findByName(@Param("Kelly"))


    }

}