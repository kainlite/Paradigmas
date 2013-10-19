
/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
 */
package relation;

//~--- JDK imports ------------------------------------------------------------

import java.util.Vector;

/**
 *
 * @author kainlite
 */
public class Student {
    private String name            = new String();
    private int    course_quantity = 0;
    private Vector inscriptions    = new Vector(10, 0);

    Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector getInscriptions() {
        return inscriptions;
    }

    public int getCourseQuantity() {
        return course_quantity;
    }

    public void incrementCourseQuantity() {
        this.course_quantity += 1;
    }

    public void Enroll(Course course) throws CourseException {
        if ((course.getTeacher() != null) && (course.getTeacher().getName() != null) && 
                !course.getTeacher().getName().equals("")) {
            inscriptions.add(new Inscription(course));
            incrementCourseQuantity();
            course.addInscription(this);
        } else {
            throw new CourseException("The requested course has no assigned "
                                      + "teacher yet, please try again later..");
        }
    }
}


