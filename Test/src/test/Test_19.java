/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author kainlite
 */
public class Test_19 {
    static void m(char c, int i) {
        System.out.println("Int: " + i);
    }
    
    static void m(int i, char c) {
        System.out.println("Char: " + c);
    }
    
    public static void main(String[] args) {
        Integer b = 1;
        m('a', b);
        m(b, 's');
    }
}
