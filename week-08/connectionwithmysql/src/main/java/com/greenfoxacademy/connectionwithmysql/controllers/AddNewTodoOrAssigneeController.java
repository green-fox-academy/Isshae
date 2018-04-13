package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.Assignee;
import com.greenfoxacademy.connectionwithmysql.models.ToDo;
import com.greenfoxacademy.connectionwithmysql.repositories.AssigneeRepository;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddNewTodoOrAssigneeController {

  @Autowired
  AssigneeRepository assigneeRepository;
  @Autowired
  TodoRepository todoRepository;

  @GetMapping("/addnewassignee")
  public String viewAddNewAssigneePage() {
    return "add-new-assignee";
  }

  @PostMapping("/addnewassignee")
  public String addNewAssignee(@ModelAttribute(name = "name") String name,
                               @ModelAttribute(name = "email") String email) {
    assigneeRepository.save(new Assignee(name, email));
    return "redirect:/assigneelist";
  }

  @GetMapping("/addnew")
  public String viewAddNewTodo() {
    return "add-new";
  }

  @PostMapping("/addnew")
  public String addNewTodo(@ModelAttribute(name = "todo") String todo) {
    todoRepository.save(new ToDo(todo));
    return "redirect:/";
  }
}
