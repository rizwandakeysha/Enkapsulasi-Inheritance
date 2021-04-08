/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enkapsulasi;

/**
 *
 * @author rizwa
 */
public class LingkaranPublic {
    public double r;
    public double luas;
    
    public void LingkaranPublic(int r) {
        this.r = r;
    }
    public double r() {
        return r;
    } 
    public double Luas() {
        luas = 3.14 * r * r;
        System.out.println("Menghitung Luas Lingkaran");
        System.out.println("Jari-jari           : "+r+" cm");
        System.out.println("Hasil luasnya adalah: "+luas+" cm²");
        return luas;
    }
}
