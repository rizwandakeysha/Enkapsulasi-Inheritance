/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author rizwa
 */
public class Persegi extends BangunDatar {
    public void Luas(int a) {
        luas = a * a;
        System.out.println("Menghitung Luas Persegi");
        System.out.println("Panjang sisi        : "+a+" cm");
        System.out.println("Hasil luasnya adalah: "+luas+" cm²");
    }
}
