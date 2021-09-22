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
public class Bola { /* Project 3 */
    
    // atribut
    public double phi;
    public int jarijari;
    
    // methods
    public void hitungVol(){
        double hasil = ((4/3) * phi * (jarijari*jarijari*jarijari));
        System.out.println("Volume bolanya: " + hasil);
    }
    
    public void hitungLuasSelimut(){
        double hasil = (4 * phi * (jarijari*jarijari));
        System.out.println("Luas selimut bolanya: " + hasil);
    }
    
}