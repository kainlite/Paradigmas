/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package relation;

/**
 *
 * @author kainlite
 */
public class Student {
    private String name = new String();
    private int course_quantity = 0;

    Student(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getCourseQuantity() {
        return course_quantity;
    }
    
    public void incrementCourseQuantity() {
        this.course_quantity += 1;
    }
}
