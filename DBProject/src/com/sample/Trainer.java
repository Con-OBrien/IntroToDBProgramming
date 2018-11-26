package com.sample;


public class Trainer {

  private long trainerId;
  private String tName;
  private String password;
  private String email;
  private java.sql.Timestamp creationDate;


  public long getTrainerId() {
    return trainerId;
  }

  public void setTrainerId(long trainerId) {
    this.trainerId = trainerId;
  }


  public String getTName() {
    return tName;
  }

  public void setTName(String tName) {
    this.tName = tName;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public java.sql.Timestamp getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(java.sql.Timestamp creationDate) {
    this.creationDate = creationDate;
  }

}
