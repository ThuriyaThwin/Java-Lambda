
package com.solt.samples;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ButtonLambda extends JFrame {

    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private Container contentPane;

    public ButtonLambda() {
        super("Lambda Button");
        LafUtils.SetNimbusLaf();
        setLayout(new FlowLayout());
        contentPane = getContentPane();
        contentPane.setBackground(Color.LIGHT_GRAY);

        btn1 = new JButton("Blue");
        btn2 = new JButton("Red");
        btn3 = new JButton("Green");

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                contentPane.setBackground(Color.BLUE);
            }
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                contentPane.setBackground(Color.RED);
            }
        });
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                contentPane.setBackground(Color.green);
            }
        });
      

        contentPane.add(btn1);
        contentPane.add(btn2);
        contentPane.add(btn3);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ButtonLambda();
            }
        });
    }
}
