package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public String hello;
  
  public Greeter() {

  }

/**
   * This is a method.
   */
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
