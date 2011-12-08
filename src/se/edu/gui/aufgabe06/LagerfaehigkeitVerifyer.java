/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.edu.gui.aufgabe06;

import java.util.Calendar;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author steeb
 */
public class LagerfaehigkeitVerifyer extends InputVerifier{

    @Override
    public boolean verify(JComponent jc) {
        if (((JTextField)(jc)).getText().equals(""))
            return true;
        boolean test1 = ((JTextField)(jc)).getText().matches("\\d{4}");
        boolean test2 = Integer.parseInt(((JTextField)(jc)).getText()) > Calendar.getInstance().get(Calendar.YEAR);
        return (test1 && test2);
    }
    
}
