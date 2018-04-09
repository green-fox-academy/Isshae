package com.greenfoxacademy.smartfox;

import com.greenfoxacademy.smartfox.databases.PetDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartfoxApplication implements CommandLineRunner {

  @Autowired
  PetDB petDB;

  public static void main(String[] args) {
    SpringApplication.run(SmartfoxApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println(petDB.PET_LIST);
  }
}
