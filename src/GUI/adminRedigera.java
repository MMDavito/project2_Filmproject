/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.Date;
import javax.swing.JOptionPane;
import omvandla.time;
import project2filmproject.FilmObjekt;

/**
 * Tar emot info ifrån redan existerande film, skickar redigeringsinformation.
 *
 * @author daca97002
 */
public class adminRedigera extends javax.swing.JFrame {

    /**
     * Creates new form adminRedigera
     *
     * @param filmensNamn Tar emot filnamn, skickar sqlqueri och sätter
     * informationen som filmen redan har.
     *
     *
     */
    public static String filmensNamn;
    public static FilmObjekt nyFilm = new FilmObjekt();
    public static time tid = new time();

    public static void film(String filmNamn) {
        filmensNamn = filmNamn;
        nyFilm = project2filmproject.FilmFörstörd.GeterFilmnamn(filmensNamn);
        try {
            tid = omvandla.time.secToTime(nyFilm.Längd);

        } catch (Exception e) {
            System.out.println("Fel vid omvandling av tid " + e);
        }
        //lägg till info
        /*mellanregister insert information ifrån "mellanregister", 
                gör sedan om det och skriv ut det i alla rutorna.*/
    }

    public adminRedigera() {
        initComponents();

        this.oldFilmnamn.setText(filmensNamn);
        this.newFilmnamn.setText(nyFilm.Filmnamn);
        this.comboGenreList.setSelectedItem(nyFilm.Genre);
        this.regissör.setText(nyFilm.Regissör);
        this.beskrivning.setText(nyFilm.Beskrivning);
        this.timmar.setText(tid.timar);
        this.minuter.setText(tid.minuter);
        this.betyg.setText(Integer.toString(nyFilm.getBetyg()));
        this.releasedatum.setText(nyFilm.getRelease());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
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
        oldFilmnamn = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        newFilmnamn = new javax.swing.JTextField();
        delete = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADMIN Redigera", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION))));

        jLabel1.setText("Filmnamn");

        jLabel2.setText("Regissör");

        regissör.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regissörActionPerformed(evt);
            }
        });

        jLabel3.setText("Genre");

        tFGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFGenreActionPerformed(evt);
            }
        });

        jLabel4.setText("Längd");

        timmar.setText("Timme");
        timmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timmarActionPerformed(evt);
            }
        });

        jLabel5.setText("Releasedatum");

        jLabel6.setText("Betyg");

        betyg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betygActionPerformed(evt);
            }
        });

        jLabel9.setText("Beskrivning");

        beskrivning.setColumns(20);
        beskrivning.setRows(5);
        jScrollPane1.setViewportView(beskrivning);

        logOut.setText("Loga ut");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        clear.setText("Rensa");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        add.setText("Ändra");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        minuter.setText("Minut");
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

        addList.setText("OK");
        addList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addListActionPerformed(evt);
            }
        });

        jLabel11.setText("Ändra Fillmnamn");

        newFilmnamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFilmnamnActionPerformed(evt);
            }
        });

        delete.setText("Radera");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(releasedatum, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(58, 58, 58)
                                .addComponent(betyg, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(timmar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(minuter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(regissör, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                            .addComponent(newFilmnamn))))
                                .addGap(35, 35, 35)
                                .addComponent(jLabel9))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(tFGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addList)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48)
                        .addComponent(oldFilmnamn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(logOut)
                        .addGap(18, 18, 18)
                        .addComponent(clear)
                        .addGap(18, 18, 18)
                        .addComponent(delete)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboGenreList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(add)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(listMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboGenreList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tFGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addList)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(oldFilmnamn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(newFilmnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(regissör, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(listMessage))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(minuter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(timmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(releasedatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(betyg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logOut)
                    .addComponent(clear)
                    .addComponent(add)
                    .addComponent(delete))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regissörActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regissörActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regissörActionPerformed

    private void tFGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFGenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFGenreActionPerformed

    private void timmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timmarActionPerformed
        /*try {
            int tim =Integer.parseInt(this.timmar.getText());
        } catch (Exception e) {
            System.out.println("Felmedelande: "+e);
        }*/
    }//GEN-LAST:event_timmarActionPerformed

    private void betygActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betygActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_betygActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_logOutActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        newFilmnamn.setText("");
        regissör.setText("");
        tFGenre.setText("");
        timmar.setText("");
        minuter.setText("");
        releasedatum.setText("");
        betyg.setText("");
        beskrivning.setText("");

    }//GEN-LAST:event_clearActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        FilmObjekt film = new FilmObjekt();
        String gammalFilm = this.oldFilmnamn.getText();
        if (this.newFilmnamn.toString().length() <= 40 && this.regissör.toString().length() <= 60 && this.beskrivning.toString().length() <= 500) {
            int tim;
            int min;
            int sekunder = 0;
            try {
                min = Integer.parseInt(this.minuter.getText());
                tim = Integer.parseInt(this.timmar.getText());
                sekunder = omvandla.time.timeToSec(tim, min);

            } catch (Exception e) {
                listMessage.setText("Fyll i korrekt tid");
                System.out.println("Error: " + e);
            }
            try {
                /*project2filmproject.FilmObjekt[] film = new project2filmproject.FilmObjekt[1];*/
                film.Filmnamn = this.newFilmnamn.getText();
                film.Regissör = this.regissör.getText();
                film.Beskrivning = this.beskrivning.getText();
                film.Genre = this.comboGenreList.getSelectedItem().toString();
                film.Längd = sekunder;
                film.setRelease(this.releasedatum.getText());
                film.setBetyg(Integer.parseInt(this.betyg.getText()));
                project2filmproject.FilmFörstörd.change(gammalFilm, film);
                JOptionPane.showMessageDialog(null, "Inlägg lyckades");
                this.setVisible(false);
            } catch (Exception e) {
                listMessage.setText("Fyll i fält");
                System.out.println("Error " + e);
            }
        } else if (this.newFilmnamn == null || this.regissör == null) {
            this.listMessage.setText("Fyll i fält");
        } else {
            
            this.listMessage.setText("Regissörnamn, max 60 tecken, Filmnamn max 40 "
                    + "beskrivning max 500");
        }

    }//GEN-LAST:event_addActionPerformed

    private void minuterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minuterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minuterActionPerformed

    private void comboGenreListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGenreListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboGenreListActionPerformed

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

    private void newFilmnamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFilmnamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newFilmnamnActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        String taBort = this.oldFilmnamn.getText();
        try {
            project2filmproject.FilmFörstörd.Delete(taBort);
            JOptionPane.showMessageDialog(null, "Tog bort " + taBort);
            this.setVisible(false);
        } catch (Exception e) {
            this.listMessage.setText("Bortagning misslyckades");
            System.out.println("Misslyckades ta bort " + taBort + " " + e);
        }

    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(adminRedigera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminRedigera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminRedigera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminRedigera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminRedigera().setVisible(true);
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
    private javax.swing.JToggleButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listGenreList;
    private javax.swing.JLabel listMessage;
    private javax.swing.JButton logOut;
    private javax.swing.JTextField minuter;
    private javax.swing.JTextField newFilmnamn;
    private javax.swing.JLabel oldFilmnamn;
    private javax.swing.JTextField regissör;
    private javax.swing.JTextField releasedatum;
    private javax.swing.JTextField tFGenre;
    private javax.swing.JTextField timmar;
    // End of variables declaration//GEN-END:variables
}
