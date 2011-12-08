/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.edu.gui.aufgabe06;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author steeb
 */
public class AlkgehaltDocument extends PlainDocument{

    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        if (string.matches("\\d") || string.equals(","))
            super.insertString(i, string, as);
    }
    
    
    
}
