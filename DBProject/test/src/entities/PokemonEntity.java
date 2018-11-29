package entities;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "Pokemon", schema = "dbo", catalog = "Pokemon")
public class PokemonEntity {
    private short pokemonId;
    private String name;
    private short attack;
    private short defence;
    private short specialAttack;
    private short specialDefence;
    private short speed;
    private byte[] image;

    @Id
    @Column(name = "PokemonID")
    public short getPokemonId() {
        return pokemonId;
    }

    public void setPokemonId(short pokemonId) {
        this.pokemonId = pokemonId;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Attack")
    public short getAttack() {
        return attack;
    }

    public void setAttack(short attack) {
        this.attack = attack;
    }

    @Basic
    @Column(name = "Defence")
    public short getDefence() {
        return defence;
    }

    public void setDefence(short defence) {
        this.defence = defence;
    }

    @Basic
    @Column(name = "SpecialAttack")
    public short getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(short specialAttack) {
        this.specialAttack = specialAttack;
    }

    @Basic
    @Column(name = "SpecialDefence")
    public short getSpecialDefence() {
        return specialDefence;
    }

    public void setSpecialDefence(short specialDefence) {
        this.specialDefence = specialDefence;
    }

    @Basic
    @Column(name = "Speed")
    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    @Basic
    @Column(name = "Image")
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PokemonEntity that = (PokemonEntity) o;
        return pokemonId == that.pokemonId &&
                attack == that.attack &&
                defence == that.defence &&
                specialAttack == that.specialAttack &&
                specialDefence == that.specialDefence &&
                speed == that.speed &&
                Objects.equals(name, that.name) &&
                Arrays.equals(image, that.image);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(pokemonId, name, attack, defence, specialAttack, specialDefence, speed);
        result = 31 * result + Arrays.hashCode(image);
        return result;
    }
}
