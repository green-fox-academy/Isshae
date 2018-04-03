package com.greenfoxacademy.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;


@Controller
public class HelloWebController {

  private AtomicLong counter = new AtomicLong(0);

  @GetMapping("/web/greeting")
  public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model,
                         Model model2) {
    model.addAttribute("name", name);
    model2.addAttribute("id", counter.incrementAndGet());
    return "greeting";
  }
}
