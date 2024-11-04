/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai.tap.pkg1;

/**
 *
 * @author Admin
 */
public class BaiTap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sumOdd = 0;  
        int sumEven = 0; 

        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { 
                sumEven += i;
            } else {           
                sumOdd += i;
            }
        }

       
        System.out.println("Sum of even numbers from 1 to 100: " + sumEven);
        System.out.println("Sum of odd numbers from 1 to 100: " + sumOdd);
    }
        // TODO code application logic here
    }
    
}
