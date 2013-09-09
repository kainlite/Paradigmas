/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integerlist;

import java.util.Vector;
 
/**
 *
 * @author alumno
 */
public class IntegerList {
    private Vector<Integer> list = new Vector();
 
    public void Add(int value) {
        list.add(value);
    }
    
    public int Sum() {
        int sum = 0;
        for(int element : list) sum += element;
        return sum;
    }
    
    public IntegerList Reverse() {
        IntegerList copy = new IntegerList();
        int j = 0;
        for(int i = list.size()-1; i >= 0; i--) {
            copy.Add(list.get(i));
        }
       
        return copy;
    }
    
    public int GetElement(int position) {
        return new Integer(list.elementAt(position));
    }
    
    public void RemoveElementsWithValue(int value) {
        Vector reconstructed = new Vector();
        for(int i = 0; i <= list.size()-1; i++) {
            if (list.get(i) != value) {
                reconstructed.add(list.get(i));
            }
        }
        
        list = reconstructed;
    }
    
    public int size() {
        int count = 0;
        
        for (int element : list) {
            count++;
        }
        
        return count;
    }
    
    public static IntegerList intrinsic(IntegerList a, IntegerList b) {
        IntegerList result = new IntegerList();
        
        for(int element_a : a.list) {
            for (int element_b : b.list) {
                if(element_a == element_b) { 
                    result.Add(element_a);
                }
            }
        }
                
        return result;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IntegerList list = new IntegerList();
        IntegerList list_b = new IntegerList();
        
        list.Add(10);
        list.Add(20);
        list.Add(30);
        list.Add(40);
        list.Add(50);
        
        System.out.println("4th Element " + list.GetElement(4));
        
        list.RemoveElementsWithValue(50);
        
        for (int element : list.list) {
            System.out.println("With less Elements " + element);
        }
        
        list_b = list.Reverse();
        
        for (int element : list_b.list) {
            System.out.println("Reversed Elements " + element);
        } 
        
        list.Add(60);
        list_b.Add(60);
        list.Add(70);
        
        list_b = IntegerList.intrinsic(list, list_b);
        
        for (int element : list_b.list) {
            System.out.println("Intrinsic Elements " + element);
        }          
    }
}