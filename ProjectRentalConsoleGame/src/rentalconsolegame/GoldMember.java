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
public class GoldMember extends SilverMember { //Menggunakan Extends karena class GoldMember merupakan subclass dari class SilverMember.
    
    int Cashback, hargaSewa = 30000;
    double Diskon = 2/100; //Diskon untuk Member Gold (2%)
    
    @Override
    protected void Benefit1(long berapaLama){ //Access Modifier: Protected
        double biayaSewa = this.hargaSewa * berapaLama;
        double Total = biayaSewa - (biayaSewa*this.Diskon);
        System.out.println("Total Sewa      : Rp" + Total);
    }
    
    @Override
    protected void Benefit2(long berapaLama){ //Access Modifier: Protected
        Point = berapaLama * 5; //Point: 5/hari
        System.out.println("Jumlah Poin     : " + Point);
    }
    
    protected void Benefit3(){ //Access Modifier: Protected
        this.Cashback = 5000;
        System.out.println("Jumlah Cashback : Rp" + this.Cashback);
    }
}