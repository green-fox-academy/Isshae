package com.greenfoxacademy.hellobeanworld.models;

import com.greenfoxacademy.hellobeanworld.services.MyColor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Green implements MyColor {
  @Override
  public void printColor() {
    System.out.println("It is green in color...");
  }
}
