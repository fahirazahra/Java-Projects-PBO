/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_pendataankaryawan;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Fahira
 */
public class MenuUtama {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Atribut
        String Nama, Alamat, Golongan, Status, TglLahir;
        int kode, JumlahAnak = 0, input, Menikah;
        
        Scanner inputData = new Scanner(System.in);
        DataKaryawan Data = new DataKaryawan();
        TambahData Add = new TambahData();
        HapusData Delete = new HapusData();
        LihatData Display = new LihatData();
        CariData Find = new CariData();
        
        System.out.println( "Menu Utama" );
        System.out.println( "=================================" );
        
        //Switch
        while (true){
            System.out.println( "1. Tambah Data" + "\n2. Hapus Data" + "\n3. Lihat Data" + "\n4. Cari Data" + "\n5. Exit" );
            System.out.print( "Menu Pilihan : ");
            input = inputData.nextInt();
            
            switch (input){
                case 1:
                    while (true){
                        System.out.print("Masukkan Kode Karyawan : ");
                        kode = inputData.nextInt();
                        inputData.nextLine();
                        System.out.print("Masukkan Nama Karyawan : ");
                        Nama = inputData.nextLine();
                        System.out.print("Masukkan Alamat : ");
                        Alamat = inputData.nextLine();
                        System.out.print("Masukkan Tanggal Lahir (YYYY-MM-DD) : ");
                        TglLahir = inputData.nextLine();
                        System.out.print("Masukkan Golongan (A/B/C/D) : ");
                        Golongan = inputData.nextLine();
                        System.out.print("Status Menikah : " + "\n1. Sudah Menikah" + "\n2. Belum Menikah" + "\nPilihan : ");
                        Menikah = inputData.nextInt();
                        if ( Menikah == 1 ){
                            Status = "Sudah Menikah";
                            System.out.print("Masukkan Jumlah Anak : ");
                            JumlahAnak = inputData.nextInt();
                        } else {
                            Status = "Belum Menikah";
                        }                    
                        Data.tambahDataKaryawan(new ProfilKaryawan(kode, Nama, Alamat, TglLahir, Golongan, Status, JumlahAnak));
                        if (Add.SubMenu() == 1){
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Masukkan Kode Karyawan: ");
                    inputData.nextLine();
                    int caridata = inputData.nextInt();
                    Data.hapusDataKaryawan(caridata);
                    if (Delete.SubMenu() == 1){
                        break;
                    }
                case 3:
                    System.out.println("====================================================");
                    System.out.println("DATA KARYAWAN");
                    System.out.println("----------------------------------------------------");
                    System.out.println("KODE\tNAMA\tGOL\tUSIA\t\tSTATUS MENIKAH\tJUMLAH ANAK");
                    System.out.println("----------------------------------------------------");
                
                    Data.tampilDataKaryawan();
                    System.out.println("Jumlah Data : " + Data.jumlahKaryawan());
                    if (Display.SubMenu() == 1){
                        break;
                    }
                case 4:
                    System.out.println("Masukkan Kode Karyawan : ");
                    inputData.nextLine();
                    int cari = inputData.nextInt();
                    Data.cariDataKaryawan(cari);
                    if (Find.SubMenu() == 1){
                        break;
                    }
                case 5:
                    System.exit(0);
                default:
                    System.out.println( "Terjadi Kesalahan" );
                    break;
            }
        }
        
    }
    
}