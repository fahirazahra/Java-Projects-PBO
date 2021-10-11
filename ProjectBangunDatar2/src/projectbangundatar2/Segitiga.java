/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author Fahira
 */
public class Segitiga {
    
    int hitungLuas(int S1, int S2){
        int luas = (S1 * S2)/2;
        return luas;
    }
    double hitungLuas(double S1, int S2){
        double luas = (S1 * S2)/2;
        return luas;
    }
    double hitungLuas(int S1, double S2){
        double luas = (S1 * S2)/2;
        return luas;
    }
    double hitungLuas(double S1, double S2){
        double luas = (S1 * S2)/2;
        return luas;
    }
    
    int hitungKeliling(int S1, int S2){
        int keliling = ((S1*S1) + (S2*S2) + S1 + S2);
        return keliling;
    }
    double hitungKeliling(double S1, int S2){
        double keliling = ((S1*S1) + (S2*S2) + S1 + S2);
        return keliling;
    }
    double hitungKeliling(int S1, double S2){
        double keliling = ((S1*S1) + (S2*S2) + S1 + S2);
        return keliling;
    }
    double hitungKeliling(double S1, double S2){
        double keliling = ((S1*S1) + (S2*S2) + S1 + S2);
        return keliling;
    }   
}