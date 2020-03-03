package com.javaproject.restservice.controller;

import org.junit.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.*;
import org.springframework.boot.test.context.*;
import org.springframework.boot.web.server.*;
import org.springframework.http.*;
import org.springframework.test.context.junit4.*;
import org.springframework.web.client.*;

import java.net.*;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    @LocalServerPort
    int randomServerPort;

    @Test
    void TestUserfindAll() {
        RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = "http://localhost:" + randomServerPort + "/users";
        URI uri = null;
        try {
            uri = new URI(baseUrl);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);

        Assert.assertEquals(200, result.getStatusCodeValue());
    }

    @Test
    void find() {
    }

    @Test
    void create() {
    }

    @Test
    void delete() {
    }

    @Test
    void update() {
    }
}