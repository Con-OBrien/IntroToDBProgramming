package com.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class FriendsEntityPK implements Serializable {
    private short trainerId1;
    private short trainerId2;

    @Column(name = "TrainerID1")
    @Id
    public short getTrainerId1() {
        return trainerId1;
    }

    public void setTrainerId1(short trainerId1) {
        this.trainerId1 = trainerId1;
    }

    @Column(name = "TrainerID2")
    @Id
    public short getTrainerId2() {
        return trainerId2;
    }

    public void setTrainerId2(short trainerId2) {
        this.trainerId2 = trainerId2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FriendsEntityPK that = (FriendsEntityPK) o;
        return trainerId1 == that.trainerId1 &&
                trainerId2 == that.trainerId2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainerId1, trainerId2);
    }
}
