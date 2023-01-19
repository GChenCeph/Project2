
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
* This is the test class for LinkList class.
* 
* @author guangkai
* @version 1 9/23/2022 2:47 pm
*/
public class LinkListTest extends TestCase {

    
    /**
     * This will test getSize().
     */
    @Test
    public void testGetSize1() {
        
        LinkList<Point> link = new LinkList<Point>();
        Point point1 = new Point(3, 3, "point1");
        link.insert(point1);
        
        assertEquals(link.getSize(), 1);
    }
    
    
    /**
     * This will test getSize().
     */
    @Test
    public void testGetSize2() {
        
        LinkList<Point> link = new LinkList<Point>();
        Point point1 = new Point(3, 3, "point1");
        link.insert(point1);
        Point point2 = new Point(3, 4, "point2");
        Point point3 = new Point(3, 5, "point3");
        link.insert(point2);
        link.insert(point2);
        link.insert(point3);
        link.insert(point2);
        
        assertEquals(link.getSize(), 5);
        assertEquals(link.getDiffer(), 3);
        //assertEquals(link.getNumber(), 3);
    }
    
    /**
     * This will test getRemove().
     */
    @Test
    public void testRemove() {
        
        LinkList<Point> link = new LinkList<Point>();
        Point point1 = new Point(3, 3, "point1");
        SkipList<String, Point> list = new SkipList<String, Point>();
        link.remove(point1, list);
        link.insert(point1);
        Point point2 = new Point(3, 4, "point2");
        Point point3 = new Point(3, 5, "point3");
        link.insert(point2);
        link.insert(point2);
        link.insert(point3);
        link.insert(point2);
        link.remove(point3, list);
        
        assertEquals(link.getSize(), 4);
        assertEquals(link.getDiffer(), 2);
        
        link.remove(point2, list);
        assertEquals(link.getSize(), 3);
        assertEquals(link.getDiffer(), 2);
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testRemove2() {
        
        LinkList<Point> link = new LinkList<Point>();
        Point point1 = new Point(3, 3, "point1");
        link.removeCalled(point1);
        link.insert(point1);
        Point point2 = new Point(3, 4, "point2");
        Point point3 = new Point(3, 5, "point3");
        link.insert(point2);
        link.insert(point2);
        link.insert(point3);
        link.insert(point2);
        link.removeCalled(point3);
        
        assertEquals(link.getSize(), 4);
        assertEquals(link.getDiffer(), 2);
        link.dump();
        assertEquals(systemOut().getHistory(), ""
            + "point2, 3, 4\r\n"
            + "point2, 3, 4\r\n"
            + "point2, 3, 4\r\n"
            + "point1, 3, 3\r\n"
            + "point1, 3, 3\n");
        systemOut().clearHistory();
        
        link.removeCalled(point2);
        assertEquals(link.getSize(), 3);
        assertEquals(link.getDiffer(), 2);
    }
    
    
    /**
     * This will test getRemove().
     */
    @Test
    public void testRemove3() {
        
        LinkList<Point> link = new LinkList<Point>();
        Point point1 = new Point(3, 3, "point1");
        SkipList<String, Point> list = new SkipList<String, Point>();
        link.remove(point1, list);
        
        link.insert(point1);
        link.remove(point1, list);
    }
    
    
    /**
     * This will test getRemove().
     */
    @Test
    public void testRemove4() {
        
        LinkList<Point> link = new LinkList<Point>();
        Point point1 = new Point(3, 3, "point1");
        Point point2 = new Point(3, 4, "point2");
        Point point3 = new Point(3, 5, "point3");
        SkipList<String, Point> list = new SkipList<String, Point>();
        link.insert(point1);
        link.insert(point2);
        link.remove(point1, list);
        link.remove(point2, list);
        link.remove(point3, list);
    }
    
    
    /**
     * This will test getRemove().
     */
    @Test
    public void testRemove5() {
        
        LinkList<Point> link = new LinkList<Point>();
        Point point1 = new Point(2, 4, "point1");
        Point point2 = new Point(3, 4, "point2");
        Point point3 = new Point(4, 4, "point3");
        SkipList<String, Point> list = new SkipList<String, Point>();
        link.insert(point1);
        link.insert(point2);
        link.insert(point3);
        link.remove(point1, list);
        link.remove(point2, list);
        link.remove(point3, list);
        
        assertEquals(link.getDiffer(), 1);
    }
    
    
    /**
     * This will test getRemove().
     */
    @Test
    public void testRemove6() {
        
        LinkList<Point> link = new LinkList<Point>();
        Point point1 = new Point(2, 4, "point1");
        Point point2 = new Point(3, 4, "point2");
        Point point3 = new Point(4, 4, "point3");
        SkipList<String, Point> list = new SkipList<String, Point>();
        link.insert(point1);
        link.insert(point2);
        link.insert(point3);
        link.remove(point1, list);
        
        assertEquals(systemOut().getHistory(), ""
            + "Point removed: (point1, 2, 4)\n");
        systemOut().clearHistory();
        assertEquals(link.getDiffer(), 2);
    }
    
    
    /**
     * This will test getRemove().
     */
    @Test
    public void testRemoveCalled() {
        
        LinkList<Point> link = new LinkList<Point>();
        Point point1 = new Point(2, 4, "point1");
        Point point2 = new Point(3, 4, "point2");
        Point point3 = new Point(4, 4, "point3");
        link.insert(point1);
        link.insert(point2);
        link.insert(point3);
        link.removeCalled(point1);
        
        assertEquals(systemOut().getHistory(), "");
        systemOut().clearHistory();
        assertEquals(link.getDiffer(), 2);
    }
    
    
    /**
     * This will test getRemove().
     */
    @Test
    public void testRemoveCalled1() {
        
        LinkList<Point> link = new LinkList<Point>();
        Point point1 = new Point(3, 2, "point1");
        Point point2 = new Point(3, 3, "point2");
        Point point3 = new Point(3, 4, "point3");
        link.insert(point1);
        link.insert(point2);
        link.insert(point3);
        link.removeCalled(point1);
        
        assertEquals(systemOut().getHistory(), "");
        systemOut().clearHistory();
        assertEquals(link.getDiffer(), 2);
    }
    
    
    /**
     * This will test getRemove().
     */
    @Test
    public void testRemoveCalled2() {
        
        LinkList<Point> link = new LinkList<Point>();
        Point point1 = new Point(3, 2, "point1");
        Point point2 = new Point(3, 3, "point2");
        Point point3 = new Point(3, 4, "point3");
        Point point4 = new Point(3, 3, "point4");
        link.insert(point1);
        link.insert(point2);
        link.insert(point3);
        link.removeCalled(point1);
        
        assertEquals(systemOut().getHistory(), "");
        systemOut().clearHistory();
        assertEquals(link.getDiffer(), 2);
        
        link.removeCalled(point4);
        assertEquals(systemOut().getHistory(), "");
        systemOut().clearHistory();
        assertEquals(link.getDiffer(), 1);
    }
    
    
    /**
     * This will test duplicates().
     */
    @Test
    public void testDuplicates1() {
        
        LinkList<Point> link = new LinkList<Point>();
        Point point1 = new Point(3, 3, "point1");
        Point point2 = new Point(3, 3, "point2");
        Point point3 = new Point(3, 3, "point1");
        Point point4 = new Point(3, 3, "point1");
        link.insert(point1);
        link.insert(point2);
        link.insert(point3);
        link.insert(point4);
        assertEquals(link.getSize(), 4);
        link.duplicates();
        assertEquals(systemOut().getHistory(), "(3, 3)\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test duplicates().
     */
    @Test
    public void testDuplicates2() {
        
        LinkList<Point> link = new LinkList<Point>();
        link.duplicates();
        assertEquals(systemOut().getHistory(), "");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test duplicates().
     */
    @Test
    public void testDuplicates3() {
        
        LinkList<Point> link = new LinkList<Point>();
        Point point1 = new Point(3, 3, "point1");
        Point point2 = new Point(3, 4, "point2");
        Point point3 = new Point(3, 5, "point3");
        link.insert(point1);
        link.insert(point2);
        link.insert(point3);
        assertEquals(link.getSize(), 3);
        link.duplicates();
        assertEquals(systemOut().getHistory(), "");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test duplicates().
     */
    @Test
    public void testDuplicates4() {
        
        LinkList<Point> link = new LinkList<Point>();
        Point point1 = new Point(2, 4, "point1");
        Point point2 = new Point(3, 4, "point2");
        Point point3 = new Point(5, 4, "point3");
        link.insert(point1);
        link.insert(point2);
        link.insert(point3);
        assertEquals(link.getSize(), 3);
        link.duplicates();
        assertEquals(systemOut().getHistory(), "");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test duplicates().
     */
    @Test
    public void testDuplicates5() {
        
        LinkList<Point> link = new LinkList<Point>();
        Point point1 = new Point(2, 2, "point1");
        Point point2 = new Point(3, 3, "point2");
        Point point3 = new Point(5, 5, "point3");
        link.insert(point1);
        link.insert(point2);
        link.insert(point3);
        assertEquals(link.getSize(), 3);
        link.duplicates();
        assertEquals(systemOut().getHistory(), "");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test duplicates().
     */
    @Test
    public void testDuplicates6() {
        
        LinkList<Point> link = new LinkList<Point>();
        Point point1 = new Point(3, 3, "point1");
        link.insert(point1);
        link.insert(point1);
        link.insert(point1);
        link.insert(point1);
        assertEquals(link.getSize(), 4);
        link.duplicates();
        assertEquals(systemOut().getHistory(), "(3, 3)\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test duplicates().
     */
    @Test
    public void testDuplicates7() {
        
        LinkList<Point> link = new LinkList<Point>();
        Point point1 = new Point(3, 3, "point1");
        link.insert(point1);
        link.insert(point1);
        assertEquals(link.getSize(), 2);
        link.duplicates();
        assertEquals(systemOut().getHistory(), "(3, 3)\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test duplicates().
     */
    @Test
    public void testDuplicates8() {
        
        LinkList<Point> link = new LinkList<Point>();
        Point point1 = new Point(3, 3, "point1");
        link.insert(point1);
        assertEquals(link.getSize(), 1);
        link.duplicates();
        assertEquals(systemOut().getHistory(), "");
        systemOut().clearHistory();
    }
}
