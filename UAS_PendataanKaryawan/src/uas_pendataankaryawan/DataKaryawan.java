/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_pendataankaryawan;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Fahira
 */
public class DataKaryawan{
    
    ArrayList <ProfilKaryawan> Data = new ArrayList <ProfilKaryawan> ();
    Scanner inputData = new Scanner(System.in);
    
    //Method
    void tambahDataKaryawan(ProfilKaryawan data){
        this.Data.add(data);
    }
    void tampilDataKaryawan(){
        for(ProfilKaryawan data: this.Data){
            data.printData();
        }
    }
    void cariDataKaryawan(int kode){
        boolean find = false;
        int index = -1;
        for(int i = 0; i < this.Data.size(); i++){
            if(this.Data.get(i).kodeKaryawan == kode){
                index = i;
                find = true;
            }
        }   
        if(find == true){
            this.Data.get(index).cariData();
        } else{
            System.out.println("Tidak Ditemukan");
        }
    }
    void hapusDataKaryawan(int kode){
        this.Data.removeIf(data -> data.kodeKaryawan == kode);
    }
    
    public int jumlahKaryawan(){
        return Data.size();
    }
    
}