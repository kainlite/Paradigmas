/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package relation;

/**
 *
 * @author kainlite
 */
public class Teacher {
    private String name = new String();
    
    Teacher(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
