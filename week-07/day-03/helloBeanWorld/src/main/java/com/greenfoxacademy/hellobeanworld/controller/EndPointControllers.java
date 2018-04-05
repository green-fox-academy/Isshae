package com.greenfoxacademy.hellobeanworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EndPointControllers {
  @Autowired
  UtilityService utilityService;

  @GetMapping("/useful")
  public String usefulController() {
    return "usefulTemplate";
  }

  @GetMapping("/useful/colored")
  public String coloredBackground(Model model) {
   model.addAttribute("randomColor",utilityService.randomColor());
    return "coloredBackground";
  }

  @GetMapping("/useful/email")
  public String email (@RequestParam("email")String email,Model model){
  model.addAttribute("isValid",utilityService.validateEmail(email));
  model.addAttribute("email",email);
    return "emailValidatorTemplate";
  }
}
