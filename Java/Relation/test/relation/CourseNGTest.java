/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package relation;

import java.util.Vector;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author kainlite
 */
public class CourseNGTest {
    
    public CourseNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getName method, of class Course.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String name = "course_1";
        Course instance = new Course(name);
        String expResult = "course_1";
        String result = instance.getName();
        
        assertEquals(result, expResult);
    }

    /**
     * Test of setName method, of class Course.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "course_1";
        Course instance = new Course(null);
        instance.setName(name);
        String expResult = name;
        String result = instance.getName();
        
        assertEquals(result, expResult);
    }

    /**
     * Test of getTeacher method, of class Course.
     */
    @Test
    public void testGetTeacher() {
        System.out.println("getTeacher");
        Course instance = new Course("course_1");
        Teacher expResult = new Teacher("teacher");
        instance.setTeacher(expResult);
        Teacher result = instance.getTeacher();
        
        assertEquals(result, expResult);
    }

    /**
     * Test of setTeacher method, of class Course.
     */
    @Test
    public void testSetTeacher() {
        System.out.println("setTeacher");
        Teacher teacher = new Teacher("teacher");
        Course instance = new Course("course_1");
        instance.setTeacher(teacher);
        Teacher expResult = instance.getTeacher();
        
        assertEquals(teacher, expResult);
    }

    /**
     * Test of addInscription method, of class Course.
     */
    @Test
    public void testAddInscription() {
        System.out.println("addInscription");
        Student student = new Student("student_1");
        Course instance = new Course("course_1");
        instance.addInscription(student);
        Vector students = instance.enrolledStudents();
        
        assertEquals(students.size(), 1);
        assertEquals(students.get(0), student);
    }

    /**
     * Test of enrolledStudents method, of class Course.
     */
    @Test
    public void testEnrolledStudents() {
        System.out.println("enrolledStudents");
        Course instance = new Course("course_1");
        Vector expResult = new Vector();
        Vector result = instance.enrolledStudents();

        assertEquals(result, expResult);
    }

    /**
     * Test of countEnrolledStudents method, of class Course.
     */
    @Test
    public void testCountEnrolledStudents() {
        System.out.println("countEnrolledStudents");
        Course instance = new Course("course_1");
        int expResult = 0;
        int result = instance.countEnrolledStudents();
        
        assertEquals(result, expResult);
    }
}