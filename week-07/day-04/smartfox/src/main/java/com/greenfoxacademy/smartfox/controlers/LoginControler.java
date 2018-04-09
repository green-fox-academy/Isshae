package com.greenfoxacademy.smartfox.controlers;

import com.greenfoxacademy.smartfox.databases.PetDB;
import com.greenfoxacademy.smartfox.factories.PetFactory;
import com.greenfoxacademy.smartfox.models.Pet;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginControler {

  private PetService petService;

  @Autowired
  public LoginController(PetService petService) {
    this.petService = petService;
  }

  @GetMapping("/login")
  public String viewLoginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String login(@ModelAttribute(name = "petName") String petName, Model model) {
    model.addAttribute("petName", petName);
    return "redirect:/";
  }
}
