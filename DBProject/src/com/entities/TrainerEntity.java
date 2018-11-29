package com.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Trainer", schema = "dbo", catalog = "Pokemon")
public class TrainerEntity {
    private short trainerId;
    private String tName;
    private String password;
    private String email;
    private Timestamp creationDate;

    @Id
    @Column(name = "TrainerID")
    public short getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(short trainerId) {
        this.trainerId = trainerId;
    }

    @Basic
    @Column(name = "TName")
    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    @Basic
    @Column(name = "Password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        TrainerEntity that = (TrainerEntity) o;
        return trainerId == that.trainerId &&
                Objects.equals(tName, that.tName) &&
                Objects.equals(password, that.password) &&
                Objects.equals(email, that.email) &&
                Objects.equals(creationDate, that.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainerId, tName, password, email, creationDate);
    }
}
