package com.springtest.javaconf;

import java.io.IOException;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class AppConfig {

   @Bean(name = "helloWorldBean")
   public HelloWorld helloWorld() {
      return new HelloWorldImpl();
   }

   @Bean
   public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
      PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
      ppc.setLocation(new ClassPathResource("placeholders.properties"));
      ppc.setPlaceholderPrefix("${p:");
      return new PropertySourcesPlaceholderConfigurer();
   }

   @Bean
   public static PropertyPlaceholderConfigurer ppc() throws IOException {
      PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
      ppc.setLocation(new ClassPathResource("placeholders.properties"));
      ppc.setPlaceholderPrefix("${p:");
      return ppc;
   }

}
