package com.samples.el.examples;

import java.util.*;
import javax.faces.bean.*;

@ManagedBean(name="testBean1")
@ApplicationScoped
public class TestBean1 {
  private Date creationTime = new Date();
  private String greeting = "Hello";

  public Date getCreationTime() {
    return(creationTime);
  }

  public String getGreeting() {
    return(greeting);
  }

  public double getRandomNumber() {
    return(Math.random());
  }
}


//@RequestScoped  -> request
//SessonScoped -> Session

//@ApplcatonScoped  -> ServletContext/Context/jsp application