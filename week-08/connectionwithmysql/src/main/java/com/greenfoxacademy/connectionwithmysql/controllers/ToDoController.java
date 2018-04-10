package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.ToDo;
import com.greenfoxacademy.connectionwithmysql.repositories.ToDoRepository;
import com.greenfoxacademy.connectionwithmysql.services.ToDoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class ToDoController {

  @Autowired
  ToDoRepository toDoRepository;
  @Autowired
  ToDoServiceImpl toDoService;


  @RequestMapping(value = {"/", "/list"})
  public String list(@RequestParam(value = "active", required = false) String active, Model model) {
    if (active != null && active.equals("true") ) {
      model.addAttribute("todos", toDoRepository.findAllByIsDoneIsFalse());
    } else {
      model.addAttribute("todos", toDoRepository.findAll());
    }
    return "todolist";
  }
}
