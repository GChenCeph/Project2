

import org.junit.Test;
import student.TestCase;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
//
// -- guangkai

/**
 * This is the test class for KVPair class.
 * 
 * @author guangkai
 * @version 1 9/4/2022 11:01 pm
 */
public class KVPairTest extends TestCase {

    /**
     * This will test compareTo().
     */
    @Test
    public void testPairCompareTo() {

        Point point1 = new Point(3, 3, "point1");
        KVPair<String, Point> newPair1 = 
            new KVPair<String, Point>("point1", point1);
        assertEquals(newPair1.compareTo(newPair1), 0);
    }


    /**
     * This will test compareTo().
     */
    @Test
    public void testKeyCompareTo() {

        Point point1 = new Point(3, 3, "point1");
        KVPair<String, Point> newPair1 = 
            new KVPair<String, Point>("point1", point1);

        assertEquals(newPair1.key().compareTo(newPair1.key()), 0);
        assertEquals(newPair1.key(), "point1");
    }
    
    
    /**
     * This will test value().
     */
    @Test
    public void testKey() {

        Point point1 = new Point(3, 3, "point1");
        KVPair<String, Point> newPair1 = 
            new KVPair<String, Point>("point1", point1);

        assertEquals(newPair1.key(), point1.getName());
    }


    /**
     * This will test value().
     */
    @Test
    public void testValue() {

        Point point1 = new Point(3, 3, "point1");
        KVPair<String, Point> newPair1 = 
            new KVPair<String, Point>("point1", point1);

        assertEquals(newPair1.value(), point1);
    }


    /**
     * This will test toString().
     */
    @Test
    public void testToString() {

        Point point1 = new Point(3, 3, "point1");
        KVPair<String, Point> newPair1 = 
            new KVPair<String, Point>("point1", point1);

        assertEquals(newPair1.toString(), "point1, 3, 3");
    }
}
