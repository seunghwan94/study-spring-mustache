package com.example.mustache.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.mustache.vo.Todo;

import lombok.extern.log4j.Log4j2;

@SpringBootTest
@Log4j2
public class TodoServiceTests {
  @Autowired
  private TodoService service;

  @Test
  public void testList(){
    log.info(service.list());
  }

  @Test
  public void testSelectOne(){
    log.info(service.findById(1));
  }

  @Test
  public void testAdd(){
    Todo todo = Todo.builder().task("연습1").build();
    log.info(service.add(todo));
  }

  @Test
  public void testModify(){
    Todo todo = service.findById(4);
    todo.setDone(true);
    log.info(service.modify(todo));
  }


  @Test
  public void testRemove(){
    log.info(service.remove(2));
  }
}
