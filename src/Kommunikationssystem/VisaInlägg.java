/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kommunikationssystem;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import oru.inf.*;


/**
 *
 * @author User
 */
public class VisaInlägg extends javax.swing.JFrame {
    
    private InfDB idb;
    /**
     * Creates new form NewJFrame
     */
    public VisaInlägg(InfDB idb) {
        this.idb = idb;
        initComponents();
        FyllComboBox();
        
    }

   
     private void FyllComboBox()
    {
        String Kategorinamn = "SELECT KATEGORINAMN FROM KATEGORI";
        ArrayList<String> allKategorier;
        // Loopar igenom arraylisten och lägger till varje position i comboboxen
        try {
            allKategorier = idb.fetchColumn(Kategorinamn);
            for (String kategorinamn : allKategorier) {
                cboxKategori.addItem(kategorinamn);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Ett fel inträffade!");
        }
        // Sätter att startläget i comboboxen skall vara en tom poosition
        cboxKategori.setSelectedIndex(-1);}
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboxKategori = new javax.swing.JComboBox<>();
        btnVisaInlagg = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInlagg = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKomentera = new javax.swing.JTextArea();
        btnKomentera = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lableBlogg = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtVisaInlagg = new javax.swing.JTextArea();
        lblBild = new javax.swing.JLabel();
        btnSeInlagg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtKomentarLista = new javax.swing.JList<>();
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

        cboxKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxKategoriActionPerformed(evt);
            }
        });

        btnVisaInlagg.setText("Visa inlägg");
        btnVisaInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaInlaggActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(txtInlagg);

        txtKomentera.setColumns(20);
        txtKomentera.setRows(5);
        jScrollPane1.setViewportView(txtKomentera);

        btnKomentera.setText("Komentera");
        btnKomentera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKomenteraActionPerformed(evt);
            }
        });

        jLabel2.setText("Komentera Inlägg");

        lableBlogg.setText("Blogginlägg");

        txtVisaInlagg.setEditable(false);
        txtVisaInlagg.setColumns(20);
        txtVisaInlagg.setRows(5);
        jScrollPane3.setViewportView(txtVisaInlagg);

        btnSeInlagg.setText("Se inlägg");
        btnSeInlagg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeInlaggActionPerformed(evt);
            }
        });

        jLabel1.setText("Välj kategori");

        jScrollPane4.setViewportView(txtKomentarLista);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboxKategori, 0, 109, Short.MAX_VALUE)
                    .addComponent(btnVisaInlagg, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(lableBlogg))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(279, 279, 279)
                                .addComponent(btnSeInlagg))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(159, 159, 159))
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnKomentera))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(lblBild, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lableBlogg, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVisaInlagg))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1))
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblBild, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKomentera))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(btnSeInlagg)))))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisaInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaInlaggActionPerformed
       if ((cboxKategori.getSelectedIndex() == -1)) {
        JOptionPane.showMessageDialog(null, "Välj en kategori!");
        
       } else {
           listaInlagg();
       }
       
    }//GEN-LAST:event_btnVisaInlaggActionPerformed

    private void btnKomenteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKomenteraActionPerformed
        if(!txtKomentera.getText().isEmpty()) {
         try
        {
        String Aid = "SELECT MAX(KOMENTARID) FROM BLOGGINLAGG_KOMENTAR";
        String AidString = idb.fetchSingle(Aid);
        int AidInt = Integer.parseInt(AidString) + 1;
        
        
        String emailInput = txtKomentera.getText();
        
        String LasareID = MainWindow.getId();
        String rollerVal = txtInlagg.getSelectedValue();
        
        String rollSiffra = idb.fetchSingle( "SELECT BID FROM Blogginlagg WHERE Titel ='" + rollerVal + "'");
        int rollSiffraInt = Integer.parseInt(rollSiffra);
        
        String fraga = "INSERT INTO BLOGGINLAGG_KOMENTAR VALUES ('" + AidInt + "','" + LasareID + "','" + rollSiffraInt + "','" + emailInput +"')";
        
    
        idb.insert(fraga);
        JOptionPane.showMessageDialog(null, "Din komentar har registrerats på inlägget!");
        }
        catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Ett fel inträffade!");
            }

        }
        else{
        JOptionPane.showMessageDialog(null, "Skriv en kommentar!");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnKomenteraActionPerformed

    private void btnSeInlaggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeInlaggActionPerformed

         if(txtInlagg.getSelectedValue()!= null){
        try {
        String rollerVal = txtInlagg.getSelectedValue();
        String textInlagg = idb.fetchSingle ("SELECT TEXT from BLOGGINLAGG where TITEL = '" + rollerVal + "'");  
        String bild = idb.fetchSingle("SELECT BILD from BLOGGINLAGG where TITEL = '" + rollerVal + "'");
        txtVisaInlagg.setText(textInlagg);
        
        
        
       // Image image = icon.getImage().getScaledInstance(lblBild.getWidth(), lblBild.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(bild).getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH));
        
        
        lblBild.setIcon(imageIcon);
        listaKomentar();
        }
        
        catch 
        (InfException e) {
                JOptionPane.showMessageDialog(null, "Ett fel inträffade!");
        }
         }
         else{
       JOptionPane.showMessageDialog(null, "Klicka på en titel!");
       }
         
    }//GEN-LAST:event_btnSeInlaggActionPerformed

    private void cboxKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxKategoriActionPerformed

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
    public void listaInlagg(){
         DefaultListModel list = new DefaultListModel();
        txtInlagg.clearSelection();

        try {
             String kategoriVal = cboxKategori.getSelectedItem().toString();
        
             String kategoriID = idb.fetchSingle("SELECT KID from KATEGORI where kategorinamn = '" + kategoriVal + "'");
            
            ArrayList<HashMap<String, String>> blogginlagg;
            String sql = "SELECT BID, TITEL, TEXT FROM BLOGGINLAGG where kategori = '" + kategoriID + "'";
            blogginlagg = idb.fetchRows(sql);
            if(blogginlagg !=null){

            for (HashMap<String, String> hittad : blogginlagg) {
                String BID = hittad.get("BID");
                String titel = hittad.get("TITEL");
                String text = hittad.get("TEXT");


                list.addElement(titel);
                txtInlagg.setModel(list);
            }}else{ txtInlagg.setModel(list);
            list.addElement("Det finns inga inlägg i databasen.");
                    }

        }
        
        catch(InfException e){
            System.out.println(e.getMessage());
        
        }  


    }
     public void listaKomentar(){
         DefaultListModel klist = new DefaultListModel();
      

        try {
             String kategoriVal = cboxKategori.getSelectedItem().toString();
             
             String blogginlaggKomentarer = idb.fetchSingle("SELECT BID from BLOGGINLAGG where Titel = '" + txtInlagg.getSelectedValue() + "'");
            ArrayList<HashMap<String, String>> komentarInlagg;
            String blogginlaggKomentar = "SELECT BID,Komentar FROM BLOGGINLAGG_KOMENTAR where BID = " + blogginlaggKomentarer ;
            komentarInlagg = idb.fetchRows(blogginlaggKomentar);
            if(komentarInlagg !=null){

            for (HashMap<String, String> hittad : komentarInlagg) {
                String BID = hittad.get("BID");
                String Komentar = hittad.get("KOMENTAR");
                
                System.out.println(Komentar);

                klist.addElement(Komentar);
                txtKomentarLista.setModel(klist);
            }}else{ txtKomentarLista.setModel(klist);
            klist.addElement("Det finns inga komentarer på inlägget.");
                    }

        }
        
        catch(InfException e){
            System.out.println(e.getMessage());
        
        }  


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKomentera;
    private javax.swing.JButton btnSeInlagg;
    private javax.swing.JButton btnVisaInlagg;
    private javax.swing.JComboBox<String> cboxKategori;
    private javax.swing.JMenuItem itemAllmanKalender;
    private javax.swing.JMenuItem itemKonto;
    private javax.swing.JMenu itemMinaMoten;
    private javax.swing.JMenuItem itemPrivatKalender;
    private javax.swing.JMenuItem itemPubliceraInlagg;
    private javax.swing.JMenuItem itemSkapaMote;
    private javax.swing.JMenuItem itemStartsida;
    private javax.swing.JMenuItem itemVisaInformellaBlogg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lableBlogg;
    private javax.swing.JLabel lblBild;
    private javax.swing.JList<String> txtInlagg;
    private javax.swing.JList<String> txtKomentarLista;
    private javax.swing.JTextArea txtKomentera;
    private javax.swing.JTextArea txtVisaInlagg;
    // End of variables declaration//GEN-END:variables

}