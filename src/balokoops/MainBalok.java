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
public class MainBalok extends NewBalok{
    public static void main(String args[]) {
        NewBalok newbalok = new NewBalok();
        Scanner input = new Scanner(System.in);
        System.out.println("Perhitungan Balok");
        System.out.println("Masukkan Panjang : ");
        newbalok.setPanjang(input.nextDouble());
        System.out.println("Masukkan Lebar : ");
        newbalok.setLebar(input.nextDouble());
        System.out.println("Masukkan Tinggi : ");
        newbalok.setTinggi(input.nextDouble());
        System.out.println("Luas Balok : " +newbalok.countluas());
        System.out.println("Keliling Balok : " +newbalok.countkeliling());
        System.out.println("Volume Balok : " +newbalok.countvolume());
    }
    
}
