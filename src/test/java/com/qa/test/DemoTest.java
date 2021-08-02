package com.qa.test;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DemoTest {
  @Test
  public void sum() {
  System.out.println("SUM");
  int a = 10;
  int b = 20;
  Assert.assertEquals(30, a+b);
  }
  
  @Test
  public void sub() {
  System.out.println("SUBSTRACTION");
  int a = 10;
  int b = 20;
  Assert.assertEquals(10, b-a);
  }


  @Test
  public void div() {
  System.out.println("DIVISION");
  int a = 10;
  int b = 20;
  Assert.assertEquals(2, b/a);
  }


  @Test
  public void multi() {
  System.out.println("MULTIPLICATION");
  int a = 10;
  int b = 20;
  Assert.assertEquals(200, a*b);
  }

}
