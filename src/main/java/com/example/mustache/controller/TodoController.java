package com.example.mustache.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.mustache.service.TodoService;
import com.example.mustache.vo.Todo;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@AllArgsConstructor
@RequestMapping("todo")
@Log4j2
public class TodoController {
  private TodoService service;

  
  @GetMapping("")
  public String view(Model model) {
    model.addAttribute("title", "todo");      
    model.addAttribute("todos", service.list());      
    return "todo";
  }

  @GetMapping("add")
  public String add(@RequestParam String task ,Model model) {
    Todo todo = Todo.builder().task(task).build();
    model.addAttribute("todos", service.add(todo));      
    return "redirect:/todo";
  }

  @PostMapping("modify")
  public String postMethodName(@RequestParam int id,@RequestParam boolean done, Model model) {

    Todo todo = Todo.builder().id(id).done(!done).build();
    service.modify(todo);
    return "redirect:/todo";
  }
  
  @PostMapping("remove")
  public String postMethodName(@RequestParam int id, Model model) {
    service.remove(id);
    return "redirect:/todo";
  }
}
