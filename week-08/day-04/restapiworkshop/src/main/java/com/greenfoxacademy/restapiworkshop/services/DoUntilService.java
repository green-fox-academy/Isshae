package com.greenfoxacademy.restapiworkshop.services;

import com.greenfoxacademy.restapiworkshop.models.Until;
import org.springframework.stereotype.Component;

@Component
public class DoUntilService {

  public Integer add(Until until) {
    Integer result = 0;

    for (int i = 1; i <= until.getUntil(); i++) {
      result += i;
    }
    return result;
  }

  public Integer multiply(Until until) {
    Integer result = 1;

    for (int i = 1; i <= until.getUntil(); i++) {
      result *= i;
    }
    return result;
  }
}
