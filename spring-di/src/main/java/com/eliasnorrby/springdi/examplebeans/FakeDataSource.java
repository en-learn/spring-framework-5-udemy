package com.eliasnorrby.springdi.examplebeans;

public class FakeDataSource {
  private String User;
  private String password;
  private String url;

  public String getUser() {
    return User;
  }

  public void setUser(String user) {
    User = user;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
