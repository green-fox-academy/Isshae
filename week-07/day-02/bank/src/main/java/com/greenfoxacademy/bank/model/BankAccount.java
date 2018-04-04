package com.greenfoxacademy.bank.model;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

  private String name;
  private double balance;
  private String animalType;
  private String currency;

  public BankAccount() {
  }

  public BankAccount(String name, double balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = "Zebra";

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Override
  public String toString() {
    return "name = " + name  +
            ", balance = " + balance + currency +
            ", animalType = " + animalType + " \n ";
  }
}
