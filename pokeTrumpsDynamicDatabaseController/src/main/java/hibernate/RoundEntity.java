package hibernate;

import javax.persistence.*;

@Entity
@Table(name = "Round", schema = "dbo", catalog = "Pokemon")
public class RoundEntity {
    private short roundId;
    private short battleId;
    private short trainerPokemonId;
    private short trainer2PokemonId;
    private short firstTrainerId;
    private String statChosen;
    private short winnerId;

    @Id
    @Column(name = "RoundID")
    public short getRoundId() {
        return roundId;
    }

    public void setRoundId(short roundId) {
        this.roundId = roundId;
    }

    @Basic
    @Column(name = "BattleID")
    public short getBattleId() {
        return battleId;
    }

    public void setBattleId(short battleId) {
        this.battleId = battleId;
    }

    @Basic
    @Column(name = "TrainerPokemonID")
    public short getTrainerPokemonId() {
        return trainerPokemonId;
    }

    public void setTrainerPokemonId(short trainerPokemonId) {
        this.trainerPokemonId = trainerPokemonId;
    }

    @Basic
    @Column(name = "Trainer2PokemonID")
    public short getTrainer2PokemonId() {
        return trainer2PokemonId;
    }

    public void setTrainer2PokemonId(short trainer2PokemonId) {
        this.trainer2PokemonId = trainer2PokemonId;
    }

    @Basic
    @Column(name = "FirstTrainerID")
    public short getFirstTrainerId() {
        return firstTrainerId;
    }

    public void setFirstTrainerId(short firstTrainerId) {
        this.firstTrainerId = firstTrainerId;
    }

    @Basic
    @Column(name = "StatChosen")
    public String getStatChosen() {
        return statChosen;
    }

    public void setStatChosen(String statChosen) {
        this.statChosen = statChosen;
    }

    @Basic
    @Column(name = "WinnerID")
    public short getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(short winnerId) {
        this.winnerId = winnerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoundEntity that = (RoundEntity) o;

        if (roundId != that.roundId) return false;
        if (battleId != that.battleId) return false;
        if (trainerPokemonId != that.trainerPokemonId) return false;
        if (trainer2PokemonId != that.trainer2PokemonId) return false;
        if (firstTrainerId != that.firstTrainerId) return false;
        if (winnerId != that.winnerId) return false;
        if (statChosen != null ? !statChosen.equals(that.statChosen) : that.statChosen != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) roundId;
        result = 31 * result + (int) battleId;
        result = 31 * result + (int) trainerPokemonId;
        result = 31 * result + (int) trainer2PokemonId;
        result = 31 * result + (int) firstTrainerId;
        result = 31 * result + (statChosen != null ? statChosen.hashCode() : 0);
        result = 31 * result + (int) winnerId;
        return result;
    }
}
