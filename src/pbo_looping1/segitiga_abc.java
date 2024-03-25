/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_looping1;

/**
 *
 * @author Asus
 */
public class segitiga_abc {
    public static void main(String[] args) {
     char huruf = 'A';
        char i;
        char j;
        for (i=5;i>=1;i--) {
            for (j=1;j<=i;j++) {
                System.out.print((char)(64+j)+ "");
                huruf++;
            }
            System.out.println();
        }   
    }
}
