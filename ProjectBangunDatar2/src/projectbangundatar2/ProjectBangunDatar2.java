/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author Fahira
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PersegiPanjang PP1 = new PersegiPanjang();
        System.out.println("Luas Persegi Panjang");
        System.out.println("P = 10, L = 5 : " + PP1.hitungLuas(10, 5));
        System.out.println("P = 3.6, L = 8 : " + PP1.hitungLuas(3.6, 8));
        System.out.println("P = 6, L = 8.3 : " + PP1.hitungLuas(6, 8.3));
        System.out.println("P = 5.6, L = 8.8 : " + PP1.hitungLuas(5.6, 8.8));
        System.out.println("Keliling Persegi Panjang");
        System.out.println("P = 10, L = 5 : " + PP1.hitungKeliling(10, 5));
        System.out.println("P = 3.6, L = 8 : " + PP1.hitungKeliling(3.6, 8));
        System.out.println("P = 6, L = 8.3 : " + PP1.hitungKeliling(6, 8.3));
        System.out.println("P = 5.6, L = 8.8 : " + PP1.hitungKeliling(5.6, 8.8));
        
        Persegi P1 = new Persegi();
        System.out.println("Luas Persegi");
        System.out.println("S = 4.5 : " + P1.hitungLuas(4.5));
        System.out.println("S = 7 : " + P1.hitungLuas(7));
        System.out.println("Keliling Persegi");
        System.out.println("S = 4.5 : " + P1.hitungKeliling(4.5));
        System.out.println("S = 7 : " + P1.hitungKeliling(7));
        
        Lingkaran L1 = new Lingkaran();
        System.out.println("Luas Lingkaran");
        System.out.println("r = 5 :" + L1.hitungLuas(5));
        System.out.println("r = 7.4 : " + L1.hitungLuas(7.4));
        System.out.println("Keliling Lingkaran");
        System.out.println("r = 5 :" + L1.hitungKeliling(5));
        System.out.println("r = 7.4 : " + L1.hitungKeliling(7.4));
        
        Segitiga S1 = new Segitiga();
        System.out.println("Luas Segitiga");
        System.out.println("A = 8, T = 10 : " + S1.hitungLuas(8, 10));
        System.out.println("Keliling Segitiga");
        System.out.println("A = 8, T = 10 : " + S1.hitungKeliling(8, 10));
    }   
}