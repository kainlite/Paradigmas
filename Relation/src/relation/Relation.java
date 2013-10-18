
/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
 */
package relation;

/**
 *
 * @author kainlite
 */
public class Relation {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Student student_1 = new Student("student_1");
        Student student_2 = new Student("student_2");
        Teacher teacher   = new Teacher("teacher");
        Course  course_1  = new Course("course_1");
        Course  course_2  = new Course("course_2");

        // Assign teacher to course
        course_1.setTeacher(teacher);

        // Enrolling student_1 in course_1
        try {
            student_1.Enroll(course_1);
        } catch (CourseException ex) {
            System.out.println("Exception in enroll student_1 course_1: " + ex);
        }

        // Enrolling student_2 in course_1
        try {
            student_2.Enroll(course_1);
        } catch (CourseException ex) {
            System.out.println("Exception in enroll student_2 in course_1: " 
                    + ex.getMessage());
        }

        // Enrolling student_1 in course_2 that does not have an assigned teacher
        try {
            student_1.Enroll(course_2);
        } catch (CourseException ex) {
            System.out.println("Exception in enroll student_1 course_2: " 
                    + ex.getMessage());
        }

        // Printing enrolled students for course_1
        for (int i = 0; i <= course_1.enrolledStudents().size() - 1; i++) {
            Student     student     = (Student) course_1.enrolledStudents().get(i);
            Inscription inscription = null;

            System.out.println("Enrolled in course_1: " + student.getName());
        }

        // Printing enrolled students for course_2
        for (int i = 0; i <= course_2.enrolledStudents().size() - 1; i++) {
            Student student = (Student) course_1.enrolledStudents().get(i);

            System.out.println("Enrolled in course_2: " + student.getName());
        }

        // Printing counts of enrolled students in courses
        System.out.println("course_1 count:" + course_1.countEnrolledStudents());
        System.out.println("course_2 count:" + course_2.countEnrolledStudents());

        // Printing students count of courses
        System.out.println("student_1 count:" + student_1.getCourseQuantity());
        System.out.println("student_2 count:" + student_2.getCourseQuantity());

        // Printing inscriptions for student_1
        for (Object element : student_1.getInscriptions()) {
            Inscription inscription = ((Inscription) element);

            System.out.println("student_1 enrolled in: " + inscription.getInscription().getName() + " on: "
                               + inscription.getDate());
        }

        // Printing inscriptions for student_2
        for (Object element : student_2.getInscriptions()) {
            Inscription inscription = ((Inscription) element);

            System.out.println("student_2 enrolled in: " + inscription.getInscription().getName() + " on: "
                               + inscription.getDate());
        }
    }
}

