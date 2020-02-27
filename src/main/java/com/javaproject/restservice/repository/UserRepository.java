package com.javaproject.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.*;
import org.springframework.data.repository.query.*;
import org.springframework.data.rest.core.annotation.*;

import com.javaproject.restservice.entity.User;

import java.util.*;


@RestResource(exported = false)
public interface UserRepository extends JpaRepository<User, String> {
}