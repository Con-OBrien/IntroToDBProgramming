package hibernate;

import javax.persistence.*;

@Entity
@Table(name = "TrainerPokemon", schema = "dbo", catalog = "Pokemon")
@IdClass(TrainerPokemonEntityPK.class)
public class TrainerPokemonEntity {
    private short pokemonId;
    private short trainerId;
    private boolean team;
    private boolean favourite;

    @Id
    @Column(name = "PokemonID")
    public short getPokemonId() {
        return pokemonId;
    }

    public void setPokemonId(short pokemonId) {
        this.pokemonId = pokemonId;
    }

    @Id
    @Column(name = "TrainerID")
    public short getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(short trainerId) {
        this.trainerId = trainerId;
    }

    @Basic
    @Column(name = "Team")
    public boolean isTeam() {
        return team;
    }

    public void setTeam(boolean team) {
        this.team = team;
    }

    @Basic
    @Column(name = "Favourite")
    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrainerPokemonEntity that = (TrainerPokemonEntity) o;

        if (pokemonId != that.pokemonId) return false;
        if (trainerId != that.trainerId) return false;
        if (team != that.team) return false;
        if (favourite != that.favourite) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) pokemonId;
        result = 31 * result + (int) trainerId;
        result = 31 * result + (team ? 1 : 0);
        result = 31 * result + (favourite ? 1 : 0);
        return result;
    }
}
