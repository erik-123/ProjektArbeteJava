/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kommunikationssystem;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Edvin
 */
public class GöraInlägg extends javax.swing.JFrame {
    private static InfDB idb;
    private Mail mail;
    
    public GöraInlägg(InfDB idb) {
        initComponents();
        this.idb = idb;
        FyllComboBox();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtKategori = new javax.swing.JTextField();
        BtnPubliceraInlagg = new javax.swing.JButton();
        CboValjKategori = new javax.swing.JComboBox<>();
        TxtSkrivaInlag = new javax.swing.JScrollPane();
        TxtSkrivaInlagg = new javax.swing.JTextArea();
        txtTitel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        lbl_image = new javax.swing.JLabel();
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

        BtnPubliceraInlagg.setText("Publicera Inlägg");
        BtnPubliceraInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPubliceraInlaggActionPerformed(evt);
            }
        });

        TxtSkrivaInlagg.setColumns(20);
        TxtSkrivaInlagg.setRows(5);
        TxtSkrivaInlag.setViewportView(TxtSkrivaInlagg);

        txtTitel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitelActionPerformed(evt);
            }
        });

        jLabel1.setText("Välj titel på inlägg");

        jLabel2.setText("Välj kategori");

        jLabel3.setText("Skriv in ny kategori");

        jButton1.setText("Välj bild fil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Välj bild här");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CboValjKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(TxtSkrivaInlag, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnPubliceraInlagg)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CboValjKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtSkrivaInlag, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnPubliceraInlagg, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FyllComboBox()
    {
        String Kategorinamn = "SELECT KATEGORINAMN FROM KATEGORI";
        ArrayList<String> allKategorier;
        // Loopar igenom arraylisten och lägger till varje position i comboboxen
        try {
            allKategorier = idb.fetchColumn(Kategorinamn);
            for (String kategorinamn : allKategorier) {
                CboValjKategori.addItem(kategorinamn);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Ett fel inträffade!");
        }
        // Sätter att startläget i comboboxen skall vara en tom poosition
        CboValjKategori.setSelectedIndex(-1);}
    
    
    private void BtnPubliceraInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPubliceraInlaggActionPerformed
        if(Validation.isNotEmpty(txtTitel)){
        if(TxtKategori.getText().isEmpty() && CboValjKategori.getSelectedIndex()!=-1)
        {
        try
        {
        String bid = "SELECT MAX(BID) FROM BLOGGINLAGG";
        String bidString = idb.fetchSingle(bid);
        int bidInt = Integer.parseInt(bidString) + 1;
        String forfattare = MainWindow.getId();
       
        String text = TxtSkrivaInlagg.getText();
        String titel = txtTitel.getText();
        

        String kategoriVal = CboValjKategori.getSelectedItem().toString();
        
        String kategoriID = idb.fetchSingle("SELECT KID FROM KATEGORI WHERE Kategorinamn ='" + kategoriVal + "'");
        
        int kategoriIDInt = Integer.parseInt(kategoriID);
        
        String image = jTextField1.getText();
        image = image.replace("\\", "\\\\");
          
        String fraga = "INSERT INTO BLOGGINLAGG VALUES ('" + bidInt + "','" + titel + "','" + text + "','" + forfattare + "','" + kategoriIDInt + "','" + image + "')";
        idb.insert(fraga);
        mail();
        JOptionPane.showMessageDialog(null, "Ditt inlägg har postats!");
        
        }
        catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Ett fel inträffade!");
        }   
        }  
        else if(!TxtKategori.getText().isEmpty())
                {   
                    
         try
        {
        String bid = "SELECT MAX(BID) FROM BLOGGINLAGG";
        String bidString = idb.fetchSingle(bid);
        int bidInt = Integer.parseInt(bidString) + 1;
        String forfattare = MainWindow.getId();
        
        String text = TxtSkrivaInlagg.getText();
        String titel = txtTitel.getText();
            
        String KID = "SELECT MAX(KID) FROM KATEGORI";
        String KIDString = idb.fetchSingle(KID);
        int KIDInt = Integer.parseInt(KIDString) + 1;
        
        String ktext = TxtKategori.getText();
        
        String image = jTextField1.getText();
        image = image.replace("\\", "\\\\");
        
        String Ktabell = "INSERT INTO KATEGORI VALUES ('" + KIDInt + "','" + ktext + "')";
        idb.insert(Ktabell);
        
        String fraga = "INSERT INTO BLOGGINLAGG VALUES ('" + bidInt + "','" + titel + "','" + text + "','" + forfattare + "','" + KIDInt + "','" + image + "')";
        idb.insert(fraga);
        
        JOptionPane.showMessageDialog(null, "Du har skapat en ny kategori!");
        mail();
        JOptionPane.showMessageDialog(null, "Ditt inlägg har postats!");
        
        }
        catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Ett fel inträffade!");
            } 
                }
        else{
        JOptionPane.showMessageDialog(null, "Välj en kategori!");
        
        }
        }
        
    }//GEN-LAST:event_BtnPubliceraInlaggActionPerformed

    private void mail (){
            try{
                String Titel = txtTitel.getText();
                String namn = idb.fetchSingle("SELECT NAMN FROM ANSTALLDA WHERE AID = '" + MainWindow.getId() + "'");
                String Enamn = idb.fetchSingle("SELECT EFTERNAMN FROM ANSTALLDA WHERE AID = '" + MainWindow.getId() + "'");
                String Namn = namn + " " + Enamn;  
                ArrayList<String> aids = idb.fetchColumn("SELECT AID FROM ANSTALLDA");
                for (String aid : aids) {
                    int id = Integer.parseInt(aid);
                    String note = idb.fetchSingle("SELECT NOTIS FROM ANSTALLDA WHERE AID= '" + id + "'");
                    if (note != null){
                    if (note.equals("J")) {
                        String qmail = "SELECT EMAIL FROM ANSTALLDA WHERE AID = " + id;
                        String email = idb.fetchSingle(qmail);
                        String titel = "Nytt inlägg";
                        String text = "Hej,\n\nEtt nytt inlägg har publicerats\n" + "Av: " + Namn + "\nMed titeln: " + Titel;
                        mail.sendMail(email, text, titel);
                    }
                    }
                }            
        
        
        }
        catch (Exception ex) {
            Logger.getLogger(GöraInlägg.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    
    private void txtTitelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  JFileChooser chooser = new JFileChooser();
    chooser.showOpenDialog(null);
    File f = chooser.getSelectedFile();
    String filename = f.getAbsolutePath();
    jTextField1.setText(filename);
    Image getAbsolutePath = null;

    ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH));
    lbl_image.setIcon(imageIcon);

    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPubliceraInlagg;
    private javax.swing.JComboBox<String> CboValjKategori;
    private javax.swing.JTextField TxtKategori;
    private javax.swing.JScrollPane TxtSkrivaInlag;
    private javax.swing.JTextArea TxtSkrivaInlagg;
    private javax.swing.JMenuItem itemAllmanKalender;
    private javax.swing.JMenuItem itemKonto;
    private javax.swing.JMenu itemMinaMoten;
    private javax.swing.JMenuItem itemPrivatKalender;
    private javax.swing.JMenuItem itemPubliceraInlagg;
    private javax.swing.JMenuItem itemSkapaMote;
    private javax.swing.JMenuItem itemStartsida;
    private javax.swing.JMenuItem itemVisaInformellaBlogg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JTextField txtTitel;
    // End of variables declaration//GEN-END:variables
}
