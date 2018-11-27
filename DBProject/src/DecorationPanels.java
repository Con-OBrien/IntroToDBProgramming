import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.sample.*;


public class DecorationPanels extends JFrame implements ActionListener {

    private JLabel usernameLabel = new JLabel("Username:");
    private JLabel emailLabel = new JLabel("Email");
    private JLabel passwordLabel = new JLabel("Password");
    private JLabel confirmPasswordLabel = new JLabel("Confirm Password");
    private JTextField usernameField = new JTextField(15);
    private JTextField emailField = new JTextField(15);
    private JPasswordField passwordField = new JPasswordField(15);
    private JPasswordField confirmPasswordField = new JPasswordField(15);

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
        Trainer trainer = new Trainer();
        trainer.validateInfo();

    }
}
