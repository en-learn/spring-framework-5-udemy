package com.eliasnorrby.springdi.config;

import com.eliasnorrby.springdi.examplebeans.FakeDataSource;
import com.eliasnorrby.springdi.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {

  @Value("${guru.username}")
  String username;

  @Value("${guru.password}")
  String password;

  @Value("${guru.dburl}")
  String url;

  @Value("${guru.jms.username}")
  String jmsUsername;

  @Value("${guru.jms.password}")
  String jmsPassword;

  @Value("${guru.jms.url}")
  String jmsUrl;

  @Bean
  public FakeDataSource fakeDataSource() {
    FakeDataSource fakeDataSource = new FakeDataSource();
    fakeDataSource.setUsername(username);
    fakeDataSource.setPassword(password);
    fakeDataSource.setUrl(url);
    return fakeDataSource;
  }

  @Bean
  public FakeJmsBroker fakeJmsBroker() {
    FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
    fakeJmsBroker.setUsername(jmsUsername);
    fakeJmsBroker.setPassword(jmsPassword);
    fakeJmsBroker.setUrl(jmsUrl);
    return fakeJmsBroker;
  }
}
