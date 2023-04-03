package org.example;

import com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme;
import org.example.view.MainPanel;

import javax.swing.*;


public class Main {
    public static JFrame mainFrame = new JFrame(String.valueOf(FlatOneDarkIJTheme.setup()));


    public static void main(String[] args) {
        System.out.println("Hello world!");
        mainFrame.setTitle("BearBurger");
        mainFrame.setResizable(false);
        MainPanel mainPanel = new MainPanel();
        mainFrame.setContentPane(mainPanel.panel);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}