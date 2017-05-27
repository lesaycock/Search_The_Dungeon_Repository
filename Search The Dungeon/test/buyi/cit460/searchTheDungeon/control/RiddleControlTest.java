/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.searchTheDungeon.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gibran Millan
 */
public class RiddleControlTest {
    
    public RiddleControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcWizard method, of class RiddleControl.
     */
    @Test
    public void testCalcWizard() {
        System.out.println("calcWizard");
        

        //Test case #1
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        int numberOne = 1;
        int numberTwo = 2;
        int numberThree = 3;
        
        // create instance of Riddle control class
        RiddleControl instance = new RiddleControl();
        
        // expected output returned value
        int expResult = 1;
        
        // call function to run test
        int result = instance.calcWizard(numberOne, numberTwo, numberThree);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         //Test case #2
        System.out.println("\tTest case #2");
        
        // input values for test case 2
        numberOne = 5;
        numberTwo = -1;
        numberThree = 9;
        
        // expected output returned value
        expResult = -1;
        
        // call function to run test
        result = instance.calcWizard(numberOne, numberTwo, numberThree);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //Test case #3
        System.out.println("\tTest case #3");
        
        // input values for test case 3
        numberOne = 0;
        numberTwo = 4;
        numberThree = 12;
        
        // expected output returned value
        expResult = -1;
        
        // call function to run test
        result = instance.calcWizard(numberOne, numberTwo, numberThree);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //Test case #4
        System.out.println("\tTest case #4");
        
        // input values for test case 4
        numberOne = 3;
        numberTwo = 1;
        numberThree = 5;
        
        // expected output returned value
        expResult = -1;
        
        // call function to run test
        result = instance.calcWizard(numberOne, numberTwo, numberThree);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         //Test case #5
        System.out.println("\tTest case #5");
        
        // input values for test case 5
        numberOne = 0;
        numberTwo = 7;
        numberThree = 3;
        
        // expected output returned value
        expResult = -1;
        
        // call function to run test
        result = instance.calcWizard(numberOne, numberTwo, numberThree);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         //Test case #6
        System.out.println("\tTest case #6");
        
        // input values for test case 6
        numberOne = 3;
        numberTwo = 0;
        numberThree = 7;
        
        // expected output returned value
        expResult = -1;
        
        // call function to run test
        result = instance.calcWizard(numberOne, numberTwo, numberThree);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         //Test case #7
        System.out.println("\tTest case #7");
        
        // input values for test case 7
        numberOne = 7;
        numberTwo = 3;
        numberThree = 0;
        
        // expected output returned value
        expResult = -1;
        
        // call function to run test
        result = instance.calcWizard(numberOne, numberTwo, numberThree);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
    /**
     * Test of calcFaries method, of class RiddleControl.
     */
    @Test
    public void testCalcFaries() {
        System.out.println("calcFaries");
        

        //Test case #1
        System.out.println("\tTest case #1");
        
        // input values for test case 1
        int sizeOfMap = 26;
        int howManyRooms = 18;

        // create instance of Riddle control class
        RiddleControl instance = new RiddleControl();
        
        // expected output returned value
        int expResult = 69;
        
                
        // call function to run test
        int result = instance.calcFaries(sizeOfMap, howManyRooms);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");   
        
                //Test case #2
        System.out.println("\tTest case #2");
        
        // input values for test case 2
        sizeOfMap = 5;
        howManyRooms = -1;
        
        // expected output returned value
        expResult = -1;
        
                
        // call function to run test
        result = instance.calcFaries(sizeOfMap, howManyRooms);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
                //Test case #3
        System.out.println("\tTest case #3");
        
        // input values for test case 3
        sizeOfMap = 50;
        howManyRooms = 4;
        
        // expected output returned value
        expResult = -1;
        
        // call function to run test
        result = instance.calcFaries(sizeOfMap, howManyRooms);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
                //Test case #4
        System.out.println("\tTest case #4");
        
        // input values for test case 4
        sizeOfMap = 30;
        howManyRooms = 15;
        
        // expected output returned value
        expResult = -1;
        
        // call function to run test
        result = instance.calcFaries(sizeOfMap, howManyRooms);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
                //Test case #5
        System.out.println("\tTest case #5");
        
        // input values for test case 5
        sizeOfMap = 34;
        howManyRooms = 0;
        
        // expected output returned value
        expResult = -1;
        
        // call function to run test
        result = instance.calcFaries(sizeOfMap, howManyRooms);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
                        //Test case #6
        System.out.println("\tTest case #6");
        
        // input values for test case 6
        sizeOfMap = 34;
        howManyRooms = 34;
        
        // expected output returned value
        expResult = -1;
        
        // call function to run test
        result = instance.calcFaries(sizeOfMap, howManyRooms);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
                        //Test case #7
        System.out.println("\tTest case #7");
        
        // input values for test case 7
        sizeOfMap = 34;
        howManyRooms = 17;
        
        // expected output returned value
        expResult = -1;
        
        // call function to run test
        result = instance.calcFaries(sizeOfMap, howManyRooms);
        
        // compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 

    /**
     * Test of calcTrap method, of class RiddleControl.
     */
    @Test
    public void testCalcTrap() {
        System.out.println("calcTrap");
        
        //calcTrap test #1
        System.out.println("\tTest case #1");
        
        //input values for test case 1
        double radius = 11;
        double height = 12;
        
        //create instance of inventory control class
        RiddleControl instance = new RiddleControl();
        
        //expected output
        double expResult = 4561.59;
        
        //call function to run test
        double result = instance.calcTrap(radius, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //calcTrap test #2
        System.out.println("\tTest case #2");
        
        //input values 
        radius = -11;
        height = 12;
        
        //expected output
        expResult = -1;
        
        //call function to run test
        result = instance.calcTrap(radius, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //calcTrap test #3
        System.out.println("\tTest case #3");
        
        //input values 
        radius = -11;
        height = 0;
        
        //expected output
        expResult = -1;
        
        //call function to run test
        result = instance.calcTrap(radius, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //calcTrap test #4
        System.out.println("\tTest case #4");
        
        //input values 
        radius = 3;
        height = 4;
        
        //expected output
        expResult = -1;
        
        //call function to run test
        result = instance.calcTrap(radius, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //calcTrap test #5
        System.out.println("\tTest case #5");
        
        //input values 
        radius = 0;
        height = 10;
        
        //expected output
        expResult = -1;
        
        //call function to run test
        result = instance.calcTrap(radius, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //calcTrap test #6
        System.out.println("\tTest case #6");
        
        //input values 
        radius = 10;
        height = 0;
        
        //expected output
        expResult = -1;
        
        //call function to run test
        result = instance.calcTrap(radius, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        //calcTrap test #7
        System.out.println("\tTest case #7");
        
        //input values 
        radius = 10;
        height = 100;
        
        //expected output
        expResult = -1;
        
        //call function to run test
        result = instance.calcTrap(radius, height);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}