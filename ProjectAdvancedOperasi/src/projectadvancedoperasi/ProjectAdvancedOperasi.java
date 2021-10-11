/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author Fahira
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Operasi A = new Operasi();
        System.out.println(A.jumlahkan(3, 4));
        
        Operasi B = new Operasi();
        System.out.println(B.jumlahkan(4, 7, -9));
        
        Operasi C = new Operasi();
        System.out.println(C.jumlahkan(3.4, -0.002, 0.12313));   
    }
}