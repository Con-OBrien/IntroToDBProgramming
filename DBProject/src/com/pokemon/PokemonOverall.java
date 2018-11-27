package com.pokemon;

import com.GUI.GameGUI;
import com.GUI.HomeGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PokemonOverall extends JFrame implements ActionListener {

    private JMenuBar menuBar;

    public PokemonOverall() {
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

        //actual data for the table in a 2d array
        Object[][] data = new Object[][] {
                {1, "Venasaur", 100, 100, 100, 100, 100 },
                {16, "Persian", 100, 86, 100, 24, 134 },
                {43, "Dragonite", 60, 60, 60, 60, 60 },
        };
        //create table with data
        JTable table = new JTable(data, columns);

        //add the table to the frame
        this.add(new JScrollPane(table));

        this.setTitle("Pokemon Favourites");
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
        if(e.getActionCommand().equals("Back")) {
            dispose();
            GameGUI g = new GameGUI();
            g.setVisible(true);
        }
    }
}