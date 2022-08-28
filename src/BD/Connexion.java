/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author KATALA
 */
public class Connexion {
   
     //parametres du serveur
    public static Connection connec = null;
    public static String ip = "localhost";
    public static String port = "3306";
    public static String db = "deostatbd";
    public static String user = "root";
    public static String pwd = "";
    public static String mess = "";
    public static String url;// = "jdbc:mysql://"+ip+":"+port+"/"+db;

    //parametre de l'utilisateur
    public static String agents = "";
    public static String pats = "";
    public static String message = "";

    public Statement etatRec;
    public ResultSet resultat;

    public Connexion() {
        try {
            CONNEXION();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur d'ouverture de la connection" + e.getMessage());
        }
    }

    public static String remplir(String ipa, String porta, String dbs, String us, String ps) {
        ip = ipa;
        port = porta;
        user = us;
        pwd = ps;
        db = dbs;
        CONNEXION();
        return mess;
    }

    static Boolean CONNEXION() {
        url = "jdbc:mysql://" + ip + ":" + port + "/" + db;
        Boolean res = true;
        try {
            connec = DriverManager.getConnection(url, user, pwd);
            mess = "Connexion effectuée!!";

        } catch (Exception ex) {
            res = false;
            JOptionPane.showMessageDialog(null, "Problème de connexion au serveur\n" + ex.getMessage(), "\nErreur de Connexion au serveur des données", 1);
            mess = ex.getMessage();
        }
        return res;
        //System.out.println(url); 
    }


    public void Execution_requete(String req) {
        try {
            int text;
            etatRec = connec.createStatement();
            text = etatRec.executeUpdate(req);
            if (text == 1) {
                JOptionPane.showMessageDialog(null, "l'operation effectuée");
            } else {
                JOptionPane.showMessageDialog(null, "echec d'operation");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur dans l'execution" + e.getMessage());
        }
    }

    public void selection(String req) {
        try {
            etatRec = connec.createStatement();
            resultat = etatRec.executeQuery(req);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur dans la selection" + e.getMessage());
        }
    }

    public Connection con() {
        return connec;
    }

}
