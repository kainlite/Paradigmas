/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author kainlite
 */
public class Test_12 {
    
    public static void main(String[] args) {
        Integer I = new Integer(7);
        String S = new String("7");
        
        //if (I.equals( (Integer)S )) { // The issue is on conversion so.
        if (S.equals(String.valueOf(I))) { // Right conversion 
            System.out.println("The text is a number");
        } else {
            System.out.println("The text is not a number");
        }
            
    }
    
}
