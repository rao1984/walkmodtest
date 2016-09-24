package com.springtest.javaconf;

import org.springframework.beans.factory.annotation.Value;

public class HelloWorldImpl implements HelloWorld {

   @Value("${p:name}")
   private String name;

   public void hello() {
      System.out.println("Hai from India" + name);
      if ("ss".equals(name)) {

      }
   }

}
