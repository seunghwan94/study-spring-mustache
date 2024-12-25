package com.example.mustache.controller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import lombok.extern.log4j.Log4j2;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Log4j2
public class IndexControllerTests {
  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  public void testIndex(){
    String body = this.restTemplate.getForObject("http://localhost:8080/", String.class);
    log.info(body);
    assertTrue(body.contains("괄호 세개"));
  }

}
