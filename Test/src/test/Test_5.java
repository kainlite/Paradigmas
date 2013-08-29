/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author kainlite
 */
public class Test_5 {
     
    public static void change_i(int i[]) {
        System.out.println(i);
        i[0] = i[0] * i[2];
        i[0] *= i[1];
    }
    
    public static void main(String[] args) {
        int i[] = {1, 5, 10};
        
        for (int j = 0; j < 3; j++) {
            change_i(i);
            System.out.println("i[j]= " + i[j]);
        }
        
        System.out.println("i[0] = " + i[0]);
        System.out.println("i[1] = " + i[1]);
        System.out.println("i[2] = " + i[2]);
    }
}
