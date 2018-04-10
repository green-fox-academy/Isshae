package com.greenfoxacademy.connectionwithmysql.services;

import com.greenfoxacademy.connectionwithmysql.models.ToDo;

import java.util.List;

public interface ToDoService {
  public List<ToDo> getTodos();

  public List<ToDo> getActiveTodos();
}
