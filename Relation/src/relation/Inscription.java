
/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
 */
package relation;

//~--- JDK imports ------------------------------------------------------------

import java.util.Date;

/**
 *
 * @author kainlite
 */
public class Inscription {
    private Date   date;
    private Course inscription;

    Inscription(Course course) {
        this.date        = new Date();
        this.inscription = course;
    }

    public Date getDate() {
        return this.date;
    }

    public Course getInscription() {
        return this.inscription;
    }
}

