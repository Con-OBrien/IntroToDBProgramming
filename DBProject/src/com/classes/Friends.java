package com.classes;


public class Friends {

  private long trainerId1;
  private long trainerId2;
  private java.sql.Timestamp creationDate;


  public long getTrainerId1() {
    return trainerId1;
  }

  public void setTrainerId1(long trainerId1) {
    this.trainerId1 = trainerId1;
  }


  public long getTrainerId2() {
    return trainerId2;
  }

  public void setTrainerId2(long trainerId2) {
    this.trainerId2 = trainerId2;
  }


  public java.sql.Timestamp getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(java.sql.Timestamp creationDate) {
    this.creationDate = creationDate;
  }

}
