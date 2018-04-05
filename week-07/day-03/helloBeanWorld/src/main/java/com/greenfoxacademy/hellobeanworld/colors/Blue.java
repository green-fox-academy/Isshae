package com.greenfoxacademy.hellobeanworld.colors;


import org.springframework.stereotype.Component;

@Component
public class Blue implements MyColor {
  @Override
  public void printColor() {
    System.out.println("It is blue in color...");
  }
}
