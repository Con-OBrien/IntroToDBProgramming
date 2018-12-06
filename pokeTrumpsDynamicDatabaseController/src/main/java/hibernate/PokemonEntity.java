package hibernate;

import javax.persistence.*;
import java.util.Arrays;

@Entity
@Table(name = "Pokemon", schema = "dbo", catalog = "Pokemon")

//@NamedQuery(name = "getPokemon" query = select pok)
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

        if (pokemonId != that.pokemonId) return false;
        if (attack != that.attack) return false;
        if (defence != that.defence) return false;
        if (specialAttack != that.specialAttack) return false;
        if (specialDefence != that.specialDefence) return false;
        if (speed != that.speed) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (!Arrays.equals(image, that.image)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) pokemonId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) attack;
        result = 31 * result + (int) defence;
        result = 31 * result + (int) specialAttack;
        result = 31 * result + (int) specialDefence;
        result = 31 * result + (int) speed;
        result = 31 * result + Arrays.hashCode(image);
        return result;
    }
}
