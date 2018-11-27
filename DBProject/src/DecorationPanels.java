import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Date;

import com.sample.*;


public class DecorationPanels extends JFrame implements ActionListener {

    private JLabel usernameLabel = new JLabel("Username:");
    private JLabel emailLabel = new JLabel("Email");
    private JLabel passwordLabel = new JLabel("Password");
    private JLabel confirmPasswordLabel = new JLabel("Confirm Password");
    private JTextField usernameField = new JTextField(15);
    private JTextField emailField = new JTextField(15);
    private JTextField passwordField = new JTextField(15);
    private JTextField confirmPasswordField = new JTextField(15);

    public DecorationPanels() {


        setIconImage(new ImageIcon(".\\images\\Poke_Ball-512.png").getImage());
        setTitle("PokeTrumps");
        setSize(500,300);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(screenSize.width/2-getSize().width/2, screenSize.height/2-getSize().height/2);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(new GridLayout(0,1));
        JPanel panel = new JPanel(new GridLayout(10,1));
        add(panel);

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(confirmPasswordLabel);
        panel.add(confirmPasswordField);

        JButton addAccount = new JButton("Add Account");
        addAccount.addActionListener(this);
        panel.add(addAccount);

        pack();
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        boolean blanksCheck = blankValidationCheck();

        if(blanksCheck) {


            Trainer trainer = new Trainer();
            boolean check = trainer.validateInfo(usernameField.getText(), emailField.getText(),
                    passwordField.getText(), confirmPasswordField.getText());

            if (check) {
                trainer.setTName(usernameField.getText());
                trainer.setEmail(emailField.getText());
                trainer.setPassword(passwordField.getText());
                trainer.setCreationDate(new Timestamp(System.currentTimeMillis()));

            }

        }
        else
            System.out.println("\nPlease re-enter correctly!");
    }
    private boolean blankValidationCheck() {
        boolean check = false;
        if(!usernameField.getText().equals("")) {
            if(!emailField.getText().equals("")) {
                if(!passwordField.getText().equals("")) {
                    if(!confirmPasswordField.getText().equals("")) {
                      check = true;
                    }
                    else
                        System.out.println("Confirm password is empty");
                }
                else
                    System.out.println("Password is empty");
            }
            else
                System.out.println("Email is empty");
        }
        else
            System.out.println("Username is empty");

        return check;
    }
}
