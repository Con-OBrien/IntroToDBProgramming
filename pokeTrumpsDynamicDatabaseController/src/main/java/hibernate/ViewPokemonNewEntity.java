package hibernate;

import javax.persistence.*;

@Entity
@Table(name = "view_pokemonNEW", schema = "dbo", catalog = "Pokemon")
public class ViewPokemonNewEntity {
    private Short pokemonId;
    private String name;
    private short attack;
    private short defence;
    private short specialAttack;
    private short specialDefence;
    private short speed;

    @Id
    @Column(name = "PokemonID")
    public Short getPokemonId() {
        return pokemonId;
    }

    public void setPokemonId(Short pokemonId) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewPokemonNewEntity that = (ViewPokemonNewEntity) o;

        if (attack != that.attack) return false;
        if (defence != that.defence) return false;
        if (specialAttack != that.specialAttack) return false;
        if (specialDefence != that.specialDefence) return false;
        if (speed != that.speed) return false;
        if (pokemonId != null ? !pokemonId.equals(that.pokemonId) : that.pokemonId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pokemonId != null ? pokemonId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) attack;
        result = 31 * result + (int) defence;
        result = 31 * result + (int) specialAttack;
        result = 31 * result + (int) specialDefence;
        result = 31 * result + (int) speed;
        return result;
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
