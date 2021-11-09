/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import static java.util.Collections.binarySearch;

/**
 *
 * @author Fahira
 */
public class AplikasiArrayList {
    //Atribut Array List -> Data
    ArrayList<String> dataBil = new ArrayList<String>();
    
    //METHOD PILIHAN MENU ARRAY LIST
    void Menu1(){
        Scanner tambahData = new Scanner(System.in);
        System.out.println("Masukkan Data String: ");
        this.dataBil.add(tambahData.nextLine());
        System.out.println("Daftar String dalam Array List: " + this.dataBil);
        tambahData.nextLine();
    }
    
    void Menu2(){
        Scanner cariData = new Scanner(System.in);
        System.out.println("String yang Mau Dicari: ");
        String find = cariData.nextLine();
        if(binarySearch(this.dataBil, find) > -1){
            System.out.println("String " + find + " ada di index ke-" + binarySearch(this.dataBil, find) + " di dalam data");
        } else{
            System.out.println("String " + find + " tidak ada di dalam data");
        }
    }
    
    void Menu3(){
        Scanner hapusData = new Scanner(System.in);
        System.out.println("String yang Mau Dihapus: ");
        String delete = hapusData.nextLine();
        if(binarySearch(this.dataBil, delete) > -1){
            this.dataBil.remove(binarySearch(this.dataBil, delete));
            System.out.println("String " + delete + " sudah dihapus di dalam data");
        } else{
            System.out.println("String " + delete + " tidak ada di dalam data");
        }
    }
    
    void Menu4(){
        System.out.println("Daftar String dalam ArrayList: " + this.dataBil);
    }
    
    void Menu5(){
        System.out.println("KELUAR");
        System.exit(0);
    }
    
    /* //LATIHAN ARRAY LIST (KEGIATAN 2)
    void input(){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Masukkan Bilangan Bulat: ");
            this.dataBil.add(input.nextInt());
            System.out.println("Isi Data List: " + this.dataBil);
            input.nextLine();
            System.out.println("Input Lagi? (y/n): ");
            char ans = input.nextLine().charAt(0);
            if(ans == 'n'){
                break;
            }
        }
    }
    
    double hitungRerata(ArrayList<Integer> data){
        double sum = 0;
        for(Integer item : data){
            sum += item;
        }
        double rerata = sum / data.size();
        return rerata;
    }
    
    void output(){
        System.out.println("-------------------------");
        System.out.println("Rata-Rata: " + this.hitungRerata(this.dataBil));
        System.out.println("Banyak Data: " + this.dataBil.size());
        System.out.println("Data Maksimum: " + Collections.max(this.dataBil));
        System.out.println("Data Minimum: " + Collections.min(this.dataBil));
    } */
}