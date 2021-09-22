/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;
/**
 *
 * @author Fahira
 */
public class BangunDatarMain { /* Project 2 no. 5 */
    
    public static void main (String[] args){
        
        PersegiPanjang objek1 = new PersegiPanjang(); /* Project 2 no. 6 */
        objek1.panjang = 25;
        objek1.lebar = 38;
        objek1.hitungLuas();
        objek1.hitungKeliling();
        
        Persegi persegiA = new Persegi(); /* Project 2 no. 8A */
        persegiA.sisi = 10;
        persegiA.hitungLuas();
        persegiA.hitungKeliling();
        
        Persegi persegiB = new Persegi(); /* Project 2 no. 8B */
        persegiB.sisi = 15;
        persegiB.hitungLuas();
        persegiB.hitungKeliling();
        
        Lingkaran lingkaranX = new Lingkaran(); /* Project 2 no. 9A */
        lingkaranX.phi = 3.14;
        lingkaranX.jarijari = 25;
        lingkaranX.hitungLuas();
        lingkaranX.hitungKeliling();
        
        Lingkaran lingkaranY = new Lingkaran(); /* Project 2 no. 9B */
        lingkaranY.phi = 3.14;
        lingkaranY.jarijari = 37;
        lingkaranY.hitungLuas();
        lingkaranY.hitungKeliling();
        
    }
    
}