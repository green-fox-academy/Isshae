package com.greenfoxacademy.smartfox.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginControler {

  @GetMapping("/login")
  public String showLoginPage(){
    return "login";
  }
}
