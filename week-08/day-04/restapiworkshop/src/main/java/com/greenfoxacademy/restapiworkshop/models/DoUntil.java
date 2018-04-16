package com.greenfoxacademy.restapiworkshop.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.greenfoxacademy.restapiworkshop.services.DoUntilService;
import org.springframework.beans.factory.annotation.Autowired;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DoUntil {

  @Autowired
  DoUntilService doUntilService;

  private Integer result;
  private String error;

  public DoUntil( Integer result) {
    this.result = result;
  }

  public DoUntil() {
    this.error = "Please provide a number!";
  }

  public DoUntilService getDoUntilService() {
    return doUntilService;
  }

  public void setDoUntilService(DoUntilService doUntilService) {
    this.doUntilService = doUntilService;
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
