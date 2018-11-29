package com.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

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
        return pokemonId == that.pokemonId &&
                trainerId == that.trainerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pokemonId, trainerId);
    }
}
