package com.eliasnorrby.springdi;

import com.eliasnorrby.springdi.controllers.MyController;
import com.eliasnorrby.springdi.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

    MyController myController = (MyController) ctx.getBean("myController");
    System.out.println(myController.sayHello());

    FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);

    System.out.println(fakeDataSource.getUser());
    System.out.println(fakeDataSource.getPassword());
  }
}
