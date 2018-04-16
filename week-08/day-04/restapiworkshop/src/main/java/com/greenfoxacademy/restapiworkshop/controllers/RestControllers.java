package com.greenfoxacademy.restapiworkshop.controllers;


import com.greenfoxacademy.restapiworkshop.models.Doubling;
import com.greenfoxacademy.restapiworkshop.models.Greeter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {

  @GetMapping("/doubling")
  public Doubling doubling(@RequestParam(name = "input", required = false) Integer input) {

    if (input == null) {
      return new Doubling();
    } else {
      return new Doubling(input);
    }
  }

  @GetMapping("/greeter")
  public Greeter greeter(@RequestParam(name = "name",required = false) String name,
                         @RequestParam(name = "title",required = false) String title) {
    if (name == null) {
      return new Greeter();
    } else {
      return new Greeter("Oh, hi there " + name + ", my dear " + title + " !");
    }
  }
}
