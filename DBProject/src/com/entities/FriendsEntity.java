package com.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Friends", schema = "dbo", catalog = "Pokemon")
@IdClass(FriendsEntityPK.class)
public class FriendsEntity {
    private short trainerId1;
    private short trainerId2;
    private Timestamp creationDate;

    @Id
    @Column(name = "TrainerID1")
    public short getTrainerId1() {
        return trainerId1;
    }

    public void setTrainerId1(short trainerId1) {
        this.trainerId1 = trainerId1;
    }

    @Id
    @Column(name = "TrainerID2")
    public short getTrainerId2() {
        return trainerId2;
    }

    public void setTrainerId2(short trainerId2) {
        this.trainerId2 = trainerId2;
    }

    @Basic
    @Column(name = "CreationDate")
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FriendsEntity that = (FriendsEntity) o;
        return trainerId1 == that.trainerId1 &&
                trainerId2 == that.trainerId2 &&
                Objects.equals(creationDate, that.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainerId1, trainerId2, creationDate);
    }
}
