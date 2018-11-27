package com.decoration;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;

import com.GUI.*;
import com.sample.*;

public class AddAccountDecoration extends JFrame implements ActionListener {

    private JLabel usernameLabel = new JLabel("Username:");
    private JLabel emailLabel = new JLabel("Email");
    private JLabel passwordLabel = new JLabel("Password");
    private JLabel confirmPasswordLabel = new JLabel("Confirm Password");
    private JTextField usernameField = new JTextField(15);
    private JTextField emailField = new JTextField(15);
    private JTextField passwordField = new JTextField(15);
    private JTextField confirmPasswordField = new JTextField(15);

    public AddAccountDecoration() {


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

        if(e.getActionCommand().equals("Back")) {
            System.out.println("yes");
            dispose();
            HomeGUI g = new HomeGUI();
            g.setVisible(true);
        }

        if(e.getActionCommand().equals("Add Account")) {
            Trainer.insertSQL(1,usernameField.getText(),emailField.getText(), passwordField.getText(),new Timestamp(System.currentTimeMillis()));
        }
          //
    }


   /* private boolean blankValidationCheck() {
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
    } */
}
