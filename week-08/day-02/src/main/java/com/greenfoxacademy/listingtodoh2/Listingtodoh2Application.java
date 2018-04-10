package com.greenfoxacademy.listingtodoh2;

import com.greenfoxacademy.listingtodoh2.models.ToDo;
import com.greenfoxacademy.listingtodoh2.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Listingtodoh2Application implements CommandLineRunner {

  @Autowired
  ToDoRepository toDoRepository;

  public static void main(String[] args) {
    SpringApplication.run(Listingtodoh2Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    List<ToDo> toDoList = Arrays.asList(
            toDoRepository.save(new ToDo("Start the Day")),
            toDoRepository.save(new ToDo("Finish H2 workshop1")),
            toDoRepository.save(new ToDo("Finish JPA workshop 2")),
            toDoRepository.save(new ToDo("Create a CRUD project")));
  }
}
