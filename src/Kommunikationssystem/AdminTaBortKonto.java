
package Kommunikationssystem;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import oru.inf.*;
import oru.inf.InfDB;

public class AdminTaBortKonto extends javax.swing.JFrame {
 private InfDB idb;
 private static String id;
    
    
    /**
     * Creates new form AdminTaBortKonto
     */
    public AdminTaBortKonto(InfDB idb) {
         initComponents();
        this.idb = idb;
          listaKonton();
    }

    private AdminTaBortKonto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        itemStartsida = new javax.swing.JMenuItem();
        itemVisaInformellaBlogg = new javax.swing.JMenuItem();
        itemPubliceraInlagg = new javax.swing.JMenuItem();
        itemTaBortInlagg = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        itemKonto = new javax.swing.JMenuItem();
        itemTaBortKonto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemAllmanKalender = new javax.swing.JMenuItem();
        itemPrivatKalender = new javax.swing.JMenuItem();
        itemMinaMoten = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        itemSkapaMote = new javax.swing.JMenuItem();
        itemLoggaUt = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
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

        itemTaBortInlagg.setText("Ta bort inlägg");
        itemTaBortInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTaBortInlaggActionPerformed(evt);
            }
        });
        jMenu3.add(itemTaBortInlagg);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Kontohantering");

        itemKonto.setText("Ändra konto uppgifter");
        itemKonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemKontoActionPerformed(evt);
            }
        });
        jMenu1.add(itemKonto);

        itemTaBortKonto.setText("Ta bort konton");
        itemTaBortKonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTaBortKontoActionPerformed(evt);
            }
        });
        jMenu1.add(itemTaBortKonto);

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

        itemLoggaUt.setText("                                                                                                                     Logga ut");
        itemLoggaUt.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        itemLoggaUt.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jMenuItem1.setText("Logga ut");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        itemLoggaUt.add(jMenuItem1);

        jMenuBar1.add(itemLoggaUt);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Radera");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ange anställnings-ID för det konto du vill radera.");

        jScrollPane1.setViewportView(jList1);

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
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
                DefaultListModel list = (DefaultListModel) jList1.getModel();
          
        String varde = jList1.getSelectedValue();
        if (varde != null){
        int svar = JOptionPane.showConfirmDialog(this, "Är du säker på att du vill ta bort följande konto: "+varde+"?","Confrim", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (svar) {
         case JOptionPane.YES_OPTION:
             String[] konto = varde.split(" ", 3);
           
        for (String konto1 : konto) {
            String AID = konto[0];
//                var titel = inlagg[0];
//                var text = inlagg[1];
             
         //    for (int i = 0; i < inlagg.length; i++) {
       //   String BID = inlagg[0];
         // String titel = inlagg[1];
          //String text = inlagg[2];
            
                
                
                  try {
                 String sql1 = "DELETE FROM ROLLER_ANSTALLDA WHERE AID =" + AID + "";
                 String sql2 = "DELETE FROM MOTE_DELTAGANDE WHERE ANSTALLDID =" + AID + "";
                  String sql4 = "DELETE FROM INBJUDAN WHERE INBJUDANAID =" + AID + "";
                 String sql3 = "DELETE FROM MOTEN WHERE MOTESLEDARE =" + AID + "";
                
                 String sql5 = "DELETE FROM BLOGGINLAGG WHERE FORFATTARE =" + AID + "";
                    String sql6 = "DELETE FROM ANSTALLDA WHERE AID =" + AID + "";
                  String sql7 = "DELETE FROM BLOGGINLAGG_KOMENTAR WHERE LASAREAID =" + AID + "";
                    idb.delete(sql1);
                    idb.delete(sql2);
                    idb.delete(sql4);
                    idb.delete(sql3);
                    idb.delete(sql7);
                    idb.delete(sql5);
                    idb.delete(sql6);
                  
                  
                    
                } catch (InfException e) {
                    System.out.println(e.getMessage());
                }
            list.removeElement(jList1.getSelectedValue());
             JOptionPane.showMessageDialog(null, "Kontot har tagits bort");
             break;
        }
     
         case JOptionPane.NO_OPTION:
             break;
         case JOptionPane.CLOSED_OPTION:
             break;
         default:
             break;
     }}else if(varde == null){
     JOptionPane.showMessageDialog(null, "Inget konto har valts");
     }
        listaKonton();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void itemStartsidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemStartsidaActionPerformed
        new AdminVisaInlägg(idb).setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_itemStartsidaActionPerformed

    private void itemPubliceraInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPubliceraInlaggActionPerformed

        new AdminGöraInlägg(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_itemPubliceraInlaggActionPerformed

    private void itemTaBortInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTaBortInlaggActionPerformed

        new AdminTaBortInlagg(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_itemTaBortInlaggActionPerformed

    private void itemKontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemKontoActionPerformed
        new Konto(idb).setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_itemKontoActionPerformed

    private void itemTaBortKontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTaBortKontoActionPerformed
        new AdminTaBortKonto(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_itemTaBortKontoActionPerformed

    private void itemAllmanKalenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAllmanKalenderActionPerformed
        new AdminKalender(idb).setVisible(true);
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_itemAllmanKalenderActionPerformed

    private void itemPrivatKalenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPrivatKalenderActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(AdminTaBortKonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminTaBortKonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminTaBortKonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminTaBortKonto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminTaBortKonto().setVisible(true);
            }
        });
    }
    public void listaKonton(){
         DefaultListModel list = new DefaultListModel();
        jList1.clearSelection();
        
        try {  
            ArrayList<HashMap<String, String>> anstallda;
            String sql = "SELECT AID, NAMN FROM ANSTALLDA WHERE NOT AID =" + MainWindow.getId();
            anstallda = idb.fetchRows(sql);
            if(anstallda !=null){

            for (HashMap<String, String> hittad : anstallda) {
                String AID = hittad.get("AID");
                String NAMN = hittad.get("NAMN");
               
                
                
                list.addElement(AID + " " + NAMN +" ");
                jList1.setModel(list);
            }}else{ jList1.setModel(list);
            list.addElement("Det finns inga anställda i databasen.");
                    }
            
        } catch (InfException e) {
            System.out.println(e.getMessage());
        }
    
    
    
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAllmanKalender;
    private javax.swing.JMenuItem itemAllmanKalender1;
    private javax.swing.JMenuItem itemKonto;
    private javax.swing.JMenuItem itemKonto1;
    private javax.swing.JMenu itemLoggaUt;
    private javax.swing.JMenu itemLoggaUt1;
    private javax.swing.JMenu itemMinaMoten;
    private javax.swing.JMenu itemMinaMoten1;
    private javax.swing.JMenuItem itemPrivatKalender;
    private javax.swing.JMenuItem itemPrivatKalender1;
    private javax.swing.JMenuItem itemPubliceraInlagg;
    private javax.swing.JMenuItem itemPubliceraInlagg1;
    private javax.swing.JMenuItem itemSkapaMote;
    private javax.swing.JMenuItem itemSkapaMote1;
    private javax.swing.JMenuItem itemStartsida;
    private javax.swing.JMenuItem itemStartsida1;
    private javax.swing.JMenuItem itemTaBortInlagg;
    private javax.swing.JMenuItem itemTaBortInlagg1;
    private javax.swing.JMenuItem itemTaBortKonto;
    private javax.swing.JMenuItem itemTaBortKonto1;
    private javax.swing.JMenuItem itemVisaInformellaBlogg;
    private javax.swing.JMenuItem itemVisaInformellaBlogg1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
