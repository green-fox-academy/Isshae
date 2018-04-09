package com.greenfoxacademy.smartfox.models;

import org.springframework.stereotype.Component;
import sun.font.CoreMetrics;

import java.util.ArrayList;
import java.util.List;


public class Pet {

  private String petName;
  private List<String> skills;

  public Pet(String petsName) {
    this.petName = petsName;
    this.skills = new ArrayList<>();
  }

  public String getPetName() {
    return petName;
  }

  public void setPetName(String petName) {
    this.petName = petName;
  }

  public List<String> getSkills() {
    return skills;
  }

  public void setSkills(List<String> skills) {
    this.skills = skills;
  }

  @Override
  public String toString() {
    return petName;
  }
}
