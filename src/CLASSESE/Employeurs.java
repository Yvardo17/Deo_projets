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
public class Employeurs {

    int Id_employeur;
    double Employeurs_au_fichier,
            Publics_assimiles1,
            Moins_20_salaries1,
            Plus_20_salaries1,
            Prives1,
            Moins_20_salaries2,
            Plus_20_salaries2,
            Gens_de_maison1,
            Moins_20_salaries3,
            Plus_20_salaries3,
            Nouvelles_affiliations1,
            Publics_assimiles2,
            Moins_20_salaries4,
            Plus_20_salaries4,
            Prives2,
            Moins_20_salaries5,
            Plus_20_salaries5,
            Gens_de_maison2,
            Moins_20_salaries6,
            Plus_20_salaries6,
            Employeurs_en_activite,
            Publics_assimiles3,
            Moins_20_salaries7,
            Plus_20_salaries7,
            Prives3,
            Moins_20_salaries8,
            Plus_20_salaries8,
            Gens_de_maison3,
            Moins_20_salaries9,
            Plus_20_salaries9,
            Employeurs_ayant_declare,
            Publics_assimiles4,
            Moins_20_salaries10,
            Plus_20_salaries10,
            Prives4,
            Moins_20_salaries11,
            Plus_20_salaries11,
            Gens_de_maison4,
            Moins_20_salaries12,
            Plus_20_salaries12,
            Employeurs_ayant_cotise,
            Publics_assimiles5,
            Moins_20_salaries13,
            Plus_20_salaries13,
            Prives5,
            Moins_20_salaries14,
            Plus_20_salaries14,
            Gens_de_maison5,
            Moins_20_salaries15,
            Plus_20_salaries15,
            Employeurs_en_cessation,
            Publics_assimiles6,
            Moins_20_salaries16,
            Plus_20_salaries16,
            Prives6,
            Moins_20_salaries17,
            Plus_20_salaries17,
            Gens_de_maison6,
            Moins_20_salaries18,
            Plus_20_salaries18;
    String mois;
    int annee;
    String Code_centre;
    String Matricule;

    public int getId_employeur() {
        return Id_employeur;
    }

    public void setId_employeur(int Id_employeur) {
        this.Id_employeur = Id_employeur;
    }

    public double getEmployeurs_au_fichier() {
        return Employeurs_au_fichier;
    }

    public void setEmployeurs_au_fichier(double Employeurs_au_fichier) {
        this.Employeurs_au_fichier = Employeurs_au_fichier;
    }

    public double getPublics_assimiles1() {
        return Publics_assimiles1;
    }

    public void setPublics_assimiles1(double Publics_assimiles1) {
        this.Publics_assimiles1 = Publics_assimiles1;
    }

    public double getMoins_20_salaries1() {
        return Moins_20_salaries1;
    }

    public void setMoins_20_salaries1(double Moins_20_salaries1) {
        this.Moins_20_salaries1 = Moins_20_salaries1;
    }

    public double getPlus_20_salaries1() {
        return Plus_20_salaries1;
    }

    public void setPlus_20_salaries1(double Plus_20_salaries1) {
        this.Plus_20_salaries1 = Plus_20_salaries1;
    }

    public double getPrives1() {
        return Prives1;
    }

    public void setPrives1(double Prives1) {
        this.Prives1 = Prives1;
    }

    public double getMoins_20_salaries2() {
        return Moins_20_salaries2;
    }

    public void setMoins_20_salaries2(double Moins_20_salaries2) {
        this.Moins_20_salaries2 = Moins_20_salaries2;
    }

    public double getPlus_20_salaries2() {
        return Plus_20_salaries2;
    }

    public void setPlus_20_salaries2(double Plus_20_salaries2) {
        this.Plus_20_salaries2 = Plus_20_salaries2;
    }

    public double getGens_de_maison1() {
        return Gens_de_maison1;
    }

    public void setGens_de_maison1(double Gens_de_maison1) {
        this.Gens_de_maison1 = Gens_de_maison1;
    }

    public double getMoins_20_salaries3() {
        return Moins_20_salaries3;
    }

    public void setMoins_20_salaries3(double Moins_20_salaries3) {
        this.Moins_20_salaries3 = Moins_20_salaries3;
    }

    public double getPlus_20_salaries3() {
        return Plus_20_salaries3;
    }

    public void setPlus_20_salaries3(double Plus_20_salaries3) {
        this.Plus_20_salaries3 = Plus_20_salaries3;
    }

    public double getNouvelles_affiliations1() {
        return Nouvelles_affiliations1;
    }

    public void setNouvelles_affiliations1(double Nouvelles_affiliations1) {
        this.Nouvelles_affiliations1 = Nouvelles_affiliations1;
    }

    public double getPublics_assimiles2() {
        return Publics_assimiles2;
    }

    public void setPublics_assimiles2(double Publics_assimiles2) {
        this.Publics_assimiles2 = Publics_assimiles2;
    }

    public double getMoins_20_salaries4() {
        return Moins_20_salaries4;
    }

    public void setMoins_20_salaries4(double Moins_20_salaries4) {
        this.Moins_20_salaries4 = Moins_20_salaries4;
    }

    public double getPlus_20_salaries4() {
        return Plus_20_salaries4;
    }

    public void setPlus_20_salaries4(double Plus_20_salaries4) {
        this.Plus_20_salaries4 = Plus_20_salaries4;
    }

    public double getPrives2() {
        return Prives2;
    }

    public void setPrives2(double Prives2) {
        this.Prives2 = Prives2;
    }

    public double getMoins_20_salaries5() {
        return Moins_20_salaries5;
    }

    public void setMoins_20_salaries5(double Moins_20_salaries5) {
        this.Moins_20_salaries5 = Moins_20_salaries5;
    }

    public double getPlus_20_salaries5() {
        return Plus_20_salaries5;
    }

    public void setPlus_20_salaries5(double Plus_20_salaries5) {
        this.Plus_20_salaries5 = Plus_20_salaries5;
    }

    public double getGens_de_maison2() {
        return Gens_de_maison2;
    }

    public void setGens_de_maison2(double Gens_de_maison2) {
        this.Gens_de_maison2 = Gens_de_maison2;
    }

    public double getMoins_20_salaries6() {
        return Moins_20_salaries6;
    }

    public void setMoins_20_salaries6(double Moins_20_salaries6) {
        this.Moins_20_salaries6 = Moins_20_salaries6;
    }

    public double getPlus_20_salaries6() {
        return Plus_20_salaries6;
    }

    public void setPlus_20_salaries6(double Plus_20_salaries6) {
        this.Plus_20_salaries6 = Plus_20_salaries6;
    }

    public double getEmployeurs_en_activite() {
        return Employeurs_en_activite;
    }

    public void setEmployeurs_en_activite(double Employeurs_en_activite) {
        this.Employeurs_en_activite = Employeurs_en_activite;
    }

    public double getPublics_assimiles3() {
        return Publics_assimiles3;
    }

    public void setPublics_assimiles3(double Publics_assimiles3) {
        this.Publics_assimiles3 = Publics_assimiles3;
    }

    public double getMoins_20_salaries7() {
        return Moins_20_salaries7;
    }

    public void setMoins_20_salaries7(double Moins_20_salaries7) {
        this.Moins_20_salaries7 = Moins_20_salaries7;
    }

    public double getPlus_20_salaries7() {
        return Plus_20_salaries7;
    }

    public void setPlus_20_salaries7(double Plus_20_salaries7) {
        this.Plus_20_salaries7 = Plus_20_salaries7;
    }

    public double getPrives3() {
        return Prives3;
    }

    public void setPrives3(double Prives3) {
        this.Prives3 = Prives3;
    }

    public double getMoins_20_salaries8() {
        return Moins_20_salaries8;
    }

    public void setMoins_20_salaries8(double Moins_20_salaries8) {
        this.Moins_20_salaries8 = Moins_20_salaries8;
    }

    public double getPlus_20_salaries8() {
        return Plus_20_salaries8;
    }

    public void setPlus_20_salaries8(double Plus_20_salaries8) {
        this.Plus_20_salaries8 = Plus_20_salaries8;
    }

    public double getGens_de_maison3() {
        return Gens_de_maison3;
    }

    public void setGens_de_maison3(double Gens_de_maison3) {
        this.Gens_de_maison3 = Gens_de_maison3;
    }

    public double getMoins_20_salaries9() {
        return Moins_20_salaries9;
    }

    public void setMoins_20_salaries9(double Moins_20_salaries9) {
        this.Moins_20_salaries9 = Moins_20_salaries9;
    }

    public double getPlus_20_salaries9() {
        return Plus_20_salaries9;
    }

    public void setPlus_20_salaries9(double Plus_20_salaries9) {
        this.Plus_20_salaries9 = Plus_20_salaries9;
    }

    public double getEmployeurs_ayant_declare() {
        return Employeurs_ayant_declare;
    }

    public void setEmployeurs_ayant_declare(double Employeurs_ayant_declare) {
        this.Employeurs_ayant_declare = Employeurs_ayant_declare;
    }

    public double getPublics_assimiles4() {
        return Publics_assimiles4;
    }

    public void setPublics_assimiles4(double Publics_assimiles4) {
        this.Publics_assimiles4 = Publics_assimiles4;
    }

    public double getMoins_20_salaries10() {
        return Moins_20_salaries10;
    }

    public void setMoins_20_salaries10(double Moins_20_salaries10) {
        this.Moins_20_salaries10 = Moins_20_salaries10;
    }

    public double getPlus_20_salaries10() {
        return Plus_20_salaries10;
    }

    public void setPlus_20_salaries10(double Plus_20_salaries10) {
        this.Plus_20_salaries10 = Plus_20_salaries10;
    }

    public double getPrives4() {
        return Prives4;
    }

    public void setPrives4(double Prives4) {
        this.Prives4 = Prives4;
    }

    public double getMoins_20_salaries11() {
        return Moins_20_salaries11;
    }

    public void setMoins_20_salaries11(double Moins_20_salaries11) {
        this.Moins_20_salaries11 = Moins_20_salaries11;
    }

    public double getPlus_20_salaries11() {
        return Plus_20_salaries11;
    }

    public void setPlus_20_salaries11(double Plus_20_salaries11) {
        this.Plus_20_salaries11 = Plus_20_salaries11;
    }

    public double getGens_de_maison4() {
        return Gens_de_maison4;
    }

    public void setGens_de_maison4(double Gens_de_maison4) {
        this.Gens_de_maison4 = Gens_de_maison4;
    }

    public double getMoins_20_salaries12() {
        return Moins_20_salaries12;
    }

    public void setMoins_20_salaries12(double Moins_20_salaries12) {
        this.Moins_20_salaries12 = Moins_20_salaries12;
    }

    public double getPlus_20_salaries12() {
        return Plus_20_salaries12;
    }

    public void setPlus_20_salaries12(double Plus_20_salaries12) {
        this.Plus_20_salaries12 = Plus_20_salaries12;
    }

    public double getEmployeurs_ayant_cotise() {
        return Employeurs_ayant_cotise;
    }

    public void setEmployeurs_ayant_cotise(double Employeurs_ayant_cotise) {
        this.Employeurs_ayant_cotise = Employeurs_ayant_cotise;
    }

    public double getPublics_assimiles5() {
        return Publics_assimiles5;
    }

    public void setPublics_assimiles5(double Publics_assimiles5) {
        this.Publics_assimiles5 = Publics_assimiles5;
    }

    public double getMoins_20_salaries13() {
        return Moins_20_salaries13;
    }

    public void setMoins_20_salaries13(double Moins_20_salaries13) {
        this.Moins_20_salaries13 = Moins_20_salaries13;
    }

    public double getPlus_20_salaries13() {
        return Plus_20_salaries13;
    }

    public void setPlus_20_salaries13(double Plus_20_salaries13) {
        this.Plus_20_salaries13 = Plus_20_salaries13;
    }

    public double getPrives5() {
        return Prives5;
    }

    public void setPrives5(double Prives5) {
        this.Prives5 = Prives5;
    }

    public double getMoins_20_salaries14() {
        return Moins_20_salaries14;
    }

    public void setMoins_20_salaries14(double Moins_20_salaries14) {
        this.Moins_20_salaries14 = Moins_20_salaries14;
    }

    public double getPlus_20_salaries14() {
        return Plus_20_salaries14;
    }

    public void setPlus_20_salaries14(double Plus_20_salaries14) {
        this.Plus_20_salaries14 = Plus_20_salaries14;
    }

    public double getGens_de_maison5() {
        return Gens_de_maison5;
    }

    public void setGens_de_maison5(double Gens_de_maison5) {
        this.Gens_de_maison5 = Gens_de_maison5;
    }

    public double getMoins_20_salaries15() {
        return Moins_20_salaries15;
    }

    public void setMoins_20_salaries15(double Moins_20_salaries15) {
        this.Moins_20_salaries15 = Moins_20_salaries15;
    }

    public double getPlus_20_salaries15() {
        return Plus_20_salaries15;
    }

    public void setPlus_20_salaries15(double Plus_20_salaries15) {
        this.Plus_20_salaries15 = Plus_20_salaries15;
    }

    public double getEmployeurs_en_cessation() {
        return Employeurs_en_cessation;
    }

    public void setEmployeurs_en_cessation(double Employeurs_en_cessation) {
        this.Employeurs_en_cessation = Employeurs_en_cessation;
    }

    public double getPublics_assimiles6() {
        return Publics_assimiles6;
    }

    public void setPublics_assimiles6(double Publics_assimiles6) {
        this.Publics_assimiles6 = Publics_assimiles6;
    }

    public double getMoins_20_salaries16() {
        return Moins_20_salaries16;
    }

    public void setMoins_20_salaries16(double Moins_20_salaries16) {
        this.Moins_20_salaries16 = Moins_20_salaries16;
    }

    public double getPlus_20_salaries16() {
        return Plus_20_salaries16;
    }

    public void setPlus_20_salaries16(double Plus_20_salaries16) {
        this.Plus_20_salaries16 = Plus_20_salaries16;
    }

    public double getPrives6() {
        return Prives6;
    }

    public void setPrives6(double Prives6) {
        this.Prives6 = Prives6;
    }

    public double getMoins_20_salaries17() {
        return Moins_20_salaries17;
    }

    public void setMoins_20_salaries17(double Moins_20_salaries17) {
        this.Moins_20_salaries17 = Moins_20_salaries17;
    }

    public double getPlus_20_salaries17() {
        return Plus_20_salaries17;
    }

    public void setPlus_20_salaries17(double Plus_20_salaries17) {
        this.Plus_20_salaries17 = Plus_20_salaries17;
    }

    public double getGens_de_maison6() {
        return Gens_de_maison6;
    }

    public void setGens_de_maison6(double Gens_de_maison6) {
        this.Gens_de_maison6 = Gens_de_maison6;
    }

    public double getMoins_20_salaries18() {
        return Moins_20_salaries18;
    }

    public void setMoins_20_salaries18(double Moins_20_salaries18) {
        this.Moins_20_salaries18 = Moins_20_salaries18;
    }

    public double getPlus_20_salaries18() {
        return Plus_20_salaries18;
    }

    public void setPlus_20_salaries18(double Plus_20_salaries18) {
        this.Plus_20_salaries18 = Plus_20_salaries18;
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getCode_centre() {
        return Code_centre;
    }

    public void setCode_centre(String Code_centre) {
        this.Code_centre = Code_centre;
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
            req = "INSERT INTO `employeurs` (`Id_employeur`, `Employeurs_au_fichier`, `Publics_assimiles1`, `Moins_20_salaries1`, `Plus_20_salaries1`, `Prives1`, `Moins_20_salaries2`, `Plus_20_salaries2`, `Gens_de_maison1`, `Moins_20_salaries3`, `Plus_20_salaries3`, `Nouvelles_affiliations1`, `Publics_assimiles2`, `Moins_20_salaries4`, `Plus_20_salaries4`, `Prives2`, `Moins_20_salaries5`, `Plus_20_salaries5`, `Gens_de_maison2`, `Moins_20_salaries6`, `Plus_20_salaries6`, `Employeurs_en_activite`, `Publics_assimiles3`, `Moins_20_salaries7`, `Plus_20_salaries7`, `Prives3`, `Moins_20_salaries8`, `Plus_20_salaries8`, `Gens_de_maison3`, `Moins_20_salaries9`, `Plus_20_salaries9`, `Employeurs_ayant_declare`, `Publics_assimiles4`, `Moins_20_salaries10`, `Plus_20_salaries10`, `Prives4`, `Moins_20_salaries11`, `Plus_20_salaries11`, `Gens_de_maison4`, `Moins_20_salaries12`, `Plus_20_salaries12`, `Employeurs_ayant_cotise`, `Publics_assimiles5`, `Moins_20_salaries13`, `Plus_20_salaries13`, `Prives5`, `Moins_20_salaries14`, `Plus_20_salaries14`, `Gens_de_maison5`, `Moins_20_salaries15`, `Plus_20_salaries15`, `Employeurs_en_cessation`, `Publics_assimiles6`, `Moins_20_salaries16`, `Plus_20_salaries16`, `Prives6`, `Moins_20_salaries17`, `Plus_20_salaries17`, `Gens_de_maison6`, `Moins_20_salaries18`, `Plus_20_salaries18`, `mois`,`annee`, `Code_centre`, `Matricule`) VALUES ('" + 0 + "', '" + getEmployeurs_au_fichier() + "', '" + getPublics_assimiles1() + "', '" + getMoins_20_salaries1() + "', '" + getPlus_20_salaries1() + "', '" + getPrives1() + "', '" + getMoins_20_salaries2() + "', '" + getPlus_20_salaries2() + "', '" + getGens_de_maison1() + "', '" + getMoins_20_salaries3() + "', '" + getPlus_20_salaries3() + "', '" + getNouvelles_affiliations1() + "', '" + getPublics_assimiles2() + "', '" + getMoins_20_salaries4() + "', '" + getPlus_20_salaries4() + "', '" + getPrives2() + "', '" + getMoins_20_salaries5() + "', '" + getPlus_20_salaries5() + "', '" + getGens_de_maison2() + "', '" + getMoins_20_salaries6() + "', '" + getPlus_20_salaries6() + "', '" + getEmployeurs_en_activite() + "', '" + getPublics_assimiles3() + "', '" + getMoins_20_salaries7() + "', '" + getPlus_20_salaries7() + "', '" + getPrives3() + "', '" + getMoins_20_salaries8() + "', '" + getPlus_20_salaries8() + "', '" + getGens_de_maison3() + "', '" + getMoins_20_salaries9() + "', '" + getPlus_20_salaries9() + "', '" + getEmployeurs_ayant_declare() + "', '" + getPublics_assimiles4() + "', '" + getMoins_20_salaries10() + "', '" + getPlus_20_salaries10() + "', '" + getPrives4() + "', '" + getMoins_20_salaries11() + "', '" + getPlus_20_salaries11() + "', '" + getGens_de_maison4() + "', '" + getMoins_20_salaries12() + "', '" + getPlus_20_salaries12() + "', '" + getEmployeurs_ayant_cotise() + "', '" + getPublics_assimiles5() + "', '" + getMoins_20_salaries13() + "', '" + getPlus_20_salaries13() + "', '" + getPrives5() + "', '" + getMoins_20_salaries14() + "', '" + getPlus_20_salaries14() + "', '" + getGens_de_maison5() + "', '" + getMoins_20_salaries15() + "', '" + getPlus_20_salaries15() + "', '" + getEmployeurs_en_cessation() + "', '" + getPublics_assimiles6() + "', '" + getMoins_20_salaries16() + "', '" + getPlus_20_salaries16() + "', '" + getPrives6() + "', '" + getMoins_20_salaries17() + "', '" + getPlus_20_salaries17() + "', '" + getGens_de_maison6() + "', '" + getMoins_20_salaries18() + "', '" + getPlus_20_salaries18() + "', '" + getMois() + "', '" + getAnnee()+ "', '" + getCode_centre() + "', '" + getMatricule() + "')";
            co.Execution_requete(req);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur dans la classe insertion" + e.getMessage());
        }
    }

    public void modifier() {
        try {
            String req;
            req = "UPDATE `employeurs` SET `Employeurs_au_fichier` = '" + getEmployeurs_au_fichier() + "', `Publics_assimiles1` = '" + getPublics_assimiles1() + "', `Moins_20_salaries1` = '" + getMoins_20_salaries1() + "', `Plus_20_salaries1` = '" + getPlus_20_salaries1() + "', `Prives1` = '" + getPrives1() + "', `Moins_20_salaries2` = '" + getMoins_20_salaries2() + "', `Plus_20_salaries2` = '" + getPlus_20_salaries2() + "', `Gens_de_maison1` = '" + getGens_de_maison1() + "', `Moins_20_salaries3` = '" + getMoins_20_salaries3() + "', `Plus_20_salaries3` = '" + getPlus_20_salaries3() + "', `Nouvelles_affiliations1` = '" + getNouvelles_affiliations1() + "', `Publics_assimiles2` = '" + getPublics_assimiles2() + "', `Moins_20_salaries4` = '" + getMoins_20_salaries4() + "', `Plus_20_salaries4` = '" + getPlus_20_salaries4() + "', `Prives2` = '" + getPrives2() + "', `Moins_20_salaries5` = '" + getMoins_20_salaries5() + "', `Plus_20_salaries5` = '" + getPlus_20_salaries5() + "', `Gens_de_maison2` = '" + getGens_de_maison2() + "', `Moins_20_salaries6` = '" + getMoins_20_salaries6() + "', `Plus_20_salaries6` = '" + getPlus_20_salaries6() + "', `Employeurs_en_activite` = '" + getEmployeurs_en_activite() + "', `Publics_assimiles3` = '" + getPublics_assimiles3() + "', `Moins_20_salaries7` = '" + getMoins_20_salaries7() + "', `Plus_20_salaries7` = '" + getPlus_20_salaries7() + "', `Prives3` = '" + getPrives3() + "', `Moins_20_salaries8` = '" + getMoins_20_salaries8() + "', `Plus_20_salaries8` = '" + getPlus_20_salaries8() + "', `Gens_de_maison3` = '" + getGens_de_maison3() + "', `Moins_20_salaries9` = '" + getMoins_20_salaries9() + "', `Plus_20_salaries9` = '" + getPlus_20_salaries9() + "', `Employeurs_ayant_declare` = '" + getEmployeurs_ayant_declare() + "', `Publics_assimiles4` = '" + getPublics_assimiles4() + "', `Moins_20_salaries10` = '" + getMoins_20_salaries10() + "', `Plus_20_salaries10` = '" + getPlus_20_salaries10() + "', `Prives4` = '" + getPrives4() + "', `Moins_20_salaries11` = '" + getMoins_20_salaries11() + "', `Plus_20_salaries11` = '" + getPlus_20_salaries11() + "', `Gens_de_maison4` = '" + getGens_de_maison4() + "', `Moins_20_salaries12` = '" + getMoins_20_salaries12() + "', `Plus_20_salaries12` = '" + getPlus_20_salaries12() + "', `Employeurs_ayant_cotise` = '" + getEmployeurs_ayant_cotise() + "', `Publics_assimiles5` = '" + getPublics_assimiles5() + "', `Moins_20_salaries13` = '" + getMoins_20_salaries13() + "', `Plus_20_salaries13` = '" + getPlus_20_salaries13() + "', `Prives5` = '" + getPrives5() + "', `Moins_20_salaries14` = '" + getMoins_20_salaries14() + "', `Plus_20_salaries14` = '" + getPlus_20_salaries14() + "', `Gens_de_maison5` = '" + getGens_de_maison5() + "', `Moins_20_salaries15` = '" + getMoins_20_salaries15() + "', `Plus_20_salaries15` = '" + getPlus_20_salaries15() + "', `Employeurs_en_cessation` = '" + getEmployeurs_en_cessation() + "', `Publics_assimiles6` = '" + getPublics_assimiles6() + "', `Moins_20_salaries16` = '" + getMoins_20_salaries16() + "', `Plus_20_salaries16` = '" + getPlus_20_salaries16() + "', `Prives6` = '" + getPrives6() + "', `Moins_20_salaries17` = '" + getMoins_20_salaries17() + "', `Plus_20_salaries17` = '" + getPlus_20_salaries17() + "', `Gens_de_maison6` = '" + getGens_de_maison6() + "', `Moins_20_salaries18` = '" + getMoins_20_salaries18() + "', `Plus_20_salaries18` = '" + getPlus_20_salaries18() + "', `mois` = '" + getMois() + "',`annee` = '" + getAnnee()+ "', `Code_centre` = '" + getCode_centre() + "', `Matricule` = '" + getMatricule() + "' WHERE `employeurs`.`Id_employeur` = " + getId_employeur() + ";";
            co.Execution_requete(req);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur dans la modification" + e.getMessage());
        }
    }

    public void supprimer() {
        try {
            String req;
            req = "Delete from employeurs where id_employeur='" + getId_employeur() + "'";
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
            Object donnee[][] = new Object[c][64];
            c = 0;
            co.selection(req);
            while (co.resultat.next()) {
                donnee[c][0] = co.resultat.getString(1);
                donnee[c][1] = co.resultat.getString(2);
                donnee[c][2] = co.resultat.getString(3);
                donnee[c][3] = co.resultat.getString(4);
                donnee[c][4] = co.resultat.getString(5);
                donnee[c][5] = co.resultat.getString(6);
                donnee[c][6] = co.resultat.getString(7);
                donnee[c][7] = co.resultat.getString(8);
                donnee[c][8] = co.resultat.getString(9);
                donnee[c][9] = co.resultat.getString(10);
                donnee[c][10] = co.resultat.getString(11);
                donnee[c][11] = co.resultat.getString(12);
                donnee[c][12] = co.resultat.getString(13);
                donnee[c][13] = co.resultat.getString(14);
                donnee[c][14] = co.resultat.getString(15);
                donnee[c][15] = co.resultat.getString(16);
                donnee[c][16] = co.resultat.getString(17);
                donnee[c][17] = co.resultat.getString(18);
                donnee[c][18] = co.resultat.getString(19);
                donnee[c][19] = co.resultat.getString(20);
                donnee[c][20] = co.resultat.getString(21);
                donnee[c][21] = co.resultat.getString(22);
                donnee[c][22] = co.resultat.getString(23);
                donnee[c][23] = co.resultat.getString(24);
                donnee[c][24] = co.resultat.getString(25);
                donnee[c][25] = co.resultat.getString(26);
                donnee[c][26] = co.resultat.getString(27);
                donnee[c][27] = co.resultat.getString(28);
                donnee[c][28] = co.resultat.getString(29);
                donnee[c][29] = co.resultat.getString(30);
                donnee[c][30] = co.resultat.getString(31);
                donnee[c][31] = co.resultat.getString(32);
                donnee[c][32] = co.resultat.getString(33);
                donnee[c][33] = co.resultat.getString(34);
                donnee[c][34] = co.resultat.getString(35);
                donnee[c][35] = co.resultat.getString(36);
                donnee[c][36] = co.resultat.getString(37);
                donnee[c][37] = co.resultat.getString(38);
                donnee[c][38] = co.resultat.getString(39);
                donnee[c][39] = co.resultat.getString(40);
                donnee[c][40] = co.resultat.getString(41);
                donnee[c][41] = co.resultat.getString(42);
                donnee[c][42] = co.resultat.getString(43);
                donnee[c][43] = co.resultat.getString(44);
                donnee[c][44] = co.resultat.getString(45);
                donnee[c][45] = co.resultat.getString(46);
                donnee[c][46] = co.resultat.getString(47);
                donnee[c][47] = co.resultat.getString(48);
                donnee[c][48] = co.resultat.getString(49);
                donnee[c][49] = co.resultat.getString(50);
                donnee[c][50] = co.resultat.getString(51);
                donnee[c][51] = co.resultat.getString(52);
                donnee[c][52] = co.resultat.getString(53);
                donnee[c][53] = co.resultat.getString(54);
                donnee[c][54] = co.resultat.getString(55);
                donnee[c][55] = co.resultat.getString(56);
                donnee[c][56] = co.resultat.getString(57);
                donnee[c][57] = co.resultat.getString(58);
                donnee[c][58] = co.resultat.getString(59);
                donnee[c][59] = co.resultat.getString(60);
                donnee[c][60] = co.resultat.getString(61);
                donnee[c][61] = co.resultat.getString(62);
                donnee[c][62] = co.resultat.getString(63);
                donnee[c][63] = co.resultat.getString(64);
                c++;
            }
            String titre[] = {"Id Employeur", "Employeurs au Fichier", "Publics assimiles", "Moin 20 salaries", "Plus 20 salaries", "Prives", "Moins 20 salaries", "Plus 20 salaries", "Gens de maison", "Moins 20 salaries", "Plus 20 salaries", "Nouvelles Affiliations", "Publics Assimiles", "Moins 20 salaries", "Plus 20 salaries", "Prives", "Moins 20 salaries", "Plus 20 salaries", "Gens de maison", "Moins 20 salaries", "Plus 20 salaries", "Employeurs en activite", "Publics Assimiles", "Moins 20 salaries", "Plus 20 salaries", "Prives", "Moins 20 salaries", "Plus 20 salaries", "Gens de maison", "Moins 20 salaries", "Plus 20 salaries", "Employeurs ayant declare", "Publics Assimiles4", "Moins 20 salaries", "Plus 20 salaries", "Prives", "Moins 20 salaries", "Plus 20 salaries", "Gens de maison", "Moins 20 salaries", "Plus 20 salaries", "Employeurs ayant cotise", "Publics Assimiles5", "Moins 20 salaries", "Plus 20 salaries", "Prives", "Moins 20 salaries", "Plus 20 salaries", "Gens de maison", "Moins 20 salaries", "Plus 20 salaries", "Employeurs en cessation", "Publics assimiles", "Moins 20 salaries", "Plus 20 salaries", "Prives", "Moins 20 salaries", "Plus 20 salaries", "Gens de maison", "Moins 20 salaries", "Plus 20 salaries", "Mois","Année", "Code centre"};
            jt.setModel(new DefaultTableModel(donnee, titre));

            jt.getColumnModel().getColumn(0).setPreferredWidth(200);
            jt.getColumnModel().getColumn(1).setPreferredWidth(200);
            jt.getColumnModel().getColumn(2).setPreferredWidth(200);
            jt.getColumnModel().getColumn(3).setPreferredWidth(200);
            jt.getColumnModel().getColumn(4).setPreferredWidth(200);
            jt.getColumnModel().getColumn(5).setPreferredWidth(200);
            jt.getColumnModel().getColumn(6).setPreferredWidth(200);
            jt.getColumnModel().getColumn(7).setPreferredWidth(200);
            jt.getColumnModel().getColumn(8).setPreferredWidth(200);
            jt.getColumnModel().getColumn(9).setPreferredWidth(200);
            jt.getColumnModel().getColumn(10).setPreferredWidth(200);
            jt.getColumnModel().getColumn(11).setPreferredWidth(200);
            jt.getColumnModel().getColumn(12).setPreferredWidth(200);
            jt.getColumnModel().getColumn(13).setPreferredWidth(200);
            jt.getColumnModel().getColumn(14).setPreferredWidth(200);
            jt.getColumnModel().getColumn(15).setPreferredWidth(200);
            jt.getColumnModel().getColumn(16).setPreferredWidth(200);
            jt.getColumnModel().getColumn(17).setPreferredWidth(200);
            jt.getColumnModel().getColumn(18).setPreferredWidth(200);
            jt.getColumnModel().getColumn(19).setPreferredWidth(200);
            jt.getColumnModel().getColumn(20).setPreferredWidth(200);
            jt.getColumnModel().getColumn(21).setPreferredWidth(200);
            jt.getColumnModel().getColumn(22).setPreferredWidth(200);
            jt.getColumnModel().getColumn(23).setPreferredWidth(200);
            jt.getColumnModel().getColumn(24).setPreferredWidth(200);
            jt.getColumnModel().getColumn(25).setPreferredWidth(200);
            jt.getColumnModel().getColumn(26).setPreferredWidth(200);
            jt.getColumnModel().getColumn(27).setPreferredWidth(200);
            jt.getColumnModel().getColumn(28).setPreferredWidth(200);
            jt.getColumnModel().getColumn(29).setPreferredWidth(200);
            jt.getColumnModel().getColumn(30).setPreferredWidth(200);
            jt.getColumnModel().getColumn(31).setPreferredWidth(200);
            jt.getColumnModel().getColumn(32).setPreferredWidth(200);
            jt.getColumnModel().getColumn(33).setPreferredWidth(200);
            jt.getColumnModel().getColumn(34).setPreferredWidth(200);
            jt.getColumnModel().getColumn(35).setPreferredWidth(200);
            jt.getColumnModel().getColumn(36).setPreferredWidth(200);
            jt.getColumnModel().getColumn(37).setPreferredWidth(200);
            jt.getColumnModel().getColumn(38).setPreferredWidth(200);
            jt.getColumnModel().getColumn(39).setPreferredWidth(200);
            jt.getColumnModel().getColumn(40).setPreferredWidth(200);
            jt.getColumnModel().getColumn(41).setPreferredWidth(200);
            jt.getColumnModel().getColumn(42).setPreferredWidth(200);
            jt.getColumnModel().getColumn(43).setPreferredWidth(200);
            jt.getColumnModel().getColumn(44).setPreferredWidth(200);
            jt.getColumnModel().getColumn(45).setPreferredWidth(200);
            jt.getColumnModel().getColumn(46).setPreferredWidth(200);
            jt.getColumnModel().getColumn(47).setPreferredWidth(200);
            jt.getColumnModel().getColumn(48).setPreferredWidth(200);
            jt.getColumnModel().getColumn(49).setPreferredWidth(200);
            jt.getColumnModel().getColumn(50).setPreferredWidth(200);
            jt.getColumnModel().getColumn(51).setPreferredWidth(200);
            jt.getColumnModel().getColumn(52).setPreferredWidth(200);
            jt.getColumnModel().getColumn(53).setPreferredWidth(200);
            jt.getColumnModel().getColumn(54).setPreferredWidth(200);
            jt.getColumnModel().getColumn(55).setPreferredWidth(200);
            jt.getColumnModel().getColumn(56).setPreferredWidth(200);
            jt.getColumnModel().getColumn(57).setPreferredWidth(200);
            jt.getColumnModel().getColumn(58).setPreferredWidth(200);
            jt.getColumnModel().getColumn(59).setPreferredWidth(200);
            jt.getColumnModel().getColumn(60).setPreferredWidth(200);
            jt.getColumnModel().getColumn(61).setPreferredWidth(200);
            jt.getColumnModel().getColumn(62).setPreferredWidth(200);
            jt.getColumnModel().getColumn(63).setPreferredWidth(200);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur dans la classe remplisage" + e.getMessage());
        }
    }

    public void charger(JComboBox cbo) {
        try {
            String req = "SELECT id_employeur FROM employeurs ORDER BY id_employeur DESC";
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
