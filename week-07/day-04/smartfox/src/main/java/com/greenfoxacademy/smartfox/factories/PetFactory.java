package com.greenfoxacademy.smartfox.factories;

import com.greenfoxacademy.smartfox.databases.PetDB;
import com.greenfoxacademy.smartfox.models.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PetFactory {

  public Pet createPet(String petName) {
    Pet pet = new Pet(petName);
    return pet;
  }
}
