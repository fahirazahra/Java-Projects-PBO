/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Fahira
 */
public class Tabung { /* Project 3 */
    
    // atribut
    public double phi;
    public int jarijari;
    public int tinggi;
    
    // methods
    public void hitungVol(){
        double hasil = (phi * (jarijari*jarijari) * tinggi);
        System.out.println("Volume tabungnya: " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil = 2 * phi * jarijari * tinggi;
        System.out.println("Luas selimut tabungnya: " + hasil);
    }
    
}