/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Estudiante
 */
public class Vista extends JFrame{
    private JLabel label;
    private JTextField text;
    private JButton boton;
    private Controller control;
    
    public Vista(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(400, 300));
        setTitle("Ventana");
        setLayout(new FlowLayout());
        this.label = new JLabel("Agrega tu código: ");
        this.text = new JTextField(8);
        this.boton = new JButton("Ok");
        setLayout(new FlowLayout());
        add(label);
        add(text);
        add(boton);
        pack();
    }
    
    public void showMessage(String text){
        JOptionPane.showMessageDialog(null, text);
    }

    public void setText(JTextField text) {
        this.text = text;
    }

    public void setControl(Controller control) {
        this.control = control;
        this.boton.addActionListener((ActionListener) this.control);
    }

    public JTextField getText() {
        return text;
    }

    
    
}
