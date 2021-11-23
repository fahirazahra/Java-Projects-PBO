/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsiakad;
import java.time.*;

/**
 *
 * @author Fahira
 */
public class Pegawai {
    
    //Atribut
    String idPegawai;
    String namaPegawai;
    int golPegawai;
    LocalDate tanggallLahir;
    
    //Constructor
    Pegawai(String ID, String nama, int golongan, LocalDate tglLahir){
        this.idPegawai = ID;
        this.namaPegawai = nama;
        this.golPegawai = golongan;
        this.tanggallLahir = tglLahir;
    }
    
    //Method untuk Menghitung Usia Pegawai
    int hitungUsia(){
        //Mendapatkan Tanggal Hari Ini
        LocalDate today = LocalDate.now();
        
        //Hitung Selisih Tanggal lahir dan Tanggal Hari Ini
        Period selisih = Period.between(this.tanggallLahir, today);
        return selisih.getYears();
    }
    
    //HitungGaji Pokok berdasarkan Golongan dan usia
    long hitungGajiPokok(){
        long gajipokok = 0;
        if(this.golPegawai == 1){
            if(this.hitungUsia() < 40){
                gajipokok = 3500000;
            } else{
                gajipokok = 4500000;
            }
        } else if(this.golPegawai == 2){
            if(this.hitungUsia() < 40){
                gajipokok = 5000000;
            } else{
                gajipokok = 6000000;
            }
        }
        return gajipokok;
    }
    
    //Mencetak Data Pegawai dan Gaji Pokoknya
    void printPegawai(){
        System.out.println("ID Pegawai          : " + this.idPegawai);
        System.out.println("Nama Pegawai        : " + this.namaPegawai);
        System.out.println("Golongan            : " + this.golPegawai);
        System.out.println("Tanggal Lahir       : " + this.tanggallLahir);
        System.out.println("Usia                : " + this.hitungUsia() + " tahun");
        System.out.println("Gaji Pokok          : Rp" + this.hitungGajiPokok());
        System.out.println("============================================");
    }
}