
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
 * This is the test class for SkipList class.
 * 
 * @author guangkai
 * @version 1 9/23/2022 2:47 pm
 */
public class SkipNodeTest extends TestCase {
    
    /**
     * This will test the getForward() method.
     */
    @Test
    public void testGetForward() {

        Point point1 = new Point(3, 3, "point1");
        SkipNode<String, Point> newNode = 
            new SkipNode<String, Point>("point1", point1, 3);
        Point point2 = new Point(3, 4, "point2");
        @SuppressWarnings("unused")
        SkipNode<String, Point> newNode1 = 
            new SkipNode<String, Point>("point2", point2, 3);
        SkipList<String, Point> newList = new SkipList<String, Point>();
        newList.insert("point1", point1);
        newList.insert("point2", point2);
        
        assertFalse(newNode.getForward().toString().
            equals("point2, point2, 3, 4"));
    }
    

    /**
     * This will test the getPair() method.
     */
    @Test
    public void testGetPair() {

        Point point1 = new Point(3, 3, "point1");
        SkipNode<String, Point> newNode = 
            new SkipNode<String, Point>("point1", point1, 3);
        
        assertTrue(newNode.getPair().key().equals("point1"));
        String str = newNode.getPair().toString();
        assertTrue(str.equals("point1, 3, 3"));
    }


    /**
     * This will test the getDepth() method.
     */
    @Test
    public void testGetDepth() {

        Point point1 = new Point(3, 3, "point1");
        SkipNode<String, Point> newNode = 
            new SkipNode<String, Point>("point1", point1, 3);
        assertEquals(newNode.getDepth(), 3);
    }


    /**
     * This will test element() method.
     */
    @Test
    public void testElement() {

        Point point1 = new Point(3, 3, "point1");
        SkipNode<String, Point> newNode = 
            new SkipNode<String, Point>("point1", point1, 3);
        assertTrue(newNode.element().equals(point1));
    }


    /**
     * This will test key() method.
     */
    @Test
    public void testKey() {

        Point point1 = new Point(3, 3, "point1");
        SkipNode<String, Point> newNode = 
            new SkipNode<String, Point>("point1", point1, 3);
        assertTrue(newNode.key().equals("point1"));
    }
}
