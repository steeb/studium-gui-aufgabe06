/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Window.java
 *
 * Created on 07.12.2011, 19:22:29
 */
package se.edu.gui.aufgabe06;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author steeb
 */
public class Window extends javax.swing.JFrame {

    /** Creates new form Window */
    public Window() {
        initComponents();
        this.setDefaultCloseOperation(Window.EXIT_ON_CLOSE);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroupFarbe = new javax.swing.ButtonGroup();
        ifKunde = new javax.swing.JInternalFrame();
        ifWein = new javax.swing.JInternalFrame();
        ifWeinTabbedPanel = new javax.swing.JTabbedPane();
        scrollPaneWeinAnlegen = new javax.swing.JScrollPane();
        panelWeinAnlegen = new javax.swing.JPanel();
        lblBestellnummer = new javax.swing.JLabel();
        tfBestellnummer = new javax.swing.JTextField();
        lblJahrgang = new javax.swing.JLabel();
        tfJahrgang = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        lblFarbe = new javax.swing.JLabel();
        rbFarbeWeiß = new javax.swing.JRadioButton();
        rbFarbeRot = new javax.swing.JRadioButton();
        rbFarbeRose = new javax.swing.JRadioButton();
        lblRebsorte = new javax.swing.JLabel();
        cbRebsorte = new javax.swing.JComboBox();
        lblAnbaugebiet = new javax.swing.JLabel();
        cbAnbaugebiet = new javax.swing.JComboBox();
        lblAlkoholgehalt = new javax.swing.JLabel();
        tfAlkoholgehalt = new javax.swing.JTextField();
        lblLagerfaehigkeit = new javax.swing.JLabel();
        tfLagerfaehigkeit = new javax.swing.JTextField();
        lblFlaschengroesse = new javax.swing.JLabel();
        cbFlaschengroese = new javax.swing.JComboBox();
        lblFlaschenpreis = new javax.swing.JLabel();
        tfFlaschenpreis = new javax.swing.JTextField();
        panelWeinIrgendwas = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        mDatei = new javax.swing.JMenu();
        mDateiBeenden = new javax.swing.JMenuItem();
        mBearbeiten = new javax.swing.JMenu();
        mBearbeitenKunden = new javax.swing.JMenu();
        mBearbeitenKundenAufnehmen = new javax.swing.JMenuItem();
        mBearbeitenKundenAendern = new javax.swing.JMenuItem();
        mBearbeitenKundenLoeschen = new javax.swing.JMenuItem();
        mBearbeitenWein = new javax.swing.JMenu();
        mBearbeitenWeinAufnehmen = new javax.swing.JMenuItem();
        mBearbeitenWeinAendern = new javax.swing.JMenuItem();
        mBearbeitenWeinLoeschen = new javax.swing.JMenuItem();
        mHilfe = new javax.swing.JMenu();
        mHilfeInfo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        ifKunde.setClosable(true);
        ifKunde.setIconifiable(true);
        ifKunde.setMaximizable(true);
        ifKunde.setResizable(true);
        ifKunde.setTitle("Kunde anlegen");

        javax.swing.GroupLayout ifKundeLayout = new javax.swing.GroupLayout(ifKunde.getContentPane());
        ifKunde.getContentPane().setLayout(ifKundeLayout);
        ifKundeLayout.setHorizontalGroup(
            ifKundeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );
        ifKundeLayout.setVerticalGroup(
            ifKundeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 109, Short.MAX_VALUE)
        );

        getContentPane().add(ifKunde);
        ifKunde.setBounds(30, 20, 313, 141);

        ifWein.setClosable(true);
        ifWein.setIconifiable(true);
        ifWein.setMaximizable(true);
        ifWein.setResizable(true);
        ifWein.setTitle("Wein anlegen");
        ifWein.setVisible(true);
        ifWein.getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        panelWeinAnlegen.setLayout(new java.awt.GridBagLayout());

        lblBestellnummer.setText("Bestellnummer: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelWeinAnlegen.add(lblBestellnummer, gridBagConstraints);

        tfBestellnummer.setDocument(new DigetDocument());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelWeinAnlegen.add(tfBestellnummer, gridBagConstraints);

        lblJahrgang.setText("Jahrgang: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelWeinAnlegen.add(lblJahrgang, gridBagConstraints);

        tfJahrgang.setDocument(new DigetDocument());
        tfJahrgang.setInputVerifier(new JahrgangVerifyer());
        tfJahrgang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                verifyContent(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelWeinAnlegen.add(tfJahrgang, gridBagConstraints);

        lblName.setText("Name: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelWeinAnlegen.add(lblName, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelWeinAnlegen.add(tfName, gridBagConstraints);

        lblFarbe.setText("Farbe: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        panelWeinAnlegen.add(lblFarbe, gridBagConstraints);

        buttonGroupFarbe.add(rbFarbeWeiß);
        rbFarbeWeiß.setText("weiß");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        panelWeinAnlegen.add(rbFarbeWeiß, gridBagConstraints);

        buttonGroupFarbe.add(rbFarbeRot);
        rbFarbeRot.setText("rot");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        panelWeinAnlegen.add(rbFarbeRot, gridBagConstraints);

        buttonGroupFarbe.add(rbFarbeRose);
        rbFarbeRose.setText("rose");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
        panelWeinAnlegen.add(rbFarbeRose, gridBagConstraints);

        lblRebsorte.setText("Rebsorte: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelWeinAnlegen.add(lblRebsorte, gridBagConstraints);

        cbRebsorte.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelWeinAnlegen.add(cbRebsorte, gridBagConstraints);

        lblAnbaugebiet.setText("Anbaugebiet:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelWeinAnlegen.add(lblAnbaugebiet, gridBagConstraints);

        cbAnbaugebiet.setEditable(true);
        cbAnbaugebiet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelWeinAnlegen.add(cbAnbaugebiet, gridBagConstraints);

        lblAlkoholgehalt.setText("Alkoholgehalt:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelWeinAnlegen.add(lblAlkoholgehalt, gridBagConstraints);

        tfAlkoholgehalt.setDocument(new AlkgehaltDocument());
        tfAlkoholgehalt.setInputVerifier(new AlkgehaltVerifyer());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelWeinAnlegen.add(tfAlkoholgehalt, gridBagConstraints);

        lblLagerfaehigkeit.setText("Lagerfähigkeit:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelWeinAnlegen.add(lblLagerfaehigkeit, gridBagConstraints);

        tfLagerfaehigkeit.setDocument(new DigetDocument());
        tfLagerfaehigkeit.setInputVerifier(new LagerfaehigkeitVerifyer());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelWeinAnlegen.add(tfLagerfaehigkeit, gridBagConstraints);

        lblFlaschengroesse.setText("Flaschengröße:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelWeinAnlegen.add(lblFlaschengroesse, gridBagConstraints);

        cbFlaschengroese.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelWeinAnlegen.add(cbFlaschengroese, gridBagConstraints);

        lblFlaschenpreis.setText("Flaschenpreis:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelWeinAnlegen.add(lblFlaschenpreis, gridBagConstraints);

        tfFlaschenpreis.setDocument(new AlkgehaltDocument());
        tfFlaschenpreis.setInputVerifier(new PreisVerifier());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelWeinAnlegen.add(tfFlaschenpreis, gridBagConstraints);

        scrollPaneWeinAnlegen.setViewportView(panelWeinAnlegen);

        ifWeinTabbedPanel.addTab("Wein anlegen", scrollPaneWeinAnlegen);

        javax.swing.GroupLayout panelWeinIrgendwasLayout = new javax.swing.GroupLayout(panelWeinIrgendwas);
        panelWeinIrgendwas.setLayout(panelWeinIrgendwasLayout);
        panelWeinIrgendwasLayout.setHorizontalGroup(
            panelWeinIrgendwasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );
        panelWeinIrgendwasLayout.setVerticalGroup(
            panelWeinIrgendwasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        ifWeinTabbedPanel.addTab("...", panelWeinIrgendwas);

        ifWein.getContentPane().add(ifWeinTabbedPanel);

        getContentPane().add(ifWein);
        ifWein.setBounds(0, 0, 430, 600);

        mDatei.setMnemonic('D');
        mDatei.setText("Datei");
        mDatei.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        mDateiBeenden.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        mDateiBeenden.setMnemonic('B');
        mDateiBeenden.setText("Beenden");
        mDateiBeenden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDateiBeendenActionPerformed(evt);
            }
        });
        mDatei.add(mDateiBeenden);

        menuBar.add(mDatei);

        mBearbeiten.setMnemonic('e');
        mBearbeiten.setText("Bearbeiten");
        menuBar.add(mBearbeiten);

        mBearbeitenKunden.setMnemonic('K');
        mBearbeitenKunden.setText("Kunden");
        mBearbeitenKunden.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        mBearbeitenKundenAufnehmen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        mBearbeitenKundenAufnehmen.setMnemonic('A');
        mBearbeitenKundenAufnehmen.setText("Aufnehmen");
        mBearbeitenKundenAufnehmen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBearbeitenKundenAufnehmenActionPerformed(evt);
            }
        });
        mBearbeitenKunden.add(mBearbeitenKundenAufnehmen);

        mBearbeitenKundenAendern.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        mBearbeitenKundenAendern.setMnemonic('n');
        mBearbeitenKundenAendern.setText("Ändern");
        mBearbeitenKunden.add(mBearbeitenKundenAendern);

        mBearbeitenKundenLoeschen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        mBearbeitenKundenLoeschen.setMnemonic('L');
        mBearbeitenKundenLoeschen.setText("Löschen");
        mBearbeitenKunden.add(mBearbeitenKundenLoeschen);

        menuBar.add(mBearbeitenKunden);

        mBearbeitenWein.setMnemonic('W');
        mBearbeitenWein.setText("Wein");

        mBearbeitenWeinAufnehmen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        mBearbeitenWeinAufnehmen.setMnemonic('A');
        mBearbeitenWeinAufnehmen.setText("Aufnehmen");
        mBearbeitenWeinAufnehmen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBearbeitenWeinAufnehmenActionPerformed(evt);
            }
        });
        mBearbeitenWein.add(mBearbeitenWeinAufnehmen);

        mBearbeitenWeinAendern.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        mBearbeitenWeinAendern.setMnemonic('n');
        mBearbeitenWeinAendern.setText("Ändern");
        mBearbeitenWein.add(mBearbeitenWeinAendern);

        mBearbeitenWeinLoeschen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        mBearbeitenWeinLoeschen.setMnemonic('L');
        mBearbeitenWeinLoeschen.setText("Löschen");
        mBearbeitenWein.add(mBearbeitenWeinLoeschen);

        menuBar.add(mBearbeitenWein);

        mHilfe.setMnemonic('?');
        mHilfe.setText("?");

        mHilfeInfo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        mHilfeInfo.setMnemonic('o');
        mHilfeInfo.setText("Info");
        mHilfeInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mHilfeInfoActionPerformed(evt);
            }
        });
        mHilfe.add(mHilfeInfo);

        menuBar.add(mHilfe);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mDateiBeendenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDateiBeendenActionPerformed
        this.formWindowClosing(null);
    }//GEN-LAST:event_mDateiBeendenActionPerformed

    private void mHilfeInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mHilfeInfoActionPerformed
        JOptionPane.showMessageDialog(this, "Info text ...", "Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_mHilfeInfoActionPerformed

    private void mBearbeitenKundenAufnehmenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBearbeitenKundenAufnehmenActionPerformed
        ifKunde.setVisible(true);
    }//GEN-LAST:event_mBearbeitenKundenAufnehmenActionPerformed

    private void mBearbeitenWeinAufnehmenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBearbeitenWeinAufnehmenActionPerformed
        ifWein.setVisible(true);
    }//GEN-LAST:event_mBearbeitenWeinAufnehmenActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(JOptionPane.showConfirmDialog(this, "Wollen Sie wirklich Beenden?", "Beenden?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void verifyContent(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_verifyContent
        if (!((JTextField)(evt.getSource())).getInputVerifier().verify(((JTextField)(evt.getSource())))) {
            System.out.println("mööp");
        }
    }//GEN-LAST:event_verifyContent

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Window().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupFarbe;
    private javax.swing.JComboBox cbAnbaugebiet;
    private javax.swing.JComboBox cbFlaschengroese;
    private javax.swing.JComboBox cbRebsorte;
    private javax.swing.JInternalFrame ifKunde;
    private javax.swing.JInternalFrame ifWein;
    private javax.swing.JTabbedPane ifWeinTabbedPanel;
    private javax.swing.JLabel lblAlkoholgehalt;
    private javax.swing.JLabel lblAnbaugebiet;
    private javax.swing.JLabel lblBestellnummer;
    private javax.swing.JLabel lblFarbe;
    private javax.swing.JLabel lblFlaschengroesse;
    private javax.swing.JLabel lblFlaschenpreis;
    private javax.swing.JLabel lblJahrgang;
    private javax.swing.JLabel lblLagerfaehigkeit;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRebsorte;
    private javax.swing.JMenu mBearbeiten;
    private javax.swing.JMenu mBearbeitenKunden;
    private javax.swing.JMenuItem mBearbeitenKundenAendern;
    private javax.swing.JMenuItem mBearbeitenKundenAufnehmen;
    private javax.swing.JMenuItem mBearbeitenKundenLoeschen;
    private javax.swing.JMenu mBearbeitenWein;
    private javax.swing.JMenuItem mBearbeitenWeinAendern;
    private javax.swing.JMenuItem mBearbeitenWeinAufnehmen;
    private javax.swing.JMenuItem mBearbeitenWeinLoeschen;
    private javax.swing.JMenu mDatei;
    private javax.swing.JMenuItem mDateiBeenden;
    private javax.swing.JMenu mHilfe;
    private javax.swing.JMenuItem mHilfeInfo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel panelWeinAnlegen;
    private javax.swing.JPanel panelWeinIrgendwas;
    private javax.swing.JRadioButton rbFarbeRose;
    private javax.swing.JRadioButton rbFarbeRot;
    private javax.swing.JRadioButton rbFarbeWeiß;
    private javax.swing.JScrollPane scrollPaneWeinAnlegen;
    private javax.swing.JTextField tfAlkoholgehalt;
    private javax.swing.JTextField tfBestellnummer;
    private javax.swing.JTextField tfFlaschenpreis;
    private javax.swing.JTextField tfJahrgang;
    private javax.swing.JTextField tfLagerfaehigkeit;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
