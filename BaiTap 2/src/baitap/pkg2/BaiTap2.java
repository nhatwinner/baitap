/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap.pkg2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BaiTap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        
        int sum = 0;  
        int number = Math.abs(n); 

        while (number > 0) {
            int digit = number % 10;  
            sum += digit;             
            number /= 10;             
        }

        System.out.println("Sum of digits: " + sum);
    }
        // TODO code application logic here
    }
    
}
