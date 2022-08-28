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
public class Depenses {

    int id_depense;
    double Dot_Depenses,
            Dot_Gestion_technique,
            Dot_Gestion_Budgetaires,
            Dot_Autres_Gestions,
            Depenses_Gestion_Budgetaire,
            Actions_Sanitaires_Sociale,
            Remunerations,
            Autres_depenses_Gestion,
            Depenses_Gestion_Technique,
            BranchePF,
            Allocations_prenatales,
            Allocations_maternite,
            Allocations_familiales,
            Frais_medicaux1,
            Indemnites_jrnliers_conge_maternite,
            Autres_prestations,
            BrancheATMP,
            Allocation_incapacite,
            Allocations_veuve,
            Allocations_orphelin,
            Allocations_remariage1,
            Rentes_incapacite,
            Rentes_survivants_veuve,
            Rentes_survivants_orphelin,
            Soins_medicaux_rembourses,
            Produits_pharmaceutiques,
            Indemnites_journalieres_incapacite,
            Fournitures_laboratoires_radiologie,
            Protheses_fournitures_fabrication,
            Frais_transport,
            Frais_funeraires1,
            Hebergement_sinistres,
            Autres_charges_depenses_techATMP,
            BranchePVID,
            Pensions_retraitePR,
            Pensns_anticipees_volontairesPA1,
            Pensns_anticipees_usurePA2,
            Pensns_invaliditPI,
            Pensns_survivantsPS,
            Allocations_vieillesse,
            Allocations_survivants_veuve,
            Allocations_survivants_orphelin,
            Allocations_remariage2,
            Frais_medicaux2,
            Frais_funeraires2,
            Autres_charges_depenses_technPVID,
            Depenses_Autres_Gestions_Investissements,
            Total_Depenses_engages;
    String mois;
    int annee;
    String Code_centre;
    String Matricule;

    public int getId_depense() {
        return id_depense;
    }

    public void setId_depense(int id_depense) {
        this.id_depense = id_depense;
    }

    public double getDot_Depenses() {
        return Dot_Depenses;
    }

    public void setDot_Depenses(double Dot_Depenses) {
        this.Dot_Depenses = Dot_Depenses;
    }

    public double getDot_Gestion_technique() {
        return Dot_Gestion_technique;
    }

    public void setDot_Gestion_technique(double Dot_Gestion_technique) {
        this.Dot_Gestion_technique = Dot_Gestion_technique;
    }

    public double getDot_Gestion_Budgetaires() {
        return Dot_Gestion_Budgetaires;
    }

    public void setDot_Gestion_Budgetaires(double Dot_Gestion_Budgetaires) {
        this.Dot_Gestion_Budgetaires = Dot_Gestion_Budgetaires;
    }

    public double getDot_Autres_Gestions() {
        return Dot_Autres_Gestions;
    }

    public void setDot_Autres_Gestions(double Dot_Autres_Gestions) {
        this.Dot_Autres_Gestions = Dot_Autres_Gestions;
    }

    public double getDepenses_Gestion_Budgetaire() {
        return Depenses_Gestion_Budgetaire;
    }

    public void setDepenses_Gestion_Budgetaire(double Depenses_Gestion_Budgetaire) {
        this.Depenses_Gestion_Budgetaire = Depenses_Gestion_Budgetaire;
    }

    public double getActions_Sanitaires_Sociale() {
        return Actions_Sanitaires_Sociale;
    }

    public void setActions_Sanitaires_Sociale(double Actions_Sanitaires_Sociale) {
        this.Actions_Sanitaires_Sociale = Actions_Sanitaires_Sociale;
    }

    public double getRemunerations() {
        return Remunerations;
    }

    public void setRemunerations(double Remunerations) {
        this.Remunerations = Remunerations;
    }

    public double getAutres_depenses_Gestion() {
        return Autres_depenses_Gestion;
    }

    public void setAutres_depenses_Gestion(double Autres_depenses_Gestion) {
        this.Autres_depenses_Gestion = Autres_depenses_Gestion;
    }

    public double getDepenses_Gestion_Technique() {
        return Depenses_Gestion_Technique;
    }

    public void setDepenses_Gestion_Technique(double Depenses_Gestion_Technique) {
        this.Depenses_Gestion_Technique = Depenses_Gestion_Technique;
    }

    public double getBranchePF() {
        return BranchePF;
    }

    public void setBranchePF(double BranchePF) {
        this.BranchePF = BranchePF;
    }

    public double getAllocations_prenatales() {
        return Allocations_prenatales;
    }

    public void setAllocations_prenatales(double Allocations_prenatales) {
        this.Allocations_prenatales = Allocations_prenatales;
    }

    public double getAllocations_maternite() {
        return Allocations_maternite;
    }

    public void setAllocations_maternite(double Allocations_maternite) {
        this.Allocations_maternite = Allocations_maternite;
    }

    public double getAllocations_familiales() {
        return Allocations_familiales;
    }

    public void setAllocations_familiales(double Allocations_familiales) {
        this.Allocations_familiales = Allocations_familiales;
    }

    public double getFrais_medicaux1() {
        return Frais_medicaux1;
    }

    public void setFrais_medicaux1(double Frais_medicaux1) {
        this.Frais_medicaux1 = Frais_medicaux1;
    }

    public double getIndemnites_jrnliers_conge_maternite() {
        return Indemnites_jrnliers_conge_maternite;
    }

    public void setIndemnites_jrnliers_conge_maternite(double Indemnites_jrnliers_conge_maternite) {
        this.Indemnites_jrnliers_conge_maternite = Indemnites_jrnliers_conge_maternite;
    }

    public double getAutres_prestations() {
        return Autres_prestations;
    }

    public void setAutres_prestations(double Autres_prestations) {
        this.Autres_prestations = Autres_prestations;
    }

    public double getBrancheATMP() {
        return BrancheATMP;
    }

    public void setBrancheATMP(double BrancheATMP) {
        this.BrancheATMP = BrancheATMP;
    }

    public double getAllocation_incapacite() {
        return Allocation_incapacite;
    }

    public void setAllocation_incapacite(double Allocation_incapacite) {
        this.Allocation_incapacite = Allocation_incapacite;
    }

    public double getAllocations_veuve() {
        return Allocations_veuve;
    }

    public void setAllocations_veuve(double Allocations_veuve) {
        this.Allocations_veuve = Allocations_veuve;
    }

    public double getAllocations_orphelin() {
        return Allocations_orphelin;
    }

    public void setAllocations_orphelin(double Allocations_orphelin) {
        this.Allocations_orphelin = Allocations_orphelin;
    }

    public double getAllocations_remariage1() {
        return Allocations_remariage1;
    }

    public void setAllocations_remariage1(double Allocations_remariage1) {
        this.Allocations_remariage1 = Allocations_remariage1;
    }

    public double getRentes_incapacite() {
        return Rentes_incapacite;
    }

    public void setRentes_incapacite(double Rentes_incapacite) {
        this.Rentes_incapacite = Rentes_incapacite;
    }

    public double getRentes_survivants_veuve() {
        return Rentes_survivants_veuve;
    }

    public void setRentes_survivants_veuve(double Rentes_survivants_veuve) {
        this.Rentes_survivants_veuve = Rentes_survivants_veuve;
    }

    public double getRentes_survivants_orphelin() {
        return Rentes_survivants_orphelin;
    }

    public void setRentes_survivants_orphelin(double Rentes_survivants_orphelin) {
        this.Rentes_survivants_orphelin = Rentes_survivants_orphelin;
    }

    public double getSoins_medicaux_rembourses() {
        return Soins_medicaux_rembourses;
    }

    public void setSoins_medicaux_rembourses(double Soins_medicaux_rembourses) {
        this.Soins_medicaux_rembourses = Soins_medicaux_rembourses;
    }

    public double getProduits_pharmaceutiques() {
        return Produits_pharmaceutiques;
    }

    public void setProduits_pharmaceutiques(double Produits_pharmaceutiques) {
        this.Produits_pharmaceutiques = Produits_pharmaceutiques;
    }

    public double getIndemnites_journalieres_incapacite() {
        return Indemnites_journalieres_incapacite;
    }

    public void setIndemnites_journalieres_incapacite(double Indemnites_journalieres_incapacite) {
        this.Indemnites_journalieres_incapacite = Indemnites_journalieres_incapacite;
    }

    public double getFournitures_laboratoires_radiologie() {
        return Fournitures_laboratoires_radiologie;
    }

    public void setFournitures_laboratoires_radiologie(double Fournitures_laboratoires_radiologie) {
        this.Fournitures_laboratoires_radiologie = Fournitures_laboratoires_radiologie;
    }

    public double getProtheses_fournitures_fabrication() {
        return Protheses_fournitures_fabrication;
    }

    public void setProtheses_fournitures_fabrication(double Protheses_fournitures_fabrication) {
        this.Protheses_fournitures_fabrication = Protheses_fournitures_fabrication;
    }

    public double getFrais_transport() {
        return Frais_transport;
    }

    public void setFrais_transport(double Frais_transport) {
        this.Frais_transport = Frais_transport;
    }

    public double getFrais_funeraires1() {
        return Frais_funeraires1;
    }

    public void setFrais_funeraires1(double Frais_funeraires1) {
        this.Frais_funeraires1 = Frais_funeraires1;
    }

    public double getHebergement_sinistres() {
        return Hebergement_sinistres;
    }

    public void setHebergement_sinistres(double Hebergement_sinistres) {
        this.Hebergement_sinistres = Hebergement_sinistres;
    }

    public double getAutres_charges_depenses_techATMP() {
        return Autres_charges_depenses_techATMP;
    }

    public void setAutres_charges_depenses_techATMP(double Autres_charges_depenses_techATMP) {
        this.Autres_charges_depenses_techATMP = Autres_charges_depenses_techATMP;
    }

    public double getBranchePVID() {
        return BranchePVID;
    }

    public void setBranchePVID(double BranchePVID) {
        this.BranchePVID = BranchePVID;
    }

    public double getPensions_retraitePR() {
        return Pensions_retraitePR;
    }

    public void setPensions_retraitePR(double Pensions_retraitePR) {
        this.Pensions_retraitePR = Pensions_retraitePR;
    }

    public double getPensns_anticipees_volontairesPA1() {
        return Pensns_anticipees_volontairesPA1;
    }

    public void setPensns_anticipees_volontairesPA1(double Pensns_anticipees_volontairesPA1) {
        this.Pensns_anticipees_volontairesPA1 = Pensns_anticipees_volontairesPA1;
    }

    public double getPensns_anticipees_usurePA2() {
        return Pensns_anticipees_usurePA2;
    }

    public void setPensns_anticipees_usurePA2(double Pensns_anticipees_usurePA2) {
        this.Pensns_anticipees_usurePA2 = Pensns_anticipees_usurePA2;
    }

    public double getPensns_invaliditPI() {
        return Pensns_invaliditPI;
    }

    public void setPensns_invaliditPI(double Pensns_invaliditPI) {
        this.Pensns_invaliditPI = Pensns_invaliditPI;
    }

    public double getPensns_survivantsPS() {
        return Pensns_survivantsPS;
    }

    public void setPensns_survivantsPS(double Pensns_survivantsPS) {
        this.Pensns_survivantsPS = Pensns_survivantsPS;
    }

    public double getAllocations_vieillesse() {
        return Allocations_vieillesse;
    }

    public void setAllocations_vieillesse(double Allocations_vieillesse) {
        this.Allocations_vieillesse = Allocations_vieillesse;
    }

    public double getAllocations_survivants_veuve() {
        return Allocations_survivants_veuve;
    }

    public void setAllocations_survivants_veuve(double Allocations_survivants_veuve) {
        this.Allocations_survivants_veuve = Allocations_survivants_veuve;
    }

    public double getAllocations_survivants_orphelin() {
        return Allocations_survivants_orphelin;
    }

    public void setAllocations_survivants_orphelin(double Allocations_survivants_orphelin) {
        this.Allocations_survivants_orphelin = Allocations_survivants_orphelin;
    }

    public double getAllocations_remariage2() {
        return Allocations_remariage2;
    }

    public void setAllocations_remariage2(double Allocations_remariage2) {
        this.Allocations_remariage2 = Allocations_remariage2;
    }

    public double getFrais_medicaux2() {
        return Frais_medicaux2;
    }

    public void setFrais_medicaux2(double Frais_medicaux2) {
        this.Frais_medicaux2 = Frais_medicaux2;
    }

    public double getFrais_funeraires2() {
        return Frais_funeraires2;
    }

    public void setFrais_funeraires2(double Frais_funeraires2) {
        this.Frais_funeraires2 = Frais_funeraires2;
    }

    public double getAutres_charges_depenses_technPVID() {
        return Autres_charges_depenses_technPVID;
    }

    public void setAutres_charges_depenses_technPVID(double Autres_charges_depenses_technPVID) {
        this.Autres_charges_depenses_technPVID = Autres_charges_depenses_technPVID;
    }

    public double getDepenses_Autres_Gestions_Investissements() {
        return Depenses_Autres_Gestions_Investissements;
    }

    public void setDepenses_Autres_Gestions_Investissements(double Depenses_Autres_Gestions_Investissements) {
        this.Depenses_Autres_Gestions_Investissements = Depenses_Autres_Gestions_Investissements;
    }

    public double getTotal_Depenses_engages() {
        return Total_Depenses_engages;
    }

    public void setTotal_Depenses_engages(double Total_Depenses_engages) {
        this.Total_Depenses_engages = Total_Depenses_engages;
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
            req = "INSERT INTO `depense` (`id_depense`, `Dot_Depenses`, `Dot_Gestion_technique`, `Dot_Gestion_Budgetaires`, `Dot_Autres_Gestions`, `Depenses_Gestion_Budgetaire`, `Actions_Sanitaires_Sociale`, `Remunerations`, `Autres_depenses_Gestion`, `Depenses_Gestion_Technique`, `BranchePF`, `Allocations_prenatales`, `Allocations_maternite`, `Allocations_familiales`, `Frais_medicaux1`, `Indemnites_jrnliers_conge_maternite`, `Autres_prestations`, `BrancheATMP`, `Allocation_incapacite`, `Allocations_veuve`, `Allocations_orphelin`, `Allocations_remariage1`, `Rentes_incapacite`, `Rentes_survivants_veuve`, `Rentes_survivants_orphelin`, `Soins_medicaux_rembourses`, `Produits_pharmaceutiques`, `Indemnites_journalieres_incapacite`, `Fournitures_laboratoires_radiologie`, `Protheses_fournitures_fabrication`, `Frais_transport`, `Frais_funeraires1`, `Hebergement_sinistres`, `Autres_charges_depenses_techATMP`, `BranchePVID`, `Pensions_retraitePR`, `Pensns_anticipees_volontairesPA1`, `Pensns_anticipees_usurePA2`, `Pensns_invaliditPI`, `Pensns_survivantsPS`, `Allocations_vieillesse`, `Allocations_survivants_veuve`, `Allocations_survivants_orphelin`, `Allocations_remariage2`, `Frais_medicaux2`, `Frais_funeraires2`, `Autres_charges_depenses_technPVID`,`Depenses_Autres_Gestions_Investissements`,`Total_Depenses_engages`, `mois`,`annee`, `Code_centre`,`Matricule`) VALUES ('" + 0 + "', '" + getDot_Depenses() + "', '" + getDot_Gestion_technique() + "', '" + getDot_Gestion_Budgetaires() + "', '" + getDot_Autres_Gestions() + "', '" + getDepenses_Gestion_Budgetaire() + "', '" + getActions_Sanitaires_Sociale() + "', '" + getRemunerations() + "', '" + getAutres_depenses_Gestion() + "', '" + getDepenses_Gestion_Technique() + "', '" + getBranchePF() + "', '" + getAllocations_prenatales() + "', '" + getAllocations_maternite() + "', '" + getAllocations_familiales() + "', '" + getFrais_medicaux1() + "', '" + getIndemnites_jrnliers_conge_maternite() + "', '" + getAutres_prestations() + "', '" + getBrancheATMP() + "', '" + getAllocation_incapacite() + "', '" + getAllocations_veuve() + "', '" + getAllocations_orphelin() + "', '" + getAllocations_remariage1() + "', '" + getRentes_incapacite() + "', '" + getRentes_survivants_veuve() + "', '" + getRentes_survivants_orphelin() + "', '" + getSoins_medicaux_rembourses() + "', '" + getProduits_pharmaceutiques() + "', '" + getIndemnites_journalieres_incapacite() + "', '" + getFournitures_laboratoires_radiologie() + "', '" + getProtheses_fournitures_fabrication() + "', '" + getFrais_transport() + "', '" + getFrais_funeraires1() + "', '" + getHebergement_sinistres() + "', '" + getAutres_charges_depenses_techATMP() + "', '" + getBranchePVID() + "', '" + getPensions_retraitePR() + "', '" + getPensns_anticipees_volontairesPA1() + "', '" + getPensns_anticipees_usurePA2() + "', '" + getPensns_invaliditPI() + "', '" + getPensns_survivantsPS() + "', '" + getAllocations_vieillesse() + "', '" + getAllocations_survivants_veuve() + "', '" + getAllocations_survivants_orphelin() + "', '" + getAllocations_remariage2() + "', '" + getFrais_medicaux2() + "', '" + getFrais_funeraires2() + "', '" + getAutres_charges_depenses_technPVID() + "','" + getDepenses_Autres_Gestions_Investissements() + "', '" + getTotal_Depenses_engages()+ "', '" + getMois() + "', '" + getAnnee()+ "', '" + getCode_centre() + "', '" + getMatricule() + "')";
            co.Execution_requete(req);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur dans la classe insertion" + e.getMessage());
        }
    }

    public void modifier() {
        try {
            String req;
            req = "UPDATE `depense` SET `Dot_Depenses`='" + getDot_Depenses() + "', `Dot_Gestion_technique`='" + getDot_Gestion_technique() + "', `Dot_Gestion_Budgetaires`='" + getDot_Gestion_Budgetaires() + "', `Dot_Autres_Gestions`='" + getDot_Autres_Gestions() + "', `Depenses_Gestion_Budgetaire`='" + getDepenses_Gestion_Budgetaire() + "', `Actions_Sanitaires_Sociale`='" + getActions_Sanitaires_Sociale() + "', `Remunerations`='" + getRemunerations() + "', `Autres_depenses_Gestion`='" + getAutres_depenses_Gestion() + "', `Depenses_Gestion_Technique`='" + getDepenses_Gestion_Technique() + "', `BranchePF`='" + getBranchePF() + "', `Allocations_prenatales`='" + getAllocations_prenatales() + "', `Allocations_maternite`='" + getAllocations_maternite() + "', `Allocations_familiales`='" + getAllocations_familiales() + "', `Frais_medicaux1`='" + getFrais_medicaux1() + "', `Indemnites_jrnliers_conge_maternite`='" + getIndemnites_jrnliers_conge_maternite() + "', `Autres_prestations`='" + getAutres_prestations() + "', `BrancheATMP`='" + getBrancheATMP() + "', `Allocation_incapacite`='" + getAllocation_incapacite() + "', `Allocations_veuve`='" + getAllocations_veuve() + "', `Allocations_orphelin`='" + getAllocations_orphelin() + "', `Allocations_remariage1`='" + getAllocations_remariage1() + "', `Rentes_incapacite`='" + getRentes_incapacite() + "', `Rentes_survivants_veuve`='" + getRentes_survivants_veuve() + "', `Rentes_survivants_orphelin`='" + getRentes_survivants_orphelin() + "', `Soins_medicaux_rembourses`='" + getSoins_medicaux_rembourses() + "', `Produits_pharmaceutiques`='" + getProduits_pharmaceutiques() + "', `Indemnites_journalieres_incapacite`='" + getIndemnites_journalieres_incapacite() + "', `Fournitures_laboratoires_radiologie`='" + getFournitures_laboratoires_radiologie() + "', `Protheses_fournitures_fabrication`='" + getProtheses_fournitures_fabrication() + "', `Frais_transport`='" + getFrais_transport() + "', `Frais_funeraires1`='" + getFrais_funeraires1() + "', `Hebergement_sinistres`='" + getHebergement_sinistres() + "', `Autres_charges_depenses_techATMP`='" + getAutres_charges_depenses_techATMP() + "', `BranchePVID`='" + getBranchePVID() + "', `Pensions_retraitePR`='" + getPensions_retraitePR() + "', `Pensns_anticipees_volontairesPA1`='" + getPensns_anticipees_volontairesPA1() + "', `Pensns_anticipees_usurePA2`='" + getPensns_anticipees_usurePA2() + "', `Pensns_invaliditPI`='" + getPensns_invaliditPI() + "', `Pensns_survivantsPS`='" + getPensns_survivantsPS() + "', `Allocations_vieillesse`='" + getAllocations_vieillesse() + "', `Allocations_survivants_veuve`='" + getAllocations_survivants_veuve() + "', `Allocations_survivants_orphelin`='" + getAllocations_survivants_orphelin() + "', `Allocations_remariage2`='" + getAllocations_remariage2() + "', `Frais_medicaux2`='" + getFrais_medicaux2() + "', `Frais_funeraires2`='" + getFrais_funeraires2() + "', `Autres_charges_depenses_technPVID`='" + getAutres_charges_depenses_technPVID() + "', `Depenses_Autres_Gestions_Investissements`='" + getDepenses_Autres_Gestions_Investissements() + "',`Total_Depenses_engages`='" + getTotal_Depenses_engages()+ "', `mois`='" + getMois() + "',`annee`='" + getAnnee()+ "', `Code_centre`='" + getCode_centre() + "', `Matricule`='" + getMatricule() + "' WHERE `depense`.`id_depense`='" + getId_depense() + "';";
            co.Execution_requete(req);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur dans la modification" + e.getMessage());
        }
    }

    public void supprimer() {
        try {
            String req;
            req = "DELETE FROM `depense` WHERE `depense`.`id_depense` = '" + getId_depense() + "'";
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
            Object donnee[][] = new Object[c][52];
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
                c++;
            }
            String titre[] = {"Id Depense", "Dot Depenses", "Dot Gestion technique", "Dot Gestion Budgetaires", "Dot Autres Gestions", "Depenses Gestion Budgetaire", "Actions Sanitaires Sociale", "Remunerations", "Autres depenses Gestion", "Depenses Gestion Technique", "BranchePF", "Allocations prenatales", "Allocations Maternite", "Allocations Familiales", "Frais Medicaux", "Indemnites Journaliers conge maternite", "Autres Prestations", "BrancheATMP", "Allocation Incapacite", "Allocations Veuve", "Allocations Orphelin", "Allocations Remariage", "Rentes Incapacite", "Rentes Survivants Veuve", "Rentes Survivants Orphelin", "Soins Medicaux Rembourses", "Produits Pharmaceutiques", "Indemnites Journalieres Incapacite", "Fournitures Laboratoires Radiologie", "Protheses fournitures fabrication", "Frais Transport", "Frais Funeraires", "Hebergement Sinistres", "Autres Charges Depenses TechATMP", "BranchePVID", "Pensions RetraitePR", "Pensns Anticipees VolontairesPA", "Pensns Anticipees UsurePA", "Pensns InvaliditPI", "Pensns SurvivantsPS", "Allocations Vieillesse", "Allocations Survivants Veuve", "Allocations Survivants Orphelin", "Allocations Remariage", "Frais Medicaux", "Frais Funeraires", "Autres Charges Depenses TechnPVID", "Depenses Autres Gestions Investissements","Total Depense Engage", "Mois","Année", "Code Centre"};
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
            jt.getColumnModel().getColumn(44).setPreferredWidth(350);
            jt.getColumnModel().getColumn(45).setPreferredWidth(350);
            jt.getColumnModel().getColumn(46).setPreferredWidth(350);
            jt.getColumnModel().getColumn(47).setPreferredWidth(300);
            jt.getColumnModel().getColumn(48).setPreferredWidth(300);
            jt.getColumnModel().getColumn(49).setPreferredWidth(200);
            jt.getColumnModel().getColumn(50).setPreferredWidth(200);
            jt.getColumnModel().getColumn(51).setPreferredWidth(200);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur dans la classe remplisage" + e.getMessage());
        }
    }

    public void charger(JComboBox cbo) {
        try {
            String req = "SELECT id_depense FROM `depense`";
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
