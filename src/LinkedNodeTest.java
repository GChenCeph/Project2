
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
* This is the test class for LinkedNode class.
* 
* @author guangkai
* @version 1 9/23/2022 2:47 pm
*/
public class LinkedNodeTest extends TestCase {

    
    /**
     * This will test getRec().
     */
    @Test
    public void testGetRec() {
        
        Point point1 = new Point(3, 3, "point1");
        LinkedNode<Point> node = new LinkedNode<Point>(point1);
        
        assertEquals(node.getRec(), point1);
    }
    
    
    /**
     * This will test setForward() and 
     * getForward().
     */
    @Test
    public void testSetForward() {
        
        Point point1 = new Point(3, 3, "point1");
        LinkedNode<Point> node = new LinkedNode<Point>(point1);
        Point point2 = new Point(3, 4, "point2");
        LinkedNode<Point> node2 = new LinkedNode<Point>(point2);
        node.setForward(node2);
        
        assertEquals(node.getForward(), node2);
    }
    
    
    /**
     * This will test toString().
     */
    @Test
    public void testToString() {
        
        Point point1 = new Point(3, 3, "point1");
        LinkedNode<Point> node = new LinkedNode<Point>(point1);
        
        assertEquals(node.toString(), "point1, 3, 3");
    }
}
