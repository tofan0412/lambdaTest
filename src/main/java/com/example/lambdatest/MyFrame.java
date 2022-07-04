package com.example.lambdatest;

import javax.swing.*;

public class MyFrame extends JFrame {
    // 클래스 변수 지정
    static JButton button = new JButton("Click");

    // Getter & Setter 설정
    public static JButton getButton() {
        return button;
    }

    public static void setButton(JButton button) {
        MyFrame.button = button;
    }

    public MyFrame() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My Title");

        this.add(button);
        setVisible(true);
    }
}
