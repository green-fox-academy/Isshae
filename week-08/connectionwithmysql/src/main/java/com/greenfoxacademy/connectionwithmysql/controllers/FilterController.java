package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FilterController {

  @Autowired
  ToDoRepository toDoRepository;

  @PostMapping("/filter")
  public String filter(@ModelAttribute(name = "title") String title, Model model) {
    // @ModelAttribute(name = "urgent")Boolean urgent,
    // @ModelAttribute(name = "done")Boolean done, Model model){

    model.addAttribute("todos", toDoRepository.findAllByTitle(title));
    // model.addAttribute("todos",toDoRepository.findAllByIsUrgentIsTrue());
    //model.addAttribute("todos",toDoRepository.findAllByIsDoneIsTrue());


    return "todolist";
  }
}
