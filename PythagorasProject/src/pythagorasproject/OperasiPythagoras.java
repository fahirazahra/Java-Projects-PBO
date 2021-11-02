/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;
import java.util.Scanner;

/**
 *
 * @author Fahira
 */
public class OperasiPythagoras {
    void Menu(){
        System.out.println("Pilihlah menu dibawah ini:");
        System.out.println("1. Cek Triple Pythagoras");
        System.out.println("2. Menentukan Sisi Miring Segitiga");
        System.out.println("3. Menentukan Sisi Siku-Siku Segitiga");
        System.out.println("4. Exit");
        System.out.println("=====================================");
    }
    
    void OperasiPythagoras(){
        int menu, sisi, sisiA, sisiB, sisiC, sisi1, sisi2, sisi3, sisiTotal, cekTriple;
        Scanner inputMenu = new Scanner(System.in);
        
        System.out.println("Masukkan pilihan menu (1/2/3/4): ");
        menu = inputMenu.nextInt();
        switch(menu){
            case 1:
                System.out.println("CEK TRIPLE PYTHAGORAS");
                System.out.println("-------------------------------------");
                System.out.println("Sisi A : ");
                sisiA = inputMenu.nextInt();
                System.out.println("Sisi B : ");
                sisiB = inputMenu.nextInt();
                System.out.println("Sisi C : ");
                sisiC = inputMenu.nextInt();
                //Operasi Perhitungan
                sisi1 = sisiA*sisiA;
                sisi2 = sisiB*sisiB;
                sisi3 = sisiC*sisiC;
                cekTriple = sisi1 + sisi2;
                    if(sisi3 == cekTriple){ //Jika perkalian dari sisi C hasilnya sama dengan penjumlahan dari sisi A dan sisi B, maka itu adalah Triple Pythagoras.
                        System.out.println("Sisi " + sisiA + ", " + sisiB + ", dan " + sisiC + " MERUPAKAN TRIPLE PYTHAGORAS");
                    } else{
                        System.out.println("Sisi " + sisiA + ", " + sisiB + ", dan " + sisiC + " BUKAN TRIPLE PYTHAGORAS");
                    }
                break;
                
            case 2:
                System.out.println("MENENTUKAN SISI MIRING SEGITIGA");
                System.out.println("-------------------------------------");
                System.out.println("Sisi A : ");
                sisiA = inputMenu.nextInt();
                System.out.println("Sisi B : ");
                sisiB = inputMenu.nextInt();
                //Operasi Perhitungan
                sisi = ((sisiA*sisiA) + (sisiB*sisiB));
                sisiTotal = (int)Math.sqrt(sisi);
                System.out.println("Sisi miring segitiga dari " + sisiA + " dan " + sisiB + " adalah " + sisiTotal);
                break;
                
            case 3:
                System.out.println("MENENTUKAN SISI SIKU-SIKU SEGITIGA");
                System.out.println("-------------------------------------");
                System.out.println("Sisi A : ");
                sisiA = inputMenu.nextInt();
                System.out.println("Sisi C : ");
                sisiC = inputMenu.nextInt();
                //Operasi Perhitungan
                sisi = ((sisiC*sisiC) - (sisiA*sisiA));
                sisiTotal = (int)Math.sqrt(sisi);
                System.out.println("Sisi siku-siku segitiga dari " + sisiA + " dan " + sisiC + " adalah " + sisiTotal);
                break;
                
            case 4:
                System.out.println("EXIT/KELUAR");
                System.exit(0);
        }
    }
}