package com.example.lambdatest.chapter2;

import com.example.lambdatest.MyFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UseOfValue {
    public static void main(String[] args) {
        String name = "woong";
        JButton button = MyFrame.getButton();

        /*
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hi " + name);
            }
        });
        */

        // 람다식을 이용하면 아래와 같이 축약할 수 있다.
        button.addActionListener(event -> System.out.println("hi " + name));

        new MyFrame();
    }
}
