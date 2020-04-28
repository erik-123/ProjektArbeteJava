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
public class PrivatKalender extends javax.swing.JFrame {
 private InfDB idb;
 private String aid;
    /**
     * Creates new form PrivatKalender
     */
    public PrivatKalender(InfDB idb) {
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        itemStartsida = new javax.swing.JMenuItem();
        itemVisaInformellaBlogg = new javax.swing.JMenuItem();
        itemPubliceraInlagg = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        itemKonto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemAllmanKalender = new javax.swing.JMenuItem();
        itemPrivatKalender = new javax.swing.JMenuItem();
        itemMinaMoten = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        itemSkapaMote = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

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

        jMenu3.setText("Inlägg");

        itemStartsida.setText("Startsida");
        itemStartsida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemStartsidaActionPerformed(evt);
            }
        });
        jMenu3.add(itemStartsida);

        itemVisaInformellaBlogg.setText("Visa blogg");
        jMenu3.add(itemVisaInformellaBlogg);

        itemPubliceraInlagg.setText("Publicera inlägg");
        itemPubliceraInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPubliceraInlaggActionPerformed(evt);
            }
        });
        jMenu3.add(itemPubliceraInlagg);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Kontohantering");

        itemKonto.setText("Ändra konto uppgifter");
        itemKonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemKontoActionPerformed(evt);
            }
        });
        jMenu1.add(itemKonto);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Kalender");

        itemAllmanKalender.setText("Visa allmänna möten");
        itemAllmanKalender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAllmanKalenderActionPerformed(evt);
            }
        });
        jMenu2.add(itemAllmanKalender);

        itemPrivatKalender.setText("Visa privat kalender");
        itemPrivatKalender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPrivatKalenderActionPerformed(evt);
            }
        });
        jMenu2.add(itemPrivatKalender);

        jMenuBar1.add(jMenu2);

        itemMinaMoten.setText("Möten");

        jMenuItem7.setText("Visa mina möten");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        itemMinaMoten.add(jMenuItem7);

        itemSkapaMote.setText("Skapa möte");
        itemSkapaMote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSkapaMoteActionPerformed(evt);
            }
        });
        itemMinaMoten.add(itemSkapaMote);

        jMenuBar1.add(itemMinaMoten);

        jMenu4.setText("Logga ut");

        jMenuItem1.setText("Logga ut");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

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
                .addContainerGap(211, Short.MAX_VALUE))
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
                .addContainerGap(216, Short.MAX_VALUE))
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

    private void itemStartsidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemStartsidaActionPerformed
        new VisaInlägg(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_itemStartsidaActionPerformed

    private void itemPubliceraInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPubliceraInlaggActionPerformed

        new GöraInlägg(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_itemPubliceraInlaggActionPerformed

    private void itemKontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemKontoActionPerformed
        new Konto(idb).setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_itemKontoActionPerformed

    private void itemAllmanKalenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAllmanKalenderActionPerformed
        new Kalender(idb).setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_itemAllmanKalenderActionPerformed

    private void itemPrivatKalenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPrivatKalenderActionPerformed
        // TODO add your handling code here:
        new PrivatKalender(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_itemPrivatKalenderActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed

        new MinaMoten(idb).setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void itemSkapaMoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSkapaMoteActionPerformed

        new LaggaInMoten(idb).setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_itemSkapaMoteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new MainWindow(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(PrivatKalender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrivatKalender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrivatKalender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrivatKalender.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JMenuItem itemAllmanKalender;
    private javax.swing.JMenuItem itemKonto;
    private javax.swing.JMenu itemMinaMoten;
    private javax.swing.JMenuItem itemPrivatKalender;
    private javax.swing.JMenuItem itemPubliceraInlagg;
    private javax.swing.JMenuItem itemSkapaMote;
    private javax.swing.JMenuItem itemStartsida;
    private javax.swing.JMenuItem itemVisaInformellaBlogg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
