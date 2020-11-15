package com.eliasnorrby.springdi.config;

import com.eliasnorrby.springdi.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

  @Value("${guru.username}")
  String user;

  @Value("${guru.password}")
  String password;

  @Value("${guru.dburl}")
  String url;

  @Bean
  public FakeDataSource fakeDataSource() {
    FakeDataSource fakeDataSource = new FakeDataSource();
    fakeDataSource.setUser(user);
    fakeDataSource.setPassword(password);
    fakeDataSource.setUrl(url);
    return fakeDataSource;
  }

  // This is not needed any more?
  //  @Bean
  //  PropertySourcesPlaceholderConfigurer properties() {
  //    PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
  //        new PropertySourcesPlaceholderConfigurer();
  //    System.out.println(
  //        "user = " + user);
  //    return propertySourcesPlaceholderConfigurer;
  //  }
}
