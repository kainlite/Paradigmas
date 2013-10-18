
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
public class Teacher {
    private String name    = new String();
    private Vector courses = new Vector(2, 0);

    Teacher() {
        this.name = null;
    }

    Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void assignCourse(Course course) {
        this.courses.add(course);
    }
}

