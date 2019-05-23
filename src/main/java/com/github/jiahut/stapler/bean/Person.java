package com.github.jiahut.stapler.bean;

import org.kohsuke.stapler.export.Exported;
import org.kohsuke.stapler.export.ExportedBean;

@ExportedBean
public class Person {
  @Exported
  public String name;
  @Exported
  public int getAge() {
    return 28;
  }
  @Exported
  public Person getFather() {
    return new Person();
  }
}
