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
public class AdminVisaInlägg extends javax.swing.JFrame {
    
    private InfDB idb;
    /**
     * Creates new form NewJFrame
     */
    public AdminVisaInlägg(InfDB idb) {
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem8;
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