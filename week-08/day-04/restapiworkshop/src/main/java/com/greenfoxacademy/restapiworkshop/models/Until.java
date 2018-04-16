package com.greenfoxacademy.restapiworkshop.models;

import org.springframework.context.annotation.Primary;

public class Until {
  private Integer until;

  public Until() {
  }

  public Until(Integer until) {
    this.until = until;
  }

  public Integer getUntil() {
    return until;
  }

  public void setUntil(Integer until) {
    this.until = until;
  }
}
