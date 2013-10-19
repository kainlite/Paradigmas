/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package relation;

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
public class TeacherNGTest {
    
    public TeacherNGTest() {
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
     * Test of getName method, of class Teacher.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Teacher instance = new Teacher();
        String expResult = null;
        String result = instance.getName();
        
        assertEquals(result, expResult);
    }

    /**
     * Test of setName method, of class Teacher.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "teacher";
        Teacher instance = new Teacher();
        instance.setName(name);
        String result = instance.getName();
        
        assertEquals(result, name);
    }

    /**
     * Test of assignCourse method, of class Teacher.
     */
    @Test
    public void testAssignCourse() {
        System.out.println("assignCourse");
        Course course = new Course("course_1");
        Teacher instance = new Teacher("teacher");
        course.setTeacher(instance);

        assertEquals(instance, course.getTeacher());
    }
}