package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.ToDo;
import com.greenfoxacademy.connectionwithmysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UpdateController {

  @Autowired
  ToDoRepository toDoRepository;

  @GetMapping("/update")
  public String viewUpdatePage() {
    return "update";
  }

  @PostMapping("/update")
  public String update(@PathVariable(name = "todo")ToDo toDo) {
    toDoRepository.save(toDo);
    return "redirect:/";
  }
}