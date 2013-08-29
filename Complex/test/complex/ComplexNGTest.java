/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package complex;

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
public class ComplexNGTest {
    
    public ComplexNGTest() {
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
     * Test of setReal method, of class Complex.
     */
    @Test
    public void testSetReal() {
        System.out.println("setReal");
        double real = 0.0;
        Complex instance = new Complex(real , 0);
        instance.setReal(real);
    }

    /**
     * Test of setImaginary method, of class Complex.
     */
    @Test
    public void testSetImaginary() {
        System.out.println("setImaginary");
        double imaginary = 0.0;
        Complex instance = new Complex(0, imaginary);
        instance.setImaginary(imaginary);
        assertEquals(instance.getReal(), 0.0);
        assertEquals(instance.getImaginary(), 0.0);
    }

    /**
     * Test of getComplex method, of class Complex.
     */
    @Test
    public void testGetComplex() {
        System.out.println("getComplex");
        Complex instance = new Complex(0, 0);
        Complex expResult = new Complex(0, 0);
        Complex result = instance.getComplex();
        assertEquals(result.getReal(), expResult.getReal());
        assertEquals(result.getImaginary(), expResult.getImaginary());
    }

    /**
     * Test of Show method, of class Complex.
     */
    @Test
    public void testShow() {
        System.out.println("Show");
        Complex instance_a = new Complex(0, 1);
        Complex instance_b = new Complex(1, 2);
        instance_a.Show();
        instance_b.Show();
    }

    /**
     * Test of Sum method, of class Complex.
     */
    @Test
    public void testSum() {
        System.out.println("Sum");
        Complex instance_a = new Complex(0, 1);
        Complex instance_b = new Complex(1, 2);
        instance_a.Sum(instance_b);
        instance_a.Show();
        assertEquals(instance_a.getReal(), 1.0);
        assertEquals(instance_a.getImaginary(), 3.0);
    }

    /**
     * Test of main method, of class Complex.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Complex.main(args);
    }
}