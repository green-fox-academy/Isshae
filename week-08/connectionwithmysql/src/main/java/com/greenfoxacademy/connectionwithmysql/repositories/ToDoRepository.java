package com.greenfoxacademy.connectionwithmysql.repositories;

import com.greenfoxacademy.connectionwithmysql.models.ToDo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<ToDo, Long> {

  List<ToDo> findAllByTitle(String title);

  List<ToDo> findAllByIsDoneIsFalse();

  ToDo findOneById(Long id);
}
