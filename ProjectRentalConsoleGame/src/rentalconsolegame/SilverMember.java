/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegame;

/**
 *
 * @author Fahira
 */
public class SilverMember {
    
    int hargaSewa = 25000;
    double Diskon = 1/100; //Diskon untuk Member Silver (1%)
    long Point;
    
    protected void Benefit1(long berapaLama){ //Access Modifier: Protected
        double biayaSewa = this.hargaSewa * berapaLama;
        double Total = biayaSewa - (biayaSewa*this.Diskon);
        System.out.println("Total Sewa      : Rp" + Total);
    }
    
    protected void Benefit2(long berapaLama){ //Access Modifier: Protected
        this.Point = berapaLama * 1; //Point: 1/hari
        System.out.println("Jumlah Poin     : " + this.Point);
    }
}