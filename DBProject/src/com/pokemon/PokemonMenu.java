package com.pokemon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class PokemonMenu extends JFrame implements ActionListener {
    private JMenuBar menuBar;
    public PokemonMenu() {
        //headers for the table
        setIconImage(new ImageIcon(".\\images\\Poke_Ball-512.png").getImage());
        setTitle("PokeTrumps");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(screenSize.width/2-getSize().width/2, screenSize.height/2-getSize().height/2);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        backMenu();

        String[] columns = new String[] {
                "ID", "Name", "Attack", "Defence", "SpecialAttack", "SpecialDefence", "Speed"
        };

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
    public void backMenu() {

        JMenu backButton = new JMenu("Back");
        menuBar.add(backButton);

        JMenuItem backItem;

        backItem = new JMenuItem("Back");
        backButton.add(backItem);
        backItem.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {

    }
}
