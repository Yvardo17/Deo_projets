/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERFACE;

import BD.Connexion;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author KATALA
 */
public class CONFIGURATIONBD extends javax.swing.JPanel {

    /**
     * Creates new form CONFIGURATIONBD
     */
    MENUS m = new MENUS();

    public CONFIGURATIONBD() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        adresseIp = new javax.swing.JTextField();
        numPort = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Bdname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Users = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        kButton3 = new keeptoo.KButton();
        kButton4 = new keeptoo.KButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 100)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 26, 83));
        jLabel3.setText("STATDEO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 26, 83));
        jLabel4.setText("D I R E C T I O N   D E S   E  T  U  D  E  S    E T    O  R  G  A  N  I  S  A  T  I  O  N");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 26, 83));
        jLabel1.setText("Connexion à la base de données");

        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("By Kky Dev");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 26, 83), 1, true));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 26, 83));
        jLabel5.setText("Adresse IP");

        adresseIp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        adresseIp.setForeground(new java.awt.Color(0, 26, 83));
        adresseIp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 26, 83)));
        adresseIp.setSelectionColor(new java.awt.Color(0, 176, 80));
        adresseIp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adresseIpMouseClicked(evt);
            }
        });

        numPort.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        numPort.setForeground(new java.awt.Color(0, 26, 83));
        numPort.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 26, 83)));
        numPort.setSelectionColor(new java.awt.Color(0, 176, 80));
        numPort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numPortMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 26, 83));
        jLabel6.setText("N° de Port");

        Bdname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Bdname.setForeground(new java.awt.Color(0, 26, 83));
        Bdname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 26, 83)));
        Bdname.setSelectionColor(new java.awt.Color(0, 176, 80));
        Bdname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BdnameMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 26, 83));
        jLabel7.setText("BD name");

        Password.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(0, 26, 83));
        Password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 26, 83)));
        Password.setSelectionColor(new java.awt.Color(0, 176, 80));
        Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 26, 83));
        jLabel8.setText("Password");

        Users.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Users.setForeground(new java.awt.Color(0, 26, 83));
        Users.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 26, 83)));
        Users.setSelectionColor(new java.awt.Color(0, 176, 80));
        Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 26, 83));
        jLabel9.setText("Users");

        kButton3.setText("Retour");
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

        kButton4.setText("Test");
        kButton4.setBorderPainted(false);
        kButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kButton4.setkAllowGradient(false);
        kButton4.setkAllowTab(false);
        kButton4.setkBackGroundColor(new java.awt.Color(0, 204, 102));
        kButton4.setkBorderRadius(15);
        kButton4.setkHoverColor(new java.awt.Color(102, 102, 102));
        kButton4.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton4.setkPressedColor(new java.awt.Color(0, 176, 80));
        kButton4.setkSelectedColor(new java.awt.Color(0, 176, 80));
        kButton4.setOpaque(false);
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(adresseIp)
                            .addComponent(numPort, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Bdname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(Users)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adresseIp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(5, 5, 5)
                        .addComponent(numPort, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Users, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(5, 5, 5)
                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bdname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(572, 572, 572))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(275, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void adresseIpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adresseIpMouseClicked
        // TODO add your handling code here:
        adresseIp.setText("");
    }//GEN-LAST:event_adresseIpMouseClicked

    private void numPortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numPortMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_numPortMouseClicked

    private void BdnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BdnameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BdnameMouseClicked

    private void PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordMouseClicked

    private void UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UsersMouseClicked

    private void kButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton3ActionPerformed
        // TODO add your handling code here:
        int res = JOptionPane.showConfirmDialog(this, "Êtes-vous sûr que le problème est résolu?", "Question", JOptionPane.YES_NO_OPTION);
        if (res == 0) {
            new AUTHENT().setVisible(true);
            m.fermer();
        }
    }//GEN-LAST:event_kButton3ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        // TODO add your handling code here:
        Tester_Connexion();
    }//GEN-LAST:event_kButton4ActionPerformed

    private void Tester_Connexion() throws HeadlessException {

        String ip = adresseIp.getText();
        String port = numPort.getText();
        String user = Users.getText();
        String pwd = Password.getText();
        String db = Bdname.getText();
        String mess = Connexion.remplir(ip, port, db, user, pwd);

        JOptionPane.showMessageDialog(this, mess);
        if (mess.equalsIgnoreCase("Connexion effectuée!!")) {

            JOptionPane.showMessageDialog(this, "Le Problème est reglé !", "Information", 1);

        } else if (mess.equalsIgnoreCase("Communications link failure  The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.")) {

            JOptionPane.showMessageDialog(this, "l'adresse IP n'est pas correcte", "Erreur", 1);

        } else if (mess.equalsIgnoreCase("Communications link failure  The last packet sent successfully to the server was 0 milliseconds ago. The driver has not received any packets from the server.")) {

            JOptionPane.showMessageDialog(this, "l'adresse IP ou le numéro de port n'est pas correct", "Erreur", 1);

        } else if (mess.contains("Cannot load connection class because of underlying exception: 'java.lang.NumberFormatException: For input string:")) {

            JOptionPane.showMessageDialog(this, "le numéro de port n'est pas correct", "Erreur", 1);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Bdname;
    public javax.swing.JTextField Password;
    public javax.swing.JTextField Users;
    public javax.swing.JTextField adresseIp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public keeptoo.KButton kButton3;
    public keeptoo.KButton kButton4;
    public javax.swing.JTextField numPort;
    // End of variables declaration//GEN-END:variables
}