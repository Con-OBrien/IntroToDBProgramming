import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.sample.*;

public class GameGUI extends JFrame implements ActionListener {

    public GameGUI() {

        setIconImage(new ImageIcon(".\\images\\Poke_Ball-512.png").getImage());
        setTitle("PokeTrumps");
        setSize(500, 300);

        getScreenSize();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(decorationButtons());
    }
    public static void main(String[] args) {
            GameGUI game = new GameGUI();
            game.setVisible(true);
    }
    public void getScreenSize() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(screenSize.width/2-getSize().width/2, screenSize.height/2-getSize().height/2);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("Create Account")) {
            System.out.println("yes");
            DecorationPanels dec = new DecorationPanels();
            setVisible(false);
        }
        else if(e.getActionCommand().equals("Log In")) {
            logIn();
        }
    }

    private JPanel decorationButtons() {
       JPanel panel = new JPanel();
        JButton createAccButton = new JButton("Create Account");
        createAccButton.addActionListener(this);
        JButton loginButton = new JButton("Log In");
        loginButton.addActionListener(this);

        panel.add(createAccButton);
        panel.add(loginButton);
        panel.setLocation(200, 200);
        return panel;
    }

    private void addAccountDecoration() {

        removeAll();
        setLayout(new GridLayout(0,1));
        JPanel panel = new JPanel(new GridLayout(10,1));

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

    }

    private void logIn() {

    }
}
