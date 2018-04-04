package com.greenfoxacademy.bank.controller;

import com.greenfoxacademy.bank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerClass {

  @GetMapping("/show")
  public String show( @RequestParam(name = "bankAccount", required = false) BankAccount bankAccount,Model model ) {
    bankAccount = new BankAccount("Simba", 2000, "Lion");
    model.addAttribute("name",bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("animalType", bankAccount.getAnimalType());
    return "bankAccount";
  }

  @GetMapping("/submit")
  public String submit(@RequestParam(name = "submit", required = false) String submit, Model model){
    submit = "\"This is an <em>HTML</em> text. <b>Enjoy yourself!</b>\"";
    model.addAttribute("submit", submit);
    return "submit";
  }
}
