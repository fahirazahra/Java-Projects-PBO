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
public class ProjectLuasBangunKompleks {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Lingkaran - Project 1
        Lingkaran L1 = new Lingkaran();
        L1.phi = 22/7;
        L1.jarijari = 42/2;
        
        // Persegi - Project 1
        Persegi P1 = new Persegi();
        P1.sisi = 42;
        
        // Setengah Lingkaran Abu - Project 2
        Lingkaran L2 = new Lingkaran();
        L2.phi = 22/7;
        L2.jarijari = 28/2;
        
        // Setengah Lingkaran - Project 2
        Lingkaran L3 = new Lingkaran();
        L3.phi = 22/7;
        L3.jarijari = 14/2;
        
        double LuasBangunDatar = (((L1.hitungLuas())/2)*4) + P1.hitungLuas(); // Project 1
        double LuasDaerahAbu = ((L2.hitungLuas())/2) - ((L3.hitungLuas()/2)*2); // Project 2
        
        System.out.println("Luas Bangun Datarnya adalah " + LuasBangunDatar);
        System.out.println("Luas Daerah Abunya adalah " + LuasDaerahAbu);
    }
}