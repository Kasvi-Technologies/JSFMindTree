package com.samples.el.examples;

import javax.faces.bean.*;

@ManagedBean
public class Employee1 extends Employee {
  public Employee1() {
    super(new Name("Marty", "Hall"),
          new Company("http://anil-check.blogspot.com",
                      "Customized Java EE and Ajax Training"));
  }
}
