/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *
 * @author kainlite
 */
public class FibonacciNGTest {
    
    public FibonacciNGTest() {
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
     * Test of Calculate method, of class Fibonacci.
     */
    @Test
    public void testCalculate() {
        System.out.println("Calculate");
        List<Integer> numbers = new ArrayList<Integer>() {
            { add(0); add(1); add(2); add(3); add(4); add(5); add(6); add(7); add(8); add(9); add(10);}
        };
        
        
        List<Integer> expResult = new ArrayList<Integer>() {
            {add(0); add(1); add(1); add(2); add(3); add(5); add(8); add(13); add(21); add(34); add(55); add(89);}
        };
        
        Fibonacci instance = new Fibonacci();
        for (int i = 0; i < numbers.size(); i++) {
            int result = instance.Calculate(numbers.get(i));
            assertEquals((int)result, (int)expResult.get(i));
        }
    }

    /**
     * Test of main method, of class Fibonacci.
     */
    
    @Test 
    @Parameters(value="args")
    public void testMain(@Optional String[] args) {
        System.out.println("main");
        int input = 9;
        int expResult = 34;
        
        Fibonacci number = new Fibonacci();

        int result = number.Calculate(input);
                
        assertEquals(result, expResult);
    }
}