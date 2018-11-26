package com.sample;


public class TrainerPokemon {

  private long pokemonId;
  private long trainerId;
  private String team;
  private String favourite;


  public long getPokemonId() {
    return pokemonId;
  }

  public void setPokemonId(long pokemonId) {
    this.pokemonId = pokemonId;
  }


  public long getTrainerId() {
    return trainerId;
  }

  public void setTrainerId(long trainerId) {
    this.trainerId = trainerId;
  }


  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }


  public String getFavourite() {
    return favourite;
  }

  public void setFavourite(String favourite) {
    this.favourite = favourite;
  }

}
