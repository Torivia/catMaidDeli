//package com.pluralsight;
//import javax.swing.*;
//import java.awt.*;
//
//public class UI {
//    PopUpManager pm;
//    JFrame window;
//    public JTextArea messageText;
//    public JPanel bgPanel[] = new JPanel[10];
//    public JLabel bgLabel[] = new JLabel[10];
//
//
//    public UI(PopUpManager pm) {
//        this.pm = pm;
//        createMainField();
//        window.setVisible(true);
//        createBackground();
//    }
//
//    public void createMainField() {
//        window = new JFrame();
//        window.setSize(1200, 800);
//        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        window.getContentPane().setBackground(Color.black);
//        window.setLayout(null);
//
//        messageText = new JTextArea("SAMPLE TEXT :3");
//        messageText.setBounds(80, 500, 1000, 250);
//        messageText.setBackground(Color.blue);
//        messageText.setForeground(Color.pink);
//        messageText.setEditable(false);
//        messageText.setLineWrap(true);
//        messageText.setWrapStyleWord(true);
//        messageText.setFont(new Font("Book Antiqua", Font.PLAIN, 26));
//        window.add(messageText);
//    }
//    public void createBackground() {
//        bgPanel[1] = new JPanel();
//        bgPanel[1].setBounds(80, 50, 1000, 450);
//        bgPanel[1].setBackground(Color.orange);
//        bgPanel[1].setLayout(null);
//        window.add(bgPanel[1]);
//
//        bgLabel[1] = new JLabel();
//        bgLabel[1].setBounds(0,0,1000,450);
//
//    }
//}
