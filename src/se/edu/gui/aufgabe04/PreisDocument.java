/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.edu.gui.aufgabe04;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author steeb
 */
public class PreisDocument extends PlainDocument {

    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        if (this.getText(0, this.getLength()).concat(string).matches("\\d*,?\\d{0,2}"))
            super.insertString(i, string, as);
    }
}
