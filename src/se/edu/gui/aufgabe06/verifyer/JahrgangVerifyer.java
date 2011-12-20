/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.edu.gui.aufgabe06.verifyer;

import java.util.Calendar;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author steeb
 */
public class JahrgangVerifyer extends InputVerifier{

    @Override
    public boolean verify(JComponent jc) {
        boolean test2 = false;
        if (((JTextField)(jc)).getText().equals(""))
            return true;
        boolean test1 = ((JTextField)(jc)).getText().matches("\\d{4}");
        try {
            test2 = Integer.parseInt(((JTextField)(jc)).getText()) <= Calendar.getInstance().get(Calendar.YEAR);
        } catch (NumberFormatException e) {
            return false;
        }
//        if (!(test1 && test2))
//            JOptionPane.showMessageDialog(null, "test", "test", JOptionPane.OK_OPTION);
        return (test1 && test2);
    }
    
}
