/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kommunikationssystem;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.*;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;

/**
 *
 * @author Erik
 */
public class LaggaInMoten extends javax.swing.JFrame {
    private static InfDB idb;
    private String aid;
    private Mail mail;

    /**
     * Creates new form LaggaInMoten
     *
     * 
     */
    public LaggaInMoten(InfDB idb) {
        this.idb = idb;
        initComponents();
        aid = MainWindow.getId();
        fillfield();
        populateComboBox();
        populateTable();
       // Kalender();
      //ShowTimeJSpinner();
    }
    public void fillfield(){
    try {
     
      String Moteschef = idb.fetchSingle("SELECT NAMN FROM ANSTALLDA WHERE AID = '"+aid+"'");
      jLabel5.setText(Moteschef);
             
           
  }   catch (InfException e) {
       JOptionPane.showMessageDialog(null, "Ett fel inträffade!");
  }
    }
    public void populateComboBox(){
    try {  

          ArrayList<String> Forfattare;          
          String SQLForfattare = "SELECT NAMN FROM ANSTALLDA";          
          Forfattare = idb.fetchColumn(SQLForfattare);           

            
          for (String resultat : Forfattare){
              jComboBox1.addItem(resultat);               
         }
           
        } catch (InfException e) {
            e.printStackTrace();
        }
    }
    public void populateTable()
    {
    
        jTable1.clearSelection();
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        
        try {  
            ArrayList<String> Forfattare;
            String sql = "SELECT NAMN FROM ANSTALLDA";
            
             Forfattare = idb.fetchColumn(sql);
            
            for (String resultat : Forfattare) {
                          
                table.addRow(new Object[]{resultat, false});               
               
            }}
            
         catch(InfException e) 
         {
            System.out.println(e.getMessage());
        }
    }
    public void filter(String varde){
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(varde));
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSkapaMote = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        timePicker1 = new com.github.lgooddatepicker.components.TimePicker();
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

        jLabel1.setText("Möteschef:");

        btnSkapaMote.setText("Skapa möte");
        btnSkapaMote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkapaMoteActionPerformed(evt);
            }
        });

        jLabel2.setText("Titel");

        jLabel4.setText("Beskrivning");

        jLabel6.setText("Ändra möteschef");

        jLabel5.setText("jLabel5");

        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jComboBox1MouseExited(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Deltagare", "Medverkar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jLabel3.setText("Sök");

        jLabel8.setText("Välj tid");

        jDateChooser1.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(timePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(163, 163, 163)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSkapaMote, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel4))
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(timePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(btnSkapaMote)
                        .addContainerGap(41, Short.MAX_VALUE))))
        );

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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSkapaMoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkapaMoteActionPerformed
        // TODO add your handling code here:
        
        
        
        if(Validation.isNotEmpty(jTextField1) && Validation.isNotEmpty(jTextField2)){
        try{
        String Moteschef = jLabel5.getText();
        String MF = "SELECT AID FROM ANSTALLDA WHERE NAMN = '"+Moteschef+"'";
        String Moteschefen = idb.fetchSingle(MF);
        int MFINT = Integer.parseInt(Moteschefen);

        
        
          String MID = "SELECT MAX(MOTEID) FROM MOTEN";
          String MidString = idb.fetchSingle(MID);
          int MidInt = Integer.parseInt(MidString) + 1;

          
          
            
             String feltid = timePicker1.getText();
             if(feltid.isEmpty()){
             JOptionPane.showMessageDialog(null, "Inget tid har valts!");
             }
             else if(!feltid.isEmpty()){
             String myTime = feltid + ":00";
             SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
             Date date = null;
             
                try {
                        date = sdf.parse(myTime);
                } catch (ParseException e) {
                    e.printStackTrace();
                        }
                    String formattedTime = sdf.format(date);
                    

            
          java.util.Date d = jDateChooser1.getDate();
          if (d == null) {
              JOptionPane.showMessageDialog(null, "Inget datum har valts!");
             
            } else {
                     java.sql.Date sqldate = new java.sql.Date(d.getTime());

                    
          String titel = jTextField1.getText();
          String Beskrivning = jTextField2.getText();
          String datemail = sqldate.toString();
         
          
        boolean hittad = false;
        
        for (int i = 0; jTable1.getRowCount() > i; i++) {
            final String col1 = (String) jTable1.getValueAt(i, 0);
            final boolean col2 = (boolean) jTable1.getValueAt(i, 1);


            if(col2 == true){
            hittad = true;
            }}
            if (hittad == true){
           String fraga = "INSERT INTO MOTEN VALUES ('" + MidInt + "','" + formattedTime + "','" + sqldate + "','" + MFINT + "','"+titel+"','"+Beskrivning+"','OREBRO')";
          idb.insert(fraga);
                for (int i = 0; jTable1.getRowCount() > i; i++) {
            final String col1 = (String) jTable1.getValueAt(i, 0);
            final boolean col2 = (boolean) jTable1.getValueAt(i, 1);


            if(col2 == true){
            String sql ="SELECT AID FROM ANSTALLDA WHERE NAMN = '"+col1+"'";
            String sqlString = idb.fetchSingle(sql);            
            int SQLInt = Integer.parseInt(sqlString);

            String inbjudanMoteDeltagande = "INSERT INTO INBJUDAN VALUES('"+ sqlString  +"', '"+  MidInt+"', 'SVAR')";
            idb.insert(inbjudanMoteDeltagande);
            String qmail = "SELECT EMAIL FROM ANSTALLDA WHERE AID = " + sqlString;
            String email = idb.fetchSingle(qmail);
            String text = "Hej,\n\nDu har blivit inbjuden till ett möte den\n" + datemail + " kl " + formattedTime + "\nInformation om mötet:" + Beskrivning;
            mail.sendMail(email, text, titel);
            }
                }
            }

          
       
          if(hittad == false)
       {
           
           JOptionPane.showMessageDialog(null, "Välj deltagare"); 
       }
          else{
          JOptionPane.showMessageDialog(null, "Ett nytt möte har registerats!");
          
          }
          } }
                           
        }
            catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Ett fel inträffade!");
         }
            catch (Exception ex) {
            Logger.getLogger(LaggaInMoten.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        
        }
    
     
    }//GEN-LAST:event_btnSkapaMoteActionPerformed

    private void jComboBox1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseExited
        // TODO add your handling code here:
        String KategoriInput = jComboBox1.getSelectedItem().toString();
          jLabel5.setText(KategoriInput);
    }//GEN-LAST:event_jComboBox1MouseExited

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:
        String varde = jTextField3.getText();
        filter(varde);
        
    }//GEN-LAST:event_jTextField3KeyReleased

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
            java.util.logging.Logger.getLogger(LaggaInMoten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaggaInMoten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaggaInMoten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaggaInMoten.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new LaggaInMoten().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnSkapaMote;
    private javax.swing.JMenuItem itemAllmanKalender;
    private javax.swing.JMenuItem itemKonto;
    private javax.swing.JMenu itemMinaMoten;
    private javax.swing.JMenuItem itemPrivatKalender;
    private javax.swing.JMenuItem itemPubliceraInlagg;
    private javax.swing.JMenuItem itemSkapaMote;
    private javax.swing.JMenuItem itemStartsida;
    private javax.swing.JMenuItem itemVisaInformellaBlogg;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private com.github.lgooddatepicker.components.TimePicker timePicker1;
    // End of variables declaration//GEN-END:variables
}
