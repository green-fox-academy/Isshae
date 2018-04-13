package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class ToDoController {

  @Autowired
  TodoRepository todoRepository;

  @RequestMapping(value = {"", "/", "/list"})
  public String list(@RequestParam(value = "active", required = false) String active, Model model) {
    if (active != null && active.equals("true")) {
      model.addAttribute("todos", todoRepository.findAllByIsDoneIsFalse());
    } else {
      model.addAttribute("todos", todoRepository.findAll());
    }
    return "to-dolist";
  }

  @GetMapping(value = {"/{id}"})
  public String deleteTodo(@PathVariable(name = "id") Long id) {
    todoRepository.deleteById(id);
    return "redirect:/";
  }
}
