package hibernate;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "Battle", schema = "dbo", catalog = "Pokemon")
public class BattleEntity {
    private short battleId;
    private Short trainerId1;
    private Short trainerId2;
    private Timestamp date;

    @Id
    @Column(name = "BattleID")
    public short getBattleId() {
        return battleId;
    }

    public void setBattleId(short battleId) {
        this.battleId = battleId;
    }

    @Basic
    @Column(name = "TrainerID1")
    public Short getTrainerId1() {
        return trainerId1;
    }

    public void setTrainerId1(Short trainerId1) {
        this.trainerId1 = trainerId1;
    }

    @Basic
    @Column(name = "TrainerID2")
    public Short getTrainerId2() {
        return trainerId2;
    }

    public void setTrainerId2(Short trainerId2) {
        this.trainerId2 = trainerId2;
    }

    @Basic
    @Column(name = "Date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BattleEntity that = (BattleEntity) o;

        if (battleId != that.battleId) return false;
        if (trainerId1 != null ? !trainerId1.equals(that.trainerId1) : that.trainerId1 != null) return false;
        if (trainerId2 != null ? !trainerId2.equals(that.trainerId2) : that.trainerId2 != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) battleId;
        result = 31 * result + (trainerId1 != null ? trainerId1.hashCode() : 0);
        result = 31 * result + (trainerId2 != null ? trainerId2.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
