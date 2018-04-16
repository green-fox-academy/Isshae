package com.greenfoxacademy.restapiworkshop.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Greeter {

  private String welcome_message;
  private String name;
  private String title;
  private String error;

  public Greeter(String name, String title) {
    this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public Greeter(String name) {
    this.error = "Please provide a name!";
  }

  public Greeter() {
    this.error = "Please provide a title!";
  }

  //  "welcome_message": "Oh, hi there Petike, my dear student!"

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
