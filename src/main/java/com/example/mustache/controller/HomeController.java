package com.example.mustache.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class HomeController {

  @GetMapping({"","/index"})
  public String index(Model model){
    model.addAttribute("title", "home");    
    return "home";
  }
  
}
