package entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "Battle", schema = "dbo", catalog = "Pokemon")
public class BattleEntity {
    private short battleId;
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
        return battleId == that.battleId &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(battleId, date);
    }
}
