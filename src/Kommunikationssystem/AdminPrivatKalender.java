/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kommunikationssystem;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author Jerka
 */
public class AdminPrivatKalender extends javax.swing.JFrame {
 private InfDB idb;
 private String aid;
    /**
     * Creates new form PrivatKalender
     */
    public AdminPrivatKalender(InfDB idb) {
        initComponents();
        this.idb = idb;
         aid = MainWindow.getId();
       // listMoten.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calendar = new com.toedter.calendar.JCalendar();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        itemStartsida1 = new javax.swing.JMenuItem();
        itemVisaInformellaBlogg1 = new javax.swing.JMenuItem();
        itemPubliceraInlagg1 = new javax.swing.JMenuItem();
        itemTaBortInlagg1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        itemKonto1 = new javax.swing.JMenuItem();
        itemTaBortKonto1 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        itemAllmanKalender1 = new javax.swing.JMenuItem();
        itemPrivatKalender1 = new javax.swing.JMenuItem();
        itemMinaMoten1 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        itemSkapaMote1 = new javax.swing.JMenuItem();
        itemLoggaUt1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Visa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("TID ");

        jLabel2.setText("TITEL");

        jScrollPane2.setViewportView(jList2);

        jLabel3.setText("Alla möten");

        jButton2.setText("Hämta alla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("DATUM");

        jMenu4.setText("Inlägg");

        itemStartsida1.setText("Startsida");
        itemStartsida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemStartsida1ActionPerformed(evt);
            }
        });
        jMenu4.add(itemStartsida1);

        itemVisaInformellaBlogg1.setText("Visa blogg");
        itemVisaInformellaBlogg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVisaInformellaBlogg1ActionPerformed(evt);
            }
        });
        jMenu4.add(itemVisaInformellaBlogg1);

        itemPubliceraInlagg1.setText("Publicera inlägg");
        itemPubliceraInlagg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPubliceraInlagg1ActionPerformed(evt);
            }
        });
        jMenu4.add(itemPubliceraInlagg1);

        itemTaBortInlagg1.setText("Ta bort inlägg");
        itemTaBortInlagg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTaBortInlagg1ActionPerformed(evt);
            }
        });
        jMenu4.add(itemTaBortInlagg1);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Kontohantering");

        itemKonto1.setText("Ändra konto uppgifter");
        itemKonto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemKonto1ActionPerformed(evt);
            }
        });
        jMenu5.add(itemKonto1);

        itemTaBortKonto1.setText("Ta bort konton");
        itemTaBortKonto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTaBortKonto1ActionPerformed(evt);
            }
        });
        jMenu5.add(itemTaBortKonto1);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("Kalender");

        itemAllmanKalender1.setText("Visa allmänna möten");
        itemAllmanKalender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAllmanKalender1ActionPerformed(evt);
            }
        });
        jMenu6.add(itemAllmanKalender1);

        itemPrivatKalender1.setText("Visa privat kalender");
        itemPrivatKalender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPrivatKalender1ActionPerformed(evt);
            }
        });
        jMenu6.add(itemPrivatKalender1);

        jMenuBar2.add(jMenu6);

        itemMinaMoten1.setText("Möten");

        jMenuItem8.setText("Visa mina möten");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        itemMinaMoten1.add(jMenuItem8);

        itemSkapaMote1.setText("Skapa möte");
        itemSkapaMote1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSkapaMote1ActionPerformed(evt);
            }
        });
        itemMinaMoten1.add(itemSkapaMote1);

        jMenuBar2.add(itemMinaMoten1);

        itemLoggaUt1.setText(" Logga ut");
        itemLoggaUt1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        itemLoggaUt1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jMenuItem2.setText("Logga ut");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        itemLoggaUt1.add(jMenuItem2);

        jMenuBar2.add(itemLoggaUt1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addContainerGap(204, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         jList1.setVisible(true);
        DefaultListModel list = new DefaultListModel();
        jList1.clearSelection();
        
        DateFormat formatDatum = new SimpleDateFormat("yyyy-MM-dd");
        String datum = formatDatum.format(calendar.getDate());
        System.out.println(datum);
      
        try {  
            
          ArrayList<HashMap<String, String>> moten;
            
           // String fraga2 = ("SELECT NAMN,TID FROM ANSTALLDA JOIN MOTEN ON ANSTALLDA.AID = MOTEN.MOTESLEDARE WHERE DATUM = '" + datum + "'AND AID = '"+aid+"';");
          String fraga2 = "SELECT TITEL,TID, DATUM FROM ANSTALLDA JOIN MOTE_DELTAGANDE ON ANSTALLDA.AID = ANSTALLDID JOIN MOTEN ON MOTE_DELTAGANDE.MOTEID = MOTEN.MOTEID WHERE AID ='" + aid +"' AND DATUM = '"+datum+"'";
             
          moten = idb.fetchRows(fraga2);            
            System.out.println(moten);
                       
            if(moten !=null){

            for (HashMap<String, String> hittad : moten) {
                String TID = hittad.get("TID");
                String NAMN = hittad.get("TITEL");
                String DATUM = hittad.get("DATUM");
                list.addElement(TID + " " + NAMN +" "+ DATUM +"");                
                jList1.setModel(list);
                
            }
            }else{ jList1.setModel(list);
            list.addElement("Det finns inga möten inlagda.");
                    }
            
        } catch (InfException e) {
            System.out.println(e.getMessage());
        }                                     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
        jList2.setVisible(true);
        DefaultListModel list = new DefaultListModel();
        jList2.clearSelection();
        
        DateFormat formatDatum = new SimpleDateFormat("yyyy-MM-dd");
        String datum = formatDatum.format(calendar.getDate());
        System.out.println(datum);
      
        try {  
            
            
            ArrayList<HashMap<String, String>> allaMoten;
           // String fraga2 = ("SELECT NAMN,TID FROM ANSTALLDA JOIN MOTEN ON ANSTALLDA.AID = MOTEN.MOTESLEDARE WHERE DATUM = '" + datum + "'AND AID = '"+aid+"';");
          
          String fraga3 = "SELECT TITEL,TID, DATUM FROM ANSTALLDA JOIN MOTE_DELTAGANDE ON ANSTALLDA.AID = ANSTALLDID JOIN MOTEN ON MOTE_DELTAGANDE.MOTEID = MOTEN.MOTEID WHERE AID ='" + aid +"'";
          allaMoten = idb.fetchRows(fraga3);
                    
            System.out.println(allaMoten);
                       
            if(allaMoten !=null){
          
            for (HashMap<String, String> hittad : allaMoten){
                String TID = hittad.get("TID");
                String NAMN = hittad.get("TITEL");
                String DATUM = hittad.get("DATUM");
                list.addElement(TID + " " + NAMN +" "+ DATUM +"");
                jList2.setModel(list);
            
            }
            }else{ jList2.setModel(list);
            list.addElement("Det finns inga möten inlagda.");
                    }
            
        } catch (InfException e) {
            System.out.println(e.getMessage());
        }                                     
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void itemStartsida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemStartsida1ActionPerformed
        // TODO add your handling code here:
        AdminVisaInlägg startSidaWindow = new AdminVisaInlägg(idb);
        startSidaWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_itemStartsida1ActionPerformed

    private void itemVisaInformellaBlogg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVisaInformellaBlogg1ActionPerformed
        // TODO add your handling code here:
        AdminVisaInlägg startSidaWindow = new AdminVisaInlägg(idb);
        startSidaWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_itemVisaInformellaBlogg1ActionPerformed

    private void itemPubliceraInlagg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPubliceraInlagg1ActionPerformed
        // TODO add your handling code here:
        AdminGöraInlägg startSidaWindow = new AdminGöraInlägg(idb);
        startSidaWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_itemPubliceraInlagg1ActionPerformed

    private void itemTaBortInlagg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTaBortInlagg1ActionPerformed
        // TODO add your handling code here:
        AdminTaBortInlagg startSidaWindow = new AdminTaBortInlagg(idb);
        startSidaWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_itemTaBortInlagg1ActionPerformed

    private void itemKonto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemKonto1ActionPerformed
        // TODO add your handling code here:
        Konto startSidaWindow = new Konto(idb);
        startSidaWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_itemKonto1ActionPerformed

    private void itemTaBortKonto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTaBortKonto1ActionPerformed
        // TODO add your handling code here:
        AdminTaBortKonto startSidaWindow = new AdminTaBortKonto(idb);
        startSidaWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_itemTaBortKonto1ActionPerformed

    private void itemAllmanKalender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAllmanKalender1ActionPerformed
        // TODO add your handling code here:
        AdminKalender startSidaWindow = new AdminKalender(idb);
        startSidaWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_itemAllmanKalender1ActionPerformed

    private void itemPrivatKalender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPrivatKalender1ActionPerformed
        // TODO add your handling code here:
        AdminPrivatKalender startSidaWindow = new AdminPrivatKalender(idb);
        startSidaWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_itemPrivatKalender1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        AdminMinaMoten startSidaWindow = new AdminMinaMoten(idb);
        startSidaWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void itemSkapaMote1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSkapaMote1ActionPerformed
        // TODO add your handling code here:
        AdminLaggaInMoten startSidaWindow = new AdminLaggaInMoten(idb);
        startSidaWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_itemSkapaMote1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        MainWindow startSidaWindow = new MainWindow(idb);
        startSidaWindow.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPrivatKalender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPrivatKalender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPrivatKalender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPrivatKalender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new PrivatKalender().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar calendar;
    private javax.swing.JMenuItem itemAllmanKalender1;
    private javax.swing.JMenuItem itemKonto1;
    private javax.swing.JMenu itemLoggaUt1;
    private javax.swing.JMenu itemMinaMoten1;
    private javax.swing.JMenuItem itemPrivatKalender1;
    private javax.swing.JMenuItem itemPubliceraInlagg1;
    private javax.swing.JMenuItem itemSkapaMote1;
    private javax.swing.JMenuItem itemStartsida1;
    private javax.swing.JMenuItem itemTaBortInlagg1;
    private javax.swing.JMenuItem itemTaBortKonto1;
    private javax.swing.JMenuItem itemVisaInformellaBlogg1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
