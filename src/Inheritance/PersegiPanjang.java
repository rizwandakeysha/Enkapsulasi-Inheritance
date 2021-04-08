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
public class PersegiPanjang extends BangunDatar {
    public void Luas(int a, int b) {
        luas = a * b;
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.println("Panjang             : "+a+" cm");
        System.out.println("Lebar               : "+b+" cm");
        System.out.println("Hasil luasnya adalah: "+luas+" cm²");
    }
}
