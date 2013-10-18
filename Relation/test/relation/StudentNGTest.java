/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package relation;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class StudentNGTest {
    
    public StudentNGTest() {
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
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student("student");
        String expResult = "student";
        String result = instance.getName();
        
        assertEquals(result, expResult);
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "student";
        Student instance = new Student(null);
        instance.setName(name);

        String result = instance.getName();
        assertEquals(result, name);
    }

    /**
     * Test of getInscriptions method, of class Student.
     */
    @Test
    public void testGetInscriptions() {
        System.out.println("getInscriptions");
        Course course = new Course("course");
        Teacher teacher = new Teacher("teacher");
        course.setTeacher(teacher);
        Student instance = new Student("student");
        Inscription inscription = new Inscription(course);
        try {
            instance.Enroll(course);
        } catch (CourseException ex) {
            Logger.getLogger(StudentNGTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Inscription expResult = inscription;
        Inscription result = (Inscription) instance.getInscriptions().get(0);
        
        assertEquals(result.getDate(), expResult.getDate());
        assertEquals(result.getInscription(), expResult.getInscription());
    }

    /**
     * Test of getCourseQuantity method, of class Student.
     */
    @Test
    public void testGetCourseQuantity() {
        System.out.println("getCourseQuantity");
        Student instance = new Student("student");
        int expResult = 0;
        int result = instance.getCourseQuantity();
        
        assertEquals(result, expResult);
    }

    /**
     * Test of incrementCourseQuantity method, of class Student.
     */
    @Test
    public void testIncrementCourseQuantity() {
        System.out.println("incrementCourseQuantity");
        Student instance = new Student("student");
        instance.incrementCourseQuantity();
        int expResult = 1;
        int result = instance.getCourseQuantity();
        
        assertEquals(result, expResult);
    }

    /**
     * Test of Enroll method, of class Student.
     */
    @Test
    public void testEnroll() throws Exception {
        System.out.println("Enroll");
        Course course = new Course("course");
        Teacher teacher = new Teacher("teacher");
        course.setTeacher(teacher);
        Student instance = new Student("student");
        instance.Enroll(course);
        
        int expResult = 1;
        int result = instance.getCourseQuantity();
        
        assertEquals(result, expResult);
    }
}