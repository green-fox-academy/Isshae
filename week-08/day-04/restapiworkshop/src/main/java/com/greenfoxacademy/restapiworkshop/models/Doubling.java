package com.greenfoxacademy.restapiworkshop.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.stereotype.Component;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Doubling {

  private Integer received;
  private Integer result;
  private String error;

  public Doubling(Integer input) {
    this.received = input;
    this.result = input * 2;
  }

  public Doubling() {
    this.error = "Please provide an input!";
  }

  public Integer getReceived() {
    return received;
  }

  public void setReceived(Integer received) {
    this.received = received;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
