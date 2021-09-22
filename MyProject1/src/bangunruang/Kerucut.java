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
public class Kerucut { /* Project 3 */
    
    // atribut
    public double phi;
    public int jarijari;
    public int tinggi;
    public int garisapotema;
    
    // methods
    public void hitungVol(){
        double hasil = ((1/3) * phi * (jarijari*jarijari) * tinggi);
        System.out.println("Volume kerucutnya: " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil = (phi * jarijari * (jarijari+garisapotema));
        System.out.println("Luas selimut kerucutnya: " + hasil);
    }
    
}