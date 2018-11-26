import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameGUI extends JFrame implements ActionListener {

    private GameGUI() {

        setIconImage(new ImageIcon(".\\images\\Poke_Ball-512.png").getImage());
        setTitle("PokeTrumps");
        setSize(500, 300);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(screenSize.width/2-getSize().width/2, screenSize.height/2-getSize().height/2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(decorationButtons());
        //add(addAccountDecoration());

        DecorationPanels dec = new DecorationPanels();
        dec.setVisible(true);
        add(dec);


    }
    public static void main(String[] args) {
            GameGUI game = new GameGUI();
            game.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("Create Account")) {
            add(addAccountDecoration());

        }
        else if(e.getActionCommand().equals("Log In")) {
            logIn();
        }
    }

    private JPanel decorationButtons() {
       JPanel panel = new JPanel();
        JButton createAccButton = new JButton("Create Account");
        JButton loginButton = new JButton("Log In");

        panel.add(createAccButton);
        panel.add(loginButton);
        panel.setLocation(200, 200);
        return panel;
    }

    private JPanel addAccountDecoration() {
        JPanel panel = new JPanel();

        JLabel usernameLabel = new JLabel("Username:");
        JLabel emailLabel = new JLabel("Email");
        JLabel passwordLabel = new JLabel("Password");
        JLabel confirmPasswordLabel = new JLabel("Confirm Password");

        JTextField usernameField = new JTextField(15);
        JTextField emailField = new JTextField(15);
        JPasswordField passwordField = new JPasswordField(15);
        JPasswordField confirmPasswordField = new JPasswordField(15);

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(confirmPasswordLabel);
        panel.add(confirmPasswordField);

        JButton addAccount = new JButton("Add Account");

        panel.add(addAccount);

        return panel;
    }

    private void logIn() {

    }
}
