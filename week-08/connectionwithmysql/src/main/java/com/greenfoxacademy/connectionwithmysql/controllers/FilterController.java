package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FilterController {

  @Autowired
  TodoRepository todoRepository;


  @PostMapping("/filter")
  public String filter(@ModelAttribute(name = "title") String title, Model model) {
    model.addAttribute("todos", todoRepository.findAllByTitle(title));
    return "todo-list";
  }
}
