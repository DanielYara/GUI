/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import javax.swing.*;                   

/**
 *
 * @author Estudiante
 */
public class SimpleFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        Image icon = Toolkit.getDefaultToolkit().getImage("caution.gif");
        frame.setIconImage(icon);
        JPanel panel = (JPanel) frame.getContentPane();
        panel.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setTitle("Alerta");
        frame.setLayout(new FlowLayout());
//        
//        frame.setLayout(new GridLayout(2, 3));
//        for(int i = 1; i<= 6; i++)
//            frame.add(new JButton("Soy el botón " + i));
//        
        
        
        
        JLabel label = new JLabel("Escribir: ");
        JTextField text = new JTextField(5);
        frame.add(label);
        frame.add(text);
        JButton b1 = new JButton();
        b1.setText("I'm a Button");
        b1.setBackground(Color.RED);
        b1.addActionListener(new MessageListener());
        frame.add(b1);
        JButton b2 = new JButton();
        b2.setText("You can't click me!");
        b2.setBackground(Color.blue);
        b2.addActionListener(new MessageListener());
        frame.add(b2);
        frame.pack();
        
        frame.setVisible(true);
    }
    
}
