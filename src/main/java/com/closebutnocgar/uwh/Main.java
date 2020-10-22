package com.closebutnocgar.uwh;

import static java.awt.EventQueue.invokeLater;

public class Main {
    public static void main(String[] args){
        invokeLater(() -> {
            try {
                Scoreboard window = new Scoreboard();
                window.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
