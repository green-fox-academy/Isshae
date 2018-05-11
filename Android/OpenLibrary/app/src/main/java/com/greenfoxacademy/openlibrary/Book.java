package com.greenfoxacademy.openlibrary;


import java.util.List;

public class Book {

  private List<Doc> docs;
  private List<Doc> works;

  public List<Doc> getDocs() {
    return docs;
  }

  public Book(List<Doc> docs) {
    this.docs = docs;
  }

  public Book() {
  }

  public Book(List<Doc> docs, List<Doc> works) {
    this.docs = docs;
    this.works = works;
  }

  public List<Doc> getWorks() {
    return works;
  }
}
