
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Rizal {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int barang, harga=0, uang;
       
        System.out.println("=Koperasi SMK Telkom=");
        System.out.println("=====pilih barang====");
        System.out.println("1. topi");
        System.out.println("2. dasi hitam");
        System.out.println("3. dasi putih");
        System.out.println("4. sabuk");
        System.out.println("5. kaos kaki");
        System.out.println("=====================");
        barang= input.nextInt();
       
        
        switch (barang) {
            case 1:
                System.out.println("harga topi= rp.20.000"); harga = 20000;
            break;
            case 2:
                System.out.println("harga dasi hitam= rp.10.000"); harga = 10000;
            break;
            case 3:
                System.out.println("harga dasi putih= rp.10.000"); harga = 10000;
            break;  
            case 4:
                System.out.println("harga sabuk= rp.15.000");harga = 15000;
            break;
            case 5:
                System.out.println("harga kaos kaki= rp.10.000");harga = 10000;
            break;
                
        }
        System.out.println("masukkan uang anda= ");
        uang= input.nextInt();
        
        if (uang>harga) {
            System.out.println("uang kembalian anda= "+ (uang-harga));
        } else {
            System.out.println("mohon maaf uang anda kurang");
        }
        
        
    }
    
    
}
