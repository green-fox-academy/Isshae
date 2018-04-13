package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.Assignee;
import com.greenfoxacademy.connectionwithmysql.models.ToDo;
import com.greenfoxacademy.connectionwithmysql.repositories.AssigneeRepository;
import com.greenfoxacademy.connectionwithmysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddController {

  @Autowired
  AssigneeRepository assigneeRepository;
  @Autowired
  ToDoRepository toDoRepository;

  @GetMapping("/addnewassignee")
  public String viewAddNewAssigneePage() {
    return "addnewassignee";
  }

  @PostMapping("/addnewassignee")
  public String addNewAssignee(@ModelAttribute(name = "name") String name,
                               @ModelAttribute(name = "email") String email) {
    assigneeRepository.save(new Assignee(name, email));
    return "redirect:/assigneelist";
  }

  @GetMapping("/addnew")
  public String viewAddNewTodo() {
    return "addnew";
  }

  @PostMapping("/addnew")
  public String addNewTodo(@ModelAttribute(name = "todo") String todo) {
    toDoRepository.save(new ToDo(todo));
    return "redirect:/";
  }
}
