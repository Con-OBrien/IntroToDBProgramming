import java.sql.Timestamp;
import java.util.List;
import java.util.Date;
import java.util.Iterator;

import entities.Trainer;
import entities.TrainerEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil1 {
    private static SessionFactory factory;
    public static void main(String[] args) {

        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        HibernateUtil1 ME = new HibernateUtil1();

        /* Add few employee records in database */
        Integer empID1 = ME.addTrainer(1, "Ali", "Pappa","Jack@gmail.com",new Timestamp(System.currentTimeMillis()));


        /* List down all the employees */
       // ME.listEmployees();

        /* Update employee's records */
     //   ME.updateEmployee(empID1, 5000);


        /* List down new list of the employees */
       // ME.listEmployees();
    }

    /* Method to CREATE an employee in the database */

    public Integer addTrainer(long trainerID, String username, String password, String email, Timestamp creationDate){
        Session session = factory.openSession();
        Transaction tx = null;
        Integer trainID = null;

        try {
            tx = session.beginTransaction();
            Trainer trainer = new Trainer(trainerID,username, email, password, creationDate);
            trainID = (Integer) session.save(trainer);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return trainID;
    }

    /* Method to  READ all the employees */
   /* public void listEmployees( ){
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            List employees = session.createQuery("FROM Employee").list();
            for (Iterator iterator = employees.iterator(); iterator.hasNext();){
                Employee employee = (Employee) iterator.next();
                System.out.print("First Name: " + employee.getFirstName());
                System.out.print("  Last Name: " + employee.getLastName());
                System.out.println("  Salary: " + employee.getSalary());
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    } */

    /* Method to UPDATE salary for an employee */
 /*   public void updateEmployee(Integer EmployeeID, int salary ){
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Employee employee = (Employee)session.get(Employee.class, EmployeeID);
            employee.setSalary( salary );
            session.update(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    } */

    /* Method to DELETE an employee from the records */
  /*  public void deleteEmployee(Integer EmployeeID){
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Employee employee = (Employee)session.get(Employee.class, EmployeeID);
            session.delete(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    } */
}