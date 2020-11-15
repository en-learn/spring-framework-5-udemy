package com.eliasnorrby.springdi.config;

import com.eliasnorrby.springdi.examplebeans.FakeDataSource;
import com.eliasnorrby.springdi.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
// Either of these will work fine:
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
  @PropertySource("classpath:datasource.properties"),
  @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

  @Autowired
  Environment env;

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
    fakeDataSource.setUsername(env.getProperty("USERNAME"));
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
