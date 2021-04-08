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
public class LingkaranPrivate {
    private double r;
    private double luas;
    
    private void LingkaranPublic(int r) {
        this.r = r;
    }
    private double r() {
        return r;
    } 
    private double Luas() {
        luas = 3.14 * r * r;
        System.out.println("Menghitung Luas Lingkaran");
        System.out.println("Jari-jari           : "+r+" cm");
        System.out.println("Hasil luasnya adalah: "+luas+" cm²");
        return luas;
    }
    public static void main(String[] args) {
        LingkaranPublic luas = new LingkaranPublic();
        luas.LingkaranPublic(7);
        luas.Luas();
    }
}

