/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

/**
 *
 * @author Estudiante
 */
public class Ventana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vista vista = new Vista();
        Model modelo = new Model();
        Controller control = new Controller(modelo, vista);
        control.startApp();
    }
    
}
