/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author kainlite
 */
public class Test_6 {
    int i = 0;
    
    public static int change_i(int i) {
       i = 2;
       i *= 2;
       return i; 
    }
    
    public static void main(String[] args) {
        int i = 0; // Needed to run
        i = change_i(i);
        System.out.println(i);
    }
    
}
