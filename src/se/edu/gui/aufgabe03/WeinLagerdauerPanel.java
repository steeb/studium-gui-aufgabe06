/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WeinLagerdauerPanel.java
 *
 * Created on 26.12.2011, 18:07:50
 */
package se.edu.gui.aufgabe03;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JSpinner;
import se.edu.gui.aufgabe03.diagramm.WeinBalkenDiagrammNurLegende;
import se.edu.gui.aufgabe03.diagramm.WeinBalkenDiagrammOhneLegende;

/**
 *
 * @author steeb
 */
public class WeinLagerdauerPanel extends javax.swing.JPanel {

    /** Creates new form WeinLagerdauerPanel */
    public WeinLagerdauerPanel() {
        initComponents();
    }
    
    public void setLagerdauer (int ld) {
        ((WeinBalkenDiagrammOhneLegende)this.diagramm).setLagerdauer(ld);
    }
    
    public void setJahrgang (int jg) {
        ((WeinBalkenDiagrammOhneLegende)this.diagramm).setJahrgang(jg);
    }
    
    public JSpinner getLagerdauerEinsteller () {
        return lagerdauerEinsteller;
    }
    
    public int getLagerdauer () {
        return ((WeinBalkenDiagrammOhneLegende)this.diagramm).getLagerdauer();
    }
    
    public void updateJSpinner () {
        ((WeinBalkenDiagrammOhneLegende)this.diagramm).updateJSpinner();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lagerdauerEinstellerContainer = new javax.swing.JPanel();
        lagerdauerEinstellerLabel = new javax.swing.JLabel();
        lagerdauerEinsteller = new javax.swing.JSpinner();
        diagrammContainer = new javax.swing.JPanel();
        diagramm = new WeinBalkenDiagrammOhneLegende();
        legende = new WeinBalkenDiagrammNurLegende();

        setLayout(new java.awt.BorderLayout());

        lagerdauerEinstellerContainer.setBackground(new java.awt.Color(204, 204, 204));
        lagerdauerEinstellerContainer.setLayout(new javax.swing.BoxLayout(lagerdauerEinstellerContainer, javax.swing.BoxLayout.LINE_AXIS));

        lagerdauerEinstellerLabel.setBackground(new java.awt.Color(204, 204, 204));
        lagerdauerEinstellerLabel.setText("Lagerdauer:");
        lagerdauerEinstellerContainer.add(lagerdauerEinstellerLabel);

        lagerdauerEinsteller.setModel(new javax.swing.SpinnerNumberModel(((WeinBalkenDiagrammOhneLegende)this.diagramm).getLagerdauer(), null, null, 1));
        lagerdauerEinsteller.setEditor(new javax.swing.JSpinner.NumberEditor(lagerdauerEinsteller, "#,##0.###"));
        //((NumberFormatter)((NumberEditor)this.lagerdauerEinsteller.getEditor()).getTextField().getFormatter()).setAllowsInvalid(false);
        lagerdauerEinsteller.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                lagerdauerEinstelleraenderLagerdauerViaSpinner(evt);
            }
        });
        lagerdauerEinsteller.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lagerdauerEinstellerspinnerGetFocus(evt);
            }
        });
        lagerdauerEinstellerContainer.add(lagerdauerEinsteller);

        add(lagerdauerEinstellerContainer, java.awt.BorderLayout.PAGE_START);

        diagrammContainer.setLayout(new javax.swing.BoxLayout(diagrammContainer, javax.swing.BoxLayout.PAGE_AXIS));

        diagramm.setBackground(new java.awt.Color(204, 204, 204));
        diagramm.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        diagramm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diagrammMouseClicked(evt);
            }
        });
        diagramm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                diagrammelementGetFocus(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                diagrammelementLostFocus(evt);
            }
        });

        javax.swing.GroupLayout diagrammLayout = new javax.swing.GroupLayout(diagramm);
        diagramm.setLayout(diagrammLayout);
        diagrammLayout.setHorizontalGroup(
            diagrammLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        diagrammLayout.setVerticalGroup(
            diagrammLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );

        diagrammContainer.add(diagramm);

        legende.setBackground(new java.awt.Color(204, 204, 204));
        legende.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                legendeMouseClicked(evt);
            }
        });
        legende.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                legendeelementGetFocus(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                legendeelementLostFocus(evt);
            }
        });

        javax.swing.GroupLayout legendeLayout = new javax.swing.GroupLayout(legende);
        legende.setLayout(legendeLayout);
        legendeLayout.setHorizontalGroup(
            legendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        legendeLayout.setVerticalGroup(
            legendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );

        diagrammContainer.add(legende);

        add(diagrammContainer, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void lagerdauerEinstelleraenderLagerdauerViaSpinner(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_lagerdauerEinstelleraenderLagerdauerViaSpinner

        int eingabe = Integer.parseInt(this.lagerdauerEinsteller.getValue().toString());         if (eingabe > 50) {             eingabe = 50;             this.lagerdauerEinsteller.setValue(new Integer(eingabe));         } else if (eingabe < 1) {             eingabe = 1;             this.lagerdauerEinsteller.setValue(new Integer(eingabe));         }         ((WeinBalkenDiagrammOhneLegende) this.diagramm).setLagerdauer(Integer.parseInt(this.lagerdauerEinsteller.getValue().toString()));     }//GEN-LAST:event_lagerdauerEinstelleraenderLagerdauerViaSpinner

    private void lagerdauerEinstellerspinnerGetFocus(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lagerdauerEinstellerspinnerGetFocus

        this.lagerdauerEinstellerContainer.setBorder(BorderFactory.createLineBorder(Color.green));     }//GEN-LAST:event_lagerdauerEinstellerspinnerGetFocus

    private void diagrammMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diagrammMouseClicked

        diagramm.requestFocus();     }//GEN-LAST:event_diagrammMouseClicked

    private void diagrammelementGetFocus(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_diagrammelementGetFocus

        evt.getComponent().setBackground(evt.getComponent().getBackground().darker());     }//GEN-LAST:event_diagrammelementGetFocus

    private void diagrammelementLostFocus(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_diagrammelementLostFocus

        evt.getComponent().setBackground(evt.getComponent().getBackground().brighter());     }//GEN-LAST:event_diagrammelementLostFocus

    private void legendeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_legendeMouseClicked

        legende.requestFocus();     }//GEN-LAST:event_legendeMouseClicked

    private void legendeelementGetFocus(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_legendeelementGetFocus

        evt.getComponent().setBackground(evt.getComponent().getBackground().darker());     }//GEN-LAST:event_legendeelementGetFocus

    private void legendeelementLostFocus(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_legendeelementLostFocus

        evt.getComponent().setBackground(evt.getComponent().getBackground().brighter());     }//GEN-LAST:event_legendeelementLostFocus

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel diagramm;
    private javax.swing.JPanel diagrammContainer;
    private javax.swing.JSpinner lagerdauerEinsteller;
    private javax.swing.JPanel lagerdauerEinstellerContainer;
    private javax.swing.JLabel lagerdauerEinstellerLabel;
    private javax.swing.JPanel legende;
    // End of variables declaration//GEN-END:variables
}
