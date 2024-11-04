/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap3;

/**
 *
 * @author Admin
 */
public class BaiTap3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100:");

        for (int num = 2; num <= 100; num++) { 
            boolean isPrime = true;

            
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) { 
                    isPrime = false;
                    break;
                }
            }

           
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        // TODO code application logic here
    }
    
}
