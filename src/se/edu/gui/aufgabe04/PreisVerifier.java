/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.edu.gui.aufgabe04;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author steeb
 */
public class PreisVerifier extends InputVerifier{

    @Override
    public boolean verify(JComponent jc) {
        return ((JTextField)jc).getText().matches("\\d*,?\\d{0,2}");
    }
    
}
