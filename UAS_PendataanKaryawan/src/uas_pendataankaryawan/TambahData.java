/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_pendataankaryawan;
import java.util.Scanner;

/**
 *
 * @author Fahira
 */
public class TambahData extends SubMenu{
    
    Scanner key = new Scanner(System.in);
    
    @Override
    int SubMenu() {
        System.out.println("Pilih Sub Menu : " + "\n1. Kembali ke Menu Utama" + "\n2. Tambah Data Kembali" + "\nMenu Pilihan : ");
        int pilihMenu = key.nextInt();
        return pilihMenu;
    }
    
}