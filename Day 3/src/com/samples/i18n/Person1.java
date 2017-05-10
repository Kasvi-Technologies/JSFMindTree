package com.samples.i18n;

import javax.faces.bean.*;

@ManagedBean
public class Person1 extends Person {
  @Override
  public String doRegistration() {
    return("success1");
  }
}
