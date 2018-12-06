package hibernate;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class TrainerPokemonEntityPK implements Serializable {
    private short pokemonId;
    private short trainerId;

    @Column(name = "PokemonID")
    @Id
    public short getPokemonId() {
        return pokemonId;
    }

    public void setPokemonId(short pokemonId) {
        this.pokemonId = pokemonId;
    }

    @Column(name = "TrainerID")
    @Id
    public short getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(short trainerId) {
        this.trainerId = trainerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrainerPokemonEntityPK that = (TrainerPokemonEntityPK) o;

        if (pokemonId != that.pokemonId) return false;
        if (trainerId != that.trainerId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) pokemonId;
        result = 31 * result + (int) trainerId;
        return result;
    }
}
