/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;
import java.util.Scanner;

/**
 *
 * @author Fahira
 */
public class SimpleArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AplikasiArrayList data = new AplikasiArrayList();
        
        while(true){
            System.out.println("Menu Data ArrayList:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Cari Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Tampil Data");
            System.out.println("5. Keluar");
            
            System.out.println("=====================================");
            
            int inputMenu;
            Scanner input = new Scanner(System.in);
            System.out.println("Pilih Nomor Berapa: ");
            inputMenu = input.nextInt();
            
            switch(inputMenu){
                case 1:
                    data.Menu1();
                    break;
                case 2:
                    data.Menu2();
                    break;
                case 3:
                    data.Menu3();
                    break;
                case 4:
                    data.Menu4();
                    break;
                case 5:
                    data.Menu5();
            }
        }
    }
}