package hibernate;

import javax.persistence.*;
import java.sql.Timestamp;

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

        if (trainerId != that.trainerId) return false;
        if (tName != null ? !tName.equals(that.tName) : that.tName != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (creationDate != null ? !creationDate.equals(that.creationDate) : that.creationDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) trainerId;
        result = 31 * result + (tName != null ? tName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        return result;
    }
}
