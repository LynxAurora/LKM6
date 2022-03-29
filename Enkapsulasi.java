/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lkm6;

/**
 *
 * @author ACER
 */
//Isti Nur Azizah
//NIM : 2008096041
//TI 4B
import java.util.Scanner;
public class Enkapsulasi {
    private int angka;

    /**
     * @param value
     */
    public Enkapsulasi (int value ) {
        this.angka = value;
    }


    void input () {
        Scanner Enkapsulasi = new Scanner (System.in);
        System.out.print ("Masukkan Bilangan : ");
        int bilangan = Enkapsulasi.nextInt();
        this.angka = bilangan;
    }
    
    String cekangka () {
        if (angka %2 == 0 && angka > 0) {
            return "Bilangan Positif Genap";
        }
        else if (angka % 2 == 0 && angka < 0) {
            return "Bilangan Negatif Ganjil";
        }
        else if (angka % 2 != 0 && angka > 0) {
            return "Bilangan Positif Ganjil";
        }
        else if (angka % 2 != 0 && angka < 0) {
            return "Bilangan Negatif Ganjil";
        }
            return "Tidak Terdeteksi";
        }
    
        int getAngka () {
            return this.angka;
        }
    
}
