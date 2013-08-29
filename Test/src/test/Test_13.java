/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author kainlite
 */
public class Test_13 {
    public long test(Object obj) {
        if (obj instanceof Long && ((Long)obj).longValue() > 9999)
            return ((Long)obj).longValue();

        return -1L;
    }
    
    
    public static void main(String[] args) {
        Test_13 a = new Test_13();
        System.out.println(a.test(new Integer(9999)));
    }
}
