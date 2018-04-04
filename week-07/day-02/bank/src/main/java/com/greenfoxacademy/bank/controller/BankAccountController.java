package com.greenfoxacademy.bank.controller;

import com.greenfoxacademy.bank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {

  @GetMapping("/show")
    public String show(Model model) {
    BankAccount bankAccount = new BankAccount("Simba", 2000, "Lion");
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("animalType", bankAccount.getAnimalType());
    model.addAttribute("currency", bankAccount.getCurrency());
    return "bankAccount";
  }

  @GetMapping("/submit")
  public String submit(Model model) {
    String submit = "\"This is an <em>HTML</em> text. <b>Enjoy yourself!</b>\"";
    model.addAttribute("submit", submit);
    return "submit";
  }

  @GetMapping("/accountList")
  public String accountList( Model model) {
    List<BankAccount> accounts = new ArrayList<>();
    accounts.add(new BankAccount("Zazu", 10000, "Bird"));
    accounts.add(new BankAccount("Zordon", 5000, "Lion",true));
    accounts.add(new BankAccount("Pumba", 200, "Pig"));
    accounts.add(new BankAccount("Timon", 4000, "Rat",true));
    accounts.add(new BankAccount("Nala", 3000, "Lion"));
    model.addAttribute("accounts", accounts);
    return "accountList";
  }
}
