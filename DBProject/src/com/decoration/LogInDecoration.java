package com.decoration;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.GUI.*;

public class LogInDecoration extends JFrame implements ActionListener {
    private JLabel usernameLabel = new JLabel("Username:");
    private JLabel passwordLabel = new JLabel("Password");
    private JTextField usernameField = new JTextField(15);
    private JTextField passwordField = new JTextField(15);

    public LogInDecoration() {


        setIconImage(new ImageIcon(".\\images\\Poke_Ball-512.png").getImage());
        setTitle("PokeTrumps");
        setSize(500,300);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(screenSize.width/2-getSize().width/2, screenSize.height/2-getSize().height/2);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        JMenu backButton = new JMenu("Back");
        menuBar.add(backButton);

        JMenuItem backItem;

        backItem = new JMenuItem("Back");
        backButton.add(backItem);
        backButton.addActionListener(this);
        backItem.addActionListener(this);
        setLayout(new GridLayout(0,1));
        JPanel panel = new JPanel(new GridLayout(10,1));
        add(panel);

        panel.add(menuBar);
        panel.add(usernameLabel);
        panel.add(usernameField);

        panel.add(passwordLabel);
        panel.add(passwordField);


        JButton addAccount = new JButton("Add Account");
        addAccount.addActionListener(this);
        panel.add(addAccount);

        pack();
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Back")) {
            dispose();
            HomeGUI g = new HomeGUI();
            g.setVisible(true);
        }
        else if(e.getActionCommand().equals("Add Account")) {
            dispose();
            GameGUI g = new GameGUI();
            g.setVisible(true);
        }
    }
}
