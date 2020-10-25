package com.eliasnorrby.springdi;

import com.eliasnorrby.springdi.controllers.ConstructorInjectedController;
import com.eliasnorrby.springdi.controllers.MyController;
import com.eliasnorrby.springdi.controllers.PropertyInjectedController;
import com.eliasnorrby.springdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

    System.out.println("---- Primary Bean");
    MyController myController = (MyController) ctx.getBean("myController");
    System.out.println(myController.sayHello());

    System.out.println("---- Property");

    PropertyInjectedController propertyInjectedController =
        (PropertyInjectedController) ctx.getBean("propertyInjectedController");

    System.out.println(propertyInjectedController.getGreeting());

    System.out.println("---- Setter");

    SetterInjectedController setterInjectedController =
        (SetterInjectedController) ctx.getBean("setterInjectedController");

    System.out.println(setterInjectedController.getGreeting());

    System.out.println("--- Contstructor");

    ConstructorInjectedController constructorInjectedController =
        (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

    System.out.println(constructorInjectedController.getGreeting());
  }
}
