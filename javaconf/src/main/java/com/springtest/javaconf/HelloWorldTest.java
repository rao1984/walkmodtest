package com.springtest.javaconf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldTest {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
	HelloWorld helloWorld=(HelloWorld)applicationContext.getBean("helloWorldBean");
helloWorld.hello();
}
}
