/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telefono;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Estudiante
 */
public class Telefono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(250, 200));
        frame.setTitle("Telefóno");
        frame.setLayout(new BorderLayout());
        
        JPanel centerPanel = new JPanel(new GridLayout(4, 3));
        for(int i = 1; i <= 9; i++){
            centerPanel.add(new JButton("" + i));
        }
        centerPanel.add(new JButton("*"));
        centerPanel.add(new JButton("0"));
        centerPanel.add(new JButton("#"));
        frame.add(centerPanel, BorderLayout.CENTER);
        
        JPanel southPanel = new JPanel(new FlowLayout());
        southPanel.add(new JLabel("Número a marcar: "));
        southPanel.add(new JTextField(10));
        frame.add(southPanel, BorderLayout.SOUTH);
        
        frame.setVisible(true);
    }
    
}
