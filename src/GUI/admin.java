/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import project2filmproject.FilmObjekt;

/**
 *
 * @author daca97002
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
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
        filmnamn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        regissör = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tFGenre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        timmar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        releasedatum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        betyg = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        beskrivning = new javax.swing.JTextArea();
        logOut = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        add = new javax.swing.JButton();
        minuter = new javax.swing.JTextField();
        comboGenreList = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listGenreList = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        listMessage = new javax.swing.JLabel();
        addList = new javax.swing.JButton();
        danishButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("GUI/Bundle"); // NOI18N
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("admin.jPanel1.border.border.border.title"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION)))); // NOI18N

        filmnamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmnamnActionPerformed(evt);
            }
        });

        jLabel1.setText(bundle.getString("admin.jLabel1.text")); // NOI18N

        jLabel2.setText(bundle.getString("admin.jLabel2.text")); // NOI18N

        regissör.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regissörActionPerformed(evt);
            }
        });

        jLabel3.setText(bundle.getString("admin.jLabel3.text")); // NOI18N

        tFGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFGenreActionPerformed(evt);
            }
        });

        jLabel4.setText(bundle.getString("admin.jLabel4.text")); // NOI18N

        timmar.setText(bundle.getString("admin.timmar.text")); // NOI18N
        timmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timmarActionPerformed(evt);
            }
        });

        jLabel5.setText(bundle.getString("admin.jLabel5.text")); // NOI18N

        releasedatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                releasedatumActionPerformed(evt);
            }
        });

        jLabel6.setText(bundle.getString("admin.jLabel6.text")); // NOI18N

        betyg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betygActionPerformed(evt);
            }
        });

        jLabel9.setText(bundle.getString("admin.jLabel9.text")); // NOI18N

        beskrivning.setColumns(20);
        beskrivning.setRows(5);
        jScrollPane1.setViewportView(beskrivning);

        logOut.setText(bundle.getString("admin.logOut.text")); // NOI18N
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        clear.setText(bundle.getString("admin.clear.text")); // NOI18N
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        add.setText(bundle.getString("admin.add.text")); // NOI18N
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        minuter.setText(bundle.getString("admin.minuter.text")); // NOI18N
        minuter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minuterActionPerformed(evt);
            }
        });

        comboGenreList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Undefined", "Action", "Comedy", "Romance", "War", "Documentery", "Flumeri" }));
        comboGenreList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGenreListActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listGenreList);

        addList.setText(bundle.getString("admin.addList.text")); // NOI18N
        addList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addListActionPerformed(evt);
            }
        });

        danishButton.setText(bundle.getString("admin.danishButton.text")); // NOI18N
        danishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                danishButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(logOut)
                                .addGap(54, 54, 54)
                                .addComponent(clear))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(filmnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(regissör, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(59, 59, 59))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(timmar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(minuter, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(betyg, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(releasedatum, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(danishButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(tFGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addList))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboGenreList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(add)
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboGenreList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(danishButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(filmnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tFGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addList)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(regissör, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(listMessage))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(minuter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(timmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(releasedatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(betyg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logOut)
                    .addComponent(clear)
                    .addComponent(add))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addListActionPerformed
        //SKICKA INMATAT VÄRDE TILL jComboBox
        String kategorgi = tFGenre.getText().toLowerCase();
        try {
            omvandla.Strang.genreIdToString(omvandla.Strang.genreToId(kategorgi));
            //TÖMM MEDELANDE OM ANVÄNDARE GER KORREKT VÄRDE
            listMessage.setText("");
        } catch (Exception e) {
            listMessage.setText("Genre saknas");
            System.out.println("Fel " + e);
        }
        this.comboGenreList.setSelectedItem(omvandla.Strang.toFirstCap(kategorgi));

    }//GEN-LAST:event_addListActionPerformed

    private void comboGenreListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGenreListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboGenreListActionPerformed

    private void minuterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minuterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minuterActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String newFNamn = this.filmnamn.getText();
        String newRegissör = this.regissör.getText();
        String newBeskrivning = this.beskrivning.getText();
        if (newFNamn.length() <= 40 && newRegissör.length() <= 60 && newBeskrivning.length() <= 500) {
            this.listMessage.setText("");
            int tim;
            int min;
            int sekunder = 0;
            try {
                min = Integer.parseInt(this.minuter.getText());
                tim = Integer.parseInt(this.timmar.getText());
                sekunder = omvandla.time.tidToSec(tim, min);

            } catch (Exception e) {
                listMessage.setText("Fyll i korrekt tid");
                System.out.println("Error: " + e);
            }
            try {
                FilmObjekt film = new FilmObjekt();

                film.Filmnamn = newFNamn;
                film.Regissör = newRegissör;
                film.Beskrivning = newBeskrivning;
                film.Genre = this.comboGenreList.getSelectedItem().toString();
                film.Längd = sekunder;
                film.setRelease(this.releasedatum.getText());
                film.setBetyg(Integer.parseInt(this.betyg.getText()));
                //Fel härnånstans
                JOptionPane.showMessageDialog(null, "år " + film.getRelease() + " betyg " + film.getBetyg());
                project2filmproject.FilmFörstörd.seter(film);
                listMessage.setText("Inlägg lyckades");
            } catch (Exception e) {
                listMessage.setText("Fyll i fält");
                System.out.println("Error " + e);
            }
        } else {
            this.listMessage.setText("Regissörnamn, max 60 tecken, Filmnamn max 40 "
                    + "beskrivning max 500");
        }
    }//GEN-LAST:event_addActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        filmnamn.setText("");
        regissör.setText("");
        tFGenre.setText("");
        timmar.setText("");
        minuter.setText("");
        releasedatum.setText("");
        betyg.setText("");
        beskrivning.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_logOutActionPerformed

    private void betygActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betygActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_betygActionPerformed

    private void releasedatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_releasedatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_releasedatumActionPerformed

    private void timmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timmarActionPerformed
        /*try {
            int tim =Integer.parseInt(this.timmar.getText());
        } catch (Exception e) {
            System.out.println("Felmedelande: "+e);
        }*/
    }//GEN-LAST:event_timmarActionPerformed

    private void tFGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFGenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFGenreActionPerformed

    private void regissörActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regissörActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regissörActionPerformed

    private void filmnamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmnamnActionPerformed

    }//GEN-LAST:event_filmnamnActionPerformed

    private void danishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_danishButtonActionPerformed
        loadLocale("da", "DK");
    }//GEN-LAST:event_danishButtonActionPerformed
    public void loadLocale(String language, String country) {
        Locale locale = new Locale(language, country);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("GUI/Bundle", locale);
        
        jLabel4.setText(resourceBundle.getString("admin.jLabel4.text"));
        jLabel3.setText(resourceBundle.getString("admin.jLabel3.text"));
        addList.setText(resourceBundle.getString("admin.addList.text"));
        jLabel2.setText(resourceBundle.getString("admin.jLabel2.text"));
        jLabel1.setText(resourceBundle.getString("admin.jLabel1.text"));
        minuter.setText(resourceBundle.getString("admin.minuter.text"));
        add.setText(resourceBundle.getString("admin.add.text"));
        clear.setText(resourceBundle.getString("admin.clear.text"));
        logOut.setText(resourceBundle.getString("admin.logOut.text"));
        jLabel9.setText(resourceBundle.getString("admin.jLabel9.text"));
        jLabel6.setText(resourceBundle.getString("admin.jLabel6.text"));
        jLabel5.setText(resourceBundle.getString("admin.jLabel5.text"));
        timmar.setText(resourceBundle.getString("admin.timmar.text"));
        danishButton.setText(resourceBundle.getString("admin.danishButton.text"));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceBundle.getString("admin.jPanel1.border.border.border.title"),
                javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Font",0,14)));
    }

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton addList;
    private javax.swing.JTextArea beskrivning;
    private javax.swing.JTextField betyg;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> comboGenreList;
    private javax.swing.JButton danishButton;
    private javax.swing.JTextField filmnamn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listGenreList;
    private javax.swing.JLabel listMessage;
    private javax.swing.JButton logOut;
    private javax.swing.JTextField minuter;
    private javax.swing.JTextField regissör;
    private javax.swing.JTextField releasedatum;
    private javax.swing.JTextField tFGenre;
    private javax.swing.JTextField timmar;
    // End of variables declaration//GEN-END:variables
}
