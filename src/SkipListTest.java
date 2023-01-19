
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
* This is the test class for SkipList class.
* 
* @author guangkai
* @version 1 9/4/2022 11:23 pm
*/
public class SkipListTest extends TestCase {

    /**
     * This will test getSize().
     */
    @Test
    public void testGetSize() {

        SkipList<String, Point> list = new SkipList<>();
        Point point1 = new Point(3, 3, "point1");
        list.insert("point1", point1);
        assertEquals(list.getSize(), 1);
    }


    /**
     * This will test getLevel().
     */
    @Test
    public void testGetLevel() {

        SkipList<String, Point> list = new SkipList<>();
        Point point1 = new Point(3, 3, "point1");
        TestableRandom.setNextBooleans(true, true, false);
        list.insert("point1", point1);
        assertEquals(list.getLevel(), 2);
    }


    /**
     * This will test insert().
     */
    @Test
    public void testInsert1() {

        SkipList<String, Point> list = new SkipList<>();
        Point point1 = new Point(3, 3, "point1");
        Point point2 = new Point(3, 4, "point2");
        Point point3 = new Point(3, 5, "point3");
        list.insert("point1", point1);
        list.insert("point2", point2);
        list.insert("point3", point3);
        
        assertEquals(list.getSize(), 3);
    }


    /**
     * This will test insert().
     */
    @Test
    public void testInsert2() {

        SkipList<String, Point> list = new SkipList<>();
        
        assertEquals(list.getSize(), 0);
    }
    
    
    /**
     * This will test insert().
     */
    @Test
    public void testInsert3() {

        SkipList<String, Point> list = new SkipList<>();
        Point point1 = new Point(3, 3, "point1");
        Point point2 = new Point(3, 4, "point2");
        Point point3 = new Point(3, 5, "point3");
        Point point4 = new Point(4, 5, "z");
        list.insert("point1", point1);
        list.insert("point3", point3);
        list.insert("point2", point2);
        list.insert("z", point4);
        
        assertEquals(list.getSize(), 4);
    }
    
    
    /**
     * This will test insert().
     */
    @Test
    public void testInsert4() {

        SkipList<String, Point> list = new SkipList<>();
        Point point1 = new Point(3, 3, "point1");
        Point point2 = new Point(3, 4, "point2");
        Point point3 = new Point(3, 5, "point3");
        list.insert("point1", point1);
        list.insert("point3", point3);
        list.insert("point2", point2);
        
        assertEquals(list.getSize(), 3);
    }


    /**
     * This will test adjustHead()
     */
    @Test
    public void testAdjustHead() {

        SkipList<String, Point> list = new SkipList<>();
        Point point1 = new Point(3, 3, "point1");
        Point point2 = new Point(3, 4, "point2");

        TestableRandom.setNextBooleans(true, false);
        list.insert("point1", point1);
        assertEquals(list.head.getDepth(), 1);
        assertEquals(list.getLevel(), 1);

        TestableRandom.setNextBooleans(true, true, false);
        list.insert("point2", point2);
        assertEquals(list.head.getDepth(), 2);
        assertEquals(list.getLevel(), 2);
    }


    /**
     * This will test dump().
     */
    @Test
    public void testDump1() {

        SkipList<String, Point> list = new SkipList<>();
        Point point1 = new Point(3, 3, "point1");

        TestableRandom.setNextBooleans(true, false);
        list.insert("point1", point1);
        int out = list.dump();
        
        assertEquals(out, 1);
        assertEquals(systemOut().getHistory(), ""
            + "Node has depth 1, Value (null)\r\n"
            + "Node has depth 1, Value (point1, point1, 3, 3)\n");
        systemOut().clearHistory();
    }
    
    /**
     * This will test dump().
     */
    @Test
    public void testDump2() {

        SkipList<String, Point> list = new SkipList<>();
        
        assertEquals(list.getSize(), 0);
        assertEquals(list.dump(), 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node has depth 1, Value (null)\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test dump().
     */
    @Test
    public void testDump3() {

        SkipList<String, Point> list = new SkipList<>();
        
        Point p1 = new Point(0, 3, "p1");
        TestableRandom.setNextBooleans(false);
        list.insert("p1", p1);

        Point p2 = new Point(9, 2, "p2");
        TestableRandom.setNextBooleans(true, false);
        list.insert("p2", p2);

        Point p3 = new Point(5, 3, "p3");
        TestableRandom.setNextBooleans(true, true, false);
        list.insert("p3", p3);
        
        int out = list.dump();
        
        assertEquals(out, 3);
        assertEquals(systemOut().getHistory(), ""
            + "Node has depth 2, Value (null)\r\n"
            + "Node has depth 0, Value (p1, p1, 0, 3)\r\n"
            + "Node has depth 1, Value (p2, p2, 9, 2)\r\n"
            + "Node has depth 2, Value (p3, p3, 5, 3)\n");
        systemOut().clearHistory();
        
        list.removeByName("p3");
        int out2 = list.dump();
        
        assertEquals(out2, 2);
        assertEquals(systemOut().getHistory(), ""
            + "Node has depth 2, Value (null)\r\n"
            + "Node has depth 0, Value (p1, p1, 0, 3)\r\n"
            + "Node has depth 1, Value (p2, p2, 9, 2)\n");
        systemOut().clearHistory();
    }
    
    /**
     * This will test dump().
     */
    @Test
    public void testDump4() {

        SkipList<String, Point> list = new SkipList<>();
        
        Point p1 = new Point(0, 3, "p1");
        TestableRandom.setNextBooleans(false);
        list.insert("p1", p1);

        Point p2 = new Point(9, 2, "p2");
        TestableRandom.setNextBooleans(true, false);
        list.insert("p2", p2);

        Point p3 = new Point(5, 3, "p3");
        TestableRandom.setNextBooleans(true, true, false);
        list.insert("p3", p3);
    }


    /**
     * This will test removeByName()
     */
    @Test
    public void testRemoveByName1() {

        SkipList<String, Point> list = new SkipList<>();
        Point point1 = new Point(3, 3, "point1");
        Point point2 = new Point(3, 4, "point2");
        Point point3 = new Point(3, 5, "point3");
        Point point4 = new Point(3, 6, "point4");
        TestableRandom.setNextBooleans(false);
        list.insert("point1", point1);
        TestableRandom.setNextBooleans(true, false);
        list.insert("point2", point2);
        TestableRandom.setNextBooleans(true, true, false);
        list.insert("point3", point3);
        TestableRandom.setNextBooleans(true, true, true, false);
        list.insert("point4", point4);
        assertEquals(list.getSize(), 4);
        
        list.removeByName("point1");
        assertEquals(list.head.getForward()[0].getPair().value(), point2);
        assertEquals(list.head.getForward()[1].getPair().value(), point2);
        assertEquals(list.head.getForward()[2].getPair().value(), point3);
        assertEquals(list.head.getForward()[3].getPair().value(), point4);
        assertEquals(list.getSize(), 3);
        
        list.removeByName("point2");
        assertEquals(list.head.getForward()[0].getPair().value(), point3);
        assertEquals(list.head.getForward()[1].getPair().value(), point3);
        assertEquals(list.head.getForward()[2].getPair().value(), point3);
        assertEquals(list.head.getForward()[3].getPair().value(), point4);
        assertEquals(list.getSize(), 2);
        
        list.removeByName("point3");
        assertEquals(list.head.getForward()[0].getPair().value(), point4);
        assertEquals(list.head.getForward()[1].getPair().value(), point4);
        assertEquals(list.head.getForward()[2].getPair().value(), point4);
        assertEquals(list.head.getForward()[3].getPair().value(), point4);
        assertEquals(list.getSize(), 1);
    }
    
    /**
     * This will test removeByName()
     */
    @Test
    public void testRemoveByName2() {

        SkipList<String, Point> list = new SkipList<>();

        list.removeByName("point");
    }


    /**
     * This will test search()
     */
    @Test
    public void testSearch1() {

        SkipList<String, Point> list = new SkipList<>();
        Point point1 = new Point(3, 3, "point1");
        Point point2 = new Point(3, 4, "point2");
        Point point3 = new Point(3, 5, "point3");
        Point point4 = new Point(3, 3, "point1");
        TestableRandom.setNextBooleans(true, false);
        list.insert("point1", point1);
        TestableRandom.setNextBooleans(true, false);
        list.insert("point2", point2);
        TestableRandom.setNextBooleans(true, false);
        list.insert("point3", point3);
        TestableRandom.setNextBooleans(true, false);
        list.insert("point1", point4);

        list.search("point1");
        assertEquals(systemOut().getHistory(), ""
            + "Found: (point1, 3, 3)\r\n"
            + "Found: (point1, 3, 3)\n");
        systemOut().clearHistory();
        list.search("point2");
        assertEquals(systemOut().getHistory(), ""
            + "Found: (point2, 3, 4)\n");
        systemOut().clearHistory();
    }
    
    /**
     * This will test search()
     */
    @Test
    public void testSearch2() {

        SkipList<String, Point> list = new SkipList<>();
        Point point1 = new Point(3, 3, "point1");
        Point point2 = new Point(3, 4, "point2");
        Point point3 = new Point(3, 5, "point3");
        Point point4 = new Point(3, 3, "point1");
        TestableRandom.setNextBooleans(true, false);
        list.insert("point1", point1);
        TestableRandom.setNextBooleans(true, false);
        list.insert("point2", point2);
        TestableRandom.setNextBooleans(true, false);
        list.insert("point3", point3);
        TestableRandom.setNextBooleans(true, false);
        list.insert("point1", point4);

        list.search("point4");
        assertEquals(systemOut().getHistory(), ""
            + "Point not found: point4\n");
        systemOut().clearHistory();
        list.search("point2");
        assertEquals(systemOut().getHistory(), ""
            + "Found: (point2, 3, 4)\n");
        systemOut().clearHistory();
    }
}
