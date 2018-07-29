package edu.buet.cse.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootRestApplication {

  public static void main(String... args) {
    ApplicationContext appContext = SpringApplication.run(SpringBootRestApplication.class, args);
    System.out.println("Printing all bean names...");

    for (String name : appContext.getBeanDefinitionNames()) {
      System.out.println(name);
    }
  }
}
