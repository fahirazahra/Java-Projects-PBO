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
        Period SelisihGaji = Period.between(localDate, today);
        System.out.println(this.kodeKaryawan+"\t"+this.Nama+"\t"+this.Golongan+"\t"+SelisihGaji+"\t"+this.Status+"\t"+this.JumlahAnak);
    }
    void cariData(){
        LocalDate localDate = LocalDate.parse(this.TglLahir);
        LocalDate today = LocalDate.now();
        Period SelisihGaji = Period.between(localDate, today);
        System.out.println("Kode Karyawan : " + this.kodeKaryawan
                         + "\nNama Karyawan : " + this.Nama
                         + "\nGolongan : " + this.Golongan
                         + "\nUsia : " + SelisihGaji
                         + "\nStatus Menikah : " + this.Status
                         + "\nJumlah Anak : " + this.JumlahAnak);
        int GajiKaryawan = 0, TunjanganMenikah = 0, TunjanganAnak = 0, Tunjangan = 0;
        if(null != this.Golongan)switch (this.Golongan) {
            case "A":
                GajiKaryawan = 5000000;
                break;
            case "B":
                GajiKaryawan = 6000000;
                break;
            case "C":
                GajiKaryawan = 7000000;
                break;
            case "D":
                GajiKaryawan = 8000000;
                break;
            default:
                break;
        }
        if (this.Status == "1" || this.Status == "Sudah Menikah"){
            TunjanganMenikah = 10/100 * GajiKaryawan;
            TunjanganAnak = 5/100 * GajiKaryawan * this.JumlahAnak;
            Tunjangan = TunjanganMenikah + TunjanganAnak;
        }
        int GajiKotor = GajiKaryawan + Tunjangan;
        double PotonganGaji = 2.5/100 * GajiKaryawan; 
        double GajiBersih = GajiKotor - PotonganGaji;
        
        System.out.println("Gaji Pokok : Rp" + GajiKaryawan
        + "\nTunjangan Suami/Istri : Rp" + TunjanganMenikah
        + "\nTunjangan Anak : Rp" + TunjanganAnak);
        System.out.println("=================================================");
        System.out.println("Gaji Kotor : Rp" + GajiKotor
        + "\nPotongan : Rp" + PotonganGaji);
        System.out.println("=================================================");
        System.out.println("Gaji Bersih : Rp" + GajiBersih);
    }
    
}