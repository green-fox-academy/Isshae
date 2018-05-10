package com.greenfoxacademy.openlibrary;


import java.util.List;

public class Book {

  private List<Doc> docs;

  public List<Doc> getDocs() {
    return docs;
  }

  public Book(List<Doc> docs) {
    this.docs = docs;
  }

  public Book() {
  }
}
