package com.greenfoxacademy.restapiworkshop.controllers;


import com.greenfoxacademy.restapiworkshop.models.*;
import com.greenfoxacademy.restapiworkshop.services.DoUntilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestControllers {

  @Autowired
  DoUntilService doUntilService;


  @GetMapping("/doubling")
  public Doubling doubling(@RequestParam(name = "input", required = false) Integer input) {

    if (input == null) {
      return new Doubling();
    } else {
      return new Doubling(input);
    }
  }

  @GetMapping("/greeter")
  public Greeter greeter(@RequestParam(name = "name", required = false) String name,
                         @RequestParam(name = "title", required = false) String title) {
    if (name == null) {
      return new Greeter(name);
    } else if (title == null) {
      return new Greeter();
    } else {
      return new Greeter(name, title);
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Append append(@PathVariable(name = "appendable") String word) {
    return new Append(word);
  }

  @PostMapping("/dountil/{what}")
  public DoUntil doUntil(@PathVariable(name = "what", required = false) String what, @RequestBody Until until) {

    if (what.equals("sum") && !until.equals(null)) {
      return new DoUntil(doUntilService.add(until));
    } else if (what.equals("factor") && !until.equals(null)) {
      return new DoUntil(doUntilService.multiply(until));
    } else {
      return new DoUntil();
    }
  }
}
