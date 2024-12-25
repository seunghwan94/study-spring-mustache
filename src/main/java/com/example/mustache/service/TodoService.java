package com.example.mustache.service;

import java.util.List;

import com.example.mustache.vo.Todo;

public interface TodoService {
  List<Todo> list();
  Todo findById(int id);

  int add(Todo todo);
  int remove(int id);
  int modify(Todo todo);
}
