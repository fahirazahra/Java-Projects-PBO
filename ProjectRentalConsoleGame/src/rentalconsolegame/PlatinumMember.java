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
public class PlatinumMember extends GoldMember { //Menggunakan Extends karena class PlatinumMember merupakan subclass dari class GoldMember.
    
    int hargaSewa = 45000;
    double Diskon = 3/100; //Diskon untuk Member Platinum (3%)
    long Pulsa;
    
    @Override
    protected void Benefit1(long berapaLama){ //Access Modifier: Protected
        double biayaSewa = this.hargaSewa * berapaLama;
        double Total = biayaSewa - (biayaSewa*this.Diskon);
        System.out.println("Total Sewa      : Rp" + Total);
    }
    
    @Override
    protected void Benefit2(long berapaLama){ //Access Modifier: Protected
        Point = berapaLama * 10; //Point: 10/hari
        System.out.println("Jumlah Poin     : " + Point);
    }
    
    @Override
    protected void Benefit3(){ //Access Modifier: Protected
        Cashback = 10000;
        System.out.println("Jumlah Cashback : Rp" + Cashback);
    }
    
    protected void Benefit4(long berapaLama){ //Access Modifier: Protected
        this.Pulsa = berapaLama * 5000;
        System.out.println("Bonus Pulsa     : Rp" + this.Pulsa);
    }
}