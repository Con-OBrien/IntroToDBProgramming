package entities;


import java.sql.*;

public class Trainer {

  private long trainerId;
  private String tName;
  private String password;
  private String email;
  private Timestamp creationDate;

    public Trainer(long trainerId, String tName, String password, String email, Timestamp creationDate) {
        setTrainerId(trainerId);
        setTName(tName);
        setPassword(password);
        setEmail(email);
        setCreationDate(creationDate);


    }


  public long getTrainerId() {
    return trainerId;
  }

  public void setTrainerId(long trainerId) {
    this.trainerId = trainerId;
  }


  public String getTName() {
    return tName;
  }

  public void setTName(String tName) {
    this.tName = tName;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public Timestamp getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Timestamp creationDate) {
    this.creationDate = creationDate;
  }

    public static void insertSQL(long trainerID, String tname, String email, String password, Timestamp timestamp)
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost;database=Pokemon;integratedSecurity=true");

            System.out.println("Pokemon: " + connection.getMetaData().getDatabaseProductName());

            //Prevents SQL Injection
            PreparedStatement prep = connection.prepareStatement("INSERT INTO Trainer(TrainerID, TName, Password, Email, CreationDate, StatusCodeID)");
            prep.setLong(1, trainerID);
            prep.setString(2, tname);
            prep.setString(3, password);
            prep.setString(4, email);
            prep.setTimestamp(5, timestamp);
            prep.executeUpdate();
            System.out.println("Data Inserted");

            ResultSet resultSet = prep.executeQuery("SELECT TName FROM Trainer");

            while(resultSet.next())
            {
                System.out.println("Trainer ID: " + resultSet.getString("Name"));
            }

            connection.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.err.println("Problem Connecting!");
        }
    }
 /* public boolean validateInfo(String username, String email, String password, String confirmPassword) {

    boolean check = false;

      if(validateUsername(username)) {
            if(validateEmail(email)) {
                if(validatePassword(password)) {
                    if(password.equals(confirmPassword)) {
                        check = true;
                    }
                    else
                        System.out.println("Password does not match confirmation");
                }
                else
                    System.out.println("Password failed");
            }
            else
                System.out.println("Email failed");
    }
    else
        System.out.println("Username failed");

    return check;

  }

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$");
    public static final Pattern VALID_USERNAME_REGEX = Pattern.compile("[a-zA-Z0-9\\._\\-]{3,}");
    public static final Pattern VALID_PASSWORD_REGEX = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}");

    private static boolean validateEmail(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
        return matcher.find();
    }

    private static boolean validateUsername(String usernameStr) {
        Matcher matcher = VALID_USERNAME_REGEX .matcher(usernameStr);
        return matcher.find();
    }

    private static boolean validatePassword(String passwordStr) {
        Matcher matcher = VALID_PASSWORD_REGEX .matcher(passwordStr);
        return matcher.find();
    }*/

}
