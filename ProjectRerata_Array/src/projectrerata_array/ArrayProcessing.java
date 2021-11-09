/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata_array;
import java.util.Scanner;

/**
 *
 * @author Fahira
 */
public class ArrayProcessing {
    //Atribut Array berjenis Integer -> Data
    int[] dataBil = new int[100]; //dapat menginput dan menyimpan data maksimal 100.
    //Atribut Jumlah Data
    int n; // untuk menentukan banyaknya (n) data saat melakukan input.
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Banyaknya Data (n): ");
        this.n = input.nextInt();
        System.out.println("-----------------------------");
        for(int i = 0; i < n; i++){ //saat banyaknya (n) data sudah di-input, maka program akan melakukan perulangan sebanyak n tersebut.
            System.out.println("Masukkan Bilangan ke-" + (i+1) + ": "); //menggunakan (i+1) karena index mulainya dari 0, maka harus ditambah supaya bisa mulai dari 1.
            this.dataBil[i] = input.nextInt();
        }
    }
    
    double hitungRerata(int[] data){ //int[] data adalah variabel baru dari kumpulan bilangan yang sudah di-input pada method input.
        double sum = 0; //nilai awal dari sum adalah 0 (karena belum menjumlahkan apa-apa).
        for(int i = 0; i < this.n; i++){ //menggunakan this.n karena program hanya akan menjumlahkan data dari int[] data.
            sum += data[i]; //menjumlahkan semua data {int[] data).
        }
        double rerata = sum / this.n;
        return rerata;
    }
    
    //CARI NILAI MAX (PROJECT 1)
    int cariMax(int[] data){
        int nilaiMax = 0;
        for(int i = 0; i < this.n; i++){
            if(nilaiMax < data[i]){
                nilaiMax = data[i];
            }
        }
        return nilaiMax;
    }
    
    //CARI NILAI MIN (PROJECT 1)
    int cariMin(int[] data){
        int nilaiMin = 0;
        for(int i = 0; i > this.n; i++){
            if(nilaiMin > data[i]){
                nilaiMin = data[i];
            }
        }
        return nilaiMin;
    }
    
    //SORTING NILAI (PROJECT 2)
    static void urutkan(int[] data){
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data.length - 1; j++){
                if(data[j] > data[j + 1]){
                    int urut = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = urut;
                }
            }
        }
    }
    
    void output(){
        System.out.println("=============================");
        System.out.println("Rata-Rata: " + this.hitungRerata(this.dataBil));
        System.out.println("Nilai Maksimum: " + cariMax(this.dataBil));
        System.out.println("Nilai Minimum: " + cariMin(this.dataBil));
        System.out.println("-----------------------------");
        System.out.println("Sorting Nilai: ");
        urutkan(this.dataBil);
        for (int i = 0; i < this.n; i++){
            System.out.print(this.dataBil[100 - n+i] + " ");
        }
    }
}