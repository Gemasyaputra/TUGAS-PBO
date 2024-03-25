/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_looping1;

/**
 *
 * @author Asus
 */
public class gaji_karyawan {
     public static void main(String[] args) {
      
        long gajiandri = 10000000;
        long gajibudi = 5000000;
        double pajak, gajibersih;

        //jika gaji besar dari 6juta maka pajak 3%
        //jika gaji kecil dari 6juta maka pajak 2%
       
        pajak = 0.02 * gajibudi;
        gajibersih = gajibudi - pajak;
        System.out.println("pajak budi =" + pajak);
        System.out.println("gaji bersih andi =" + gajibersih);
   
        pajak = 0.03 * gajiandri;
        gajibersih = gajiandri - pajak;
        
        System.out.println("pajak andri =" + pajak);
        System.out.println("gaji bersih andri =" + gajibersih);

     }
    
}
