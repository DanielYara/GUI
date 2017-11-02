/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Estudiante
 */
public class Controller implements ActionListener{
    private Model model;
    private Vista vista;

    public Controller(Model model, Vista vista) {
        this.model = model;
        this.vista = vista;
        this.vista.setControl(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        this.model.setText(this.vista.getText().getText());
        this.vista.showMessage(this.model.getText());
    }
    
    public void startApp(){
        this.vista.setVisible(true);
    }
    
}
