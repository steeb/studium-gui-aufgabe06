/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.edu.gui.aufgabe06.verifyer;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author steeb
 */
public class VerifyAllOnSwitchingComponent implements FocusListener {
    
    List<JTextField> textfields = new LinkedList<JTextField>();
    
    public void addTextfield(JTextField tf) {
        textfields.add(tf);
    }

    @Override
    public void focusGained(FocusEvent fe) {
        for (JTextField tf : textfields) {
            if (tf.getInputVerifier().verify(tf)) {
                JOptionPane.showMessageDialog(null, "Test", "test", JOptionPane.OK_OPTION);
                tf.requestFocus();
            }
        }
    }

    @Override
    public void focusLost(FocusEvent fe) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
