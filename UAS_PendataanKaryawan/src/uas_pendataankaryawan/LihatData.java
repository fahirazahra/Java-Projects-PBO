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
public class LihatData extends SubMenu{
    
    Scanner inputData = new Scanner(System.in);
    
    @Override
    int SubMenu() {
        System.out.println("Pilih Sub Menu : " + "\n1. Kembali ke Menu Utama" + "\n Menu Pilihan : ");
        int pilihMenu = inputData.nextInt();
        return pilihMenu;
    }
    
}