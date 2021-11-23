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
public class Dosen extends Pegawai { //extends: untuk menandakan bahwa kelas Dosen merupakan subclass dari kelas Pegawai.
    
    //Atribut Tambahani Khusus untuk di class Dosen (karena atribut yang lainnya sudah diambil dari class Pegawai)
    String NIDN;
    
    //Constructor
    Dosen(String ID, String nama, int golongan, LocalDate tglLahir, String NIDN){
        super(ID, nama, golongan, tglLahir);
        this.NIDN = NIDN;
    }
    
    //Menghitung Tunjangan Pegawai Dosen
    long hitungTunjanganPegawai(){
        long tunjanganPegawai = 1500000;
        return tunjanganPegawai;
    }
    
    //Menghitung Tunjangan Fungsional Dosen
    long hitungTunjanganFungsional(){
        long tunjanganFungsional;
        if(this.hitungUsia() < 40){
            tunjanganFungsional = 1700000;
        } else{
            tunjanganFungsional = 2000000;
        }
        return tunjanganFungsional;
    }
    
    //Menghitung Total Gaji
    long hitungTotalGaji(){
        long total = this.hitungGajiPokok() + this.hitungTunjanganPegawai() + this.hitungTunjanganFungsional();
        return total;
    }
    
    //Cetak Data Pegawai, Rincian Gaji, dan Total Gaji
    void printPegawai(){
        System.out.println("ID Pegawai          : " + this.idPegawai);
        System.out.println("Nama Pegawai        : " + this.namaPegawai);
        System.out.println("Golongan            : " + this.golPegawai);
        System.out.println("Tgl Lahir           : " + this.tanggallLahir);
        System.out.println("NIDN                : " + this.NIDN);
        System.out.println("Usia                : " + this.hitungUsia() + " tahun");
        System.out.println("Gaji Pokok          : Rp" + this.hitungGajiPokok());
        System.out.println("Tunjangan Pegawai   : Rp" + this.hitungTunjanganPegawai());
        System.out.println("Tunjangan Fungsi    : Rp" + this.hitungTunjanganFungsional());
        System.out.println("Total Gaji          : Rp" + this.hitungTotalGaji());
        System.out.println("============================================");
    }
}