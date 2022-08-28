/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deostat;

import INTERFACE.AUTHENT;
import INTERFACE.AVANT;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author KATALA
 */
public class DeoStat {

    /**
     * @param args the command line arguments
     */
    public static AVANT av = new AVANT();
    public static AUTHENT at = new AUTHENT();

    public static void main(String[] args) {
        // TODO code application logic here
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int h = Toolkit.getDefaultToolkit().getScreenInsets(new JFrame().getGraphicsConfiguration()).bottom;
        Dimension dima = new Dimension(dim.width, dim.height - h);
        System.out.println(dim);
        System.out.println(dima);
        av.setVisible(true);
    }

}
