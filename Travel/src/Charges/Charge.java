/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 * No esta implementado como el modelo, se hizo para jugar con las GUIs no mas.
 * 
 */
package Charges;

/**
 *
 * @author kainlite
 */
public interface Charge {
    int max_charge = 40000;
    char coupled = 'C';
    char trailer = 'T';
    char simple = 'S';
    
    public int getCharge();
}
