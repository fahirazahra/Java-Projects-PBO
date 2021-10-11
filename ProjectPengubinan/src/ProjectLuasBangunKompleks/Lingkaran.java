/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectLuasBangunKompleks;

/**
 *
 * @author Fahira
 */
public class Lingkaran {
    double phi;
    int jarijari;
    
    int hitungLuas(){
        int Luas = (int) (this.phi * (this.jarijari*this.jarijari));
        return Luas;
    }
}