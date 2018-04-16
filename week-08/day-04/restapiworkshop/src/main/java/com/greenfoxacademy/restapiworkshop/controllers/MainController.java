package com.greenfoxacademy.restapiworkshop.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

  @GetMapping("/")
  public String viewIndex() {
    return "index";
  }
}
