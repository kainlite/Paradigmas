/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package relation;

import java.util.Date;
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
public class InscriptionNGTest {
    
    public InscriptionNGTest() {
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
     * Test of getDate method, of class Inscription.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Course course = new Course("course_1");
        Inscription instance = new Inscription(course);
        Date expResult = new Date();
        Date result = instance.getDate();
        
        assertEquals(result, expResult);
    }

    /**
     * Test of getInscription method, of class Inscription.
     */
    @Test
    public void testGetInscription() {
        System.out.println("getInscription");
        Course course = new Course("course_1");
        Inscription instance = new Inscription(course);
        Course expResult = course;
        Course result = instance.getInscription();
        
        assertEquals(result, expResult);
    }
}