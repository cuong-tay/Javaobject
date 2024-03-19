package OOP.GUI;

import OOP.Paint.Circle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameEX {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CR7");
        frame.setSize(500,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(null);
        JButton btn= new JButton("siuuu");
        btn.setBounds(100,50,80,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        frame.add(btn);
    }
}
