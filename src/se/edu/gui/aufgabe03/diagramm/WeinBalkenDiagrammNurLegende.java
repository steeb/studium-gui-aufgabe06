/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.edu.gui.aufgabe03.diagramm;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.util.Calendar;
import javax.swing.JPanel;

/**
 *
 * @author steeb
 */
public class WeinBalkenDiagrammNurLegende extends JPanel {

    private static final Color COLOR_ZU_FRUEH = Color.GRAY;
    private static final Color COLOR_OPTIMAL = Color.GREEN;
    private static final Color COLOR_UEBERLAGERT = Color.YELLOW;
    private static final Color COLOR_RAHMEN = Color.BLACK;
    private static final Color COLOR_AKTUELLES_JAHR = Color.RED;
    private static final float ANTEIL_ZU_FRUEH = 8f;
    private static final float ANTEIL_OPTIMAL = 2f;

    int balkenHoehe;
    int balkenBreite, balkenBreiteZuFrueh, balkenBreiteSteigertSich,
            balkenBreiteOptimal, balkenBreiteUeberlagert;
    int legendePosOben, legendePosUnten;
    int jahrZuFrueh, jahrSteigertSich, jahrOptimal, jahrUeberlagert;
    boolean zeigeLegende = true;
    Color colorZuFrueh = COLOR_ZU_FRUEH;
    Color colorVerlaufZuFrueh = COLOR_ZU_FRUEH;
    Color colorVerlaufOptimal = COLOR_OPTIMAL;
    Color colorOptimal = COLOR_OPTIMAL;
    Color colorUeberlagert = COLOR_UEBERLAGERT;

    public WeinBalkenDiagrammNurLegende() {
        super();
        this.setBackground(Color.white);
        this.setFocusable(true);
        this.addKeyListener(new PlusMinusEvents());
    }
    
    @Override
    public boolean isFocusable() {
        return true;
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        if (!zeigeLegende)
            return;
        int schriftHoehe = 12;
        int legendeSpaltenHoehe;
        int legendeKastenGroesse;
        AffineTransform defTransform;
        Calendar cal = Calendar.getInstance();
        Graphics2D grphcs2d = (Graphics2D) grphcs;



        legendePosOben = this.getHeight() * 1 / 10;
        legendePosUnten = this.getHeight() * 9 / 10;
        legendeSpaltenHoehe = (legendePosUnten - legendePosOben) / 5;
        legendeKastenGroesse = legendeSpaltenHoehe / 2;

        //zu früh
        grphcs2d.translate(this.getWidth() / 10, 0);
        defTransform = grphcs2d.getTransform();


            //legende
            grphcs2d.setTransform(defTransform);
            grphcs2d.translate(0, legendePosOben);
            grphcs2d.setPaint(COLOR_RAHMEN);
            grphcs2d.drawString("Legende:", 0, 0);

            //legende zu früh
            grphcs2d.translate(0, legendeSpaltenHoehe);
            grphcs2d.setPaint(COLOR_ZU_FRUEH);
            grphcs2d.fill(new Rectangle(0, 0, legendeKastenGroesse,
                    legendeKastenGroesse));
            grphcs2d.setPaint(COLOR_RAHMEN);
            grphcs2d.draw(new Rectangle(0, 0, legendeKastenGroesse,
                    legendeKastenGroesse));
            grphcs2d.drawString("zu früh",
                    legendeKastenGroesse * 2,
                    (int) (legendeKastenGroesse / 1.5));

            //legende steigert sich noch
            grphcs2d.translate(0, legendeSpaltenHoehe);
            grphcs2d.setPaint(new GradientPaint(0, 0, COLOR_ZU_FRUEH,
                    legendeKastenGroesse, 0, COLOR_OPTIMAL));
            grphcs2d.fill(new Rectangle(0, 0, legendeKastenGroesse,
                    legendeKastenGroesse));
            grphcs2d.setPaint(COLOR_RAHMEN);
            grphcs2d.draw(new Rectangle(0, 0, legendeKastenGroesse,
                    legendeKastenGroesse));
            grphcs2d.drawString("steigert sich noch",
                    legendeKastenGroesse * 2,
                    (int) (legendeKastenGroesse / 1.5));

            //legende optimater trinkzeitpunkt
            grphcs2d.translate(0, legendeSpaltenHoehe);
            grphcs2d.setPaint(COLOR_OPTIMAL);
            grphcs2d.fill(new Rectangle(0, 0, legendeKastenGroesse,
                    legendeKastenGroesse));
            grphcs2d.setPaint(COLOR_RAHMEN);
            grphcs2d.draw(new Rectangle(0, 0, legendeKastenGroesse,
                    legendeKastenGroesse));
            grphcs2d.drawString("optimaler Trinkzeitpunkt",
                    legendeKastenGroesse * 2,
                    (int) (legendeKastenGroesse / 1.5));

            //legende überlagert
            grphcs2d.translate(0, legendeSpaltenHoehe);
            grphcs2d.setPaint(COLOR_UEBERLAGERT);
            grphcs2d.fill(new Rectangle(0, 0, legendeKastenGroesse,
                    legendeKastenGroesse));
            grphcs2d.setPaint(COLOR_RAHMEN);
            grphcs2d.draw(new Rectangle(0, 0, legendeKastenGroesse,
                    legendeKastenGroesse));
            grphcs2d.drawString("überlagert",
                    legendeKastenGroesse * 2,
                    (int) (legendeKastenGroesse / 1.5));
    }
    
    class PlusMinusEvents extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent ke) {
            super.keyPressed(ke);
            boolean altZeigeLegende = zeigeLegende;
            if (ke.getKeyChar() == '+')
                zeigeLegende = true;
            else if (ke.getKeyChar() == KeyEvent.VK_MINUS)
                zeigeLegende = false;
            if(altZeigeLegende != zeigeLegende)
                WeinBalkenDiagrammNurLegende.this.repaint();
        }
        
    }
}
