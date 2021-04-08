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
public class Lingkaran extends BangunDatar {
    public void Luas(int a) {
        luas = 3.14 * a * a;
        System.out.println("Menghitung Luas Lingkaran");
        System.out.println("Panjang jari-jari   : "+a+" cm");
        System.out.println("Hasil luasnya adalah: "+luas+" cm²");
    }
}
