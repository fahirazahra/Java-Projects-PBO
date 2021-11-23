/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectsiakad;
import java.time.*;

/**
 *
 * @author Fahira
 */
public class ProjectSIAKAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Contoh Objek Data Pegawai
        // contoh obyek data pegawai
        Pegawai p1 = new Pegawai("0222", "Ucup", 2, LocalDate.of(1994, 2, 22));
        p1.printPegawai();
         
        // contoh obyek data pegawai dosen
        Dosen p2 = new Dosen("0902", "Udin", 2, LocalDate.of(1995, 2, 9), "196712140002");
        p2.printPegawai();
         
        // contoh obyek data pegawai nondosen
        NonDosen p3 = new NonDosen("0214", "Ujang", 1, LocalDate.of(1997, 2, 14));
        p3.printPegawai();
    }
}