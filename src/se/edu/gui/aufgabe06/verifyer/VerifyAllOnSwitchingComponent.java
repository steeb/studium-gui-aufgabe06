/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.edu.gui.aufgabe06.verifyer;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author steeb
 */
public class VerifyAllOnSwitchingComponent extends MouseAdapter {
    
    List<JTextField> textfields = new LinkedList<JTextField>();
    
    public void addTextfield(JTextField tf) {
        textfields.add(tf);
    }

    @Override
    public void mousePressed(MouseEvent me) {
        for (JTextField tf : textfields) {
            if (!tf.getInputVerifier().verify(tf)) {
                JOptionPane.showMessageDialog(null, "Falsch ausgefüllt", "Bitte im richtigen Format ausfüllen", JOptionPane.OK_OPTION);
                tf.requestFocus();
            }
        }
    }
}
