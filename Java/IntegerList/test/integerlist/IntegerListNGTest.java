/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package integerlist;

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
public class IntegerListNGTest {
    
    public IntegerListNGTest() {
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
     * Test of Add method, of class IntegerList.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        int value = 10;
        IntegerList instance = new IntegerList();
        instance.Add(value);
        assertEquals(instance.GetElement(0), value);
    }

    /**
     * Test of Sum method, of class IntegerList.
     */
    @Test
    public void testSum() {
        System.out.println("Sum");
        IntegerList instance = new IntegerList();
        instance.Add(1);
        instance.Add(2);
        instance.Add(3);
        
        int expResult = 6;
        int result = instance.Sum();
        assertEquals(result, expResult);
    }

    /**
     * Test of Reverse method, of class IntegerList.
     */
    @Test
    public void testReverse() {
        System.out.println("Reverse");
        IntegerList instance = new IntegerList();
        IntegerList expResult = new IntegerList();
        instance.Add(1);
        instance.Add(2);
        instance.Add(3);
        expResult.Add(3);
        expResult.Add(2);
        expResult.Add(1);
        instance.Reverse();
        
        for (int i = 0; i < expResult.size(); i++) {
          assertEquals(instance.GetElement(i), expResult.GetElement(i));   
        }
    }

    /**
     * Test of GetElement method, of class IntegerList.
     */
    @Test
    public void testGetElement() {
        System.out.println("GetElement");
        int position = 0;
        IntegerList instance = new IntegerList();
        instance.Add(0);
        int expResult = 0;
        int result = instance.GetElement(position);
        assertEquals(result, expResult);
    }

    /**
     * Test of RemoveElementsWithValue method, of class IntegerList.
     */
    @Test
    public void testRemoveElementsWithValue() {
        System.out.println("RemoveElementsWithValue");
        int value = 2;
        IntegerList instance = new IntegerList();
        instance.Add(0);
        instance.Add(1);
        instance.Add(2);
        instance.Add(2);
        IntegerList expResult = new IntegerList();
        expResult.Add(0);
        expResult.Add(1);
        instance.RemoveElementsWithValue(value);
        IntegerList result = instance;
        
        assertEquals(expResult.size(), 2);
        
        for (int i = 0; i < instance.size(); i++) {
            System.out.println(instance.GetElement(i));
        }
        
        for (int i = 0; i < result.size(); i++) {
          assertEquals(result.GetElement(i), expResult.GetElement(i));   
        }
    }

    /**
     * Test of size method, of class IntegerList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        IntegerList instance = new IntegerList();
        instance.Add(0);
        instance.Add(1);
        instance.Add(2);
        int expResult = 3;
        int result = instance.size();
        assertEquals(result, expResult);
    }

    /**
     * Test of intrinsic method, of class IntegerList.
     */
    @Test
    public void testIntrinsic() {
        System.out.println("intrinsic");
        IntegerList a = new IntegerList();
        IntegerList b = new IntegerList();
        IntegerList expResult = new IntegerList();
        a.Add(1);
        a.Add(2);
        a.Add(3);
        b.Add(0);
        b.Add(2);
        b.Add(3);
        expResult.Add(2);
        expResult.Add(3);
        IntegerList result = IntegerList.intrinsic(a, b);
        
        for (int i = 0; i < expResult.size(); i++) {
          assertEquals(result.GetElement(i), expResult.GetElement(i));   
        }
    }

    /**
     * Test of main method, of class IntegerList.
     */
    @Test
    public void testMain() {
        // Not really needed..
    }
}