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
public class Persegi { /* Project 2 no. 7 */
    
    // atribut
    public int sisi;
    
    // methods
    public void hitungLuas(){
        int hasil = sisi * sisi;
        System.out.println("Luas perseginya: " + hasil);
    }
    
    public void hitungKeliling(){
        int hasil = sisi + sisi + sisi + sisi;
        System.out.println("Keliling perseginya: " + hasil);
    }
    
}
