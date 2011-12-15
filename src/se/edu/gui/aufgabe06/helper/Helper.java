/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.edu.gui.aufgabe06.helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author florian
 */
public class Helper {

    public static HashMap<String, List<String>> leseDateiEin(String file) {
        FileReader fr = null;
        String Land = "";
        String gebiet = "";
        String token;
        List<String> gebiete = new LinkedList<String>();
        HashMap<String, List<String>> laender = new HashMap<String, List<String>>();
        try {
            fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            token = reader.readLine();
            while (token != null) {
                if (!token.equals("")) {
                    if (!token.contains("-")) {
                        if (!Land.equals("")) {
                            Collections.sort(gebiete);
                            laender.put(Land, gebiete);
                            gebiete = new LinkedList<String>();
                        }

                        Land = token;
//                        System.out.println("Land: " + Land);
                    } else {
                        StringTokenizer st = new StringTokenizer(token, "-");
                        gebiet = (st.hasMoreTokens()) ? st.nextToken() : "";
                        gebiete.add(gebiet);
//                        System.out.println("Gebiet: " + gebiet);
                    }
                }
                token = reader.readLine();
            }
            Collections.sort(gebiete);
            laender.put(Land, gebiete);
        } catch (IOException ex) {
            Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Helper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return laender;
    }
}
