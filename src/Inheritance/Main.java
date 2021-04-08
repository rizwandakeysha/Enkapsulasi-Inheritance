/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;
import java.util.Scanner;
/**
 *
 * @author rizwa
 */
public class Main {
    public static void main(String[] args) {
        Scanner luas = new Scanner(System.in);
        int menu;
        int pilih;
        
        System.out.println("Program Menghitung Luas Bangun Datar");
        System.out.println("Pilihan Bangun Datar: \n 1. Persegi \n 2. Lingkaran \n 3. Segitiga \n");
        System.out.print("Masukkan pilihan: ");
        pilih = luas.nextInt();
        System.out.println("=================");
        System.out.println("");
        switch(pilih){
            case 1: 
                Persegi luas1 = new Persegi();
                luas1.Luas(7);
            break;
            case 2:
                Lingkaran luas2 = new Lingkaran();
                luas2.Luas(7);
            break;
            case 3:
                PersegiPanjang luas3 = new PersegiPanjang();
                luas3.Luas(9, 7);
            break;
            default:
            System.out.println("Maaf, masih belum ada bangun datar lain, terima kasih.");
        }
    }
}
