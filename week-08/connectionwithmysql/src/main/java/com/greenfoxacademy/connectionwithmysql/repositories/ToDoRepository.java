package com.greenfoxacademy.connectionwithmysql.repositories;

import com.greenfoxacademy.connectionwithmysql.models.ToDo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ToDoRepository extends CrudRepository<ToDo,Long> {

  public List<ToDo> findAllByIsDoneIsFalse();
  public List<ToDo> findAllByIsUrgentIsTrue();
  public List<ToDo> findAllByIsDoneIsTrue();
  public List<ToDo> findAllByTitle(String title);

}
