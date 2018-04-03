package com.greenfoxacademy.springstart.controller;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

  private long id;
  private String content;
  private static final AtomicLong counter = new AtomicLong(0);

  public Greeting( String content) {
    this.id = counter.incrementAndGet();
    this.content = content;

  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
