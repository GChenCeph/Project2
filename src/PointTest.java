

import org.junit.Test;
import student.TestCase;

//Virginia Tech Honor Code Pledge:
//
//As a Hokie, I will conduct myself with honor and integrity at all times.
//I will not lie, cheat, or steal, nor will I accept the actions of those
//who do.
//
//-- guangkai

/**
* This is the test class for Rectangle class.
* 
* @author guangkai
* @version 1 9/4/2022 11:08 pm
*/
public class PointTest extends TestCase {

    
    /**
     * This will test getX() method.
     */
    @Test
    public void testGetX() {
        
        Point point1 = new Point(3, 4, "point1");

        assertEquals(point1.getX(), 3);
    }


    /**
     * This will test getY() method.
     */
    @Test
    public void testGetY() {
        
        Point point1 = new Point(3, 4, "point1");

        assertEquals(point1.getY(), 4);
    }
    
    
    /**
     * This will test getName() method.
     */
    @Test
    public void testGetName() {
        
        Point point1 = new Point(3, 4, "point1");

        assertEquals(point1.getName(), "point1");
    }
    
    
    /**
     * This will test isInside() method.
     */
    @Test
    public void testIsInside() {
        
        Point pointIn1 = new Point(6, 6, "pointOut1");
        
        Point pointOut1 = new Point(4, 4, "pointOut1");
        Point pointOut2 = new Point(5, 4, "pointOut2");
        Point pointOut3 = new Point(6, 4, "pointOut3");
        Point pointOut4 = new Point(10, 4, "pointOut4");
        Point pointOut5 = new Point(11, 4, "pointOut5");
        Point pointOut6 = new Point(11, 5, "pointOut6");
        Point pointOut7 = new Point(11, 6, "pointOut7");
        Point pointOut8 = new Point(11, 10, "pointOut8");
        Point pointOut9 = new Point(11, 11, "pointOut9");
        Point pointOut10 = new Point(10, 11, "pointOut10");
        Point pointOut11 = new Point(9, 11, "pointOut11");
        Point pointOut12 = new Point(5, 11, "pointOut12");
        Point pointOut13 = new Point(4, 11, "pointOut13");
        Point pointOut14 = new Point(4, 10, "pointOut14");
        Point pointOut15 = new Point(4, 9, "pointOut15");
        Point pointOut16 = new Point(4, 5, "pointOut16");
        
        Point pointSide1 = new Point(5, 5, "pointSide1");
        Point pointSide2 = new Point(8, 5, "pointSide2");
        Point pointSide3 = new Point(10, 5, "pointSide3");
        Point pointSide4 = new Point(10, 8, "pointSide4");
        Point pointSide5 = new Point(10, 10, "pointSide5");
        Point pointSide6 = new Point(8, 10, "pointSide6");
        Point pointSide7 = new Point(5, 10, "pointSide7");
        Point pointSide8 = new Point(5, 8, "pointSide8");
        
        assertTrue(pointIn1.isInside(5, 5, 5, 5));
        assertFalse(pointOut1.isInside(5, 5, 5, 5));
        assertFalse(pointOut2.isInside(5, 5, 5, 5));
        assertFalse(pointOut3.isInside(5, 5, 5, 5));
        assertFalse(pointOut4.isInside(5, 5, 5, 5));
        assertFalse(pointOut5.isInside(5, 5, 5, 5));
        assertFalse(pointOut6.isInside(5, 5, 5, 5));
        assertFalse(pointOut7.isInside(5, 5, 5, 5));
        assertFalse(pointOut8.isInside(5, 5, 5, 5));
        assertFalse(pointOut9.isInside(5, 5, 5, 5));
        assertFalse(pointOut10.isInside(5, 5, 5, 5));
        assertFalse(pointOut11.isInside(5, 5, 5, 5));
        assertFalse(pointOut12.isInside(5, 5, 5, 5));
        assertFalse(pointOut13.isInside(5, 5, 5, 5));
        assertFalse(pointOut14.isInside(5, 5, 5, 5));
        assertFalse(pointOut15.isInside(5, 5, 5, 5));
        assertFalse(pointOut16.isInside(5, 5, 5, 5));
        assertFalse(pointSide1.isInside(5, 5, 5, 5));
        assertFalse(pointSide2.isInside(5, 5, 5, 5));
        assertFalse(pointSide3.isInside(5, 5, 5, 5));
        assertFalse(pointSide4.isInside(5, 5, 5, 5));
        assertFalse(pointSide5.isInside(5, 5, 5, 5));
        assertFalse(pointSide6.isInside(5, 5, 5, 5));
        assertFalse(pointSide7.isInside(5, 5, 5, 5));
        assertFalse(pointSide8.isInside(5, 5, 5, 5));
    }
    
    
    /**
     * This will test toString() method.
     */
    @Test
    public void testToString() {
        Point point1 = new Point(3, 4, "point1");

        assertEquals(point1.toString(), "point1, 3, 4");
    }
    
    
    /**
     * This will test toString() method.
     */
    @Test
    public void testToString2() {
        Point point1 = new Point(3, 4, "point1");

        assertTrue(point1.toString2().equals("(3, 4)"));
    }
    
    /**
     * This will test setName().
     */
    @Test
    public void testSetName() {
        
        Point point1 = new Point(3, 4, "point1");
        point1.setName("point2");
        
        assertEquals(point1.getName(), "point2");
    }
}
