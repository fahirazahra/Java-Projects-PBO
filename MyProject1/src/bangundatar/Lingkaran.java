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
public class Lingkaran { /* Project 2 no. 7 */
    
    // atribut
    public double phi;
    public int jarijari;
    
    // methods
    public void hitungLuas(){
        double hasil = phi * jarijari * jarijari;
        System.out.println("Luas lingkarannya: " + hasil);
    }
    
    public void hitungKeliling(){
        double hasil = 2 * phi * jarijari;
        System.out.println("Keliling lingkarannya: " + hasil);
    }
    
}