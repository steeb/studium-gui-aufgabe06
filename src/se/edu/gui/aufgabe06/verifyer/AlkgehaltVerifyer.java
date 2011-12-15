/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.edu.gui.aufgabe06.verifyer;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author steeb
 */
public class AlkgehaltVerifyer extends InputVerifier{

    @Override
    public boolean verify(JComponent jc) {
        return ((JTextField)(jc)).getText().matches("\\d{0,2}(,\\d)?");
    }
    
}
