import javax.swing.*;
import java.awt.*;

public class GameGUI {

    private static void createWindow() {

        JFrame frame = new JFrame("PokeTrumps");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel text = new JLabel("Welcome to PokeTrumps",SwingConstants.CENTER);
        frame.add(text);

        JButton createAccountButton = new JButton("Create Account");
        createAccountButton.setBounds(250,200,95,30);
        frame.add(createAccountButton);

        JButton logInButton = new JButton("Log In");
        logInButton.setBounds(250,400,95,30);

        frame.add(logInButton);

        frame.setSize(500,500);

        frame.setLayout(null);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        createWindow();
    }
}
