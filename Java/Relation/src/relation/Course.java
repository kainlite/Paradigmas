
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
public class Course {
    private int     duration     = 0;
    private String  name         = new String();
    private Vector  inscriptions = new Vector(100, 0);
    private Teacher teacher;

    Course(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        teacher.assignCourse(this);
        this.teacher = teacher;
    }

    public void addInscription(Student student) {
        inscriptions.add(student);
    }

    public Vector enrolledStudents() {
        return inscriptions;
    }

    public int countEnrolledStudents() {
        int sum = 0;

        for (Object element : inscriptions) {
            sum += 1;
        }

        return sum;
    }
}

