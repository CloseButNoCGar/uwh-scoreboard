package com.closebutnocgar.uwh;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class Scoreboard extends JFrame{
    JPanel panel = new JPanel(new MigLayout());
    JPanel toPanel = new JPanel(new MigLayout());
    JPanel headPanel = new JPanel(new MigLayout());
    JPanel wPanel = new JPanel(new MigLayout());
    JPanel bPanel = new JPanel(new MigLayout());
    JPanel tPanel = new JPanel(new MigLayout());
    JPanel southPanel = new JPanel(new MigLayout());
    JLabel gameNumberLabel = new JLabel("This is game No.33");
    JLabel halfLabel = new JLabel("2nd Half");
    JLabel whiteTeamLabel = new JLabel("White");
    JLabel blackTeamLabel = new JLabel("Black");
    JLabel timerLabel = new JLabel("5:51");
    JLabel whiteScoreLabel = new JLabel("0");
    JLabel blackScoreLabel = new JLabel("5");
    JLabel courtTimeLabel = new JLabel("Court Time is 10:16:36 AM");
    JLabel timeoutLabel = new JLabel("Call Time Out");
    JLabel overTimeLabel = new JLabel("Time To Pull Back");
    JLabel overTimeValueLabel = new JLabel("3:03");
    JButton teamTimeOutButton = new JButton("Team");
    JButton refTimeOutButton = new JButton("Ref&");
    JButton whiteGoalButton = new JButton("Goal");
    JButton blackGoalButton= new JButton("Goal");

    public Scoreboard(){
        initialise();
    }

    private void initialise() {
        setTitle("Scoreboard");
        setBounds(15, 15, 1300, 762);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);

        buildWindow();
        addListeners();
    }

    private void buildWindow(){
        toPanel.add(timeoutLabel,"align center, span 2, wrap");
        toPanel.add(teamTimeOutButton);
        toPanel.add(refTimeOutButton, "wrap");
        toPanel.add(overTimeLabel, "align center, span 2, wrap");
        toPanel.add(overTimeValueLabel, "align center, span 2");
        headPanel.add(gameNumberLabel, "wrap");
        headPanel.add(halfLabel);
        southPanel.add(courtTimeLabel);
        wPanel.add(whiteTeamLabel, "wrap");
        wPanel.add(whiteScoreLabel, "wrap");
        wPanel.add(whiteGoalButton);
        bPanel.add(blackTeamLabel, "wrap");
        bPanel.add(blackScoreLabel, "wrap");
        bPanel.add(blackGoalButton);
        tPanel.add(timerLabel);
        panel.add(wPanel);
        panel.add(tPanel);
        panel.add(bPanel);
        panel.add(toPanel, "east");
        panel.add(southPanel, "south");
        panel.add(headPanel, "north");



        getContentPane().add(panel);
    }

    private void addListeners(){

    }


}
