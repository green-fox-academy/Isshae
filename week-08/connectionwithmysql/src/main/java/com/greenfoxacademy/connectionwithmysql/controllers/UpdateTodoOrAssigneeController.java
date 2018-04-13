package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.Assignee;
import com.greenfoxacademy.connectionwithmysql.models.ToDo;
import com.greenfoxacademy.connectionwithmysql.repositories.AssigneeRepository;
import com.greenfoxacademy.connectionwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UpdateTodoOrAssigneeController {

  @Autowired
  TodoRepository todoRepository;

  @Autowired
  AssigneeRepository assigneeRepository;

  @GetMapping("/update/{id}")
  public String viewUpdateTudo(@PathVariable(name = "id") Long id, Model model) {
    model.addAttribute("todo", todoRepository.findOneById(id));
    return "update-todo";
  }

  @PostMapping("/update/{id}")
  public String update(ToDo toDo) {
    todoRepository.save(toDo);
    return "redirect:/";
  }

  @GetMapping("/updateassignee")
  public String viewUpdateAssignee() {
    return "update-assignee";
  }

  @PostMapping("/updateassignee")
  public String updateAssignee(@PathVariable(name = "assignee") Assignee assignee) {
    assigneeRepository.save(assignee);
    return "redirect:/assigneelist";
  }
}