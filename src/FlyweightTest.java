
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
* This will test Flyweight class.
* 
* @author guangkai guangkai@vt.edu
* @version 1 9/26/2022 4:20 pm
*/
public class FlyweightTest extends TestCase {
    
    
    /**
     * This will test getType().
     */
    public void testGetType() {
        
        Flyweight fly = new Flyweight();
        assertEquals(fly.getType(), 0);
    }
    
    
    /**
     * This will test getListSize().
     */
    public void testGetListSize() {
        
        Flyweight fly = new Flyweight();
        assertEquals(fly.getListSize(), 0);
    }
    
    
    /**
     * This will test getListSize().
     */
    public void testGetDiffer() {
        
        Flyweight fly = new Flyweight();
        assertEquals(fly.getDiffer(), 0);
    }
    
    
    /**
     * This will test getLink().
     */
    public void testGetLink() {
        
        Flyweight fly = new Flyweight();
        assertNull(fly.getLink());
    }
    
    
    /**
     * This will test insert().
     */
    @Test
    public void testInsert() {
        
        Flyweight fly = new Flyweight();
        Point point1 = new Point(3, 3, "point1");
        fly.insert(point1, 1024, 0, 0);
        
        fly.dump(0, 0, 1024, 1, 0);
        assertEquals(systemOut().getHistory(), ""
            + "  Node at 0, 0, 1024: Empty\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemove() {
        
        Flyweight fly = new Flyweight();
        Point point1 = new Point(3, 3, "point1");
        SkipList<String, Point> list = new SkipList<String, Point>();
        fly.remove(point1, list);
        
        fly.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Point not found: (3, 3)\r\n"
            + "Node at 0, 0, 1024: Empty\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemove2() {
        
        Flyweight fly = new Flyweight();
        Point point1 = new Point(3, 3, "point1");
        fly.removeCalled(point1);
        
        fly.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024: Empty\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test regionSearch().
     */
    @Test
    public void testRegionSearch() {
        
        Flyweight fly = new Flyweight();
        int numberOfNode = fly.regionSearch(1, 1, 1023, 1023, 0);
        
        assertEquals(numberOfNode, 1);
    }
    
    
    /**
     * This will test duplicates().
     */
    @Test
    public void testDuplicates() {
        
        Flyweight fly = new Flyweight();
        fly.duplicates();
        
        assertEquals(systemOut().getHistory(), "");
    }
}
