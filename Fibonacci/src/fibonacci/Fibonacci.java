/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author kainlite
 */
public class Fibonacci {
    
    public int Calculate(int number) {
        if (number == 0) return 0;
        if (number < 2) return 1;
              
        return Calculate(number-2) + Calculate(number-1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fibonacci number = new Fibonacci();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int result = number.Calculate(i);
        System.out.println("Result: " + result);
    }
}
