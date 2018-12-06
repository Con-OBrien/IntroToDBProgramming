import javax.persistence.*;

@Entity
@Table(name = "battle_table")
public class Battle {
@Id
@GeneratedValue(generator = "incrementor")
  private long battleId;

@Column(name = "trainerId1")
  private long trainerId1;

@Column(name = "trainerId2")
  private long trainerId2;

@Column(name = "date")
  private java.sql.Timestamp date;


  public long getBattleId() {
    return battleId;
  }

  public void setBattleId(long battleId) {
    this.battleId = battleId;
  }


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


  public java.sql.Timestamp getDate() {
    return date;
  }

  public void setDate(java.sql.Timestamp date) {
    this.date = date;
  }

}
