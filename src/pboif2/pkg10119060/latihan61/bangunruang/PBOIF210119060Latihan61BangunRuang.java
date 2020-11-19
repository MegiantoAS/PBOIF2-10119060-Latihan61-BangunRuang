/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan61.bangunruang;

/**
 *
 * @author asus
 */
public class PBOIF210119060Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola objBola = new Bola();
        objBola.setJariJari(7);
        System.out.println("Jari-jari Bola = "+objBola.getjariJari()+" cm");
        System.out.printf("Volume Bola =  %.1f cm^3 \n",objBola.Volume());
        System.out.println("");
        
        Tabung objTabung = new Tabung();
        objTabung.setJariJari(10); 
        objTabung.setTinggi(21);
        System.out.println("jari - jari Tabung = "+objTabung.getJariJari()+" cm");
        System.out.println("Tinggi tabung = "+objTabung.getTinggi()+" cm");
        System.out.printf("Volume Tabung = %.1f cm^3 \n",objTabung.Volume());
        System.out.println("");
        
        Kerucut objKerucut = new Kerucut();
        objKerucut.setJariJari(14);
        objKerucut.setTinggi(9);
        System.out.println("Jari - Jari Tabung = "+objKerucut.getjariJari()+" cm");
        System.out.println("Tinggi Kerucut = "+objKerucut.getTinggi()+" cm");
        System.out.printf("Volome Kerucut = %.1f cm^3 \n",objKerucut.Volume());
    }
    
}
