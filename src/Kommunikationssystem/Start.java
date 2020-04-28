/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kommunikationssystem;

import javax.swing.JOptionPane;
import oru.inf.*;

/**
 *
 * @author Haag
 */
public class Start {

    private static InfDB idb;

    public static void main(String[] args) {
        try {
            String dir = System.getProperty("user.dir");
            String os = System.getProperty("os.name").toLowerCase();
            String dbPath;
            if (os.contains("mac")) {
                dbPath = "/Library/Frameworks/Firebird.framework/Versions/A/Resources/DB/MONKEY.FDB";
                System.out.println(dbPath);
            } else {
                dbPath = ("\\db\\MONKEY.FDB"); //Sökväg för alla andra.
                System.out.println(dbPath);
            }
            idb = new InfDB(dbPath);
            new MainWindow(idb).setVisible(true);
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Ett fel inträffade!" + e);
        }
    }
}
