package com.example.lambdatest.chapter2;

import com.example.lambdatest.MyFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstLambda {
    public static void main(String[] args) {
        JButton button = MyFrame.getButton();
        /*
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
            }
        });
        */

        // 위 코드는 아래와 같이 개선될 수 있다.

        button.addActionListener(event -> System.out.println("button Clicked"));

        new MyFrame();

    }
}
