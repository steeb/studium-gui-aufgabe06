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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;
import javax.swing.JSpinner;

/**
 *
 * @author steeb
 */
public class WeinBalkenDiagrammOhneLegende extends JPanel {

    private static final Color COLOR_ZU_FRUEH = Color.GRAY;
    private static final Color COLOR_OPTIMAL = Color.GREEN;
    private static final Color COLOR_UEBERLAGERT = Color.YELLOW;
    private static final Color COLOR_RAHMEN = Color.BLACK;
    private static final Color COLOR_AKTUELLES_JAHR = Color.RED;
    private static final float ANTEIL_ZU_FRUEH = 8f;
    private static final float ANTEIL_OPTIMAL = 2f;

    enum Elemente {

        zuFrueh,
        steigertSich,
        optimal,
        ueberlagert,
        ausserhalb
    }
    Elemente mouseIn = Elemente.ausserhalb;
    int jahrgang;
    int lagerdauer;
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
    JSpinner js;

    public WeinBalkenDiagrammOhneLegende(int jahrgang, int lagerdauer) {
        super();
        this.addMouseMotionListener(new BalkenHighlighten());
        this.addMouseListener(new InfosAussgeben());
        this.addKeyListener(new PlusMinusEvents());
        this.setJahrgang(jahrgang);
        this.setLagerdauer(lagerdauer);
        this.setBackground(Color.white);
        this.setFocusable(true);

    }

    public void registerJSpinner(JSpinner js) {
        this.js = js;
    }
    
    public void updateJSpinner() {
        js.setValue(new Integer(lagerdauer));
    }

    @Override
    public boolean isFocusable() {
        return true;
    }

    public final void setJahrgang(int jahrgang) {
        this.jahrgang = jahrgang + 1;
    }

    public final void setLagerdauer(int lagerdauer) {
        this.lagerdauer = lagerdauer;
        this.repaint();
    }

    public final int getLagerdauer() {
        return this.lagerdauer;
    }

    public final void incLagerdauer() {
        if (this.lagerdauer < 50) {
            this.lagerdauer++;
            this.repaint();
        }
    }

    public final void decLagerdauer() {
        if (this.lagerdauer > 1) {
            this.lagerdauer--;
            this.repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        int fensterBreite;
        int schriftHoehe = 12;
        Graphics2D grphcs2d = (Graphics2D) grphcs;

        grphcs2d.setStroke(new BasicStroke(1));

        fensterBreite = this.getWidth() * 80 / 100;

        balkenHoehe = this.getHeight() * 80 / 100 - schriftHoehe;
        balkenBreite = fensterBreite / (this.lagerdauer + 1);

        balkenBreiteZuFrueh = balkenBreite
                * Math.round(this.lagerdauer / ANTEIL_ZU_FRUEH);
        balkenBreiteOptimal = balkenBreite
                * Math.round(this.lagerdauer / ANTEIL_OPTIMAL);
        balkenBreiteUeberlagert = balkenBreite;
        balkenBreiteSteigertSich = balkenBreite
                * this.lagerdauer - (balkenBreiteZuFrueh + balkenBreiteOptimal);

        if (this.lagerdauer == 1) {
            balkenBreiteZuFrueh = balkenBreiteSteigertSich = 0;
            balkenBreiteOptimal = balkenBreiteUeberlagert;
        } else if (this.lagerdauer == 2) {
            balkenBreiteSteigertSich = balkenBreite;
            balkenBreiteOptimal = balkenBreite;
            balkenBreiteZuFrueh = 0;
        }

        jahrZuFrueh = this.jahrgang;
        jahrSteigertSich = this.jahrgang
                + (int) Math.round(this.lagerdauer / ANTEIL_ZU_FRUEH);
        jahrOptimal = this.jahrgang + this.lagerdauer / (int) ANTEIL_OPTIMAL;
        jahrUeberlagert = this.jahrgang + this.lagerdauer;

        //zu früh
        grphcs2d.translate(this.getWidth() / 10, 0);
        grphcs2d.translate(0, this.getHeight() / 10);
        grphcs2d.setPaint(colorZuFrueh);
        grphcs2d.fill(new Rectangle(balkenBreiteZuFrueh, balkenHoehe));
        grphcs2d.setPaint(COLOR_RAHMEN);
        grphcs2d.draw(new Rectangle(balkenBreiteZuFrueh, balkenHoehe));
        grphcs2d.drawString("" + jahrZuFrueh, 0, balkenHoehe + schriftHoehe);

        //steigert sich noch
        grphcs2d.translate(balkenBreiteZuFrueh, 0);
        grphcs2d.setPaint(new GradientPaint(0, 0, colorVerlaufZuFrueh,
                balkenBreiteSteigertSich, 0, colorVerlaufOptimal));
        grphcs2d.fill(new Rectangle(balkenBreiteSteigertSich, balkenHoehe));
        grphcs2d.setPaint(COLOR_RAHMEN);
        grphcs2d.draw(new Rectangle(balkenBreiteSteigertSich, balkenHoehe));
        grphcs2d.drawString("" + jahrSteigertSich, 0,
                balkenHoehe + schriftHoehe);

        //optimater trinkzeitpunkt
        grphcs2d.translate(balkenBreiteSteigertSich, 0);
        grphcs2d.setPaint(colorOptimal);
        grphcs2d.fill(new Rectangle(balkenBreiteOptimal, balkenHoehe));
        grphcs2d.setPaint(COLOR_RAHMEN);
        grphcs2d.draw(new Rectangle(balkenBreiteOptimal, balkenHoehe));
        grphcs2d.drawString("" + jahrOptimal, 0, balkenHoehe + schriftHoehe);

        //überlagert
        grphcs2d.translate(balkenBreiteOptimal, 0);
        grphcs2d.setPaint(colorUeberlagert);
        grphcs2d.fill(new Rectangle(balkenBreiteUeberlagert, balkenHoehe));
        grphcs2d.setPaint(COLOR_RAHMEN);
        grphcs2d.draw(new Rectangle(balkenBreiteUeberlagert, balkenHoehe));
        grphcs2d.drawString("" + jahrUeberlagert, 0,
                balkenHoehe + schriftHoehe);
    }

    class BalkenHighlighten extends MouseMotionAdapter {

        @Override
        public void mouseMoved(MouseEvent e) {
            Elemente mouseInAlt = mouseIn;
            colorZuFrueh = COLOR_ZU_FRUEH;
            colorVerlaufZuFrueh = COLOR_ZU_FRUEH;
            colorVerlaufOptimal = COLOR_OPTIMAL;
            colorOptimal = COLOR_OPTIMAL;
            colorUeberlagert = COLOR_UEBERLAGERT;
            mouseIn = Elemente.ausserhalb;
            //Horizontalen bereich einschränken
            if (e.getX() > getWidth() / 10
                    && e.getX() < getWidth() - getWidth() / 10) {
                //vertikal balken
                if (e.getY() > getHeight() / 10
                        && e.getY() < getHeight() / 10 + balkenHoehe) {
                    colorZuFrueh = COLOR_ZU_FRUEH;
                    colorVerlaufZuFrueh = COLOR_ZU_FRUEH;
                    colorVerlaufOptimal = COLOR_OPTIMAL;
                    colorOptimal = COLOR_OPTIMAL;
                    colorUeberlagert = COLOR_UEBERLAGERT;
                    //zufrüh
                    if (e.getX() < getWidth() / 10 + balkenBreiteZuFrueh) {
                        mouseIn = Elemente.zuFrueh;
                        colorZuFrueh = COLOR_ZU_FRUEH.darker();

                        //steigert sich noch
                    } else if (e.getX() < getWidth() / 10 + balkenBreiteZuFrueh
                            + balkenBreiteSteigertSich) {
                        mouseIn = Elemente.steigertSich;
                        colorVerlaufZuFrueh = COLOR_ZU_FRUEH.darker();
                        colorVerlaufOptimal = COLOR_OPTIMAL.darker();

                        //optimal
                    } else if (e.getX() < getWidth() / 10 + balkenBreiteZuFrueh
                            + balkenBreiteSteigertSich + balkenBreiteOptimal) {
                        mouseIn = Elemente.optimal;
                        colorOptimal = COLOR_OPTIMAL.darker();

                        //überlagert
                    } else {
                        mouseIn = Elemente.ueberlagert;
                        colorUeberlagert = COLOR_UEBERLAGERT.darker();
                    }
                    //vertikal legende
                } else if (e.getY() > legendePosOben
                        && e.getY() < legendePosUnten) {
                }
            }
            if (mouseInAlt != mouseIn) {
                repaint();
            }
        }
    }

    class InfosAussgeben extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent me) {
            super.mouseClicked(me);
            boolean zeigeLegendeAlt = zeigeLegende;
            switch (mouseIn) {
                case zuFrueh:
                    System.out.printf("In den Jahren %d - %d ist es für den "
                            + "Wein noch zu früh.\n", jahrZuFrueh,
                            jahrSteigertSich - 1);
                    break;
                case steigertSich:
                    System.out.printf("In den Jahren %d - %d steigert sich der "
                            + "Geschmack des Weins noch.\n", jahrSteigertSich,
                            jahrOptimal - 1);
                    break;
                case optimal:
                    System.out.printf("In den Jahren %d – %d hat der Wein sein "
                            + "geschmackliches Optimum.\n", jahrOptimal,
                            jahrUeberlagert - 1);
                    break;
                case ueberlagert:
                    System.out.printf("Ab dem Jahre %d ist der Wein überlagert."
                            + "\n", jahrUeberlagert);
                    break;
            }
        }
    }

    class PlusMinusEvents extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent ke) {
            super.keyPressed(ke);
            if (ke.getKeyChar() == '+') {
                incLagerdauer();
                js.setValue(new Integer(lagerdauer));
            } else if (ke.getKeyChar() == KeyEvent.VK_MINUS) {
                decLagerdauer();
                js.setValue(new Integer(lagerdauer));
            }
        }
    }
}
