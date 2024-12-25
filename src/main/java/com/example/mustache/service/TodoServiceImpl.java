package com.example.mustache.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.mustache.mapper.TodoMapper;
import com.example.mustache.vo.Todo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TodoServiceImpl implements TodoService {
  private final TodoMapper mapper;

  @Override
  public List<Todo> list() {
    return mapper.select();
  }
  
  @Override
  public Todo findById(int id) {
    return mapper.selectByOne(id);
  }

  @Override
  public int add(Todo todo) {
    return mapper.insert(todo);
  }

  @Override
  public int modify(Todo todo) {
    return mapper.update(todo);
  }

  @Override
  public int remove(int id) {
    return mapper.delete(id);
  }

  
  
}
