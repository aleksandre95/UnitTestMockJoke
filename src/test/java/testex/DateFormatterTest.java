/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testex;

import java.util.Date;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class DateFormatterTest {
    
    public DateFormatterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFormattedDate method, of class DateFormatter.
     */
    @Test
    public void testGetFormattedDate() throws Exception {
        System.out.println("getFormattedDate");
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date.toString());
        String timeZone = "Europe/Kiev";
        DateFormatter dateFormatter = new DateFormatter();
        
         
       String result = dateFormatter.getFormattedDate(timeZone,date);
       String expResult = "14 III 2017 07:00 PM";
        assertThat(expResult, is(result));
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of main method, of class DateFormatter.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
