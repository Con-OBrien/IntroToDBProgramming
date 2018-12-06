import javax.persistence.*;

@Entity
@Table(name = "round_table")
public class Round {
    @Id
    @GeneratedValue(generator = "incrementor")
  private long roundId;

    @Column(name = "battleId")
  private long battleId;

    @Column(name = "trainerPokemonId")
  private long trainerPokemonId;

    @Column(name = "trainer2PokemonId")
  private long trainer2PokemonId;

    @Column(name = "firstTrainerId")
  private long firstTrainerId;

    @Column(name = "statChosen")
  private String statChosen;

    @Column(name = "winnerId")
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
