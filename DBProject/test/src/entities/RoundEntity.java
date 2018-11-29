package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Round", schema = "dbo", catalog = "Pokemon")
public class RoundEntity {
    private short roundId;
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
        return roundId == that.roundId &&
                trainerPokemonId == that.trainerPokemonId &&
                trainer2PokemonId == that.trainer2PokemonId &&
                firstTrainerId == that.firstTrainerId &&
                winnerId == that.winnerId &&
                Objects.equals(statChosen, that.statChosen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roundId, trainerPokemonId, trainer2PokemonId, firstTrainerId, statChosen, winnerId);
    }
}
