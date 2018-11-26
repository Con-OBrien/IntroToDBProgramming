package com.sample;


public class Round {

  private long roundId;
  private long battleId;
  private long trainerPokemonId;
  private long trainer2PokemonId;
  private long firstTrainerId;
  private String statChosen;
  private long winnerId;


  public long getRoundId() {
    return roundId;
  }

  public void setRoundId(long roundId) {
    this.roundId = roundId;
  }


  public long getBattleId() {
    return battleId;
  }

  public void setBattleId(long battleId) {
    this.battleId = battleId;
  }


  public long getTrainerPokemonId() {
    return trainerPokemonId;
  }

  public void setTrainerPokemonId(long trainerPokemonId) {
    this.trainerPokemonId = trainerPokemonId;
  }


  public long getTrainer2PokemonId() {
    return trainer2PokemonId;
  }

  public void setTrainer2PokemonId(long trainer2PokemonId) {
    this.trainer2PokemonId = trainer2PokemonId;
  }


  public long getFirstTrainerId() {
    return firstTrainerId;
  }

  public void setFirstTrainerId(long firstTrainerId) {
    this.firstTrainerId = firstTrainerId;
  }


  public String getStatChosen() {
    return statChosen;
  }

  public void setStatChosen(String statChosen) {
    this.statChosen = statChosen;
  }


  public long getWinnerId() {
    return winnerId;
  }

  public void setWinnerId(long winnerId) {
    this.winnerId = winnerId;
  }

}
