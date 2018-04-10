package com.greenfoxacademy.listingtodoh2.repositories;

import com.greenfoxacademy.listingtodoh2.models.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo,Long> {

}
