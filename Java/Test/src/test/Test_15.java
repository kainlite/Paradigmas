/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author kainlite
 */
public class Test_15 {
    
    public static void main(String[] args) {
        Long L = new Long(7);
        int I = 7;
                
        if (L.equals( (Integer)I )) { 
        // The issue is on conversion so.
        // if (L.equals(Long.valueOf(I))) { // Right conversion 
            System.out.println("The text is a number");
        } else {
            System.out.println("The text is not a number");
        }
            
    }
    
}
