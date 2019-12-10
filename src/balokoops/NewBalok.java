/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balokoops;

import java.util.Scanner;

/**
 *
 * @author ROBBY
 */
public class NewBalok {

    
    private double panjang,lebar,tinggi;
    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double countkeliling() {
        double keliling;
        keliling = 4*(panjang+lebar+tinggi);
        return keliling;
    }
    
    public double countvolume() {
        double volume;
        volume = panjang*lebar*tinggi;
        return volume;
    }
    
    public double countluas(){
        double luas;
        luas = ((2 * (panjang * lebar)) + (2 * (panjang * tinggi)) + (2 * (lebar * tinggi)));
        return luas;
    }
}
