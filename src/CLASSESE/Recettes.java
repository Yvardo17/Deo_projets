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
public class Recettes {

    int Id_recette;
    double DotationRecettes,
            BranPrestationsFaml1,
            BranATMP1,
            BranPVID1,
            RecettesRealisees,
            BranPrestationsFaml2,
            BranATMP2,
            BranPVID2,
            CotiseOrdinairesModeleDC,
            BranPrestationsFaml3,
            BranATMP3,
            BranPVID3,
            CotiseComplmntairesModeleDCC,
            BranPrestationsFaml4,
            BranATMP4,
            BranPVID4,
            MajorationRetardMO,
            BranPrestationsFaml5,
            BranATMP5,
            BranPVID5,
            TaxationOfficeTO,
            BranPrestationsFaml6,
            BranATMP6,
            BranPVID6,
            ImpayesCotiseRecouvresEexerCours,
            BranPrestationsFaml7,
            BranATMP7,
            BranPVID7,
            ArrieresCotiseRecouvresExersAnt,
            BranPrestationsFaml8,
            BranATMP8,
            BranPVID8,
            NbreEmployeursConcernesArrieres;
    String mois;
    int annee;
    String Code_centre;
    String Matricule;

    public int getId_recette() {
        return Id_recette;
    }

    public void setId_recette(int Id_recette) {
        this.Id_recette = Id_recette;
    }

    public double getDotationRecettes() {
        return DotationRecettes;
    }

    public void setDotationRecettes(double DotationRecettes) {
        this.DotationRecettes = DotationRecettes;
    }

    public double getBranPrestationsFaml1() {
        return BranPrestationsFaml1;
    }

    public void setBranPrestationsFaml1(double BranPrestationsFaml1) {
        this.BranPrestationsFaml1 = BranPrestationsFaml1;
    }

    public double getBranATMP1() {
        return BranATMP1;
    }

    public void setBranATMP1(double BranATMP1) {
        this.BranATMP1 = BranATMP1;
    }

    public double getBranPVID1() {
        return BranPVID1;
    }

    public void setBranPVID1(double BranPVID1) {
        this.BranPVID1 = BranPVID1;
    }

    public double getRecettesRealisees() {
        return RecettesRealisees;
    }

    public void setRecettesRealisees(double RecettesRealisees) {
        this.RecettesRealisees = RecettesRealisees;
    }

    public double getBranPrestationsFaml2() {
        return BranPrestationsFaml2;
    }

    public void setBranPrestationsFaml2(double BranPrestationsFaml2) {
        this.BranPrestationsFaml2 = BranPrestationsFaml2;
    }

    public double getBranATMP2() {
        return BranATMP2;
    }

    public void setBranATMP2(double BranATMP2) {
        this.BranATMP2 = BranATMP2;
    }

    public double getBranPVID2() {
        return BranPVID2;
    }

    public void setBranPVID2(double BranPVID2) {
        this.BranPVID2 = BranPVID2;
    }

    public double getCotiseOrdinairesModeleDC() {
        return CotiseOrdinairesModeleDC;
    }

    public void setCotiseOrdinairesModeleDC(double CotiseOrdinairesModeleDC) {
        this.CotiseOrdinairesModeleDC = CotiseOrdinairesModeleDC;
    }

    public double getBranPrestationsFaml3() {
        return BranPrestationsFaml3;
    }

    public void setBranPrestationsFaml3(double BranPrestationsFaml3) {
        this.BranPrestationsFaml3 = BranPrestationsFaml3;
    }

    public double getBranATMP3() {
        return BranATMP3;
    }

    public void setBranATMP3(double BranATMP3) {
        this.BranATMP3 = BranATMP3;
    }

    public double getBranPVID3() {
        return BranPVID3;
    }

    public void setBranPVID3(double BranPVID3) {
        this.BranPVID3 = BranPVID3;
    }

    public double getCotiseComplmntairesModeleDCC() {
        return CotiseComplmntairesModeleDCC;
    }

    public void setCotiseComplmntairesModeleDCC(double CotiseComplmntairesModeleDCC) {
        this.CotiseComplmntairesModeleDCC = CotiseComplmntairesModeleDCC;
    }

    public double getBranPrestationsFaml4() {
        return BranPrestationsFaml4;
    }

    public void setBranPrestationsFaml4(double BranPrestationsFaml4) {
        this.BranPrestationsFaml4 = BranPrestationsFaml4;
    }

    public double getBranATMP4() {
        return BranATMP4;
    }

    public void setBranATMP4(double BranATMP4) {
        this.BranATMP4 = BranATMP4;
    }

    public double getBranPVID4() {
        return BranPVID4;
    }

    public void setBranPVID4(double BranPVID4) {
        this.BranPVID4 = BranPVID4;
    }

    public double getMajorationRetardMO() {
        return MajorationRetardMO;
    }

    public void setMajorationRetardMO(double MajorationRetardMO) {
        this.MajorationRetardMO = MajorationRetardMO;
    }

    public double getBranPrestationsFaml5() {
        return BranPrestationsFaml5;
    }

    public void setBranPrestationsFaml5(double BranPrestationsFaml5) {
        this.BranPrestationsFaml5 = BranPrestationsFaml5;
    }

    public double getBranATMP5() {
        return BranATMP5;
    }

    public void setBranATMP5(double BranATMP5) {
        this.BranATMP5 = BranATMP5;
    }

    public double getBranPVID5() {
        return BranPVID5;
    }

    public void setBranPVID5(double BranPVID5) {
        this.BranPVID5 = BranPVID5;
    }

    public double getTaxationOfficeTO() {
        return TaxationOfficeTO;
    }

    public void setTaxationOfficeTO(double TaxationOfficeTO) {
        this.TaxationOfficeTO = TaxationOfficeTO;
    }

    public double getBranPrestationsFaml6() {
        return BranPrestationsFaml6;
    }

    public void setBranPrestationsFaml6(double BranPrestationsFaml6) {
        this.BranPrestationsFaml6 = BranPrestationsFaml6;
    }

    public double getBranATMP6() {
        return BranATMP6;
    }

    public void setBranATMP6(double BranATMP6) {
        this.BranATMP6 = BranATMP6;
    }

    public double getBranPVID6() {
        return BranPVID6;
    }

    public void setBranPVID6(double BranPVID6) {
        this.BranPVID6 = BranPVID6;
    }

    public double getImpayesCotiseRecouvresEexerCours() {
        return ImpayesCotiseRecouvresEexerCours;
    }

    public void setImpayesCotiseRecouvresEexerCours(double ImpayesCotiseRecouvresEexerCours) {
        this.ImpayesCotiseRecouvresEexerCours = ImpayesCotiseRecouvresEexerCours;
    }

    public double getBranPrestationsFaml7() {
        return BranPrestationsFaml7;
    }

    public void setBranPrestationsFaml7(double BranPrestationsFaml7) {
        this.BranPrestationsFaml7 = BranPrestationsFaml7;
    }

    public double getBranATMP7() {
        return BranATMP7;
    }

    public void setBranATMP7(double BranATMP7) {
        this.BranATMP7 = BranATMP7;
    }

    public double getBranPVID7() {
        return BranPVID7;
    }

    public void setBranPVID7(double BranPVID7) {
        this.BranPVID7 = BranPVID7;
    }

    public double getArrieresCotiseRecouvresExersAnt() {
        return ArrieresCotiseRecouvresExersAnt;
    }

    public void setArrieresCotiseRecouvresExersAnt(double ArrieresCotiseRecouvresExersAnt) {
        this.ArrieresCotiseRecouvresExersAnt = ArrieresCotiseRecouvresExersAnt;
    }

    public double getBranPrestationsFaml8() {
        return BranPrestationsFaml8;
    }

    public void setBranPrestationsFaml8(double BranPrestationsFaml8) {
        this.BranPrestationsFaml8 = BranPrestationsFaml8;
    }

    public double getBranATMP8() {
        return BranATMP8;
    }

    public void setBranATMP8(double BranATMP8) {
        this.BranATMP8 = BranATMP8;
    }

    public double getBranPVID8() {
        return BranPVID8;
    }

    public void setBranPVID8(double BranPVID8) {
        this.BranPVID8 = BranPVID8;
    }

    public double getNbreEmployeursConcernesArrieres() {
        return NbreEmployeursConcernesArrieres;
    }

    public void setNbreEmployeursConcernesArrieres(double NbreEmployeursConcernesArrieres) {
        this.NbreEmployeursConcernesArrieres = NbreEmployeursConcernesArrieres;
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
            req = "INSERT INTO `recette` (`Id_recette`, `DotationRecettes`, `BranPrestationsFaml1`, `BranATMP1`, `BranPVID1`, `RecettesRealisees`, `BranPrestationsFaml2`, `BranATMP2`, `BranPVID2`, `CotiseOrdinairesModeleDC`, `BranPrestationsFaml3`, `BranATMP3`, `BranPVID3`, `CotiseComplmntairesModeleDCC`, `BranPrestationsFaml4`, `BranATMP4`, `BranPVID4`, `MajorationRetardMO`, `BranPrestationsFaml5`, `BranATMP5`, `BranPVID5`, `TaxationOfficeTO`, `BranPrestationsFaml6`, `BranATMP6`, `BranPVID6`, `ImpayesCotiseRecouvresEexerCours`, `BranPrestationsFaml7`, `BranATMP7`, `BranPVID7`, `ArrieresCotiseRecouvresExersAnt`, `BranPrestationsFaml8`, `BranATMP8`, `BranPVID8`, `NbreEmployeursConcernesArrieres`, `mois`, `annee`, `Code_centre`, `Matricule`) VALUES ('" + 0 + "', '" + getDotationRecettes() + "', '" + getBranPrestationsFaml1() + "', '" + getBranATMP1() + "', '" + getBranPVID1() + "', '" + getRecettesRealisees() + "', '" + getBranPrestationsFaml2() + "', '" + getBranATMP2() + "', '" + getBranPVID2() + "', '" + getCotiseOrdinairesModeleDC() + "', '" + getBranPrestationsFaml3() + "', '" + getBranATMP3() + "', '" + getBranPVID3() + "', '" + getCotiseComplmntairesModeleDCC() + "', '" + getBranPrestationsFaml4() + "', '" + getBranATMP4() + "', '" + getBranPVID4() + "', '" + getMajorationRetardMO() + "', '" + getBranPrestationsFaml5() + "', '" + getBranATMP5() + "', '" + getBranPVID5() + "', '" + getTaxationOfficeTO() + "', '" + getBranPrestationsFaml6() + "', '" + getBranATMP6() + "', '" + getBranPVID6() + "', '" + getImpayesCotiseRecouvresEexerCours() + "', '" + getBranPrestationsFaml7() + "', '" + getBranATMP7() + "', '" + getBranPVID7() + "', '" + getArrieresCotiseRecouvresExersAnt() + "', '" + getBranPrestationsFaml8() + "', '" + getBranATMP8() + "', '" + getBranPVID8() + "', '" + getNbreEmployeursConcernesArrieres() + "','" + getMois() + "','" + getAnnee() + "', '" + getCode_centre() + "', '" + getMatricule() + "')";
            co.Execution_requete(req);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur dans la classe insertion" + e.getMessage());
        }
    }

    public void modifier() {
        try {
            String req;
            req = "UPDATE `recette` SET `DotationRecettes` = '" + getDotationRecettes() + "', `BranPrestationsFaml1` = '" + getBranPrestationsFaml1() + "', `BranATMP1` = '" + getBranATMP1() + "', `BranPVID1` = '" + getBranPVID1() + "', `RecettesRealisees` = '" + getRecettesRealisees() + "', `BranPrestationsFaml2` = '" + getBranPrestationsFaml2() + "', `BranATMP2` = '" + getBranATMP2() + "', `BranPVID2` = '" + getBranPVID2() + "', `CotiseOrdinairesModeleDC` = '" + getCotiseOrdinairesModeleDC() + "', `BranPrestationsFaml3` = '" + getBranPrestationsFaml3() + "', `BranATMP3` = '" + getBranATMP3() + "', `BranPVID3` = '" + getBranPVID3() + "', `CotiseComplmntairesModeleDCC` = '" + getCotiseComplmntairesModeleDCC() + "', `BranPrestationsFaml4` = '" + getBranPrestationsFaml4() + "', `BranATMP4` = '" + getBranATMP4() + "', `BranPVID4` = '" + getBranPVID4() + "', `MajorationRetardMO` = '" + getMajorationRetardMO() + "', `BranPrestationsFaml5` = '" + getBranPrestationsFaml5() + "', `BranATMP5` = '" + getBranATMP5() + "', `BranPVID5` = '" + getBranPVID5() + "', `TaxationOfficeTO` = '" + getTaxationOfficeTO() + "', `BranPrestationsFaml6` = '" + getBranPrestationsFaml6() + "', `BranATMP6` = '" + getBranATMP6() + "', `BranPVID6` = '" + getBranPVID6() + "', `ImpayesCotiseRecouvresEexerCours` = '" + getImpayesCotiseRecouvresEexerCours() + "', `BranPrestationsFaml7` = '" + getBranPrestationsFaml7() + "', `BranATMP7` = '" + getBranATMP7() + "', `BranPVID7` = '" + getBranPVID7() + "', `BranPrestationsFaml8` = '" + getBranPrestationsFaml8() + "', `BranATMP8` = '" + getBranATMP8() + "', `BranPVID8` = '" + getBranPVID8() + "', `NbreEmployeursConcernesArrieres` = '" + getNbreEmployeursConcernesArrieres() + "', `mois` = '" + getMois() + "', `annee` = '" + getAnnee() + "', `Code_centre` = '" + getCode_centre() + "', `Matricule` = '" + getMatricule() + "' WHERE `recette`.`Id_recette` = " + getId_recette() + ";";
            co.Execution_requete(req);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur dans la modification" + e.getMessage());
        }
    }

    public void supprimer() {
        try {
            String req;
            req = "DELETE FROM `recette` WHERE `recette`.`Id_recette` ='" + getId_recette() + "'";
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
            Object donnee[][] = new Object[c][37];
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
                c++;
            }
            String titre[] = {"Id Recette", "Dotation Recettes", "Branche Prestations Faml", "Branche ATMP", "Branche PVID", "Recettes Realisees", "Branche Prestations Faml", "Branche ATMP", "Branche PVID", "Cotise Ordinaires Modele DC", "Branche Prestations Faml", "Branche ATMP", "Branche PVID", "Cotise Complmntaires Modele DCC", "Branche Prestations Faml", "Branche ATMP", "Branche PVID", "Majoration Retard MO", "Branche Prestations Faml", "Branche ATMP", "Branche PVID", "Taxation Office TO", "Branche Prestations Faml", "Branche ATMP", "Branche PVID", "Impayes Cotise Recouvres Eexer Cours", "Branche Prestations Faml", "Branche ATMP", "Branche PVID", "Arrieres Cotise Recouvres Exers Ant", "Branche Prestations Faml", "Branche ATMP", "Branche PVID", "Nbre Employeurs Concernes Arrieres", "Mois ","Ann??e", "Code Centre"};
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

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur dans la classe remplisage" + e.getMessage());
        }
    }

    public void charger(JComboBox cbo) {
        try {
            String req = "SELECT Id_recette FROM recette ORDER BY id_recette DESC";
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
