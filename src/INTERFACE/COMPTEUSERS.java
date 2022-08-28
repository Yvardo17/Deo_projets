/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFACE;

import CLASSESE.Analystes;
import BD.Connexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author KATALA
 */
public class COMPTEUSERS extends javax.swing.JFrame {

    /**
     * Creates new form COMPTEUSERS
     */
    Connexion co = new Connexion();
    MENUS m = new MENUS();
    Analystes a = new Analystes();

    public COMPTEUSERS() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        nom.setText(AUTHENT.nomUsers);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        anciens = new javax.swing.JPasswordField();
        nouveau = new javax.swing.JPasswordField();
        confirm = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kButton3 = new keeptoo.KButton();
        jLabel10 = new javax.swing.JLabel();
        jCheckBox = new javax.swing.JCheckBox();
        jCheckNouveau = new javax.swing.JCheckBox();
        jCheckConfirme = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 26, 83));
        jLabel3.setText("STATDEO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 26, 83));
        jLabel4.setText("D I R E C T I O N   D E S   E  T  U  D  E  S    E T    O  R  G  A  N  I  S  A  T  I  O  N");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 26, 83));
        jLabel1.setText("Modification du Password");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8_user_100px.png"))); // NOI18N
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 26, 83), 1, true));

        anciens.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        anciens.setForeground(new java.awt.Color(0, 26, 83));
        anciens.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 26, 83)));
        anciens.setSelectionColor(new java.awt.Color(0, 176, 80));
        anciens.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                anciensCaretUpdate(evt);
            }
        });
        anciens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anciensMouseClicked(evt);
            }
        });

        nouveau.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nouveau.setForeground(new java.awt.Color(0, 26, 83));
        nouveau.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 26, 83)));
        nouveau.setSelectionColor(new java.awt.Color(0, 176, 80));
        nouveau.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                nouveauCaretUpdate(evt);
            }
        });
        nouveau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nouveauMouseClicked(evt);
            }
        });

        confirm.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        confirm.setForeground(new java.awt.Color(0, 26, 83));
        confirm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 26, 83)));
        confirm.setSelectionColor(new java.awt.Color(0, 176, 80));
        confirm.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                confirmCaretUpdate(evt);
            }
        });
        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 26, 83));
        jLabel5.setText("Actuel Password");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 26, 83));
        jLabel6.setText("Nouveau Password");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 26, 83));
        jLabel7.setText("Confirmer Password");

        kButton3.setText("Valider");
        kButton3.setBorderPainted(false);
        kButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kButton3.setkAllowGradient(false);
        kButton3.setkAllowTab(false);
        kButton3.setkBackGroundColor(new java.awt.Color(0, 204, 102));
        kButton3.setkBorderRadius(15);
        kButton3.setkHoverColor(new java.awt.Color(102, 102, 102));
        kButton3.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton3.setkPressedColor(new java.awt.Color(0, 176, 80));
        kButton3.setkSelectedColor(new java.awt.Color(0, 176, 80));
        kButton3.setOpaque(false);
        kButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton3ActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("By Kky Dev");

        jCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8_visible_24BLEU.png"))); // NOI18N
        jCheckBox.setOpaque(false);
        jCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxMouseClicked(evt);
            }
        });

        jCheckNouveau.setBackground(new java.awt.Color(255, 255, 255));
        jCheckNouveau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8_visible_24BLEU.png"))); // NOI18N
        jCheckNouveau.setOpaque(false);
        jCheckNouveau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckNouveauMouseClicked(evt);
            }
        });

        jCheckConfirme.setBackground(new java.awt.Color(255, 255, 255));
        jCheckConfirme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8_visible_24BLEU.png"))); // NOI18N
        jCheckConfirme.setOpaque(false);
        jCheckConfirme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckConfirmeMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Compte ");

        nom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nom.setForeground(new java.awt.Color(255, 0, 0));
        nom.setText("nom");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anciens, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nouveau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckNouveau, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckConfirme, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nom))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(anciens, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBox))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nouveau, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addComponent(jCheckNouveau))
                            .addGap(15, 15, 15)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckConfirme)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel5)))
                .addGap(35, 35, 35)
                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel10))
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

    private void anciensCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_anciensCaretUpdate
        // TODO add your handling code here:
        //m=matricule.getText();
    }//GEN-LAST:event_anciensCaretUpdate

    private void anciensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anciensMouseClicked
        // TODO add your handling code here:
        anciens.setText("");
    }//GEN-LAST:event_anciensMouseClicked

    private void nouveauCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_nouveauCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_nouveauCaretUpdate

    private void nouveauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nouveauMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nouveauMouseClicked

    private void confirmCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_confirmCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmCaretUpdate

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmMouseClicked

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        // TODO add your handling code here:
        compte();
    }//GEN-LAST:event_kButton3ActionPerformed

    private void jCheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxMouseClicked
        // TODO add your handling code here:
        if (jCheckBox.isSelected()) {
            anciens.setEchoChar((char) 0);
            jCheckBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8_visible_24BLEU.png")));
        } else {
            anciens.setEchoChar((char) 8226);
            jCheckBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8_hide_24BLEU.png")));
        }
    }//GEN-LAST:event_jCheckBoxMouseClicked

    private void jCheckNouveauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckNouveauMouseClicked
        // TODO add your handling code here:
        if (jCheckNouveau.isSelected()) {
            nouveau.setEchoChar((char) 0);
            jCheckNouveau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8_visible_24BLEU.png")));
        } else {
            nouveau.setEchoChar((char) 8226);
            jCheckNouveau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8_hide_24BLEU.png")));
        }
    }//GEN-LAST:event_jCheckNouveauMouseClicked

    private void jCheckConfirmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckConfirmeMouseClicked
        // TODO add your handling code here:
        if (jCheckConfirme.isSelected()) {
            confirm.setEchoChar((char) 0);
            jCheckConfirme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8_visible_24BLEU.png")));
        } else {
            confirm.setEchoChar((char) 8226);
            jCheckConfirme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8_hide_24BLEU.png")));
        }
    }//GEN-LAST:event_jCheckConfirmeMouseClicked

    public void compte() {
        String ancien = anciens.getText();
        String nouveaus = nouveau.getText();
        String confirme = confirm.getText();

        Boolean res = ancien.isEmpty() && nouveaus.isEmpty() && confirme.isEmpty();
        if (res) {
            JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs ", "Information incomplète", 1);
            return;
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(Connexion.url, Connexion.user, Connexion.pwd);

            String sql = "Select * from analystes where Matricule=? and passwords=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, MENUS.name);
            pst.setString(2, anciens.getText());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                if (nouveaus.equals(confirme)) {
                    a.setMatricule(MENUS.name);
                    a.setPasswords(confirm.getText());
                    a.modifierCompte();
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Desolé le nouveau mot de passe n'est pas identique ", "Information differente", 1);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Desolé l'utilisateur n'est pas reconnu dans le système", "Utilisateur inconnus", 1);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

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
            java.util.logging.Logger.getLogger(COMPTEUSERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(COMPTEUSERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(COMPTEUSERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(COMPTEUSERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new COMPTEUSERS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPasswordField anciens;
    public javax.swing.JPasswordField confirm;
    private javax.swing.JCheckBox jCheckBox;
    private javax.swing.JCheckBox jCheckConfirme;
    private javax.swing.JCheckBox jCheckNouveau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public keeptoo.KButton kButton3;
    private javax.swing.JLabel nom;
    public javax.swing.JPasswordField nouveau;
    // End of variables declaration//GEN-END:variables
}