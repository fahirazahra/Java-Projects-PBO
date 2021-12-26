/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_pendataankaryawan;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author Fahira
 */
public class ProfilKaryawan {
    
    //Atribut
    String Nama, Alamat, Golongan, Status, TglLahir;
    int kodeKaryawan, JumlahAnak;
    Scanner inputData = new Scanner(System.in);
    SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD");
    
    ProfilKaryawan(int kode, String Nama, String Alamat, String TglLahir, String Golongan, String Status, int JumlahAnak){
        this.kodeKaryawan = kode;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.TglLahir = TglLahir;
        this.Golongan = Golongan;
        this.Status = Status;
        this.JumlahAnak = JumlahAnak;
    }
    
    //Method
    void printData(){
        LocalDate localDate = LocalDate.parse(this.TglLahir);
        LocalDate today = LocalDate.now();
        Period selisih = Period.between(localDate, today);
        System.out.println(this.kodeKaryawan+"\t"+this.Nama+"\t"+this.Golongan+"\t"+selisih+"\t"+this.Status+"\t"+this.JumlahAnak);
    }
    void cariData(){
        LocalDate localDate = LocalDate.parse(this.TglLahir);
        LocalDate today = LocalDate.now();
        Period selisih = Period.between(localDate, today);
        System.out.println("Kode Karyawan : " + this.kodeKaryawan
                         + "\nNama Karyawan : " + this.Nama
                         + "\nGolongan : " + this.Golongan
                         + "\nUsia : " + selisih
                         + "\nStatus Menikah : " + this.Status
                         + "\nJumlah Anak : " + this.JumlahAnak);
        int Gaji = 0, tunjanganNikah = 0, tunjanganAnak = 0, tunjangan = 0;
        if(null != this.Golongan)switch (this.Golongan) {
            case "A":
                Gaji = 5000000;
                break;
            case "B":
                Gaji = 6000000;
                break;
            case "C":
                Gaji = 7000000;
                break;
            case "D":
                Gaji = 8000000;
                break;
            default:
                break;
        }
        if (this.Status == "1" || this.Status == "Sudah Menikah"){
            tunjanganNikah = 10/100 * Gaji;
            tunjanganAnak = 5/100 * Gaji * this.JumlahAnak;
            tunjangan = tunjanganNikah + tunjanganAnak;
        }
        int GajiKotor = Gaji + tunjangan;
        double potongan = 2.5/100 * Gaji; 
        double GajiBersih = GajiKotor - potongan;
        
        System.out.println("Gaji Pokok : Rp" + Gaji
        + "\nTunjangan Suami/Istri : Rp" + tunjanganNikah
        + "\nTunjangan Anak : Rp" + tunjanganAnak);
        System.out.println("=================================================");
        System.out.println("Gaji Kotor : Rp" + GajiKotor
        + "\nPotongan : Rp" + potongan);
        System.out.println("=================================================");
        System.out.println("Gaji Bersih : Rp" + GajiBersih);
    }
    
}