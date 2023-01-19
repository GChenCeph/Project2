
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
* This will test Internal class.
* 
* @author guangkai guangkai@vt.edu
* @version 1 9/26/2022 1:52 pm
*/
public class InternalTest extends TestCase {
    
    
    /**
     * This will test insert()
     */
    @Test
    public void testInsert1() {
        
        Point point1 = new Point(3, 3, "point1");
        Leaf leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024:\r\n"
            + "(point1, 3, 3)\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test insert()
     */
    @Test
    public void testInsert2() {
        
        Point point1 = new Point(3, 3, "point1");
        Leaf leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point1, 1024, 0, 0);
        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024:\r\n"
            + "(point1, 3, 3)\r\n"
            + "(point1, 3, 3)\r\n"
            + "(point1, 3, 3)\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test insert()
     */
    @Test
    public void testInsert3() {
        
        Point point1 = new Point(3, 3, "point1");
        Point point2 = new Point(3, 4, "point2");
        Point point3 = new Point(3, 5, "point3");
        Leaf leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024:\r\n"
            + "(point3, 3, 5)\r\n"
            + "(point2, 3, 4)\r\n"
            + "(point1, 3, 3)\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test insert()
     */
    @Test
    public void testInsert4() {
        
        Point point1 = new Point(128, 128, "point1");
        Point point2 = new Point(128, 384, "point2");
        Point point3 = new Point(384, 128, "point3");
        Point point4 = new Point(384, 384, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point4, 1024, 0, 0);
        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024: Internal\r\n"
            + "  Node at 0, 0, 512: Internal\r\n"
            + "    Node at 0, 0, 256:\r\n"
            + "    (point1, 128, 128)\r\n"
            + "    Node at 256, 0, 256:\r\n"
            + "    (point3, 384, 128)\r\n"
            + "    Node at 0, 256, 256:\r\n"
            + "    (point2, 128, 384)\r\n"
            + "    Node at 256, 256, 256:\r\n"
            + "    (point4, 384, 384)\r\n"
            + "  Node at 512, 0, 512: Empty\r\n"
            + "  Node at 0, 512, 512: Empty\r\n"
            + "  Node at 512, 512, 512: Empty\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test insert()
     */
    @Test
    public void testInsert5() {
        
        Point point1 = new Point(3, 3, "point1");
        Point point2 = new Point(3, 266, "point2");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point2, 1024, 0, 0);
        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024: Internal\r\n"
            + "  Node at 0, 0, 512: Internal\r\n"
            + "    Node at 0, 0, 256:\r\n"
            + "    (point1, 3, 3)\r\n"
            + "    (point1, 3, 3)\r\n"
            + "    Node at 256, 0, 256: Empty\r\n"
            + "    Node at 0, 256, 256:\r\n"
            + "    (point2, 3, 266)\r\n"
            + "    (point2, 3, 266)\r\n"
            + "    Node at 256, 256, 256: Empty\r\n"
            + "  Node at 512, 0, 512: Empty\r\n"
            + "  Node at 0, 512, 512: Empty\r\n"
            + "  Node at 512, 512, 512: Empty\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test insert()
     */
    @Test
    public void testInsert6() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point4, 1024, 0, 0);
        leaf.dump(0, 0, 1024, 0, 0);
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
     * This will test insert()
     */
    @Test
    public void testInsert7() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point4, 1024, 0, 0);
        leaf.dump(0, 0, 1024, 0, 0);
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
     * This will test insert()
     */
    @Test
    public void testInsert8() {
        
        Point point1 = new Point(10, 522, "point1");
        Point point2 = new Point(500, 522, "point2");
        Point point3 = new Point(10, 1000, "point3");
        Point point4 = new Point(500, 1000, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point4, 1024, 0, 0);
        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024: Internal\r\n"
            + "  Node at 0, 0, 512: Empty\r\n"
            + "  Node at 512, 0, 512: Empty\r\n"
            + "  Node at 0, 512, 512: Internal\r\n"
            + "    Node at 0, 512, 256:\r\n"
            + "    (point1, 10, 522)\r\n"
            + "    Node at 256, 512, 256:\r\n"
            + "    (point2, 500, 522)\r\n"
            + "    Node at 0, 768, 256:\r\n"
            + "    (point3, 10, 1000)\r\n"
            + "    Node at 256, 768, 256:\r\n"
            + "    (point4, 500, 1000)\r\n"
            + "  Node at 512, 512, 512: Empty\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test insert()
     */
    @Test
    public void testInsert9() {
        
        Point point1 = new Point(550, 522, "point1");
        Point point2 = new Point(1000, 522, "point2");
        Point point3 = new Point(550, 1000, "point3");
        Point point4 = new Point(1000, 1000, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point4, 1024, 0, 0);
        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024: Internal\r\n"
            + "  Node at 0, 0, 512: Empty\r\n"
            + "  Node at 512, 0, 512: Empty\r\n"
            + "  Node at 0, 512, 512: Empty\r\n"
            + "  Node at 512, 512, 512: Internal\r\n"
            + "    Node at 512, 512, 256:\r\n"
            + "    (point1, 550, 522)\r\n"
            + "    Node at 768, 512, 256:\r\n"
            + "    (point2, 1000, 522)\r\n"
            + "    Node at 512, 768, 256:\r\n"
            + "    (point3, 550, 1000)\r\n"
            + "    Node at 768, 768, 256:\r\n"
            + "    (point4, 1000, 1000)\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test dump().
     */
    @Test
    public void testDump() {
        
        Node leaf = new Leaf();
        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024: Empty\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemove() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Point point5 = new Point(522, 1020, "point5");
        Point point6 = new Point(1022, 1022, "point5");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        SkipList<String, Point> list = new SkipList<String, Point>();
        leaf.remove(point3, list);
        leaf.remove(point4, list);
        leaf.remove(point5, list);
        leaf.remove(point6, list);
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testRemove2() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Point point5 = new Point(522, 1020, "point5");
        Point point6 = new Point(1022, 1022, "point5");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf.removeCalled(point3);
        leaf.removeCalled(point4);
        leaf.removeCalled(point5);
        leaf.removeCalled(point6);
    }
    
    
    /**
     * This will test remove1().
     */
    @Test
    public void testRemove3() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter2 = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        SkipList<String, Point> list = new SkipList<String, Point>();
        newInter2.remove(point1, list);
        newInter2.remove(point1, list);
        newInter2.remove(point2, list);
        newInter2.remove(point2, list);
        newInter2.remove(point3, list);
        newInter2.remove(point3, list);
        newInter2.remove(point4, list);
        newInter2.remove(point4, list);
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testRemove4() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point1);
        newInter.removeCalled(point1);
        newInter.removeCalled(point2);
        newInter.removeCalled(point2);
        newInter.removeCalled(point3);
        newInter.removeCalled(point3);
        newInter.removeCalled(point4);
        newInter.removeCalled(point4);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemove5() {
        
        Point point1 = new Point(256, 256, "point1");
        Point point2 = new Point(768, 256, "point2");
        Point point3 = new Point(256, 768, "point3");
        Point point4 = new Point(768, 768, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        SkipList<String, Point> list = new SkipList<String, Point>();
        newInter.remove(point1, list);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemove6() {
        
        Point point1 = new Point(256, 256, "point1");
        Point point2 = new Point(768, 256, "point2");
        Point point3 = new Point(256, 768, "point3");
        Point point4 = new Point(768, 768, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point2);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemove7() {
        
        Point point1 = new Point(256, 256, "point1");
        Point point2 = new Point(768, 256, "point2");
        Point point3 = new Point(256, 768, "point3");
        Point point4 = new Point(768, 768, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        SkipList<String, Point> list = new SkipList<String, Point>();
        newInter.remove(point3, list);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemoveCalled7() {
        
        Point point1 = new Point(256, 256, "point1");
        Point point2 = new Point(768, 256, "point2");
        Point point3 = new Point(256, 768, "point3");
        Point point4 = new Point(768, 768, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point3);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemove8() {
        
        Point point1 = new Point(256, 256, "point1");
        Point point2 = new Point(768, 256, "point2");
        Point point3 = new Point(256, 768, "point3");
        Point point4 = new Point(768, 768, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        SkipList<String, Point> list = new SkipList<String, Point>();
        newInter.remove(point4, list);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemoveCalled8() {
        
        Point point1 = new Point(256, 256, "point1");
        Point point2 = new Point(768, 256, "point2");
        Point point3 = new Point(256, 768, "point3");
        Point point4 = new Point(768, 768, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point4);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemove9() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        SkipList<String, Point> list = new SkipList<String, Point>();
        newInter.remove(point1, list);
        newInter.remove(point2, list);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemoveCalled9() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point1);
        newInter.removeCalled(point2);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemove10() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        SkipList<String, Point> list = new SkipList<String, Point>();
        newInter.remove(point1, list);
        newInter.remove(point3, list);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemoveCalled10() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point1);
        newInter.removeCalled(point3);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemove11() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        SkipList<String, Point> list = new SkipList<String, Point>();
        newInter.remove(point1, list);
        newInter.remove(point4, list);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemoveCalled11() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point1);
        newInter.removeCalled(point4);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemove12() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        SkipList<String, Point> list = new SkipList<String, Point>();
        newInter.remove(point2, list);
        newInter.remove(point3, list);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemoveCalled12() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point2);
        newInter.removeCalled(point3);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemove13() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        SkipList<String, Point> list = new SkipList<String, Point>();
        newInter.remove(point2, list);
        newInter.remove(point4, list);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemoveCalled13() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point2);
        newInter.removeCalled(point4);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemove19() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        SkipList<String, Point> list = new SkipList<String, Point>();
        newInter.remove(point3, list);
        newInter.remove(point4, list);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemoveCalled19() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point3);
        newInter.removeCalled(point4);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemove14() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        SkipList<String, Point> list = new SkipList<String, Point>();
        leaf.remove(point1, list);
        leaf.remove(point2, list);
        leaf.remove(point3, list);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemoveCalled14() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        leaf.removeCalled(point1);
        leaf.removeCalled(point2);
        leaf.removeCalled(point3);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemove15() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point4, 1024, 0, 0);
        leaf.dump(0, 0, 1024, 0, 0);
        
        SkipList<String, Point> list = new SkipList<String, Point>();
        leaf.remove(point1, list);
        leaf.dump(0, 0, 1024, 0, 0);
        leaf.remove(point2, list);
        leaf.remove(point4, list);
        leaf.dump(0, 0, 1024, 0, 0);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemoveCalled15() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point4, 1024, 0, 0);
        leaf.dump(0, 0, 1024, 0, 0);
        
        leaf.removeCalled(point1);
        leaf.removeCalled(point2);
        leaf.removeCalled(point4);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemove16() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        SkipList<String, Point> list = new SkipList<String, Point>();
        newInter.remove(point1, list);
        newInter.remove(point3, list);
        newInter.remove(point4, list);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemoveCalled16() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point1);
        newInter.removeCalled(point3);
        newInter.removeCalled(point4);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemove17() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        SkipList<String, Point> list = new SkipList<String, Point>();
        newInter.remove(point2, list);
        newInter.remove(point3, list);
        newInter.remove(point4, list);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemoveCalled17() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point2);
        newInter.removeCalled(point3);
        newInter.removeCalled(point4);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemove18() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        SkipList<String, Point> list = new SkipList<String, Point>();
        newInter.remove(point1, list);
        newInter.remove(point2, list);
        newInter.remove(point3, list);
        newInter.remove(point4, list);
    }
    
    
    /**
     * This will test remove().
     */
    @Test
    public void testRemoveCalled18() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point1);
        newInter.removeCalled(point2);
        newInter.removeCalled(point3);
        newInter.removeCalled(point4);
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testRemove20() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point1);
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testRemove21() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point2);
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testRemove22() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point3);
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testRemove23() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point4);
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testRemove24() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point1);
        newInter.removeCalled(point2);
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testRemove25() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point1);
        newInter.removeCalled(point3);
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testRemove26() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point1);
        newInter.removeCalled(point4);
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testRemove27() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point2);
        newInter.removeCalled(point3);
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testRemove28() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point2);
        newInter.removeCalled(point4);
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testRemove29() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point3);
        newInter.removeCalled(point4);
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testRemove30() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point1);
        newInter.removeCalled(point2);
        newInter.removeCalled(point3);
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testRemove31() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point1);
        newInter.removeCalled(point2);
        newInter.removeCalled(point4);
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testRemove32() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point1);
        newInter.removeCalled(point3);
        newInter.removeCalled(point4);
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testRemove33() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point2);
        newInter.removeCalled(point3);
        newInter.removeCalled(point4);
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testRemove34() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.removeCalled(point1);
        newInter.removeCalled(point2);
        newInter.removeCalled(point3);
        newInter.removeCalled(point4);
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testRemove35() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Node newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        SkipList<String, Point> list = new SkipList<String, Point>();
        newInter = newInter.remove(point1, list);
        newInter.dump(0, 0, 1024, 0, 0);
        newInter = newInter.remove(point2, list);
        newInter.dump(0, 0, 1024, 0, 0);
        newInter = newInter.remove(point3, list);
        newInter.dump(0, 0, 1024, 0, 0);
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testRemove36() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(522, 422, "point4");
        Point point5 = new Point(522, 422, "point5");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Node newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        newInter.insert(point5, 1024, 0, 0);
        Point point6 = new Point(256, 256, "point6");
        Point point7 = new Point(768, 256, "point7");
        Point point8 = new Point(256, 768, "point8");
        Point point9 = new Point(768, 768, "point9");
        newInter.insert(point6, 1024, 0, 0);
        newInter.insert(point7, 1024, 0, 0);
        newInter.insert(point8, 1024, 0, 0);
        newInter.insert(point9, 1024, 0, 0);
        newInter.dump(0, 0, 1024, 0, 0);
        newInter = newInter.removeCalled(point6);
        newInter.dump(0, 0, 1024, 0, 0);
        
        newInter = newInter.removeCalled(point3);
        newInter.dump(0, 0, 1024, 0, 0);
        newInter = newInter.removeCalled(point2);
        newInter.dump(0, 0, 1024, 0, 0);
        newInter = newInter.removeCalled(point1);
        newInter.dump(0, 0, 1024, 0, 0);
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testRemove37() {
        
        Point point1 = new Point(780, 32, "point1");
        Point point2 = new Point(780, 32, "point2");
        Point point3 = new Point(780, 32, "point3");
        Point point4 = new Point(780, 32, "point4");
        Point point5 = new Point(780, 32, "point5");
        
        Point point6 = new Point(780, 130, "point6");
        
        Point point7 = new Point(960, 130, "point7");
        Point point8 = new Point(960, 130, "point8");
        
        Point point9 = new Point(640, 390, "point9");
        
        Point point10 = new Point(960, 390, "point10");
        
        Point point11 = new Point(600, 600, "point11");
        
        Point point12 = new Point(900, 570, "point12");
        
        Point point13 = new Point(990, 530, "point13");
        
        Point point14 = new Point(1000, 530, "point14");
        
        Point point15 = new Point(990, 560, "point15");
        
        Point point16 = new Point(1000, 560, "point16");
        
        Point point17 = new Point(960, 960, "point17");
        
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf.insert(point4, 1024, 0, 0);
        leaf.insert(point5, 1024, 0, 0);
        leaf.insert(point6, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point7, 1024, 0, 0);
        leaf.insert(point8, 1024, 0, 0);
        leaf.insert(point9, 1024, 0, 0);
        leaf.insert(point10, 1024, 0, 0);
        leaf.insert(point11, 1024, 0, 0);
        leaf.insert(point12, 1024, 0, 0);
        leaf.insert(point13, 1024, 0, 0);
        leaf.insert(point14, 1024, 0, 0);
        leaf.insert(point15, 1024, 0, 0);
        leaf.insert(point16, 1024, 0, 0);
        leaf.insert(point17, 1024, 0, 0);
        
        SkipList<String, Point> list = new SkipList<String, Point>();
        
        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024: Internal\r\n"
            + "  Node at 0, 0, 512: Empty\r\n"
            + "  Node at 512, 0, 512: Internal\r\n"
            + "    Node at 512, 0, 256: Empty\r\n"
            + "    Node at 768, 0, 256: Internal\r\n"
            + "      Node at 768, 0, 128:\r\n"
            + "      (point1, 780, 32)\r\n"
            + "      (point2, 780, 32)\r\n"
            + "      (point3, 780, 32)\r\n"
            + "      (point4, 780, 32)\r\n"
            + "      (point5, 780, 32)\r\n"
            + "      Node at 896, 0, 128: Empty\r\n"
            + "      Node at 768, 128, 128:\r\n"
            + "      (point6, 780, 130)\r\n"
            + "      Node at 896, 128, 128:\r\n"
            + "      (point8, 960, 130)\r\n"
            + "      (point7, 960, 130)\r\n"
            + "    Node at 512, 256, 256:\r\n"
            + "    (point9, 640, 390)\r\n"
            + "    Node at 768, 256, 256:\r\n"
            + "    (point10, 960, 390)\r\n"
            + "  Node at 0, 512, 512: Empty\r\n"
            + "  Node at 512, 512, 512: Internal\r\n"
            + "    Node at 512, 512, 256:\r\n"
            + "    (point11, 600, 600)\r\n"
            + "    Node at 768, 512, 256: Internal\r\n"
            + "      Node at 768, 512, 128: Empty\r\n"
            + "      Node at 896, 512, 128: Internal\r\n"
            + "        Node at 896, 512, 64:\r\n"
            + "        (point12, 900, 570)\r\n"
            + "        Node at 960, 512, 64: Internal\r\n"
            + "          Node at 960, 512, 32:\r\n"
            + "          (point13, 990, 530)\r\n"
            + "          Node at 992, 512, 32:\r\n"
            + "          (point14, 1000, 530)\r\n"
            + "          Node at 960, 544, 32:\r\n"
            + "          (point15, 990, 560)\r\n"
            + "          Node at 992, 544, 32:\r\n"
            + "          (point16, 1000, 560)\r\n"
            + "        Node at 896, 576, 64: Empty\r\n"
            + "        Node at 960, 576, 64: Empty\r\n"
            + "      Node at 768, 640, 128: Empty\r\n"
            + "      Node at 896, 640, 128: Empty\r\n"
            + "    Node at 512, 768, 256: Empty\r\n"
            + "    Node at 768, 768, 256:\r\n"
            + "    (point17, 960, 960)\n");
        systemOut().clearHistory();
        
        leaf = leaf.remove(point1, list);
        leaf = leaf.remove(point2, list);
        leaf = leaf.remove(point3, list);
        leaf = leaf.remove(point4, list);
        leaf = leaf.remove(point5, list);
        
        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Point removed: (point1, 780, 32)\r\n"
            + "Point removed: (point2, 780, 32)\r\n"
            + "Point removed: (point3, 780, 32)\r\n"
            + "Point removed: (point4, 780, 32)\r\n"
            + "Point removed: (point5, 780, 32)\r\n"
            + "Node at 0, 0, 1024: Internal\r\n"
            + "  Node at 0, 0, 512: Empty\r\n"
            + "  Node at 512, 0, 512: Internal\r\n"
            + "    Node at 512, 0, 256: Empty\r\n"
            + "    Node at 768, 0, 256:\r\n"
            + "    (point6, 780, 130)\r\n"
            + "    (point8, 960, 130)\r\n"
            + "    (point7, 960, 130)\r\n"
            + "    Node at 512, 256, 256:\r\n"
            + "    (point9, 640, 390)\r\n"
            + "    Node at 768, 256, 256:\r\n"
            + "    (point10, 960, 390)\r\n"
            + "  Node at 0, 512, 512: Empty\r\n"
            + "  Node at 512, 512, 512: Internal\r\n"
            + "    Node at 512, 512, 256:\r\n"
            + "    (point11, 600, 600)\r\n"
            + "    Node at 768, 512, 256: Internal\r\n"
            + "      Node at 768, 512, 128: Empty\r\n"
            + "      Node at 896, 512, 128: Internal\r\n"
            + "        Node at 896, 512, 64:\r\n"
            + "        (point12, 900, 570)\r\n"
            + "        Node at 960, 512, 64: Internal\r\n"
            + "          Node at 960, 512, 32:\r\n"
            + "          (point13, 990, 530)\r\n"
            + "          Node at 992, 512, 32:\r\n"
            + "          (point14, 1000, 530)\r\n"
            + "          Node at 960, 544, 32:\r\n"
            + "          (point15, 990, 560)\r\n"
            + "          Node at 992, 544, 32:\r\n"
            + "          (point16, 1000, 560)\r\n"
            + "        Node at 896, 576, 64: Empty\r\n"
            + "        Node at 960, 576, 64: Empty\r\n"
            + "      Node at 768, 640, 128: Empty\r\n"
            + "      Node at 896, 640, 128: Empty\r\n"
            + "    Node at 512, 768, 256: Empty\r\n"
            + "    Node at 768, 768, 256:\r\n"
            + "    (point17, 960, 960)\n");
        systemOut().clearHistory();
        
        leaf = leaf.remove(point16, list);

        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Point removed: (point16, 1000, 560)\r\n"
            + "Node at 0, 0, 1024: Internal\r\n"
            + "  Node at 0, 0, 512: Empty\r\n"
            + "  Node at 512, 0, 512: Internal\r\n"
            + "    Node at 512, 0, 256: Empty\r\n"
            + "    Node at 768, 0, 256:\r\n"
            + "    (point6, 780, 130)\r\n"
            + "    (point8, 960, 130)\r\n"
            + "    (point7, 960, 130)\r\n"
            + "    Node at 512, 256, 256:\r\n"
            + "    (point9, 640, 390)\r\n"
            + "    Node at 768, 256, 256:\r\n"
            + "    (point10, 960, 390)\r\n"
            + "  Node at 0, 512, 512: Empty\r\n"
            + "  Node at 512, 512, 512: Internal\r\n"
            + "    Node at 512, 512, 256:\r\n"
            + "    (point11, 600, 600)\r\n"
            + "    Node at 768, 512, 256: Internal\r\n"
            + "      Node at 768, 512, 128: Empty\r\n"
            + "      Node at 896, 512, 128: Internal\r\n"
            + "        Node at 896, 512, 64:\r\n"
            + "        (point12, 900, 570)\r\n"
            + "        Node at 960, 512, 64:\r\n"
            + "        (point13, 990, 530)\r\n"
            + "        (point14, 1000, 530)\r\n"
            + "        (point15, 990, 560)\r\n"
            + "        Node at 896, 576, 64: Empty\r\n"
            + "        Node at 960, 576, 64: Empty\r\n"
            + "      Node at 768, 640, 128: Empty\r\n"
            + "      Node at 896, 640, 128: Empty\r\n"
            + "    Node at 512, 768, 256: Empty\r\n"
            + "    Node at 768, 768, 256:\r\n"
            + "    (point17, 960, 960)\n");
        systemOut().clearHistory();
        
        leaf = leaf.remove(point15, list);

        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Point removed: (point15, 990, 560)\r\n"
            + "Node at 0, 0, 1024: Internal\r\n"
            + "  Node at 0, 0, 512: Empty\r\n"
            + "  Node at 512, 0, 512: Internal\r\n"
            + "    Node at 512, 0, 256: Empty\r\n"
            + "    Node at 768, 0, 256:\r\n"
            + "    (point6, 780, 130)\r\n"
            + "    (point8, 960, 130)\r\n"
            + "    (point7, 960, 130)\r\n"
            + "    Node at 512, 256, 256:\r\n"
            + "    (point9, 640, 390)\r\n"
            + "    Node at 768, 256, 256:\r\n"
            + "    (point10, 960, 390)\r\n"
            + "  Node at 0, 512, 512: Empty\r\n"
            + "  Node at 512, 512, 512: Internal\r\n"
            + "    Node at 512, 512, 256:\r\n"
            + "    (point11, 600, 600)\r\n"
            + "    Node at 768, 512, 256:\r\n"
            + "    (point12, 900, 570)\r\n"
            + "    (point13, 990, 530)\r\n"
            + "    (point14, 1000, 530)\r\n"
            + "    Node at 512, 768, 256: Empty\r\n"
            + "    Node at 768, 768, 256:\r\n"
            + "    (point17, 960, 960)\n");
        systemOut().clearHistory();

        leaf = leaf.remove(point11, list);
        leaf = leaf.remove(point14, list);
        
        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Point removed: (point11, 600, 600)\r\n"
            + "Point removed: (point14, 1000, 530)\r\n"
            + "Node at 0, 0, 1024: Internal\r\n"
            + "  Node at 0, 0, 512: Empty\r\n"
            + "  Node at 512, 0, 512: Internal\r\n"
            + "    Node at 512, 0, 256: Empty\r\n"
            + "    Node at 768, 0, 256:\r\n"
            + "    (point6, 780, 130)\r\n"
            + "    (point8, 960, 130)\r\n"
            + "    (point7, 960, 130)\r\n"
            + "    Node at 512, 256, 256:\r\n"
            + "    (point9, 640, 390)\r\n"
            + "    Node at 768, 256, 256:\r\n"
            + "    (point10, 960, 390)\r\n"
            + "  Node at 0, 512, 512: Empty\r\n"
            + "  Node at 512, 512, 512:\r\n"
            + "  (point12, 900, 570)\r\n"
            + "  (point13, 990, 530)\r\n"
            + "  (point17, 960, 960)\n");
        systemOut().clearHistory();

        leaf = leaf.remove(point7, list);
        leaf = leaf.remove(point9, list);

        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Point removed: (point8, 960, 130)\r\n"
            + "Point removed: (point9, 640, 390)\r\n"
            + "Node at 0, 0, 1024: Internal\r\n"
            + "  Node at 0, 0, 512: Empty\r\n"
            + "  Node at 512, 0, 512:\r\n"
            + "  (point6, 780, 130)\r\n"
            + "  (point7, 960, 130)\r\n"
            + "  (point10, 960, 390)\r\n"
            + "  Node at 0, 512, 512: Empty\r\n"
            + "  Node at 512, 512, 512:\r\n"
            + "  (point12, 900, 570)\r\n"
            + "  (point13, 990, 530)\r\n"
            + "  (point17, 960, 960)\n");
        systemOut().clearHistory();

        leaf = leaf.remove(point7, list);
        leaf = leaf.remove(point12, list);
        leaf = leaf.remove(point17, list);

        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Point removed: (point7, 960, 130)\r\n"
            + "Point removed: (point12, 900, 570)\r\n"
            + "Point removed: (point17, 960, 960)\r\n"
            + "Node at 0, 0, 1024:\r\n"
            + "(point6, 780, 130)\r\n"
            + "(point10, 960, 390)\r\n"
            + "(point13, 990, 530)\n");
        systemOut().clearHistory();
        
        leaf = (Internal)leaf.insert(point7, 1024, 0, 0);
        leaf.insert(point12, 1024, 0, 0);
        leaf.insert(point17, 1024, 0, 0);
        leaf.dump(0, 0, 1024, 0, 0);
        
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024: Internal\r\n"
            + "  Node at 0, 0, 512: Empty\r\n"
            + "  Node at 512, 0, 512:\r\n"
            + "  (point7, 960, 130)\r\n"
            + "  (point10, 960, 390)\r\n"
            + "  (point6, 780, 130)\r\n"
            + "  Node at 0, 512, 512: Empty\r\n"
            + "  Node at 512, 512, 512:\r\n"
            + "  (point17, 960, 960)\r\n"
            + "  (point12, 900, 570)\r\n"
            + "  (point13, 990, 530)\n");
        systemOut().clearHistory();
        
        leaf = leaf.remove(point7, list);
        leaf = leaf.remove(point10, list);
        leaf = leaf.remove(point6, list);
        leaf.dump(0, 0, 1024, 0, 0);
        
        assertEquals(systemOut().getHistory(), ""
            + "Point removed: (point7, 960, 130)\r\n"
            + "Point removed: (point10, 960, 390)\r\n"
            + "Point removed: (point6, 780, 130)\r\n"
            + "Node at 0, 0, 1024:\r\n"
            + "(point17, 960, 960)\r\n"
            + "(point12, 900, 570)\r\n"
            + "(point13, 990, 530)\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testRemove38() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Node newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        SkipList<String, Point> list = new SkipList<String, Point>();
        newInter = newInter.remove(point1, list);
        newInter.dump(0, 0, 1024, 0, 0);
        newInter = newInter.remove(point2, list);
        newInter.dump(0, 0, 1024, 0, 0);
        newInter = newInter.remove(point3, list);
        newInter.dump(0, 0, 1024, 0, 0);
    }
    
    
    /**
     * This will fully test remove()
     * functionalities.
     */
    public void testFullRemove1() {
        
        Point point1 = new Point(780, 32, "point1");
        Point point2 = new Point(460, 33, "point2");
        Point point3 = new Point(454, 77, "point3");
        Point point4 = new Point(432, 71, "point4");
        Point point5 = new Point(407, 40, "point5");
        Point point6 = new Point(457, 153, "point6");
        Point point7 = new Point(460, 217, "point7");
        Point point8 = new Point(409, 226, "point8");
        Point point9 = new Point(421, 136, "point9");
        Point point10 = new Point(333, 130, "point10");
        Point point11 = new Point(336, 212, "point11");
        Point point12 = new Point(288, 213, "point12");
        Point point13 = new Point(277, 157, "point13");
        Point point14 = new Point(332, 47, "point14");
        Point point15 = new Point(346, 86, "point15");
        Point point16 = new Point(285, 81, "point16");
        Point point17 = new Point(271, 24, "point17");
        Point point18 = new Point(478, 286, "point18");
        Point point19 = new Point(466, 328, "point19");
        Point point20 = new Point(408, 340, "point20");
        Point point21 = new Point(419, 289, "point21");
        Point point22 = new Point(458, 419, "point22");
        Point point23 = new Point(458, 465, "point23");
        Point point24 = new Point(412, 457, "point24");
        Point point25 = new Point(404, 412, "point25");
        Point point26 = new Point(324, 414, "point26");
        Point point27 = new Point(338, 461, "point27");
        Point point28 = new Point(277, 465, "point28");
        Point point29 = new Point(284, 423, "point29");
        Point point30 = new Point(348, 276, "point30");
        Point point31 = new Point(351, 329, "point31");
        Point point32 = new Point(292, 343, "point32");
        Point point33 = new Point(273, 285, "point33");
        Point point34 = new Point(219, 286, "point34");
        Point point35 = new Point(216, 334, "point35");
        Point point36 = new Point(146, 318, "point36");
        Point point37 = new Point(162, 285, "point37");
        Point point38 = new Point(208, 413, "point38");
        Point point39 = new Point(218, 467, "point39");
        Point point40 = new Point(169, 468, "point40");
        Point point41 = new Point(169, 412, "point41");
        Point point42 = new Point(82, 417, "point42");
        Point point43 = new Point(84, 462, "point43");
        Point point44 = new Point(39, 465, "point44");
        Point point45 = new Point(40, 414, "point45");
        Point point46 = new Point(95, 297, "point46");
        Point point47 = new Point(85, 330, "point47");
        Point point48 = new Point(32, 335, "point48");
        Point point49 = new Point(27, 281, "point49");
        Point point50 = new Point(225, 33, "point50");
        Point point51 = new Point(223, 81, "point51");
        Point point52 = new Point(165, 87, "point52");
        Point point53 = new Point(156, 36, "point53");
        Point point54 = new Point(213, 147, "point54");
        Point point55 = new Point(216, 212, "point55");
        Point point56 = new Point(164, 216, "point56");
        Point point57 = new Point(137, 136, "point57");
        Point point58 = new Point(80, 168, "point58");
        Point point59 = new Point(72, 213, "point59");
        Point point60 = new Point(35, 219, "point60");
        Point point61 = new Point(35, 161, "point61");
        Point point62 = new Point(98, 26, "point62");
        Point point63 = new Point(90, 82, "point63");
        Point point64 = new Point(35, 86, "point64");
        Point point65 = new Point(28, 27, "point65");

        Node leaf = new Leaf();
        SkipList<String, Point> list = new SkipList<String, Point>();
        
        // mass insert
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point4, 1024, 0, 0);
        leaf.insert(point5, 1024, 0, 0);
        leaf.insert(point6, 1024, 0, 0);
        leaf.insert(point7, 1024, 0, 0);
        leaf.insert(point8, 1024, 0, 0);
        leaf.insert(point9, 1024, 0, 0);
        leaf.insert(point10, 1024, 0, 0);
        leaf.insert(point11, 1024, 0, 0);
        leaf.insert(point12, 1024, 0, 0);
        leaf.insert(point13, 1024, 0, 0);
        leaf.insert(point14, 1024, 0, 0);
        leaf.insert(point15, 1024, 0, 0);
        leaf.insert(point16, 1024, 0, 0);
        leaf.insert(point17, 1024, 0, 0);
        leaf.insert(point18, 1024, 0, 0);
        leaf.insert(point19, 1024, 0, 0);
        leaf.insert(point20, 1024, 0, 0);
        leaf.insert(point21, 1024, 0, 0);
        leaf.insert(point22, 1024, 0, 0);
        leaf.insert(point23, 1024, 0, 0);
        leaf.insert(point24, 1024, 0, 0);
        leaf.insert(point25, 1024, 0, 0);
        leaf.insert(point26, 1024, 0, 0);
        leaf.insert(point27, 1024, 0, 0);
        leaf.insert(point28, 1024, 0, 0);
        leaf.insert(point29, 1024, 0, 0);
        leaf.insert(point30, 1024, 0, 0);
        leaf.insert(point31, 1024, 0, 0);
        leaf.insert(point32, 1024, 0, 0);
        leaf.insert(point33, 1024, 0, 0);
        leaf.insert(point34, 1024, 0, 0);
        leaf.insert(point35, 1024, 0, 0);
        leaf.insert(point36, 1024, 0, 0);
        leaf.insert(point37, 1024, 0, 0);
        leaf.insert(point38, 1024, 0, 0);
        leaf.insert(point39, 1024, 0, 0);
        leaf.insert(point40, 1024, 0, 0);
        leaf.insert(point41, 1024, 0, 0);
        leaf.insert(point42, 1024, 0, 0);
        leaf.insert(point43, 1024, 0, 0);
        leaf.insert(point44, 1024, 0, 0);
        leaf.insert(point45, 1024, 0, 0);
        leaf.insert(point46, 1024, 0, 0);
        leaf.insert(point47, 1024, 0, 0);
        leaf.insert(point48, 1024, 0, 0);
        leaf.insert(point49, 1024, 0, 0);
        leaf.insert(point50, 1024, 0, 0);
        leaf.insert(point51, 1024, 0, 0);
        leaf.insert(point52, 1024, 0, 0);
        leaf.insert(point53, 1024, 0, 0);
        leaf.insert(point54, 1024, 0, 0);
        leaf.insert(point55, 1024, 0, 0);
        leaf.insert(point56, 1024, 0, 0);
        leaf.insert(point57, 1024, 0, 0);
        leaf.insert(point58, 1024, 0, 0);
        leaf.insert(point59, 1024, 0, 0);
        leaf.insert(point60, 1024, 0, 0);
        leaf.insert(point61, 1024, 0, 0);
        leaf.insert(point62, 1024, 0, 0);
        leaf.insert(point63, 1024, 0, 0);
        leaf.insert(point64, 1024, 0, 0);
        leaf.insert(point65, 1024, 0, 0);
        
        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024: Internal\r\n"
            + "  Node at 0, 0, 512: Internal\r\n"
            + "    Node at 0, 0, 256: Internal\r\n"
            + "      Node at 0, 0, 128: Internal\r\n"
            + "        Node at 0, 0, 64:\r\n"
            + "        (point65, 28, 27)\r\n"
            + "        Node at 64, 0, 64:\r\n"
            + "        (point62, 98, 26)\r\n"
            + "        Node at 0, 64, 64:\r\n"
            + "        (point64, 35, 86)\r\n"
            + "        Node at 64, 64, 64:\r\n"
            + "        (point63, 90, 82)\r\n"
            + "      Node at 128, 0, 128: Internal\r\n"
            + "        Node at 128, 0, 64:\r\n"
            + "        (point53, 156, 36)\r\n"
            + "        Node at 192, 0, 64:\r\n"
            + "        (point50, 225, 33)\r\n"
            + "        Node at 128, 64, 64:\r\n"
            + "        (point52, 165, 87)\r\n"
            + "        Node at 192, 64, 64:\r\n"
            + "        (point51, 223, 81)\r\n"
            + "      Node at 0, 128, 128: Internal\r\n"
            + "        Node at 0, 128, 64:\r\n"
            + "        (point61, 35, 161)\r\n"
            + "        Node at 64, 128, 64:\r\n"
            + "        (point58, 80, 168)\r\n"
            + "        Node at 0, 192, 64:\r\n"
            + "        (point60, 35, 219)\r\n"
            + "        Node at 64, 192, 64:\r\n"
            + "        (point59, 72, 213)\r\n"
            + "      Node at 128, 128, 128: Internal\r\n"
            + "        Node at 128, 128, 64:\r\n"
            + "        (point57, 137, 136)\r\n"
            + "        Node at 192, 128, 64:\r\n"
            + "        (point54, 213, 147)\r\n"
            + "        Node at 128, 192, 64:\r\n"
            + "        (point56, 164, 216)\r\n"
            + "        Node at 192, 192, 64:\r\n"
            + "        (point55, 216, 212)\r\n"
            + "    Node at 256, 0, 256: Internal\r\n"
            + "      Node at 256, 0, 128: Internal\r\n"
            + "        Node at 256, 0, 64:\r\n"
            + "        (point17, 271, 24)\r\n"
            + "        Node at 320, 0, 64:\r\n"
            + "        (point14, 332, 47)\r\n"
            + "        Node at 256, 64, 64:\r\n"
            + "        (point16, 285, 81)\r\n"
            + "        Node at 320, 64, 64:\r\n"
            + "        (point15, 346, 86)\r\n"
            + "      Node at 384, 0, 128: Internal\r\n"
            + "        Node at 384, 0, 64:\r\n"
            + "        (point5, 407, 40)\r\n"
            + "        Node at 448, 0, 64:\r\n"
            + "        (point2, 460, 33)\r\n"
            + "        Node at 384, 64, 64:\r\n"
            + "        (point4, 432, 71)\r\n"
            + "        Node at 448, 64, 64:\r\n"
            + "        (point3, 454, 77)\r\n"
            + "      Node at 256, 128, 128: Internal\r\n"
            + "        Node at 256, 128, 64:\r\n"
            + "        (point13, 277, 157)\r\n"
            + "        Node at 320, 128, 64:\r\n"
            + "        (point10, 333, 130)\r\n"
            + "        Node at 256, 192, 64:\r\n"
            + "        (point12, 288, 213)\r\n"
            + "        Node at 320, 192, 64:\r\n"
            + "        (point11, 336, 212)\r\n"
            + "      Node at 384, 128, 128: Internal\r\n"
            + "        Node at 384, 128, 64:\r\n"
            + "        (point9, 421, 136)\r\n"
            + "        Node at 448, 128, 64:\r\n"
            + "        (point6, 457, 153)\r\n"
            + "        Node at 384, 192, 64:\r\n"
            + "        (point8, 409, 226)\r\n"
            + "        Node at 448, 192, 64:\r\n"
            + "        (point7, 460, 217)\r\n"
            + "    Node at 0, 256, 256: Internal\r\n"
            + "      Node at 0, 256, 128: Internal\r\n"
            + "        Node at 0, 256, 64:\r\n"
            + "        (point49, 27, 281)\r\n"
            + "        Node at 64, 256, 64:\r\n"
            + "        (point46, 95, 297)\r\n"
            + "        Node at 0, 320, 64:\r\n"
            + "        (point48, 32, 335)\r\n"
            + "        Node at 64, 320, 64:\r\n"
            + "        (point47, 85, 330)\r\n"
            + "      Node at 128, 256, 128: Internal\r\n"
            + "        Node at 128, 256, 64:\r\n"
            + "        (point37, 162, 285)\r\n"
            + "        (point36, 146, 318)\r\n"
            + "        Node at 192, 256, 64:\r\n"
            + "        (point34, 219, 286)\r\n"
            + "        Node at 128, 320, 64: Empty\r\n"
            + "        Node at 192, 320, 64:\r\n"
            + "        (point35, 216, 334)\r\n"
            + "      Node at 0, 384, 128: Internal\r\n"
            + "        Node at 0, 384, 64:\r\n"
            + "        (point45, 40, 414)\r\n"
            + "        Node at 64, 384, 64:\r\n"
            + "        (point42, 82, 417)\r\n"
            + "        Node at 0, 448, 64:\r\n"
            + "        (point44, 39, 465)\r\n"
            + "        Node at 64, 448, 64:\r\n"
            + "        (point43, 84, 462)\r\n"
            + "      Node at 128, 384, 128: Internal\r\n"
            + "        Node at 128, 384, 64:\r\n"
            + "        (point41, 169, 412)\r\n"
            + "        Node at 192, 384, 64:\r\n"
            + "        (point38, 208, 413)\r\n"
            + "        Node at 128, 448, 64:\r\n"
            + "        (point40, 169, 468)\r\n"
            + "        Node at 192, 448, 64:\r\n"
            + "        (point39, 218, 467)\r\n"
            + "    Node at 256, 256, 256: Internal\r\n"
            + "      Node at 256, 256, 128: Internal\r\n"
            + "        Node at 256, 256, 64:\r\n"
            + "        (point33, 273, 285)\r\n"
            + "        Node at 320, 256, 64:\r\n"
            + "        (point30, 348, 276)\r\n"
            + "        Node at 256, 320, 64:\r\n"
            + "        (point32, 292, 343)\r\n"
            + "        Node at 320, 320, 64:\r\n"
            + "        (point31, 351, 329)\r\n"
            + "      Node at 384, 256, 128: Internal\r\n"
            + "        Node at 384, 256, 64:\r\n"
            + "        (point21, 419, 289)\r\n"
            + "        Node at 448, 256, 64:\r\n"
            + "        (point18, 478, 286)\r\n"
            + "        Node at 384, 320, 64:\r\n"
            + "        (point20, 408, 340)\r\n"
            + "        Node at 448, 320, 64:\r\n"
            + "        (point19, 466, 328)\r\n"
            + "      Node at 256, 384, 128: Internal\r\n"
            + "        Node at 256, 384, 64:\r\n"
            + "        (point29, 284, 423)\r\n"
            + "        Node at 320, 384, 64:\r\n"
            + "        (point26, 324, 414)\r\n"
            + "        Node at 256, 448, 64:\r\n"
            + "        (point28, 277, 465)\r\n"
            + "        Node at 320, 448, 64:\r\n"
            + "        (point27, 338, 461)\r\n"
            + "      Node at 384, 384, 128: Internal\r\n"
            + "        Node at 384, 384, 64:\r\n"
            + "        (point25, 404, 412)\r\n"
            + "        Node at 448, 384, 64:\r\n"
            + "        (point22, 458, 419)\r\n"
            + "        Node at 384, 448, 64:\r\n"
            + "        (point24, 412, 457)\r\n"
            + "        Node at 448, 448, 64:\r\n"
            + "        (point23, 458, 465)\r\n"
            + "  Node at 512, 0, 512:\r\n"
            + "  (point1, 780, 32)\r\n"
            + "  Node at 0, 512, 512: Empty\r\n"
            + "  Node at 512, 512, 512: Empty\n");
        systemOut().clearHistory();
        
        // mass remove
        leaf = leaf.remove(point1, list);
        leaf = leaf.remove(point2, list);
        leaf = leaf.remove(point3, list);
        leaf = leaf.remove(point4, list);
        leaf = leaf.remove(point5, list);
        leaf = leaf.remove(point6, list);
        leaf = leaf.remove(point7, list);
        leaf = leaf.remove(point8, list);
        leaf = leaf.remove(point9, list);
        leaf = leaf.remove(point10, list);
        leaf = leaf.remove(point11, list);
        leaf = leaf.remove(point12, list);
        leaf = leaf.remove(point13, list);
        leaf = leaf.remove(point14, list);
        leaf = leaf.remove(point15, list);
        leaf = leaf.remove(point16, list);
        leaf = leaf.remove(point17, list);
        leaf = leaf.remove(point18, list);
        leaf = leaf.remove(point19, list);
        leaf = leaf.remove(point20, list);
        leaf = leaf.remove(point21, list);
        leaf = leaf.remove(point22, list);
        leaf = leaf.remove(point23, list);
        leaf = leaf.remove(point24, list);
        leaf = leaf.remove(point25, list);
        leaf = leaf.remove(point26, list);
        leaf = leaf.remove(point27, list);
        leaf = leaf.remove(point28, list);
        leaf = leaf.remove(point29, list);
        leaf = leaf.remove(point30, list);
        leaf = leaf.remove(point31, list);
        leaf = leaf.remove(point32, list);
        leaf = leaf.remove(point33, list);
        leaf = leaf.remove(point34, list);
        leaf = leaf.remove(point35, list);
        leaf = leaf.remove(point36, list);
        leaf = leaf.remove(point37, list);
        leaf = leaf.remove(point38, list);
        leaf = leaf.remove(point39, list);
        leaf = leaf.remove(point40, list);
        leaf = leaf.remove(point41, list);
        leaf = leaf.remove(point42, list);
        leaf = leaf.remove(point43, list);
        leaf = leaf.remove(point44, list);
        leaf = leaf.remove(point45, list);
        leaf = leaf.remove(point46, list);
        leaf = leaf.remove(point47, list);
        leaf = leaf.remove(point48, list);
        leaf = leaf.remove(point49, list);
        leaf = leaf.remove(point50, list);
        leaf = leaf.remove(point51, list);
        leaf = leaf.remove(point52, list);
        leaf = leaf.remove(point53, list);
        leaf = leaf.remove(point54, list);
        leaf = leaf.remove(point55, list);
        leaf = leaf.remove(point56, list);
        leaf = leaf.remove(point57, list);
        leaf = leaf.remove(point58, list);
        leaf = leaf.remove(point59, list);
        leaf = leaf.remove(point60, list);
        leaf = leaf.remove(point61, list);
        leaf = leaf.remove(point62, list);
        leaf = leaf.remove(point63, list);
        leaf = leaf.remove(point64, list);
        leaf = leaf.remove(point65, list);
    }
    
    
    /**
     * This will fully test remove()
     * functionalities.
     */
    public void testFullRemove2() {
        
        Point point1 = new Point(780, 32, "point1");
        Point point2 = new Point(460, 33, "point2");
        Point point3 = new Point(454, 77, "point3");
        Point point4 = new Point(432, 71, "point4");
        Point point5 = new Point(407, 40, "point5");
        Point point6 = new Point(457, 153, "point6");
        Point point7 = new Point(460, 217, "point7");
        Point point8 = new Point(409, 226, "point8");
        Point point9 = new Point(421, 136, "point9");
        Point point10 = new Point(333, 130, "point10");
        Point point11 = new Point(336, 212, "point11");
        Point point12 = new Point(288, 213, "point12");
        Point point13 = new Point(277, 157, "point13");
        Point point14 = new Point(332, 47, "point14");
        Point point15 = new Point(346, 86, "point15");
        Point point16 = new Point(285, 81, "point16");
        Point point17 = new Point(271, 24, "point17");
        Point point18 = new Point(478, 286, "point18");
        Point point19 = new Point(466, 328, "point19");
        Point point20 = new Point(408, 340, "point20");
        Point point21 = new Point(419, 289, "point21");
        Point point22 = new Point(458, 419, "point22");
        Point point23 = new Point(458, 465, "point23");
        Point point24 = new Point(412, 457, "point24");
        Point point25 = new Point(404, 412, "point25");
        Point point26 = new Point(324, 414, "point26");
        Point point27 = new Point(338, 461, "point27");
        Point point28 = new Point(277, 465, "point28");
        Point point29 = new Point(284, 423, "point29");
        Point point30 = new Point(348, 276, "point30");
        Point point31 = new Point(351, 329, "point31");
        Point point32 = new Point(292, 343, "point32");
        Point point33 = new Point(273, 285, "point33");
        Point point34 = new Point(219, 286, "point34");
        Point point35 = new Point(216, 334, "point35");
        Point point36 = new Point(146, 318, "point36");
        Point point37 = new Point(162, 285, "point37");
        Point point38 = new Point(208, 413, "point38");
        Point point39 = new Point(218, 467, "point39");
        Point point40 = new Point(169, 468, "point40");
        Point point41 = new Point(169, 412, "point41");
        Point point42 = new Point(82, 417, "point42");
        Point point43 = new Point(84, 462, "point43");
        Point point44 = new Point(39, 465, "point44");
        Point point45 = new Point(40, 414, "point45");
        Point point46 = new Point(95, 297, "point46");
        Point point47 = new Point(85, 330, "point47");
        Point point48 = new Point(32, 335, "point48");
        Point point49 = new Point(27, 281, "point49");
        Point point50 = new Point(225, 33, "point50");
        Point point51 = new Point(223, 81, "point51");
        Point point52 = new Point(165, 87, "point52");
        Point point53 = new Point(156, 36, "point53");
        Point point54 = new Point(213, 147, "point54");
        Point point55 = new Point(216, 212, "point55");
        Point point56 = new Point(164, 216, "point56");
        Point point57 = new Point(137, 136, "point57");
        Point point58 = new Point(80, 168, "point58");
        Point point59 = new Point(72, 213, "point59");
        Point point60 = new Point(35, 219, "point60");
        Point point61 = new Point(35, 161, "point61");
        Point point62 = new Point(98, 26, "point62");
        Point point63 = new Point(90, 82, "point63");
        Point point64 = new Point(35, 86, "point64");
        Point point65 = new Point(28, 27, "point65");

        Node leaf = new Leaf();
        
        // mass insert
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point4, 1024, 0, 0);
        leaf.insert(point5, 1024, 0, 0);
        leaf.insert(point6, 1024, 0, 0);
        leaf.insert(point7, 1024, 0, 0);
        leaf.insert(point8, 1024, 0, 0);
        leaf.insert(point9, 1024, 0, 0);
        leaf.insert(point10, 1024, 0, 0);
        leaf.insert(point11, 1024, 0, 0);
        leaf.insert(point12, 1024, 0, 0);
        leaf.insert(point13, 1024, 0, 0);
        leaf.insert(point14, 1024, 0, 0);
        leaf.insert(point15, 1024, 0, 0);
        leaf.insert(point16, 1024, 0, 0);
        leaf.insert(point17, 1024, 0, 0);
        leaf.insert(point18, 1024, 0, 0);
        leaf.insert(point19, 1024, 0, 0);
        leaf.insert(point20, 1024, 0, 0);
        leaf.insert(point21, 1024, 0, 0);
        leaf.insert(point22, 1024, 0, 0);
        leaf.insert(point23, 1024, 0, 0);
        leaf.insert(point24, 1024, 0, 0);
        leaf.insert(point25, 1024, 0, 0);
        leaf.insert(point26, 1024, 0, 0);
        leaf.insert(point27, 1024, 0, 0);
        leaf.insert(point28, 1024, 0, 0);
        leaf.insert(point29, 1024, 0, 0);
        leaf.insert(point30, 1024, 0, 0);
        leaf.insert(point31, 1024, 0, 0);
        leaf.insert(point32, 1024, 0, 0);
        leaf.insert(point33, 1024, 0, 0);
        leaf.insert(point34, 1024, 0, 0);
        leaf.insert(point35, 1024, 0, 0);
        leaf.insert(point36, 1024, 0, 0);
        leaf.insert(point37, 1024, 0, 0);
        leaf.insert(point38, 1024, 0, 0);
        leaf.insert(point39, 1024, 0, 0);
        leaf.insert(point40, 1024, 0, 0);
        leaf.insert(point41, 1024, 0, 0);
        leaf.insert(point42, 1024, 0, 0);
        leaf.insert(point43, 1024, 0, 0);
        leaf.insert(point44, 1024, 0, 0);
        leaf.insert(point45, 1024, 0, 0);
        leaf.insert(point46, 1024, 0, 0);
        leaf.insert(point47, 1024, 0, 0);
        leaf.insert(point48, 1024, 0, 0);
        leaf.insert(point49, 1024, 0, 0);
        leaf.insert(point50, 1024, 0, 0);
        leaf.insert(point51, 1024, 0, 0);
        leaf.insert(point52, 1024, 0, 0);
        leaf.insert(point53, 1024, 0, 0);
        leaf.insert(point54, 1024, 0, 0);
        leaf.insert(point55, 1024, 0, 0);
        leaf.insert(point56, 1024, 0, 0);
        leaf.insert(point57, 1024, 0, 0);
        leaf.insert(point58, 1024, 0, 0);
        leaf.insert(point59, 1024, 0, 0);
        leaf.insert(point60, 1024, 0, 0);
        leaf.insert(point61, 1024, 0, 0);
        leaf.insert(point62, 1024, 0, 0);
        leaf.insert(point63, 1024, 0, 0);
        leaf.insert(point64, 1024, 0, 0);
        leaf.insert(point65, 1024, 0, 0);
        
        assertEquals(leaf.getDiffer(), 65);
        
        // mass remove
        leaf = leaf.removeCalled(point1);
        leaf = leaf.removeCalled(point2);
        leaf = leaf.removeCalled(point3);
        leaf = leaf.removeCalled(point4);
        leaf = leaf.removeCalled(point5);
        leaf = leaf.removeCalled(point6);
        leaf = leaf.removeCalled(point7);
        leaf = leaf.removeCalled(point8);
        leaf = leaf.removeCalled(point9);
        leaf = leaf.removeCalled(point10);
        leaf = leaf.removeCalled(point11);
        leaf = leaf.removeCalled(point12);
        leaf = leaf.removeCalled(point13);
        leaf = leaf.removeCalled(point14);
        leaf = leaf.removeCalled(point15);
        leaf = leaf.removeCalled(point16);
        leaf = leaf.removeCalled(point17);
        leaf = leaf.removeCalled(point18);
        leaf = leaf.removeCalled(point19);
        leaf = leaf.removeCalled(point20);
        leaf = leaf.removeCalled(point21);
        leaf = leaf.removeCalled(point22);
        leaf = leaf.removeCalled(point23);
        leaf = leaf.removeCalled(point24);
        leaf = leaf.removeCalled(point25);
        leaf = leaf.removeCalled(point26);
        leaf = leaf.removeCalled(point27);
        leaf = leaf.removeCalled(point28);
        leaf = leaf.removeCalled(point29);
        leaf = leaf.removeCalled(point30);
        leaf = leaf.removeCalled(point31);
        leaf = leaf.removeCalled(point32);
        leaf = leaf.removeCalled(point33);
        leaf = leaf.removeCalled(point34);
        leaf = leaf.removeCalled(point35);
        leaf = leaf.removeCalled(point36);
        leaf = leaf.removeCalled(point37);
        leaf = leaf.removeCalled(point38);
        leaf = leaf.removeCalled(point39);
        leaf = leaf.removeCalled(point40);
        leaf = leaf.removeCalled(point41);
        leaf = leaf.removeCalled(point42);
        leaf = leaf.removeCalled(point43);
        leaf = leaf.removeCalled(point44);
        leaf = leaf.removeCalled(point45);
        leaf = leaf.removeCalled(point46);
        leaf = leaf.removeCalled(point47);
        leaf = leaf.removeCalled(point48);
        leaf = leaf.removeCalled(point49);
        leaf = leaf.removeCalled(point50);
        leaf = leaf.removeCalled(point51);
        leaf = leaf.removeCalled(point52);
        leaf = leaf.removeCalled(point53);
        leaf = leaf.removeCalled(point54);
        leaf = leaf.removeCalled(point55);
        leaf = leaf.removeCalled(point56);
        leaf = leaf.removeCalled(point57);
        leaf = leaf.removeCalled(point58);
        leaf = leaf.removeCalled(point59);
        leaf = leaf.removeCalled(point60);
        leaf = leaf.removeCalled(point61);
        leaf = leaf.removeCalled(point62);
        leaf = leaf.removeCalled(point63);
        leaf = leaf.removeCalled(point64);
        leaf = leaf.removeCalled(point65);
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testGetLink() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        newInter.dump(0, 0, 1024, 0, 0);
        
        LinkList<Point> link = new LinkList<Point>();
        link = newInter.getLink();
        assertEquals(link.head.getForward().getRec(), point1);
    }
    
    
    /**
     * This will test duplicates().
     */
    @Test
    public void testDuplicates1() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.duplicates();
        assertEquals(systemOut().getHistory(), "");
    }
    
    
    /**
     * This will test duplicates().
     */
    @Test
    public void testDuplicates2() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(522, 30, "point1");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal newInter = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        newInter.duplicates();
        assertEquals(systemOut().getHistory(), "(522, 30)\n");
    }
    
    
    /**
     * This will test regionSearch().
     */
    @Test
    public void testRegionSearch() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(1020, 422, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        Internal inter = (Internal)leaf.insert(point4, 1024, 0, 0);
        int numberOfNode = inter.regionSearch(1, 1, 1021, 1021, 0);
        inter.dump(0, 0, 1024, 0, 0);
        
        assertEquals(numberOfNode, 9);
        
        int numberOfNode2 = inter.regionSearch(1000, 1, 1021, 1021, 0);
        inter.dump(0, 0, 1024, 0, 0);
         
        assertEquals(numberOfNode2, 5);
    }
    
    
    /**
     * This will test regionSearch().
     */
    @Test
    public void testRegionSearch2() {
        
        Point point1 = new Point(4, 4, "p1");
        Point point2 = new Point(4, 4, "p1");
        Point point3 = new Point(4, 4, "P1");
        Point point4 = new Point(300, 15, "p2");
        Point point5 = new Point(700, 4, "p4");
        Point point6 = new Point(700, 4, "p5");
        Point point7 = new Point(200, 900, "pointy");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf.insert(point4, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point5, 1024, 0, 0);
        leaf.insert(point6, 1024, 0, 0);
        leaf.insert(point7, 1024, 0, 0);
        
        int numberOfNode = leaf.regionSearch(500, 500, 20, 20, 0);
        leaf.dump(0, 0, 1024, 0, 0);
        
        assertEquals(numberOfNode, 4);
    }
    
    
    /**
     * This will test regionSearch().
     */
    @Test
    public void testGetDiffer() {
        
        Point point1 = new Point(4, 4, "p1");
        Point point2 = new Point(4, 4, "p1");
        Point point3 = new Point(4, 4, "P1");
        Point point4 = new Point(300, 15, "p2");
        Point point5 = new Point(700, 4, "p4");
        Point point6 = new Point(700, 4, "p5");
        Point point7 = new Point(200, 900, "pointy");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf.insert(point4, 1024, 0, 0);
        leaf = leaf.insert(point5, 1024, 0, 0);
        leaf = leaf.insert(point6, 1024, 0, 0);
        leaf = leaf.insert(point7, 1024, 0, 0);
        
        assertEquals(leaf.getDiffer(), 4);
    }
    
    
    /**
     * This will test isOverlapping().
     */
    public void testIsOverlapping() {
        
        Point p1 = new Point(349, 118, "p1");
        Point p2 = new Point(354, 361, "p2");
        Point p3 = new Point(170, 331, "p3");
        Point p4 = new Point(124, 113, "p4");
        Node leaf = new Leaf();
        leaf.insert(p1, 1024, 0, 0);
        leaf.insert(p2, 1024, 0, 0);
        leaf.insert(p3, 1024, 0, 0);
        leaf = leaf.insert(p4, 1024, 0, 0);
        leaf.dump(0, 0, 1024, 0, 0);
        
        leaf.regionSearch(12, 12, 500, 500, 0);
        
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024: Internal\r\n"
            + "  Node at 0, 0, 512: Internal\r\n"
            + "    Node at 0, 0, 256:\r\n"
            + "    (p4, 124, 113)\r\n"
            + "    Node at 256, 0, 256:\r\n"
            + "    (p1, 349, 118)\r\n"
            + "    Node at 0, 256, 256:\r\n"
            + "    (p3, 170, 331)\r\n"
            + "    Node at 256, 256, 256:\r\n"
            + "    (p2, 354, 361)\r\n"
            + "  Node at 512, 0, 512: Empty\r\n"
            + "  Node at 0, 512, 512: Empty\r\n"
            + "  Node at 512, 512, 512: Empty\r\n"
            + "Point found: (p4, 124, 113)\r\n"
            + "Point found: (p1, 349, 118)\r\n"
            + "Point found: (p3, 170, 331)\r\n"
            + "Point found: (p2, 354, 361)\n");
        systemOut().clearHistory();
        
        leaf.regionSearch(256, 256, 200, 200, 0);
        
        assertEquals(systemOut().getHistory(), "");
        systemOut().clearHistory();
        
        leaf.regionSearch(12, 12, 500, 500, 0);
        
        assertEquals(systemOut().getHistory(), ""
            + "Point found: (p4, 124, 113)\r\n"
            + "Point found: (p1, 349, 118)\r\n"
            + "Point found: (p3, 170, 331)\r\n"
            + "Point found: (p2, 354, 361)\n");
        systemOut().clearHistory();
        
        leaf.regionSearch(0, 0, 200, 200, 0);
        
        assertEquals(systemOut().getHistory(), "Point found: (p4, 124, 113)\n");
        systemOut().clearHistory();
        
        leaf.regionSearch(256, 12, 200, 200, 0);
        
        leaf.regionSearch(0, 0, 200, 200, 0);
        
        assertEquals(systemOut().getHistory(), "Point found: (p4, 124, 113)\n");
        systemOut().clearHistory();
        
        leaf.regionSearch(0, 256, 200, 200, 0);
        
        assertEquals(systemOut().getHistory(), "");
        systemOut().clearHistory();
        
        leaf.regionSearch(0, 0, 512, 256, 0);
        
        assertEquals(systemOut().getHistory(), ""
            + "Point found: (p4, 124, 113)\r\n"
            + "Point found: (p1, 349, 118)\n");
        systemOut().clearHistory();
        
        leaf.regionSearch(0, 256, 512, 256, 0);
        
        assertEquals(systemOut().getHistory(), "");
        systemOut().clearHistory();
        
        leaf.regionSearch(0, 0, 256, 512, 0);
        
        assertEquals(systemOut().getHistory(), ""
            + "Point found: (p4, 124, 113)\r\n"
            + "Point found: (p3, 170, 331)\n");
        systemOut().clearHistory();
        
        leaf.regionSearch(256, 0, 256, 512, 0);
        
        assertEquals(systemOut().getHistory(), "");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testWebCatRemove1() {
        
        Point point1 = new Point(0, 0, "point1");
        Point point2 = new Point(522, 0, "point2");
        Point point3 = new Point(0, 522, "point3");
        Point point4 = new Point(522, 522, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point4, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point1, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point2, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point3, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        leaf.removeCalled(point4);
        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024: Internal\r\n"
            + "  Node at 0, 0, 512:\r\n"
            + "  (point1, 0, 0)\r\n"
            + "  (point1, 0, 0)\r\n"
            + "  Node at 512, 0, 512:\r\n"
            + "  (point2, 522, 0)\r\n"
            + "  (point2, 522, 0)\r\n"
            + "  Node at 0, 512, 512:\r\n"
            + "  (point3, 0, 522)\r\n"
            + "  (point3, 0, 522)\r\n"
            + "  Node at 512, 512, 512:\r\n"
            + "  (point4, 522, 522)\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testWebCatRemove2() {
        
        Point point2 = new Point(522, 0, "point2");
        Point point3 = new Point(0, 522, "point3");
        Point point4 = new Point(522, 522, "point4");
        Node leaf = new Leaf();
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf.insert(point4, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point2, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point3, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        leaf.removeCalled(point4);
        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024: Internal\r\n"
            + "  Node at 0, 0, 512: Empty\r\n"
            + "  Node at 512, 0, 512:\r\n"
            + "  (point2, 522, 0)\r\n"
            + "  (point2, 522, 0)\r\n"
            + "  Node at 0, 512, 512:\r\n"
            + "  (point3, 0, 522)\r\n"
            + "  (point3, 0, 522)\r\n"
            + "  Node at 512, 512, 512:\r\n"
            + "  (point4, 522, 522)\n");
        systemOut().clearHistory();
    }
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testWebCatRemove3() {
        
        Point point1 = new Point(0, 0, "point1");
        Point point3 = new Point(0, 522, "point3");
        Point point4 = new Point(522, 522, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf.insert(point4, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point1, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point3, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        leaf.removeCalled(point4);
        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024: Internal\r\n"
            + "  Node at 0, 0, 512:\r\n"
            + "  (point1, 0, 0)\r\n"
            + "  (point1, 0, 0)\r\n"
            + "  Node at 512, 0, 512: Empty\r\n"
            + "  Node at 0, 512, 512:\r\n"
            + "  (point3, 0, 522)\r\n"
            + "  (point3, 0, 522)\r\n"
            + "  Node at 512, 512, 512:\r\n"
            + "  (point4, 522, 522)\n");
        systemOut().clearHistory();
    }
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testWebCatRemove4() {
        
        Point point1 = new Point(0, 0, "point1");
        Point point2 = new Point(522, 0, "point2");
        Point point4 = new Point(522, 522, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point4, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point1, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point2, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point4, 1024, 0, 0);
        
        leaf.removeCalled(point4);
        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024: Internal\r\n"
            + "  Node at 0, 0, 512:\r\n"
            + "  (point1, 0, 0)\r\n"
            + "  (point1, 0, 0)\r\n"
            + "  Node at 512, 0, 512:\r\n"
            + "  (point2, 522, 0)\r\n"
            + "  (point2, 522, 0)\r\n"
            + "  Node at 0, 512, 512: Empty\r\n"
            + "  Node at 512, 512, 512:\r\n"
            + "  (point4, 522, 522)\n");
        systemOut().clearHistory();
    }
    
    /**
     * This will test removeCalled().
     */
    @Test
    public void testWebCatRemove5() {
        
        Point point1 = new Point(0, 0, "point1");
        Point point2 = new Point(522, 0, "point2");
        Point point3 = new Point(0, 522, "point3");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point1, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point2, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point3, 1024, 0, 0);
        
        leaf.removeCalled(point3);
        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024: Internal\r\n"
            + "  Node at 0, 0, 512:\r\n"
            + "  (point1, 0, 0)\r\n"
            + "  (point1, 0, 0)\r\n"
            + "  Node at 512, 0, 512:\r\n"
            + "  (point2, 522, 0)\r\n"
            + "  (point2, 522, 0)\r\n"
            + "  Node at 0, 512, 512:\r\n"
            + "  (point3, 0, 522)\r\n"
            + "  Node at 512, 512, 512: Empty\n");
        systemOut().clearHistory();
    }
}
