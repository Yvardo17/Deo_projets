/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASSESE;

import BD.Connexion;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KATALA
 */
public class Analystes {

    String Matricule;
    String nom;
    String postnom;
    String prenom;
    String telephone;
    String grade;
    String passwords;

    public String getMatricule() {
        return Matricule;
    }

    public void setMatricule(String Matricule) {
        this.Matricule = Matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPostnom() {
        return postnom;
    }

    public void setPostnom(String postnom) {
        this.postnom = postnom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    Connexion co = new Connexion();

    public void ajouter() {
        try {
            String req;
            req = "INSERT INTO `analystes` (`Matricule`, `nom`, `postnom`, `prenom`, `telephone`, `grade`, `passwords`) VALUES ('" + getMatricule() + "', '" + getNom() + "', '" + getPostnom() + "', '" + getPrenom() + "', '" + getTelephone() + "', '" + getGrade() + "', '" + getPasswords()+ "')";
            co.Execution_requete(req);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur dans la classe insertion" + e.getMessage());
        }
    }

    public void modifier() {
        try {
            String req;
            req = "UPDATE `analystes` SET `nom` = '" + getNom() + "', `postnom` = '" + getPostnom() + "', `prenom` = '" + getPrenom() + "', `telephone` = '" + getTelephone() + "', `grade` = '" + getGrade() + "' WHERE `analystes`.`Matricule` = '" + getMatricule() + "';";
            co.Execution_requete(req);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur dans la modification" + e.getMessage());
        }
    }
    
     public void modifierCompte() {
        try {
            String req;
            req="UPDATE `analystes` SET `passwords` = '" + getPasswords()+ "' WHERE `analystes`.`Matricule` = '" + getMatricule() + "';";
            co.Execution_requete(req);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur dans la modification" + e.getMessage());
        }
    }

    public void supprimer() {
        try {
            String req;
            req = "Delete from analystes where Matricule='" + getMatricule() + "'";
            co.Execution_requete(req);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur dans la classe suppression" + e.getMessage());
        }
    }

    public void remplir(JTable jt, String req) {
        try {
            int c = 0;
            co.selection(req);
            while (co.resultat.next()) {
                c++;
            }
            Object donnee[][] = new Object[c][6];
            c = 0;
            co.selection(req);
            while (co.resultat.next()) {
                donnee[c][0] = co.resultat.getString(1);
                donnee[c][1] = co.resultat.getString(2);
                donnee[c][2] = co.resultat.getString(3);
                donnee[c][3] = co.resultat.getString(4);
                donnee[c][4] = co.resultat.getString(5);
                donnee[c][5] = co.resultat.getString(6);
                c++;
            }
            String titre[] = {"Matricule", "Nom", "Postnom", "Prenom", "Telephone", "Grade"};
            jt.setModel(new DefaultTableModel(donnee, titre));

            jt.getColumnModel().getColumn(0).setPreferredWidth(300);
            jt.getColumnModel().getColumn(1).setPreferredWidth(350);
            jt.getColumnModel().getColumn(2).setPreferredWidth(350);
            jt.getColumnModel().getColumn(3).setPreferredWidth(350);
            jt.getColumnModel().getColumn(4).setPreferredWidth(350);
            jt.getColumnModel().getColumn(5).setPreferredWidth(350);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur dans la classe remplisage" + e.getMessage());
        }
    }

    public void charger(JComboBox cbo) {
        try {
            String req = "SELECT Matricule FROM analystes ORDER BY Matricule DESC";
            cbo.setModel(new DefaultComboBoxModel(new String[]{""}));
            co.selection(req);
            while (co.resultat.next()) {
                cbo.addItem(co.resultat.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Il ya une erreur dans le chargement" + e.getMessage());
        }
    }

}
