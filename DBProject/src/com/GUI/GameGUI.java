package com.GUI;

import com.battle.BattleSequence;
import com.decoration.AddAccountDecoration;
import com.decoration.LogInDecoration;
import com.pokemon.PokemonFavourites;
import com.pokemon.PokemonOverall;
import com.pokemon.PokemonTeam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameGUI extends JFrame implements ActionListener {

    private JMenuBar menuBar;

    public GameGUI() {

        setIconImage(new ImageIcon(".\\images\\Poke_Ball-512.png").getImage());
        setTitle("PokeTrumps");
        setSize(500, 300);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(screenSize.width/2-getSize().width/2, screenSize.height/2-getSize().height/2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //setLayout(new GridLayout(0,1));
        //JPanel panel = new JPanel(new GridLayout(10,1));
       // add(panel);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        battleMenu();
        pokemonMenu();
        logOutMenu();

        JLabel label = new JLabel("Welcome to PokeTrumps");
        label.setLocation(200,200);
        add(label);

    }

    public static void main(String[] args) {
        GameGUI gameGUI = new GameGUI();
        gameGUI.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("Battle")) {
            BattleSequence seq = new BattleSequence();
            setVisible(false);
        }
        else if(e.getActionCommand().equals("Team")) {
            PokemonTeam team = new PokemonTeam();
            setVisible(false);
        }
        else if(e.getActionCommand().equals("Team")) {
            PokemonTeam team = new PokemonTeam();
            setVisible(false);
        }
        else if(e.getActionCommand().equals("Favourites")) {
            PokemonFavourites team = new PokemonFavourites();
            setVisible(false);
        }
        else if(e.getActionCommand().equals("All")) {
            PokemonOverall team = new PokemonOverall();
            setVisible(false);
        }
        else if(e.getActionCommand().equals("Log Out")) {
            dispose();
            HomeGUI g = new HomeGUI();
            g.setVisible(true);
        }
    }

    private void battleMenu() {

        JMenu battleMenu = new JMenu("Battle");
        menuBar.add(battleMenu);

        JMenuItem battle;

        battle = new JMenuItem("Battle");

        battleMenu.add(battle);
        battle.addActionListener(this);

    }

    private void pokemonMenu() {

        JMenu pokemonMenu = new JMenu("Pokemon");
        menuBar.add(pokemonMenu);

        JMenuItem team, favourites, all;

        team = new JMenuItem("Team");
        favourites = new JMenuItem("Favourites");
        all = new JMenuItem("All");

        pokemonMenu.add(team);
        pokemonMenu.add(favourites);
        pokemonMenu.add(all);

        team.addActionListener(this);
        favourites.addActionListener(this);
        all.addActionListener(this);

    }

    private void logOutMenu() {

        JMenu logOutMenu = new JMenu("Log Out");
        menuBar.add(logOutMenu);

        JMenuItem logOut;

        logOut = new JMenuItem("Log Out");

        logOutMenu.add(logOut);
        logOut.addActionListener(this);

    }
}
