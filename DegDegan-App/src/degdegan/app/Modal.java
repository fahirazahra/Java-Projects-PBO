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
public class Modal {
    Pemasukan Harga = new Pemasukan();
    Pengiriman Boyolali = new Pengiriman();
    Pengiriman Salatiga = new Pengiriman();
    Pengiriman Klaten = new Pengiriman();
    Pengiriman Kudus = new Pengiriman();
    
    //// Menggunakan Constructor yang berjenis Overloading
    // Untuk menentukan modal jika harus mengirim ke kota tertentu dengan ongkos per-jarak yang sudah ditentukan
    int ModalBoyolali(){
        // (15, 2) -> 2 maksudnya dua kali lipat dari batas maksimum (3000kg)
        int Total = Boyolali.Kirim(15, 2) + Harga.pasokanHarga(5000);
        return Total;
    }
    double ModalSalatiga(){
        // (35, 3) -> 3 maksudnya tiga kali lipat dari batas maksimum (3000kg)
        double Total = Salatiga.Kirim(35, 3) + Harga.pasokanHarga(7500);
        return Total;
    }
    double ModalKlaten(){
        // (30, 4) -> 4 maksudnya sudah hampir empat kali lipat dari batas maksimum (3000kg)
        double Total = Klaten.Kirim(30, 4) + Harga.pasokanHarga(8300);
        return Total;
    }
    double ModalKudus(){
        // (15, 2) -> 4 maksudnya sudah hampir empat kali lipat dari batas maksimum (3000kg)
        double Total = Kudus.Kirim(75, 4) + Harga.pasokanHarga(9100);
        return Total;
    }
}