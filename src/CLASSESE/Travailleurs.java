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
public class Travailleurs {

    int Id_travailleurs;
    double Trav_au_fichier1,
            Publics_et_assimiles1,
            Masculins1,
            Feminins1,
            Prives1,
            Masculins2,
            Feminins2,
            Gens_de_maison1,
            Masculins3,
            Féminins3,
            Trav_etrangers1,
            Masculins4,
            Feminins4,
            Assur_volontaires1,
            Masculins5,
            Feminins5,
            Nouvelles_immatriculations1,
            Publics_et_assimiles2,
            Masculins6,
            Feminins6,
            Prives2,
            Masculins7,
            Feminins7,
            Gens_de_maison2,
            Masculins8,
            Feminins8,
            Trav_etrangers2,
            Masculins9,
            Feminins9,
            Assur_volontaires2,
            Masculins10,
            Feminins10,
            Trav_se_rap_aux_employeurs_actifs,
            Publics_et_assimiles3,
            Masculins11,
            Feminins11,
            Prives3,
            Masculins12,
            Feminins12,
            Gens_de_maison3,
            Masculins13,
            Feminins13,
            Trav_etrangers3,
            Masculins14,
            Feminins14,
            Assur_volontaires3,
            Masculins15,
            Feminins15,
            Trav_se_rap_aux_employeurs_ayant_declare,
            Publics_et_assimiles4,
            Masculins16,
            Feminins16,
            Prives4,
            Masculins17,
            Feminins17,
            Gens_de_maison4,
            Masculins18,
            Feminins18,
            Trav_etrangers4,
            Masculins19,
            Feminins19,
            Assur_volontaires4,
            Masculins20,
            Feminins20,
            Trav_se_rap_aux_employ_ayant_cotise,
            Publics_et_assimiles5,
            Masculins21,
            Feminins21,
            Prives5,
            Masculins22,
            Feminins22,
            Gens_de_maison5,
            Masculins23,
            Feminins23,
            Trav_etrangers5,
            Masculins24,
            Feminins24,
            Assur_volontaires5,
            Masculins25,
            Feminins25,
            Trav_se_rap_aux_employeurs_en_cessation_d_act,
            Publics_et_assimiles6,
            Masculins26,
            Feminins26,
            Prives6,
            Masculins27,
            Feminins27,
            Gens_de_maison6,
            Masculins28,
            Feminins28,
            Trav_etrangers6,
            Masculins29,
            Feminins29,
            Assur_volontaires6,
            Masculins30,
            Feminins30,
            MS_des_remu_soumises_cotisation,
            MS_Employeurs_du_secteur_public,
            MS_Employeurs_du_secteur_prive,
            MS_Gens_de_maison,
            MS_Assures_volontaires,
            MS_Travailleurs_etrangers;
    String mois;
    int annee;
    String Code_centre;
    String Matricule;

    public int getId_travailleurs() {
        return Id_travailleurs;
    }

    public void setId_travailleurs(int Id_travailleurs) {
        this.Id_travailleurs = Id_travailleurs;
    }

    public double getTrav_au_fichier1() {
        return Trav_au_fichier1;
    }

    public void setTrav_au_fichier1(double Trav_au_fichier1) {
        this.Trav_au_fichier1 = Trav_au_fichier1;
    }

    public double getPublics_et_assimiles1() {
        return Publics_et_assimiles1;
    }

    public void setPublics_et_assimiles1(double Publics_et_assimiles1) {
        this.Publics_et_assimiles1 = Publics_et_assimiles1;
    }

    public double getMasculins1() {
        return Masculins1;
    }

    public void setMasculins1(double Masculins1) {
        this.Masculins1 = Masculins1;
    }

    public double getFeminins1() {
        return Feminins1;
    }

    public void setFeminins1(double Feminins1) {
        this.Feminins1 = Feminins1;
    }

    public double getPrives1() {
        return Prives1;
    }

    public void setPrives1(double Prives1) {
        this.Prives1 = Prives1;
    }

    public double getMasculins2() {
        return Masculins2;
    }

    public void setMasculins2(double Masculins2) {
        this.Masculins2 = Masculins2;
    }

    public double getFeminins2() {
        return Feminins2;
    }

    public void setFeminins2(double Feminins2) {
        this.Feminins2 = Feminins2;
    }

    public double getGens_de_maison1() {
        return Gens_de_maison1;
    }

    public void setGens_de_maison1(double Gens_de_maison1) {
        this.Gens_de_maison1 = Gens_de_maison1;
    }

    public double getMasculins3() {
        return Masculins3;
    }

    public void setMasculins3(double Masculins3) {
        this.Masculins3 = Masculins3;
    }

    public double getFéminins3() {
        return Féminins3;
    }

    public void setFéminins3(double Féminins3) {
        this.Féminins3 = Féminins3;
    }

    public double getTrav_etrangers1() {
        return Trav_etrangers1;
    }

    public void setTrav_etrangers1(double Trav_etrangers1) {
        this.Trav_etrangers1 = Trav_etrangers1;
    }

    public double getMasculins4() {
        return Masculins4;
    }

    public void setMasculins4(double Masculins4) {
        this.Masculins4 = Masculins4;
    }

    public double getFeminins4() {
        return Feminins4;
    }

    public void setFeminins4(double Feminins4) {
        this.Feminins4 = Feminins4;
    }

    public double getAssur_volontaires1() {
        return Assur_volontaires1;
    }

    public void setAssur_volontaires1(double Assur_volontaires1) {
        this.Assur_volontaires1 = Assur_volontaires1;
    }

    public double getMasculins5() {
        return Masculins5;
    }

    public void setMasculins5(double Masculins5) {
        this.Masculins5 = Masculins5;
    }

    public double getFeminins5() {
        return Feminins5;
    }

    public void setFeminins5(double Feminins5) {
        this.Feminins5 = Feminins5;
    }

    public double getNouvelles_immatriculations1() {
        return Nouvelles_immatriculations1;
    }

    public void setNouvelles_immatriculations1(double Nouvelles_immatriculations1) {
        this.Nouvelles_immatriculations1 = Nouvelles_immatriculations1;
    }

    public double getPublics_et_assimiles2() {
        return Publics_et_assimiles2;
    }

    public void setPublics_et_assimiles2(double Publics_et_assimiles2) {
        this.Publics_et_assimiles2 = Publics_et_assimiles2;
    }

    public double getMasculins6() {
        return Masculins6;
    }

    public void setMasculins6(double Masculins6) {
        this.Masculins6 = Masculins6;
    }

    public double getFeminins6() {
        return Feminins6;
    }

    public void setFeminins6(double Feminins6) {
        this.Feminins6 = Feminins6;
    }

    public double getPrives2() {
        return Prives2;
    }

    public void setPrives2(double Prives2) {
        this.Prives2 = Prives2;
    }

    public double getMasculins7() {
        return Masculins7;
    }

    public void setMasculins7(double Masculins7) {
        this.Masculins7 = Masculins7;
    }

    public double getFeminins7() {
        return Feminins7;
    }

    public void setFeminins7(double Feminins7) {
        this.Feminins7 = Feminins7;
    }

    public double getGens_de_maison2() {
        return Gens_de_maison2;
    }

    public void setGens_de_maison2(double Gens_de_maison2) {
        this.Gens_de_maison2 = Gens_de_maison2;
    }

    public double getMasculins8() {
        return Masculins8;
    }

    public void setMasculins8(double Masculins8) {
        this.Masculins8 = Masculins8;
    }

    public double getFeminins8() {
        return Feminins8;
    }

    public void setFeminins8(double Feminins8) {
        this.Feminins8 = Feminins8;
    }

    public double getTrav_etrangers2() {
        return Trav_etrangers2;
    }

    public void setTrav_etrangers2(double Trav_etrangers2) {
        this.Trav_etrangers2 = Trav_etrangers2;
    }

    public double getMasculins9() {
        return Masculins9;
    }

    public void setMasculins9(double Masculins9) {
        this.Masculins9 = Masculins9;
    }

    public double getFeminins9() {
        return Feminins9;
    }

    public void setFeminins9(double Feminins9) {
        this.Feminins9 = Feminins9;
    }

    public double getAssur_volontaires2() {
        return Assur_volontaires2;
    }

    public void setAssur_volontaires2(double Assur_volontaires2) {
        this.Assur_volontaires2 = Assur_volontaires2;
    }

    public double getMasculins10() {
        return Masculins10;
    }

    public void setMasculins10(double Masculins10) {
        this.Masculins10 = Masculins10;
    }

    public double getFeminins10() {
        return Feminins10;
    }

    public void setFeminins10(double Feminins10) {
        this.Feminins10 = Feminins10;
    }

    public double getTrav_se_rap_aux_employeurs_actifs() {
        return Trav_se_rap_aux_employeurs_actifs;
    }

    public void setTrav_se_rap_aux_employeurs_actifs(double Trav_se_rap_aux_employeurs_actifs) {
        this.Trav_se_rap_aux_employeurs_actifs = Trav_se_rap_aux_employeurs_actifs;
    }

    public double getPublics_et_assimiles3() {
        return Publics_et_assimiles3;
    }

    public void setPublics_et_assimiles3(double Publics_et_assimiles3) {
        this.Publics_et_assimiles3 = Publics_et_assimiles3;
    }

    public double getMasculins11() {
        return Masculins11;
    }

    public void setMasculins11(double Masculins11) {
        this.Masculins11 = Masculins11;
    }

    public double getFeminins11() {
        return Feminins11;
    }

    public void setFeminins11(double Feminins11) {
        this.Feminins11 = Feminins11;
    }

    public double getPrives3() {
        return Prives3;
    }

    public void setPrives3(double Prives3) {
        this.Prives3 = Prives3;
    }

    public double getMasculins12() {
        return Masculins12;
    }

    public void setMasculins12(double Masculins12) {
        this.Masculins12 = Masculins12;
    }

    public double getFeminins12() {
        return Feminins12;
    }

    public void setFeminins12(double Feminins12) {
        this.Feminins12 = Feminins12;
    }

    public double getGens_de_maison3() {
        return Gens_de_maison3;
    }

    public void setGens_de_maison3(double Gens_de_maison3) {
        this.Gens_de_maison3 = Gens_de_maison3;
    }

    public double getMasculins13() {
        return Masculins13;
    }

    public void setMasculins13(double Masculins13) {
        this.Masculins13 = Masculins13;
    }

    public double getFeminins13() {
        return Feminins13;
    }

    public void setFeminins13(double Feminins13) {
        this.Feminins13 = Feminins13;
    }

    public double getTrav_etrangers3() {
        return Trav_etrangers3;
    }

    public void setTrav_etrangers3(double Trav_etrangers3) {
        this.Trav_etrangers3 = Trav_etrangers3;
    }

    public double getMasculins14() {
        return Masculins14;
    }

    public void setMasculins14(double Masculins14) {
        this.Masculins14 = Masculins14;
    }

    public double getFeminins14() {
        return Feminins14;
    }

    public void setFeminins14(double Feminins14) {
        this.Feminins14 = Feminins14;
    }

    public double getAssur_volontaires3() {
        return Assur_volontaires3;
    }

    public void setAssur_volontaires3(double Assur_volontaires3) {
        this.Assur_volontaires3 = Assur_volontaires3;
    }

    public double getMasculins15() {
        return Masculins15;
    }

    public void setMasculins15(double Masculins15) {
        this.Masculins15 = Masculins15;
    }

    public double getFeminins15() {
        return Feminins15;
    }

    public void setFeminins15(double Feminins15) {
        this.Feminins15 = Feminins15;
    }

    public double getTrav_se_rap_aux_employeurs_ayant_declare() {
        return Trav_se_rap_aux_employeurs_ayant_declare;
    }

    public void setTrav_se_rap_aux_employeurs_ayant_declare(double Trav_se_rap_aux_employeurs_ayant_declare) {
        this.Trav_se_rap_aux_employeurs_ayant_declare = Trav_se_rap_aux_employeurs_ayant_declare;
    }

    public double getPublics_et_assimiles4() {
        return Publics_et_assimiles4;
    }

    public void setPublics_et_assimiles4(double Publics_et_assimiles4) {
        this.Publics_et_assimiles4 = Publics_et_assimiles4;
    }

    public double getMasculins16() {
        return Masculins16;
    }

    public void setMasculins16(double Masculins16) {
        this.Masculins16 = Masculins16;
    }

    public double getFeminins16() {
        return Feminins16;
    }

    public void setFeminins16(double Feminins16) {
        this.Feminins16 = Feminins16;
    }

    public double getPrives4() {
        return Prives4;
    }

    public void setPrives4(double Prives4) {
        this.Prives4 = Prives4;
    }

    public double getMasculins17() {
        return Masculins17;
    }

    public void setMasculins17(double Masculins17) {
        this.Masculins17 = Masculins17;
    }

    public double getFeminins17() {
        return Feminins17;
    }

    public void setFeminins17(double Feminins17) {
        this.Feminins17 = Feminins17;
    }

    public double getGens_de_maison4() {
        return Gens_de_maison4;
    }

    public void setGens_de_maison4(double Gens_de_maison4) {
        this.Gens_de_maison4 = Gens_de_maison4;
    }

    public double getMasculins18() {
        return Masculins18;
    }

    public void setMasculins18(double Masculins18) {
        this.Masculins18 = Masculins18;
    }

    public double getFeminins18() {
        return Feminins18;
    }

    public void setFeminins18(double Feminins18) {
        this.Feminins18 = Feminins18;
    }

    public double getTrav_etrangers4() {
        return Trav_etrangers4;
    }

    public void setTrav_etrangers4(double Trav_etrangers4) {
        this.Trav_etrangers4 = Trav_etrangers4;
    }

    public double getMasculins19() {
        return Masculins19;
    }

    public void setMasculins19(double Masculins19) {
        this.Masculins19 = Masculins19;
    }

    public double getFeminins19() {
        return Feminins19;
    }

    public void setFeminins19(double Feminins19) {
        this.Feminins19 = Feminins19;
    }

    public double getAssur_volontaires4() {
        return Assur_volontaires4;
    }

    public void setAssur_volontaires4(double Assur_volontaires4) {
        this.Assur_volontaires4 = Assur_volontaires4;
    }

    public double getMasculins20() {
        return Masculins20;
    }

    public void setMasculins20(double Masculins20) {
        this.Masculins20 = Masculins20;
    }

    public double getFeminins20() {
        return Feminins20;
    }

    public void setFeminins20(double Feminins20) {
        this.Feminins20 = Feminins20;
    }

    public double getTrav_se_rap_aux_employ_ayant_cotise() {
        return Trav_se_rap_aux_employ_ayant_cotise;
    }

    public void setTrav_se_rap_aux_employ_ayant_cotise(double Trav_se_rap_aux_employ_ayant_cotise) {
        this.Trav_se_rap_aux_employ_ayant_cotise = Trav_se_rap_aux_employ_ayant_cotise;
    }

    public double getPublics_et_assimiles5() {
        return Publics_et_assimiles5;
    }

    public void setPublics_et_assimiles5(double Publics_et_assimiles5) {
        this.Publics_et_assimiles5 = Publics_et_assimiles5;
    }

    public double getMasculins21() {
        return Masculins21;
    }

    public void setMasculins21(double Masculins21) {
        this.Masculins21 = Masculins21;
    }

    public double getFeminins21() {
        return Feminins21;
    }

    public void setFeminins21(double Feminins21) {
        this.Feminins21 = Feminins21;
    }

    public double getPrives5() {
        return Prives5;
    }

    public void setPrives5(double Prives5) {
        this.Prives5 = Prives5;
    }

    public double getMasculins22() {
        return Masculins22;
    }

    public void setMasculins22(double Masculins22) {
        this.Masculins22 = Masculins22;
    }

    public double getFeminins22() {
        return Feminins22;
    }

    public void setFeminins22(double Feminins22) {
        this.Feminins22 = Feminins22;
    }

    public double getGens_de_maison5() {
        return Gens_de_maison5;
    }

    public void setGens_de_maison5(double Gens_de_maison5) {
        this.Gens_de_maison5 = Gens_de_maison5;
    }

    public double getMasculins23() {
        return Masculins23;
    }

    public void setMasculins23(double Masculins23) {
        this.Masculins23 = Masculins23;
    }

    public double getFeminins23() {
        return Feminins23;
    }

    public void setFeminins23(double Feminins23) {
        this.Feminins23 = Feminins23;
    }

    public double getTrav_etrangers5() {
        return Trav_etrangers5;
    }

    public void setTrav_etrangers5(double Trav_etrangers5) {
        this.Trav_etrangers5 = Trav_etrangers5;
    }

    public double getMasculins24() {
        return Masculins24;
    }

    public void setMasculins24(double Masculins24) {
        this.Masculins24 = Masculins24;
    }

    public double getFeminins24() {
        return Feminins24;
    }

    public void setFeminins24(double Feminins24) {
        this.Feminins24 = Feminins24;
    }

    public double getAssur_volontaires5() {
        return Assur_volontaires5;
    }

    public void setAssur_volontaires5(double Assur_volontaires5) {
        this.Assur_volontaires5 = Assur_volontaires5;
    }

    public double getMasculins25() {
        return Masculins25;
    }

    public void setMasculins25(double Masculins25) {
        this.Masculins25 = Masculins25;
    }

    public double getFeminins25() {
        return Feminins25;
    }

    public void setFeminins25(double Feminins25) {
        this.Feminins25 = Feminins25;
    }

    public double getTrav_se_rap_aux_employeurs_en_cessation_d_act() {
        return Trav_se_rap_aux_employeurs_en_cessation_d_act;
    }

    public void setTrav_se_rap_aux_employeurs_en_cessation_d_act(double Trav_se_rap_aux_employeurs_en_cessation_d_act) {
        this.Trav_se_rap_aux_employeurs_en_cessation_d_act = Trav_se_rap_aux_employeurs_en_cessation_d_act;
    }

    public double getPublics_et_assimiles6() {
        return Publics_et_assimiles6;
    }

    public void setPublics_et_assimiles6(double Publics_et_assimiles6) {
        this.Publics_et_assimiles6 = Publics_et_assimiles6;
    }

    public double getMasculins26() {
        return Masculins26;
    }

    public void setMasculins26(double Masculins26) {
        this.Masculins26 = Masculins26;
    }

    public double getFeminins26() {
        return Feminins26;
    }

    public void setFeminins26(double Feminins26) {
        this.Feminins26 = Feminins26;
    }

    public double getPrives6() {
        return Prives6;
    }

    public void setPrives6(double Prives6) {
        this.Prives6 = Prives6;
    }

    public double getMasculins27() {
        return Masculins27;
    }

    public void setMasculins27(double Masculins27) {
        this.Masculins27 = Masculins27;
    }

    public double getFeminins27() {
        return Feminins27;
    }

    public void setFeminins27(double Feminins27) {
        this.Feminins27 = Feminins27;
    }

    public double getGens_de_maison6() {
        return Gens_de_maison6;
    }

    public void setGens_de_maison6(double Gens_de_maison6) {
        this.Gens_de_maison6 = Gens_de_maison6;
    }

    public double getMasculins28() {
        return Masculins28;
    }

    public void setMasculins28(double Masculins28) {
        this.Masculins28 = Masculins28;
    }

    public double getFeminins28() {
        return Feminins28;
    }

    public void setFeminins28(double Feminins28) {
        this.Feminins28 = Feminins28;
    }

    public double getTrav_etrangers6() {
        return Trav_etrangers6;
    }

    public void setTrav_etrangers6(double Trav_etrangers6) {
        this.Trav_etrangers6 = Trav_etrangers6;
    }

    public double getMasculins29() {
        return Masculins29;
    }

    public void setMasculins29(double Masculins29) {
        this.Masculins29 = Masculins29;
    }

    public double getFeminins29() {
        return Feminins29;
    }

    public void setFeminins29(double Feminins29) {
        this.Feminins29 = Feminins29;
    }

    public double getAssur_volontaires6() {
        return Assur_volontaires6;
    }

    public void setAssur_volontaires6(double Assur_volontaires6) {
        this.Assur_volontaires6 = Assur_volontaires6;
    }

    public double getMasculins30() {
        return Masculins30;
    }

    public void setMasculins30(double Masculins30) {
        this.Masculins30 = Masculins30;
    }

    public double getFeminins30() {
        return Feminins30;
    }

    public void setFeminins30(double Feminins30) {
        this.Feminins30 = Feminins30;
    }

    public double getMS_des_remu_soumises_cotisation() {
        return MS_des_remu_soumises_cotisation;
    }

    public void setMS_des_remu_soumises_cotisation(double MS_des_remu_soumises_cotisation) {
        this.MS_des_remu_soumises_cotisation = MS_des_remu_soumises_cotisation;
    }

    public double getMS_Employeurs_du_secteur_public() {
        return MS_Employeurs_du_secteur_public;
    }

    public void setMS_Employeurs_du_secteur_public(double MS_Employeurs_du_secteur_public) {
        this.MS_Employeurs_du_secteur_public = MS_Employeurs_du_secteur_public;
    }

    public double getMS_Employeurs_du_secteur_prive() {
        return MS_Employeurs_du_secteur_prive;
    }

    public void setMS_Employeurs_du_secteur_prive(double MS_Employeurs_du_secteur_prive) {
        this.MS_Employeurs_du_secteur_prive = MS_Employeurs_du_secteur_prive;
    }

    public double getMS_Gens_de_maison() {
        return MS_Gens_de_maison;
    }

    public void setMS_Gens_de_maison(double MS_Gens_de_maison) {
        this.MS_Gens_de_maison = MS_Gens_de_maison;
    }

    public double getMS_Assures_volontaires() {
        return MS_Assures_volontaires;
    }

    public void setMS_Assures_volontaires(double MS_Assures_volontaires) {
        this.MS_Assures_volontaires = MS_Assures_volontaires;
    }

    public double getMS_Travailleurs_etrangers() {
        return MS_Travailleurs_etrangers;
    }

    public void setMS_Travailleurs_etrangers(double MS_Travailleurs_etrangers) {
        this.MS_Travailleurs_etrangers = MS_Travailleurs_etrangers;
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
            req = "INSERT INTO `travailleurs` (`Trav_au_fichier1`, `Publics_et_assimiles1`, `Masculins1`, `Feminins1`, `Prives1`, `Masculins2`, `Feminins2`, `Gens_de_maison1`, `Masculins3`, `Féminins3`, `Trav_etrangers1`, `Masculins4`, `Feminins4`, `Assur_volontaires1`, `Masculins5`, `Feminins5`, `Nouvelles_immatriculations1`, `Publics_et_assimiles2`, `Masculins6`, `Feminins6`, `Prives2`, `Masculins7`, `Feminins7`, `Gens_de_maison2`, `Masculins8`, `Feminins8`, `Trav_etrangers2`, `Masculins9`, `Feminins9`, `Assur_volontaires2`, `Masculins10`, `Feminins10`, `Trav_se_rap_aux_employeurs_actifs`, `Publics_et_assimiles3`, `Masculins11`, `Feminins11`, `Prives3`, `Masculins12`, `Feminins12`, `Gens_de_maison3`, `Masculins13`, `Feminins13`, `Trav_etrangers3`, `Masculins14`, `Feminins14`, `Assur_volontaires3`, `Masculins15`, `Feminins15`, `Trav_se_rap_aux_employeurs_ayant_declare`, `Publics_et_assimiles4`, `Masculins16`, `Feminins16`, `Prives4`, `Masculins17`, `Feminins17`, `Gens_de_maison4`, `Masculins18`, `Feminins18`, `Trav_etrangers4`, `Masculins19`, `Feminins19`, `Assur_volontaires4`, `Masculins20`, `Feminins20`, `Trav_se_rap_aux_employ_ayant_cotise`, `Publics_et_assimiles5`, `Masculins21`, `Feminins21`, `Prives5`, `Masculins22`, `Feminins22`, `Gens_de_maison5`, `Masculins23`, `Feminins23`, `Trav_etrangers5`, `Masculins24`, `Feminins24`, `Assur_volontaires5`, `Masculins25`, `Feminins25`, `Trav_se_rap_aux_employeurs_en_cessation_d_act`, `Publics_et_assimiles6`, `Masculins26`, `Feminins26`, `Prives6`, `Masculins27`, `Feminins27`, `Gens_de_maison6`, `Masculins28`, `Feminins28`, `Trav_etrangers6`, `Masculins29`, `Feminins29`, `Assur_volontaires6`, `Masculins30`, `Feminins30`, `MS_des_remu_soumises_cotisation`, `MS_Employeurs_du_secteur_public`, `MS_Employeurs_du_secteur_prive`, `MS_Gens_de_maison`, `MS_Assures_volontaires`, `MS_Travailleurs_etrangers`, `mois`, `annee`, `Code_centre`, `Matricule`) VALUES ( '" + getTrav_au_fichier1() + "', '" + getPublics_et_assimiles1() + "', '" + getMasculins1() + "', '" + getFeminins1() + "', '" + getPrives1() + "', '" + getMasculins2() + "', '" + getFeminins2() + "', '" + getGens_de_maison1() + "', '" + getMasculins3() + "', '" + getFéminins3() + "', '" + getTrav_etrangers1() + "', '" + getMasculins4() + "', '" + getFeminins4() + "', '" + getAssur_volontaires1() + "', '" + getMasculins5() + "', '" + getFeminins5() + "', '" + getNouvelles_immatriculations1() + "', '" + getPublics_et_assimiles2() + "', '" + getMasculins6() + "', '" + getFeminins6() + "', '" + getPrives2() + "', '" + getMasculins7() + "', '" + getFeminins7() + "', '" + getGens_de_maison2() + "', '" + getMasculins8() + "', '" + getFeminins8() + "', '" + getTrav_etrangers2() + "', '" + getMasculins9() + "', '" + getFeminins9() + "', '" + getAssur_volontaires2() + "', '" + getMasculins10() + "', '" + getFeminins10() + "', '" + getTrav_se_rap_aux_employeurs_actifs() + "', '" + getPublics_et_assimiles3() + "', '" + getMasculins11() + "', '" + getFeminins11() + "', '" + getPrives3() + "', '" + getMasculins12() + "', '" + getFeminins12() + "', '" + getGens_de_maison3() + "', '" + getMasculins13() + "', '" + getFeminins13() + "', '" + getTrav_etrangers3() + "', '" + getMasculins14() + "', '" + getFeminins14() + "', '" + getAssur_volontaires3() + "', '" + getMasculins15() + "', '" + getFeminins15() + "', '" + getTrav_se_rap_aux_employeurs_ayant_declare() + "', '" + getPublics_et_assimiles4() + "', '" + getMasculins16() + "', '" + getFeminins16() + "', '" + getPrives4() + "', '" + getMasculins17() + "', '" + getFeminins17() + "', '" + getGens_de_maison4() + "', '" + getMasculins18() + "', '" + getFeminins18() + "', '" + getTrav_etrangers4() + "', '" + getMasculins19() + "', '" + getFeminins19() + "', '" + getAssur_volontaires4() + "', '" + getMasculins20() + "', '" + getFeminins20() + "', '" + getTrav_se_rap_aux_employ_ayant_cotise() + "', '" + getPublics_et_assimiles5() + "', '" + getMasculins21() + "', '" + getFeminins21() + "', '" + getPrives5() + "', '" + getMasculins22() + "', '" + getFeminins22() + "', '" + getGens_de_maison5() + "', '" + getMasculins23() + "', '" + getFeminins23() + "', '" + getTrav_etrangers5() + "', '" + getMasculins24() + "', '" + getFeminins24() + "', '" + getAssur_volontaires5() + "', '" + getMasculins25() + "', '" + getFeminins25() + "', '" + getTrav_se_rap_aux_employeurs_en_cessation_d_act() + "', '" + getPublics_et_assimiles6() + "', '" + getMasculins26() + "', '" + getFeminins26() + "', '" + getPrives6() + "', '" + getMasculins27() + "', '" + getFeminins27() + "', '" + getGens_de_maison6() + "', '" + getMasculins28() + "', '" + getFeminins28() + "', '" + getTrav_etrangers6() + "', '" + getMasculins29() + "', '" + getFeminins29() + "', '" + getAssur_volontaires6() + "', '" + getMasculins30() + "', '" + getFeminins30() + "', '" + getMS_des_remu_soumises_cotisation() + "', '" + getMS_Employeurs_du_secteur_public() + "', '" + getMS_Employeurs_du_secteur_prive() + "', '" + getMS_Gens_de_maison() + "', '" + getMS_Assures_volontaires() + "', '" + getMS_Travailleurs_etrangers() + "', '" + getMois() + "', '" + getAnnee()+ "', '" + getCode_centre() + "', '" + getMatricule() + "');";
            co.Execution_requete(req);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur dans la classe insertion" + e.getMessage());
        }
    }

    public void modifier() {
        try {
            String req;
            //req="UPDATE `travailleurs` SET `Trav_au_fichier1` = '100', `Publics_et_assimiles1` = '20', `Masculins1` = '10', `Feminins1` = '10', `Prives1` = '2', `Masculins2` = '1', `Feminins2` = '1', `Gens_de_maison1` = '2', `Masculins3` = '1', `Féminins3` = '1', `Trav_etrangers1` = '2', `Masculins4` = '1', `Feminins4` = '1', `Assur_volontaires1` = '2', `Masculins5` = '1', `Feminins5` = '1', `Nouvelles_immatriculations1` = '200', `Publics_et_assimiles2` = '40', `Masculins6` = '20', `Feminins6` = '20', `Prives2` = '4', `Masculins7` = '2', `Feminins7` = '2', `Gens_de_maison2` = '4', `Masculins8` = '2', `Feminins8` = '2', `Trav_etrangers2` = '4', `Masculins9` = '2', `Feminins9` = '2', `Assur_volontaires2` = '4', `Masculins10` = '2', `Feminins10` = '2', `Trav_se_rap_aux_employeurs_actifs` = '300', `Publics_et_assimiles3` = '60', `Masculins11` = '30', `Feminins11` = '30', `Prives3` = '6', `Masculins12` = '3', `Feminins12` = '3', `Gens_de_maison3` = '6', `Masculins13` = '3', `Feminins13` = '3', `Trav_etrangers3` = '6', `Masculins14` = '3', `Feminins14` = '3', `Assur_volontaires3` = '60', `Masculins15` = '30', `Feminins15` = '30', `Trav_se_rap_aux_employeurs_ayant_declare` = '400', `Publics_et_assimiles4` = '8', `Masculins16` = '4', `Feminins16` = '4', `Prives4` = '80', `Masculins17` = '40', `Feminins17` = '40', `Gens_de_maison4` = '8', `Masculins18` = '4', `Feminins18` = '4', `Trav_etrangers4` = '80', `Masculins19` = '40', `Feminins19` = '40', `Assur_volontaires4` = '80', `Masculins20` = '4', `Feminins20` = '40', `Trav_se_rap_aux_employ_ayant_cotise` = '52', `Publics_et_assimiles5` = '10', `Masculins21` = '5', `Feminins21` = '5', `Prives5` = '10', `Masculins22` = '5', `Feminins22` = '5', `Gens_de_maison5` = '10', `Masculins23` = '5', `Feminins23` = '5', `Trav_etrangers5` = '10', `Masculins24` = '5', `Feminins24` = '5', `Assur_volontaires5` = '12', `Masculins25` = '6', `Feminins25` = '6', `Trav_se_rap_aux_employeurs_en_cessation_d_act` = '601', `Publics_et_assimiles6` = '12', `Masculins26` = '6', `Feminins26` = '6', `Prives6` = '120', `Masculins27` = '6', `Feminins27` = '60', `Gens_de_maison6` = '120', `Masculins28` = '60', `Feminins28` = '60', `Trav_etrangers6` = '120', `Masculins29` = '60', `Feminins29` = '60', `Assur_volontaires6` = '120', `Masculins30` = '60', `Feminins30` = '60', `MS_des_remu_soumises_cotisation` = '15', `MS_Employeurs_du_secteur_public` = '1', `MS_Employeurs_du_secteur_prive` = '20', `MS_Gens_de_maison` = '30', `MS_Assures_volontaires` = '40', `MS_Travailleurs_etrangers` = '50', `mois` = 'Fevrier', `Code_centre` = 'codeKin' WHERE `travailleurs`.`Id_travailleurs` = 1;";
            req = "UPDATE `travailleurs` SET `Trav_au_fichier1`= '" + getTrav_au_fichier1() + "', `Publics_et_assimiles1`= '" + getPublics_et_assimiles1() + "', `Masculins1`= '" + getMasculins1() + "', `Feminins1`= '" + getFeminins1() + "', `Prives1`= '" + getPrives1() + "', `Masculins2`= '" + getMasculins2() + "', `Feminins2`= '" + getFeminins2() + "', `Gens_de_maison1`= '" + getGens_de_maison1() + "', `Masculins3`= '" + getMasculins3() + "', `Féminins3`= '" + getFéminins3() + "', `Trav_etrangers1`= '" + getTrav_etrangers1() + "', `Masculins4`= '" + getMasculins4() + "', `Feminins4`= '" + getFeminins4() + "', `Assur_volontaires1`= '" + getAssur_volontaires1() + "', `Masculins5`= '" + getMasculins5() + "', `Feminins5`= '" + getFeminins5() + "', `Nouvelles_immatriculations1`= '" + getNouvelles_immatriculations1() + "', `Publics_et_assimiles2`= '" + getPublics_et_assimiles2() + "', `Masculins6`= '" + getMasculins6() + "', `Feminins6`= '" + getFeminins6() + "', `Prives2`= '" + getPrives2() + "', `Masculins7`= '" + getMasculins7() + "', `Feminins7`= '" + getFeminins7() + "', `Gens_de_maison2`= '" + getGens_de_maison2() + "', `Masculins8`= '" + getMasculins8() + "', `Feminins8`= '" + getFeminins8() + "', `Trav_etrangers2`= '" + getTrav_etrangers2() + "', `Masculins9`= '" + getMasculins9() + "', `Feminins9`= '" + getFeminins9() + "', `Assur_volontaires2`= '" + getAssur_volontaires2() + "', `Masculins10`= '" + getMasculins10() + "', `Feminins10`= '" + getFeminins10() + "', `Trav_se_rap_aux_employeurs_actifs`= '" + getTrav_se_rap_aux_employeurs_actifs() + "', `Publics_et_assimiles3`= '" + getPublics_et_assimiles3() + "', `Masculins11`= '" + getMasculins11() + "', `Feminins11`= '" + getFeminins11() + "', `Prives3`= '" + getPrives3() + "', `Masculins12`= '" + getMasculins12() + "', `Feminins12`= '" + getFeminins12() + "', `Gens_de_maison3`= '" + getGens_de_maison3() + "', `Masculins13`= '" + getMasculins13() + "', `Feminins13`= '" + getFeminins13() + "', `Trav_etrangers3`= '" + getTrav_etrangers3() + "', `Masculins14`= '" + getMasculins14() + "', `Feminins14`= '" + getFeminins14() + "', `Assur_volontaires3`= '" + getAssur_volontaires3() + "', `Masculins15`= '" + getMasculins15() + "', `Feminins15`= '" + getFeminins15() + "', `Trav_se_rap_aux_employeurs_ayant_declare`= '" + getTrav_se_rap_aux_employeurs_ayant_declare() + "', `Publics_et_assimiles4`= '" + getPublics_et_assimiles4() + "', `Masculins16`= '" + getMasculins16() + "', `Feminins16`= '" + getFeminins16() + "', `Prives4`= '" + getPrives4() + "', `Masculins17`= '" + getMasculins17() + "', `Feminins17`= '" + getFeminins17() + "', `Gens_de_maison4`= '" + getGens_de_maison4() + "', `Masculins18`= '" + getMasculins18() + "', `Feminins18`= '" + getFeminins18() + "', `Trav_etrangers4`= '" + getTrav_etrangers4() + "', `Masculins19`= '" + getMasculins19() + "', `Feminins19`= '" + getFeminins19() + "', `Assur_volontaires4`= '" + getAssur_volontaires4() + "', `Masculins20`= '" + getMasculins20() + "', `Feminins20`= '" + getFeminins20() + "', `Trav_se_rap_aux_employ_ayant_cotise`= '" + getTrav_se_rap_aux_employ_ayant_cotise() + "', `Publics_et_assimiles5`= '" + getPublics_et_assimiles5() + "', `Masculins21`= '" + getMasculins21() + "', `Feminins21`= '" + getFeminins21() + "', `Prives5`= '" + getPrives5() + "', `Masculins22`= '" + getMasculins22() + "', `Feminins22`= '" + getFeminins22() + "', `Gens_de_maison5`= '" + getGens_de_maison5() + "', `Masculins23`= '" + getMasculins23() + "', `Feminins23`= '" + getFeminins23() + "', `Trav_etrangers5`= '" + getTrav_etrangers5() + "', `Masculins24`= '" + getMasculins24() + "', `Feminins24`= '" + getFeminins24() + "', `Assur_volontaires5`= '" + getAssur_volontaires5() + "', `Masculins25`= '" + getMasculins25() + "', `Feminins25`= '" + getFeminins25() + "', `Trav_se_rap_aux_employeurs_en_cessation_d_act`= '" + getTrav_se_rap_aux_employeurs_en_cessation_d_act() + "', `Publics_et_assimiles6`= '" + getPublics_et_assimiles6() + "', `Masculins26`= '" + getMasculins26() + "', `Feminins26`= '" + getFeminins26() + "', `Prives6`= '" + getPrives6() + "', `Masculins27`= '" + getMasculins27() + "', `Feminins27`= '" + getFeminins27() + "', `Gens_de_maison6`= '" + getGens_de_maison6() + "', `Masculins28`= '" + getMasculins28() + "', `Feminins28`= '" + getFeminins28() + "', `Trav_etrangers6`= '" + getTrav_etrangers6() + "', `Masculins29`= '" + getMasculins29() + "', `Feminins29`= '" + getFeminins29() + "', `Assur_volontaires6`= '" + getAssur_volontaires6() + "', `Masculins30`= '" + getMasculins30() + "', `Feminins30`= '" + getFeminins30() + "', `MS_des_remu_soumises_cotisation`= '" + getMS_des_remu_soumises_cotisation() + "', `MS_Employeurs_du_secteur_public`= '" + getMS_Employeurs_du_secteur_public() + "', `MS_Employeurs_du_secteur_prive`= '" + getMS_Employeurs_du_secteur_prive() + "', `MS_Gens_de_maison`= '" + getMS_Gens_de_maison() + "', `MS_Assures_volontaires`= '" + getMS_Assures_volontaires() + "', `MS_Travailleurs_etrangers`= '" + getMS_Travailleurs_etrangers() + "', `mois`= '" + getMois() + "', `annee`= '" + getAnnee()+ "', `Code_centre`= '" + getCode_centre() + "', `Matricule`= '" + getMatricule() + "' WHERE `travailleurs`.`Id_travailleurs` = " + getId_travailleurs() + ";";
            co.Execution_requete(req);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur dans la modification" + e.getMessage());
        }
    }

    public void supprimer() {
        try {
            String req;
            req = "Delete from travailleurs where id_travailleurs='" + getId_travailleurs() + "'";
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
            Object donnee[][] = new Object[c][106];
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
                donnee[c][64] = co.resultat.getString(65);
                donnee[c][65] = co.resultat.getString(66);
                donnee[c][66] = co.resultat.getString(67);
                donnee[c][67] = co.resultat.getString(68);
                donnee[c][68] = co.resultat.getString(69);
                donnee[c][69] = co.resultat.getString(70);
                donnee[c][70] = co.resultat.getString(71);
                donnee[c][71] = co.resultat.getString(72);
                donnee[c][72] = co.resultat.getString(73);
                donnee[c][73] = co.resultat.getString(74);
                donnee[c][74] = co.resultat.getString(75);
                donnee[c][75] = co.resultat.getString(76);
                donnee[c][76] = co.resultat.getString(77);
                donnee[c][77] = co.resultat.getString(78);
                donnee[c][78] = co.resultat.getString(79);
                donnee[c][79] = co.resultat.getString(80);
                donnee[c][80] = co.resultat.getString(81);
                donnee[c][81] = co.resultat.getString(82);
                donnee[c][82] = co.resultat.getString(83);
                donnee[c][83] = co.resultat.getString(84);
                donnee[c][84] = co.resultat.getString(85);
                donnee[c][85] = co.resultat.getString(86);
                donnee[c][86] = co.resultat.getString(87);
                donnee[c][87] = co.resultat.getString(88);
                donnee[c][88] = co.resultat.getString(89);
                donnee[c][89] = co.resultat.getString(90);
                donnee[c][90] = co.resultat.getString(91);
                donnee[c][91] = co.resultat.getString(92);
                donnee[c][92] = co.resultat.getString(93);
                donnee[c][93] = co.resultat.getString(94);
                donnee[c][94] = co.resultat.getString(95);
                donnee[c][95] = co.resultat.getString(96);
                donnee[c][96] = co.resultat.getString(97);
                donnee[c][97] = co.resultat.getString(98);
                donnee[c][98] = co.resultat.getString(99);
                donnee[c][99] = co.resultat.getString(100);
                donnee[c][100] = co.resultat.getString(101);
                donnee[c][101] = co.resultat.getString(102);
                donnee[c][102] = co.resultat.getString(103);
                donnee[c][103] = co.resultat.getString(104);
                donnee[c][104] = co.resultat.getString(105);
                donnee[c][105] = co.resultat.getString(106);
                c++;
            }
            String titre[] = {"Id Travailleurs", "Trav au Fichier", "Publics et Assimiles", "Masculins", "Feminins", "Prives", "Masculins", "Feminins", "Gens de maison", "Masculins", "Féminins", "Trav etrangers1", "Masculins", "Feminins", "Assur volontaires1", "Masculins5", "Feminins", "Nouvelles Immatriculations", "Publics et Assimiles", "Masculins", "Feminins", "Prives", "Masculins", "Feminins", "Gens de maison", "Masculins", "Feminins", "Trav  etrangers", "Masculins", "Feminins", "Assur Volontaires", "Masculins", "Feminins", "Trav se rap aux employeurs actifs", "Publics et assimiles", "Masculins", "Feminins", "Prives", "Masculins", "Feminins", "Gens de maison", "Masculins", "Feminins", "Trav etrangers", "Masculins", "Feminins", "Assur volontaires", "Masculins", "Feminins", "Trav se rap aux employeurs ayant declare", "Publics et assimiles", "Masculins", "Feminins", "Prives", "Masculins", "Feminins", "Gens de maison", "Masculins", "Feminins", "Trav etrangers", "Masculins", "Feminins", "Assur volontaires", "Masculins", "Feminins", "Trav se rap aux employ ayant cotise", "Publics et assimiles", "Masculins", "Feminins", "Prives", "Masculins", "Feminins", "Gens de maison", "Masculins", "Feminins", "Trav etrangers", "Masculins", "Feminins", "Assur volontaires", "Masculins", "Feminins", "Trav se rap aux employeurs en cessation act", "Publics et assimiles6", "Masculins", "Feminins", "Prives", "Masculins", "Feminins", "Gens de maison", "Masculins", "Feminins", "Trav etrangers", "Masculins", "Feminins", "Assur volontaires", "Masculins", "Feminins", "MS des remu soumises cotisation", "MS Employeurs du secteur public", "MS Employeurs du secteur prive", "MS Gens de maison", "MS Assures volontaires", "MS Travailleurs etrangers", "Mois","Année", "Centre de Gestion"};
            jt.setModel(new DefaultTableModel(donnee, titre));

            jt.getColumnModel().getColumn(0).setPreferredWidth(300);
            jt.getColumnModel().getColumn(1).setPreferredWidth(300);
            jt.getColumnModel().getColumn(2).setPreferredWidth(300);
            jt.getColumnModel().getColumn(3).setPreferredWidth(300);
            jt.getColumnModel().getColumn(4).setPreferredWidth(300);
            jt.getColumnModel().getColumn(5).setPreferredWidth(300);
            jt.getColumnModel().getColumn(6).setPreferredWidth(300);
            jt.getColumnModel().getColumn(7).setPreferredWidth(300);
            jt.getColumnModel().getColumn(8).setPreferredWidth(300);
            jt.getColumnModel().getColumn(9).setPreferredWidth(300);
            jt.getColumnModel().getColumn(10).setPreferredWidth(300);
            jt.getColumnModel().getColumn(11).setPreferredWidth(300);
            jt.getColumnModel().getColumn(12).setPreferredWidth(300);
            jt.getColumnModel().getColumn(13).setPreferredWidth(300);
            jt.getColumnModel().getColumn(14).setPreferredWidth(300);
            jt.getColumnModel().getColumn(15).setPreferredWidth(300);
            jt.getColumnModel().getColumn(16).setPreferredWidth(300);
            jt.getColumnModel().getColumn(17).setPreferredWidth(300);
            jt.getColumnModel().getColumn(18).setPreferredWidth(300);
            jt.getColumnModel().getColumn(19).setPreferredWidth(300);
            jt.getColumnModel().getColumn(20).setPreferredWidth(300);
            jt.getColumnModel().getColumn(21).setPreferredWidth(300);
            jt.getColumnModel().getColumn(22).setPreferredWidth(300);
            jt.getColumnModel().getColumn(23).setPreferredWidth(300);
            jt.getColumnModel().getColumn(24).setPreferredWidth(300);
            jt.getColumnModel().getColumn(25).setPreferredWidth(300);
            jt.getColumnModel().getColumn(26).setPreferredWidth(300);
            jt.getColumnModel().getColumn(27).setPreferredWidth(300);
            jt.getColumnModel().getColumn(28).setPreferredWidth(300);
            jt.getColumnModel().getColumn(29).setPreferredWidth(300);
            jt.getColumnModel().getColumn(30).setPreferredWidth(300);
            jt.getColumnModel().getColumn(31).setPreferredWidth(300);
            jt.getColumnModel().getColumn(32).setPreferredWidth(300);
            jt.getColumnModel().getColumn(33).setPreferredWidth(300);
            jt.getColumnModel().getColumn(34).setPreferredWidth(300);
            jt.getColumnModel().getColumn(35).setPreferredWidth(300);
            jt.getColumnModel().getColumn(36).setPreferredWidth(300);
            jt.getColumnModel().getColumn(37).setPreferredWidth(300);
            jt.getColumnModel().getColumn(38).setPreferredWidth(300);
            jt.getColumnModel().getColumn(39).setPreferredWidth(300);
            jt.getColumnModel().getColumn(40).setPreferredWidth(300);
            jt.getColumnModel().getColumn(41).setPreferredWidth(300);
            jt.getColumnModel().getColumn(42).setPreferredWidth(300);
            jt.getColumnModel().getColumn(43).setPreferredWidth(300);
            jt.getColumnModel().getColumn(44).setPreferredWidth(300);
            jt.getColumnModel().getColumn(45).setPreferredWidth(300);
            jt.getColumnModel().getColumn(46).setPreferredWidth(300);
            jt.getColumnModel().getColumn(47).setPreferredWidth(300);
            jt.getColumnModel().getColumn(48).setPreferredWidth(300);
            jt.getColumnModel().getColumn(49).setPreferredWidth(300);
            jt.getColumnModel().getColumn(50).setPreferredWidth(300);
            jt.getColumnModel().getColumn(51).setPreferredWidth(300);
            jt.getColumnModel().getColumn(52).setPreferredWidth(300);
            jt.getColumnModel().getColumn(53).setPreferredWidth(300);
            jt.getColumnModel().getColumn(54).setPreferredWidth(300);
            jt.getColumnModel().getColumn(55).setPreferredWidth(300);
            jt.getColumnModel().getColumn(56).setPreferredWidth(300);
            jt.getColumnModel().getColumn(57).setPreferredWidth(300);
            jt.getColumnModel().getColumn(58).setPreferredWidth(300);
            jt.getColumnModel().getColumn(59).setPreferredWidth(300);
            jt.getColumnModel().getColumn(60).setPreferredWidth(300);
            jt.getColumnModel().getColumn(61).setPreferredWidth(300);
            jt.getColumnModel().getColumn(62).setPreferredWidth(300);
            jt.getColumnModel().getColumn(63).setPreferredWidth(300);
            jt.getColumnModel().getColumn(64).setPreferredWidth(300);
            jt.getColumnModel().getColumn(65).setPreferredWidth(300);
            jt.getColumnModel().getColumn(66).setPreferredWidth(300);
            jt.getColumnModel().getColumn(67).setPreferredWidth(300);
            jt.getColumnModel().getColumn(68).setPreferredWidth(300);
            jt.getColumnModel().getColumn(69).setPreferredWidth(300);
            jt.getColumnModel().getColumn(70).setPreferredWidth(300);
            jt.getColumnModel().getColumn(71).setPreferredWidth(300);
            jt.getColumnModel().getColumn(72).setPreferredWidth(300);
            jt.getColumnModel().getColumn(73).setPreferredWidth(300);
            jt.getColumnModel().getColumn(74).setPreferredWidth(300);
            jt.getColumnModel().getColumn(75).setPreferredWidth(300);
            jt.getColumnModel().getColumn(76).setPreferredWidth(300);
            jt.getColumnModel().getColumn(77).setPreferredWidth(300);
            jt.getColumnModel().getColumn(78).setPreferredWidth(300);
            jt.getColumnModel().getColumn(79).setPreferredWidth(300);
            jt.getColumnModel().getColumn(80).setPreferredWidth(300);
            jt.getColumnModel().getColumn(81).setPreferredWidth(300);
            jt.getColumnModel().getColumn(82).setPreferredWidth(300);
            jt.getColumnModel().getColumn(83).setPreferredWidth(300);
            jt.getColumnModel().getColumn(84).setPreferredWidth(300);
            jt.getColumnModel().getColumn(85).setPreferredWidth(300);
            jt.getColumnModel().getColumn(86).setPreferredWidth(300);
            jt.getColumnModel().getColumn(87).setPreferredWidth(300);
            jt.getColumnModel().getColumn(88).setPreferredWidth(300);
            jt.getColumnModel().getColumn(89).setPreferredWidth(300);
            jt.getColumnModel().getColumn(90).setPreferredWidth(300);
            jt.getColumnModel().getColumn(91).setPreferredWidth(300);
            jt.getColumnModel().getColumn(92).setPreferredWidth(300);
            jt.getColumnModel().getColumn(93).setPreferredWidth(300);
            jt.getColumnModel().getColumn(94).setPreferredWidth(300);
            jt.getColumnModel().getColumn(95).setPreferredWidth(300);
            jt.getColumnModel().getColumn(96).setPreferredWidth(300);
            jt.getColumnModel().getColumn(97).setPreferredWidth(300);
            jt.getColumnModel().getColumn(98).setPreferredWidth(300);
            jt.getColumnModel().getColumn(99).setPreferredWidth(300);
            jt.getColumnModel().getColumn(100).setPreferredWidth(300);
            jt.getColumnModel().getColumn(101).setPreferredWidth(300);
            jt.getColumnModel().getColumn(102).setPreferredWidth(300);
            jt.getColumnModel().getColumn(103).setPreferredWidth(300);
            jt.getColumnModel().getColumn(104).setPreferredWidth(300);
            jt.getColumnModel().getColumn(105).setPreferredWidth(300);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur dans la classe remplisage" + e.getMessage());
        }
    }

    public void charger(JComboBox cbo) {
        try {
            String req = "SELECT id_travailleurs FROM travailleurs ORDER BY id_travailleurs DESC";
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
