/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.edu.gui.aufgabe06;

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
        if (((JTextField)(jc)).getText().equals(""))
            return true;
        return ((JTextField)jc).getText().matches("\\d*,?\\d{0,2}");
    }
    
}
