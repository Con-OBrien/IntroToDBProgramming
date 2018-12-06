import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import  org.hibernate.query.Query;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dbo.Trainer", schema = "Pokemon")
public class Trainer {
  @Id
  @Column(name = "TrainerID")
  private long trainerId;

    public long getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(long trainerId) {
        this.trainerId = trainerId;
    }

  @Column(name = "TName")
  private String tName;

    public String getTName() {
        return tName;
    }

    public void setTName(String tName) {
        this.tName = tName;
    }

  @Column(name = "Password")
  private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  @Column(name = "Email")
  private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  @Column(name = "CreationDate")
  private String creationDate;

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }








  public static void createTrainer(long id, String TName, String email, String password, String creationDate) {
      Configuration config = new Configuration();
      config.addAnnotatedClass(Pokemon.class);
      SessionFactory factory = config.configure().buildSessionFactory();
      Session session = factory.getCurrentSession();
      session.beginTransaction();
      Trainer newTrainer = new Trainer();
      newTrainer.setTrainerId(id);
      newTrainer.setTName(TName);
      newTrainer.setEmail(email);
      newTrainer.setPassword(password);
      newTrainer.setCreationDate(creationDate);
      session.save(newTrainer);
      session.getTransaction().commit();
  }
}
