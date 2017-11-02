/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import javax.swing.*;

/**
 *
 * @author Estudiante
 */
public class GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = JOptionPane.showInputDialog(null, "¿Cual es tu nombre?");
        int choice = JOptionPane.showConfirmDialog(null, "¿Te gusta comer pastel, " + name + "?");
        if(choice == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "De acuerdo, ¿a quien no?");
        } else if(choice == JOptionPane.CLOSED_OPTION){
            JOptionPane.getDesktopPaneForComponent(null);
        }
        else{
            JOptionPane.showMessageDialog(null, "Estamos de acuerdo en que no lo estamos.");
        }
    }
    
}
