/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degdegan.app;

/**
 *
 * @author Fahira
 */

import java.util.Scanner;
        
public class DegDeganApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Objek untuk Menginput Data (harga jual degan)
        Scanner inputData = new Scanner(System.in);
        
        //Objek dari Modal
        Modal kirimBoyolali = new Modal();
        Modal kirimSalatiga = new Modal();
        Modal kirimKlaten = new Modal();
        Modal kirimKudus = new Modal();
        
        //Objek dari Pemasukan
        Keuntungan Pendapatan = new Keuntungan();
        
        System.out.println("DEGDEGAN 'Pak Amir'");
        System.out.println("====================================");
        System.out.println("Jika harga Degan di Kota:");
        
        System.out.println("Boyolali = ");
        int Boyolali = inputData.nextInt(); // Agar output dapat menginput data (menginput harga jual degan yang sekiranya dapat menghasilkan keuntungan sebesar 15 juta rupiah)
        int pemasukanBoyolali = Pendapatan.balikModal(Boyolali, 5000);
        int keuntunganBoyolali = pemasukanBoyolali - kirimBoyolali.ModalBoyolali();
        
        System.out.println("Salatiga = ");
        int Salatiga = inputData.nextInt();
        int pemasukanSalatiga = Pendapatan.balikModal(Salatiga, 7500);
        double keuntunganSalatiga = pemasukanSalatiga - kirimSalatiga.ModalSalatiga();
        
        System.out.println("Klaten = ");
        int Klaten = inputData.nextInt();
        int pemasukanKlaten = Pendapatan.balikModal(Klaten, 8300);
        double keuntunganKlaten = pemasukanKlaten - kirimKlaten.ModalKlaten();
        
        System.out.println("Kudus = ");
        int Kudus = inputData.nextInt();
        int pemasukanKudus = Pendapatan.balikModal(Kudus, 9100);
        double keuntunganKudus = pemasukanKudus - kirimKudus.ModalKudus();
        
        
        //Perhitungan Keuntungan (TOTAL)
        double totalKeuntungan = keuntunganBoyolali + keuntunganSalatiga + keuntunganKlaten + keuntunganKudus;
        System.out.println("------------------------------------");
        System.out.println("Total Keuntungan: " + totalKeuntungan);
    }
}