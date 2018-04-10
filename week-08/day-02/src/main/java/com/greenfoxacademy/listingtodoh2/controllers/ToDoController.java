package com.greenfoxacademy.listingtodoh2.controllers;

import com.greenfoxacademy.listingtodoh2.models.ToDo;
import com.greenfoxacademy.listingtodoh2.repositories.ToDoRepository;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class ToDoController {

  @Autowired
  ToDoRepository toDoRepository;


  @RequestMapping(value = {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", toDoRepository.findAll());
    return "todolist";
  }

}
