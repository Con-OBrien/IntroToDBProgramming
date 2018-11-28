package com.battle;

import com.GUI.GameGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BattleSequence extends JFrame implements ActionListener {

    private JMenuBar menuBar;

    public BattleSequence() {
        setIconImage(new ImageIcon(".\\images\\Poke_Ball-512.png").getImage());
        setTitle("PokeTrumps");
        setSize(750,500);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        backMenu();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(screenSize.width/2-getSize().width/2, screenSize.height/2-getSize().height/2);

        Dimension d = new Dimension();
        d.setSize(750,500);
        setPreferredSize(d);
        GridLayout layout = new GridLayout(2, 2);
        setLayout(layout);

        decoratingBattle();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void decoratingBattle() {

        JPanel jp = new JPanel();
        JLabel label1 = new JLabel("Your Pokemon");
        jp.add(label1);

        jp.setBackground(Color.blue);

        JPanel jp2 = new JPanel(new BorderLayout());
        JLabel label2 = new JLabel("Their Pokemon");
        label2.setForeground(Color.white);
        jp2.add(label2);
        jp2.setBackground(Color.RED);


        JPanel jp3 = new JPanel();

        JLabel chooseStat = new JLabel("Choose your pokemon...");
        jp3.add(chooseStat);

        JButton pokemon1 = new JButton("Venasaur");
        JButton pokemon2 = new JButton("Charizard");
        JButton pokemon3 = new JButton("Blastoise");
        JButton pokemon4 = new JButton("Raichu");
        JButton pokemon5 = new JButton("Mewtwo");

        jp3.add(pokemon1);
        jp3.add(pokemon2);
        jp3.add(pokemon3);
        jp3.add(pokemon4);
        jp3.add(pokemon5);



        jp3.setBackground(Color.WHITE);





        JPanel jp4 = new JPanel();
        jp4.setBackground(Color.WHITE);

        JLabel label3 = new JLabel("Choose your stat...");
        jp4.add(label3);

        JButton button1 = new JButton("Attack");
        JButton button2 = new JButton("Defence");
        JButton button3 = new JButton("SpecialAttack");
        JButton button4 = new JButton("SpecialDefence");
        JButton button5 = new JButton("Speed");

        jp4.add(button1);
        jp4.add(button2);
        jp4.add(button3);
        jp4.add(button4);
        jp4.add(button5);



        add(jp);
        add(jp2);
        add(jp3);
        add(jp4);

    }
    public void backMenu() {

        JMenu backButton = new JMenu("Quit");
        menuBar.add(backButton);

        JMenuItem backItem;

        backItem = new JMenuItem("Quit Game");
        backButton.add(backItem);
        backItem.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("Quit Game")) {
            int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit this game?", "PokeTrumps", JOptionPane.YES_NO_OPTION);
            if(reply == JOptionPane.YES_OPTION) {
                dispose();
                GameGUI g = new GameGUI();
                g.setVisible(true);
            }

        }

    }
}
