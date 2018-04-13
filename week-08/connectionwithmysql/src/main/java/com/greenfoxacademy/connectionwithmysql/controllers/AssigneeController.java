package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AssigneeController {
  @Autowired
  AssigneeRepository assigneeRepository;

  @GetMapping("/assigneelist")
  public String viewAssigneeList(Model model) {
    model.addAttribute("assignees", assigneeRepository.findAll());
    return "assignee-list";
  }

  @GetMapping(value = {"/assigneelist/{id}"})
  public String deleteaAssignee(@PathVariable(name = "id") Long id) {
    assigneeRepository.deleteById(id);
    return "redirect:/assigneelist";
  }
}
