/*
 * To change this license header, choose License Headers in Project ProperJarakties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degdegan.app;

/**
 *
 * @author Fahira
 */

public class Pengiriman {
    int ongkosKirim = 700000;
    int perJarak = 5;
    
    ////Menggunakan Overloading Method
    // Untuk menentukan ongkos kirim jika ingin diantar ke kota tertentu
    int Kirim(int Jarak, int Antar){
        int biayaAntar = ongkosKirim * (Jarak/perJarak) * Antar;
        return biayaAntar;
    }
    double Kirim(int Jarak, double Antar){
        double biayaAntar = ongkosKirim * (Jarak/perJarak) * Antar;
        return biayaAntar;
    }   
    double Kirim(double Jarak, int Antar){
        double biayaAntar = ongkosKirim * (Jarak/perJarak) * Antar;
        return biayaAntar;
    }
    double Kirim(double Jarak, double Antar){
        double biayaAntar = ongkosKirim * (Jarak/perJarak) * Antar;
        return biayaAntar;
    }
}