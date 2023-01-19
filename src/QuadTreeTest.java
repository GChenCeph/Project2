
import org.junit.Test;
import student.TestCase;
import student.TestableRandom;

//Virginia Tech Honor Code Pledge:
//
//As a Hokie, I will conduct myself with honor and integrity at all times.
//I will not lie, cheat, or steal, nor will I accept the actions of those
//who do.
//
//-- guangkai

/**
* This is the test class for Leaf class.
* 
* @author guangkai
* @version 1 9/23/2022 2:47 pm
*/
public class QuadTreeTest extends TestCase {
    
    
    /**
     * This will test getRoot().
     */
    public void testGetRoot() {
        
        QuadTree<Point> tree = new QuadTree<Point>();
        
        assertEquals(tree.getRoot().getType(), 0);
    }
    
    
    /**
     * This will test insert().
     */
    @Test
    public void testInsert() {
        
        QuadTree<Point> tree = new QuadTree<Point>();
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        tree.insert(point1);
        tree.insert(point2);
        tree.insert(point3);
        tree.insert(point4);
        tree.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024: Internal\r\n"
            + "  Node at 0, 0, 512: Empty\r\n"
            + "  Node at 512, 0, 512: Internal\r\n"
            + "    Node at 512, 0, 256:\r\n"
            + "    (point1, 522, 30)\r\n"
            + "    Node at 768, 0, 256:\r\n"
            + "    (point2, 1020, 30)\r\n"
            + "    Node at 512, 256, 256:\r\n"
            + "    (point3, 522, 422)\r\n"
            + "    Node at 768, 256, 256:\r\n"
            + "    (point4, 1020, 422)\r\n"
            + "  Node at 0, 512, 512: Empty\r\n"
            + "  Node at 512, 512, 512: Empty\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test insert().
     */
    @Test
    public void testInsert1() {
        
        QuadTree<Point> tree = new QuadTree<Point>();
        Point point1 = new Point(522, 30, "point1");
        tree.insert(point1);
        tree.insert(point1);
        tree.insert(point1);
        tree.insert(point1);
        tree.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024:\r\n"
            + "(point1, 522, 30)\r\n"
            + "(point1, 522, 30)\r\n"
            + "(point1, 522, 30)\r\n"
            + "(point1, 522, 30)\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test insert().
     */
    @Test
    public void testInsert3() {
        
        QuadTree<Point> tree = new QuadTree<Point>();
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(522, 30, "point2");
        Point point3 = new Point(522, 30, "point3");
        Point point4 = new Point(522, 30, "point4");
        tree.insert(point1);
        tree.insert(point2);
        tree.insert(point3);
        tree.insert(point4);
        tree.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024:\r\n"
            + "(point4, 522, 30)\r\n"
            + "(point3, 522, 30)\r\n"
            + "(point2, 522, 30)\r\n"
            + "(point1, 522, 30)\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test remove().
     */
    public void testRemove() {
        
        QuadTree<Point> tree = new QuadTree<Point>();
        Point p1 = new Point(522, 30, "p1");
        Point p2 = new Point(522, 33, "p2");
        Point p3 = new Point(523, 34, "p3");
        tree.insert(p1);
        tree.insert(p2);
        tree.insert(p3);
        
        tree.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024:\r\n"
            + "(p3, 523, 34)\r\n"
            + "(p2, 522, 33)\r\n"
            + "(p1, 522, 30)\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test removeCalled().
     */
    public void testRemove2() {
        
        QuadTree<Point> tree = new QuadTree<Point>();
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(522, 30, "point2");
        tree.insert(point1);
        tree.insert(point2);
        
        tree.removeCalled(522, 30, "point1");
    }
    
    
    /**
     * This will test regionSearch().
     */
    public void testRegionSearch() {
        
        QuadTree<Point> tree = new QuadTree<Point>();
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(522, 33, "point2");
        tree.insert(point1);
        tree.insert(point2);
        
        int num = tree.regionSearch(1, 1, 600, 600, 0);
        assertEquals(num, 1);
    }
    
    
    /**
     * This will test duplicates().
     */
    public void testDuplicates() {
        
        QuadTree<Point> tree = new QuadTree<Point>();
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(522, 30, "point2");
        tree.insert(point1);
        tree.insert(point2);
        
        tree.duplicates();
        assertEquals(systemOut().getHistory(), ""
            + "(522, 30)\n");
        systemOut().clearHistory();
    }
}
