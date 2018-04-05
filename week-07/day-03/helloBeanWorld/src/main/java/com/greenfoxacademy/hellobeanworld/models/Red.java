package com.greenfoxacademy.hellobeanworld.models;

import com.greenfoxacademy.hellobeanworld.services.MyColor;

public class Red implements MyColor {
  @Override
  public void printColor() {
    System.out.println("It is red in color...");
  }
}
