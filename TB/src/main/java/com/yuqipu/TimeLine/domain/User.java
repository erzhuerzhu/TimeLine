package com.yuqipu.TimeLine.domain;

public class User {
    private String userid;
    private String email;
    private String password;

    public User() {
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
  }

    @Override
    public String toString() {
        return "User"+userid+":"+email;
    }
}
