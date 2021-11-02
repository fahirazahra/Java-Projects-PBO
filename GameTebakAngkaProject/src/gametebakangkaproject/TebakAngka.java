/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;
import java.util.Scanner;

/**
 *
 * @author Fahira
 */
public class TebakAngka {
    // TODO code application logic here
    void output(){
        System.out.println("Hai... nama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silahkan tebak ya!!!");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
    }
    void input(){
        int Random;
        int Tebak;
        Random = (int)(Math.random()*100); //Random angka dari 0 s/d 100
        Scanner inputAngka = new Scanner(System.in);
        do {
            System.out.println("Masukkan tebakan Anda: ");
            Tebak = inputAngka.nextInt();
            if(Tebak < Random){
                System.out.println("Hehehe... Bilangan tebakan Anda terlalu kecil.");
            } else if(Tebak > Random){
                System.out.println("Hehehe... Bilangan tebakan Anda terlalu besar");
            } else{
                System.out.println("Yeay... Bilangan tebakan Anda BENAR :) ");
            }
        } while(Tebak != Random);
    }
}