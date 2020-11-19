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
public class Tabung extends BangunRuang{
       public int tinggi;

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    

    public int getJariJari() {
        return jariJari;
    }

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }
       
       
    @Override
    public double Volume() {
        return Math.PI * Math.pow(jariJari, 2)*tinggi;
    }
    
    
}
