package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.models.Assignee;
import com.greenfoxacademy.connectionwithmysql.models.ToDo;
import com.greenfoxacademy.connectionwithmysql.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AssigneeController {
  @Autowired
  AssigneeRepository assigneeRepository;

  @GetMapping("/assigneelist")
  public String viewAssigneeList(Model model){
    model.addAttribute("assignees",assigneeRepository.findAll());
    return "assigneelist";
  }

  @GetMapping("/addnewassignee")
  public String viewAddNewAssigneePage() {
    return "addnewassignee";
  }

  @PostMapping("/addnewassignee")
  public String addNewTodo(@ModelAttribute(name = "name") String name,
                           @ModelAttribute(name = "email")String email) {
    assigneeRepository.save(new Assignee(name,email));
    return "redirect:/assigneelist";
  }

  @GetMapping(value = {"/{id}/assignee"})
  public String deleteaAssignee(@PathVariable(name = "id") Long id) {
    assigneeRepository.deleteById(id);
    return "redirect:/assigneelist";
  }
}
