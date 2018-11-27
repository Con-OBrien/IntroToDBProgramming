package com.classes;


public class Pokemon {

  private long pokemonId;
  private String name;
  private long attack;
  private long defence;
  private long specialAttack;
  private long specialDefence;
  private long speed;
  private String image;


  public long getPokemonId() {
    return pokemonId;
  }

  public void setPokemonId(long pokemonId) {
    this.pokemonId = pokemonId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getAttack() {
    return attack;
  }

  public void setAttack(long attack) {
    this.attack = attack;
  }


  public long getDefence() {
    return defence;
  }

  public void setDefence(long defence) {
    this.defence = defence;
  }


  public long getSpecialAttack() {
    return specialAttack;
  }

  public void setSpecialAttack(long specialAttack) {
    this.specialAttack = specialAttack;
  }


  public long getSpecialDefence() {
    return specialDefence;
  }

  public void setSpecialDefence(long specialDefence) {
    this.specialDefence = specialDefence;
  }


  public long getSpeed() {
    return speed;
  }

  public void setSpeed(long speed) {
    this.speed = speed;
  }


  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

}
