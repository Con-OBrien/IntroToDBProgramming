package com.sample;


import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Trainer {

  private long trainerId;
  private String tName;
  private String password;
  private String email;
  private java.sql.Timestamp creationDate;


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


  public java.sql.Timestamp getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(java.sql.Timestamp creationDate) {
    this.creationDate = creationDate;
  }

  public boolean validateInfo(String username, String email, String password, String confirmPassword) {

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

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
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
    }

}
