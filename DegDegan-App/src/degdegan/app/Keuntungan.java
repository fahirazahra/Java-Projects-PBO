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
public class Keuntungan {
    // Untuk menghitung keuntungan yang didapat dari penjualan dengan cara mengalikan harga jual degan dengan jumlah buah yang terjual.
    int balikModal(int hargaJual, int Jumlah){
        int totalKeuntungan = hargaJual * Jumlah;
        return totalKeuntungan;
    }
}