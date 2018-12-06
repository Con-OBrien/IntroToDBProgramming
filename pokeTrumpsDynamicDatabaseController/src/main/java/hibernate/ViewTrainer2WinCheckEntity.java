package hibernate;

import javax.persistence.*;

@Entity
@Table(name = "view_Trainer2WinCheck", schema = "dbo", catalog = "Pokemon")
public class ViewTrainer2WinCheckEntity {
    private Integer roundsWon;

    @Id
    @Column(name = "Rounds_Won")
    public Integer getRoundsWon() {
        return roundsWon;
    }

    public void setRoundsWon(Integer roundsWon) {
        this.roundsWon = roundsWon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewTrainer2WinCheckEntity that = (ViewTrainer2WinCheckEntity) o;

        if (roundsWon != null ? !roundsWon.equals(that.roundsWon) : that.roundsWon != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return roundsWon != null ? roundsWon.hashCode() : 0;
    }

    /*private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }*/
}
