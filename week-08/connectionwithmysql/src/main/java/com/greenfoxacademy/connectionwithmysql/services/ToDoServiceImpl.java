package com.greenfoxacademy.connectionwithmysql.services;

import com.greenfoxacademy.connectionwithmysql.models.ToDo;
import com.greenfoxacademy.connectionwithmysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoServiceImpl implements ToDoService {

  @Autowired
  ToDoRepository toDoRepository;

  @Override
  public List<ToDo> getTodos() {
    List<ToDo> toDoList = new ArrayList<>();
    toDoRepository
            .findAll()
            .forEach(toDoList::add);
    return toDoList;
  }

  @Override
  public List<ToDo> getActiveTodos() {
    List<ToDo> activeToDoList = new ArrayList<>();
    getTodos()
            .stream()
            .filter(t -> !t.isDone())
            .forEach(activeToDoList::add);
    return activeToDoList;
  }
}
