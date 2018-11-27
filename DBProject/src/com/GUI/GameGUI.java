package com.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameGUI extends JFrame implements ActionListener {

    public GameGUI() {

        setIconImage(new ImageIcon(".\\images\\Poke_Ball-512.png").getImage());
        setTitle("PokeTrumps");
        setSize(500, 300);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(screenSize.width/2-getSize().width/2, screenSize.height/2-getSize().height/2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

        JLabel label = new JLabel("Welcome to PokeTrumps");

    }


    public void actionPerformed(ActionEvent e) {

    }
}
