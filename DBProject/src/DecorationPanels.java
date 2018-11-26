import javax.swing.*;

public class DecorationPanels extends JPanel {

    public DecorationPanels() {


        JLabel usernameLabel = new JLabel("Username:");
        JLabel emailLabel = new JLabel("Email");
        JLabel passwordLabel = new JLabel("Password");
        JLabel confirmPasswordLabel = new JLabel("Confirm Password");

        JTextField usernameField = new JTextField(15);
        JTextField emailField = new JTextField(15);
        JPasswordField passwordField = new JPasswordField(15);
        JPasswordField confirmPasswordField = new JPasswordField(15);

        add(usernameLabel);
        add(usernameField);
        add(emailLabel);
        add(emailField);
        add(passwordLabel);
        add(passwordField);
        add(confirmPasswordLabel);
        add(confirmPasswordField);

        JButton addAccount = new JButton("Add Account");

        add(addAccount);

    }
}
