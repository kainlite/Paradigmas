/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author kainlite
 */
public class Test_8 {
    String message = "The message is: ";
    String temporal;
    
    public void setValue(int value) {
        if (value > 0) temporal = "Possitive";
            System.out.println(message + temporal);
    }
    
    public static void main(String[] args) {
        Test_8 a = new Test_8();
        a.setValue(-5);
    }
}
