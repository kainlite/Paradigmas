/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author kainlite
 */
public class Test_9 {
    
    public static void main(String[] args) {
        Long L = new Long(7);
        String S = new String("7");
        
        if (L.equals(Integer.parseInt(S))) {
            System.out.println("The text is a number");
        } else {
            System.out.println("The text is not a number");
        }
            
    }
    
}
