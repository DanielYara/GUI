/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class MessageListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(null, "Oprimiste el botón.");
    }
}
