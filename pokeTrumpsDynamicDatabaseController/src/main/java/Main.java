import hibernate.PokemonEntity;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.security.auth.login.AppConfigurationEntry;

public class Main {

    private static final SessionFactory mySession;

    static{
        try {
            Configuration config = new Configuration();
            config.configure();

            mySession = config.buildSessionFactory();
        }catch (Throwable ex){
            throw  new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException{
        return mySession.openSession();
    }
    public static void main(String[] args) {
        final Session session = getSession();
        try{
            try{
                String hql = "Select attack from PokemonEntity where pokemonId = :id";
                Query myQuery = session.createQuery(hql);
                myQuery.setParameter("id", (short)21);
                short PokemonID = (Short) myQuery.getSingleResult();
                System.out.println(PokemonID);
            }catch(HibernateException e){

            }
        }finally{
            session.close();
        }
      //  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");


        //Trainer.createTrainer(1,"yes","no","hello","18/APR/2010");
       // EntityManager entityManager = entityManagerFactory.createEntityManager();

        //entityManager.persist(trainer);
        //entityManager.getTransaction().commit();

        //entityManagerFactory.close();


    }
}
