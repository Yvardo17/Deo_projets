/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASSESE;

import BD.Connexion;
import INTERFACE.MENUS;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KATALA
 */
public class Centre_Gestions {

    String Code_centre;
    String nom;
    String libelle;
    String Matricule;

    public String getCode_centre() {
        return Code_centre;
    }

    public void setCode_centre(String Code_centre) {
        this.Code_centre = Code_centre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMatricule() {
        return Matricule;
    }

    public void setMatricule(String Matricule) {
        this.Matricule = Matricule;
    }
    Connexion co = new Connexion();

    public void ajouter() {
        try {
            String req;
            req = "INSERT INTO `centre_gestion` (`Code_centre`, `nom`, `libelle`, `Matricule`) VALUES ('" + getCode_centre() + "', '" + getNom() + "', '" + getLibelle() + "', '" + getMatricule() + "')";
            co.Execution_requete(req);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur dans la classe insertion" + e.getMessage());
        }
    }

    public void modifier() {
        try {
            String req;
            req = "UPDATE `centre_gestion` SET `nom` = '" + getNom() + "', `libelle` = '" + getLibelle() + "', `Matricule` = '" + getMatricule() + "' WHERE `centre_gestion`.`Code_centre` = '" + getCode_centre() + "';";
            co.Execution_requete(req);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur dans la modification" + e.getMessage());
        }
    }

    public void supprimer() {
        try {
            String req;
            req = "Delete from centre_gestion where code_centre='" + getCode_centre() + "'";
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
            Object donnee[][] = new Object[c][4];
            c = 0;
            co.selection(req);
            while (co.resultat.next()) {
                donnee[c][0] = co.resultat.getString(1);
                donnee[c][1] = co.resultat.getString(2);
                donnee[c][2] = co.resultat.getString(3);
                donnee[c][3] = co.resultat.getString(4);
                c++;
            }
            String titre[] = {"Code_centre", "nom", "libelle", "Matricule"};
            jt.setModel(new DefaultTableModel(donnee, titre));

            jt.getColumnModel().getColumn(0).setPreferredWidth(200);
            jt.getColumnModel().getColumn(1).setPreferredWidth(450);
            jt.getColumnModel().getColumn(2).setPreferredWidth(350);
            jt.getColumnModel().getColumn(3).setPreferredWidth(200);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur dans la classe remplisage" + e.getMessage());
        }
    }

    public void remplissage(JTable jt, String req) {
        try {
            int c = 0;
            co.selection(req);
            while (co.resultat.next()) {
                c++;
            }
            Object donnee[][] = new Object[c][1];
            c = 0;
            co.selection(req);
            while (co.resultat.next()) {
                donnee[c][0] = co.resultat.getString(1);
                c++;
            }
            String titre[] = {"CENTRE DE GESTION"};
            jt.setModel(new DefaultTableModel(donnee, titre));

            jt.getColumnModel().getColumn(0).setPreferredWidth(200);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur dans la classe remplisage" + e.getMessage());
        }
    }

    public void charger(JComboBox cbo) {
        MENUS M = new MENUS();
        try {
            if (MENUS.grades.equals("analyste")) {
                String req = "SELECT code_centre FROM centre_gestion where matricule='" + MENUS.vrai + "'";
                cbo.setModel(new DefaultComboBoxModel(new String[]{""}));
                co.selection(req);
                while (co.resultat.next()) {
                    cbo.addItem(co.resultat.getString(1));
                }
            } else {
                String req = "SELECT code_centre FROM centre_gestion";
                cbo.setModel(new DefaultComboBoxModel(new String[]{""}));
                co.selection(req);
                while (co.resultat.next()) {
                    cbo.addItem(co.resultat.getString(1));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Il ya une erreur dans le chargement" + e.getMessage());
        }
    }

}
