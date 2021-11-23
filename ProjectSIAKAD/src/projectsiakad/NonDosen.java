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
public class NonDosen extends Pegawai {
    
    //Constructor
    NonDosen(String ID, String nama, int golongan, LocalDate tglLahir){
        super(ID, nama, golongan, tglLahir);
    }
    
    //Menghitung Tunjangan Pegawai Non Dosen
    long hitungTunjanganPegawai(){
        long tunjanganPegawai = 1000000;
        return tunjanganPegawai;
    }
    
    //Menghitung Total Gaji
    long hitungTotalGaji(){
        long total = this.hitungGajiPokok() + this.hitungTunjanganPegawai();
        return total;
    }
    
    //Cetak Data Pegawai, Rincian Gaji, dan Total Gaji
    void printPegawai(){
        System.out.println("ID Pegawai          : " + this.idPegawai);
        System.out.println("Nama Pegawai        : " + this.namaPegawai);
        System.out.println("Golongan            : " + this.golPegawai);
        System.out.println("Tgl Lahir           : " + this.tanggallLahir);
        System.out.println("Usia                : " + this.hitungUsia() + " tahun");
        System.out.println("Gaji Pokok          : Rp" + this.hitungGajiPokok());
        System.out.println("Tunjangan Pegawai   : Rp" + this.hitungTunjanganPegawai());
        System.out.println("Total Gaji          : Rp" + this.hitungTotalGaji());
    }
}