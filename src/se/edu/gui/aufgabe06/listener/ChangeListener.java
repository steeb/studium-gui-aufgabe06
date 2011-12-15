/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.edu.gui.aufgabe06.listener;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author steeb
 */
public class ChangeListener implements DocumentListener, ItemListener, javax.swing.event.ChangeListener{

    private boolean changed = false;
    
    public void reset() {
        changed = false;
    }
    
    public boolean hasChanged() {
        return this.changed;
    }

    @Override
    public void insertUpdate(DocumentEvent de) {
        this.changed = true;
        System.out.println("changed");
    }

    @Override
    public void removeUpdate(DocumentEvent de) {
        this.changed = true;
        System.out.println("changed");
    }

    @Override
    public void changedUpdate(DocumentEvent de) {
        this.changed = true;
        System.out.println("changed");
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        this.changed = true;
        System.out.println("changed");
    }

    @Override
    public void stateChanged(ChangeEvent ce) {
        this.changed = true;
        System.out.println("changed");
    }
}