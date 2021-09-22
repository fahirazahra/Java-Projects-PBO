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
public class PersegiPanjang { /* Project 2 no. 2 */
    
    /* Project 2 no. 3 */
    // atribut
    public int panjang;
    public int lebar;
    
    /* Project 2 no. 4 */
    // methods
    public void hitungLuas(){
        int hasil = panjang * lebar;
        System.out.println("Luas persegi panjangnya: " + hasil);
    }
    
    public void hitungKeliling(){
        int hasil = (2 * (panjang + lebar));
        System.out.println("Keliling persegi panjangnya: " + hasil);
    }
    
}
