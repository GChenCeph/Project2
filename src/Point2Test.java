import java.io.FileNotFoundException;
import org.junit.Test;
import student.TestCase;
import student.TestableRandom;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
//
// -- guangkai

/**
 * This will test Point2 class, which
 * contains main.
 * 
 * @author guangkai guangkai@vt.edu
 * @version 1 9/26/2022 7:49 pm
 */
public class Point2Test extends TestCase {

    
    /**
     * This is the test main method.
     * 
     * @throws FileNotFoundException
     */
    @Test
    public void testMain1() throws FileNotFoundException {

        String[] str0 = new String[1];
        str0[0] = "testEmpty.txt";
        Point2.main(str0);
        assertEquals(systemOut().getHistory(), "");
        systemOut().clearHistory();
    }
    
    
    /**
     * This is the test main method.
     * 
     * @throws FileNotFoundException
     */
    @Test
    public void testMain2() throws FileNotFoundException {

        String[] str0 = new String[1];
        str0[0] = "testEmpty2.txt";
        Point2.main(str0);
        assertEquals(systemOut().getHistory(), 
            "File does not exist: testEmpty2.txt\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This is the test main method.
     * 
     * @throws FileNotFoundException
     */
    @Test
    public void testMain3() throws FileNotFoundException {

        String[] str0 = new String[1];
        str0[0] = "test Empty.txt";
        Point2.main(str0);
        assertEquals(systemOut().getHistory(), 
            "File does not exist: test Empty.txt\n");
        systemOut().clearHistory();
        
        str0[0] = "";
        Point2.main(str0);
        assertEquals(systemOut().getHistory(), 
            "File does not exist: \n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This is the test main method.
     * 
     * @throws FileNotFoundException
     */
    @Test
    public void testMain4() throws FileNotFoundException {

        String[] str0 = new String[1];
        str0[0] = "testing3.txt";
        TestableRandom.setNextBooleans(true, true, false);
        Point2.main(str0);
        assertEquals(systemOut().getHistory(), ""
            + "Point inserted: (p1, 4, 4)\r\n"
            + "SkipList dump:\r\n"
            + "Node has depth 2, Value (null)\r\n"
            + "Node has depth 2, Value (p1, p1, 4, 4)\r\n"
            + "SkipList size is: 1\r\n"
            + "QuadTree dump:\r\n"
            + "Node at 0, 0, 1024:\r\n"
            + "(p1, 4, 4)\r\n"
            + "1 quadtree nodes printed\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This is the test main method.
     * 
     * @throws FileNotFoundException
     */
    @Test
    public void testMain5() throws FileNotFoundException {

        String[] str0 = new String[1];
        str0[0] = "testing2.txt";
        Point2.main(str0);
        assertEquals(systemOut().getHistory(), ""
            + "Point inserted: (p1, 4, 4)\r\n"
            + "Point inserted: (p1, 4, 4)\r\n"
            + "Point inserted: (P1, 4, 4)\r\n"
            + "Point inserted: (p2, 300, 15)\r\n"
            + "Point inserted: (p4, 700, 4)\r\n"
            + "Point inserted: (p5, 700, 4)\r\n"
            + "Point inserted: (pointy, 200, 900)\r\n"
            + "Point rejected: (bad1, 1134, 12)\r\n"
            + "Point rejected: (bad2, 3, 3221)\r\n"
            + "Point rejected: (bad3, -3, 2)\r\n"
            + "Point rejected: (1552, 2)\r\n"
            + "Point not found: (8, 8)\r\n"
            + "Point removed: (p2, 300, 15)\r\n"
            + "Point not found: (300, 15)\r\n"
            + "Point not removed: pOINTy\r\n"
            + "Point removed: (pointy, 200, 900)\r\n"
            + "Duplicate points:\r\n"
            + "(4, 4)\r\n"
            + "(700, 4)\r\n"
            + "Points intersecting region (2, 2, 1000, 1000)\r\n"
            + "Point found: (p1, 4, 4)\r\n"
            + "Point found: (P1, 4, 4)\r\n"
            + "Point found: (p1, 4, 4)\r\n"
            + "Point found: (p5, 700, 4)\r\n"
            + "Point found: (p4, 700, 4)\r\n"
            + "5 quadtree nodes visited\r\n"
            + "Rectangle rejected: (500, 500, 0, 0)\r\n"
            + "Points intersecting region (500, 500, 20, 20)\r\n"
            + "4 quadtree nodes visited\r\n"
            + "Points intersecting region (600, 0, 200, 200)\r\n"
            + "Point found: (p5, 700, 4)\r\n"
            + "Point found: (p4, 700, 4)\r\n"
            + "2 quadtree nodes visited\r\n"
            + "Points intersecting region (600, 0, 2000, 2000)\r\n"
            + "Point found: (p5, 700, 4)\r\n"
            + "Point found: (p4, 700, 4)\r\n"
            + "3 quadtree nodes visited\r\n"
            + "Rectangle rejected: (500, 500, 0, 20)\r\n"
            + "Rectangle rejected: (500, 500, 20, 0)\r\n"
            + "Found: (p1, 4, 4)\r\n"
            + "Found: (p1, 4, 4)\r\n"
            + "Point not found: p2\r\n"
            + "Found: (p4, 700, 4)\r\n"
            + "Point not found: P4\r\n"
            + "Point not found: (1002, 2)\r\n"
            + "Point rejected: (1002, 1552)\r\n"
            + "Point rejected: (1552, 1552)\r\n"
            + "Point removed: (p5, 700, 4)\r\n"
            + "Point removed: (p4, 700, 4)\r\n"
            + "Point not found: (700, 4)\n");
        systemOut().clearHistory();
    }


    /**
     * This is the test main method.
     * 
     * @throws FileNotFoundException
     */
    @Test
    public void testMain6() throws FileNotFoundException {

        String[] str0 = new String[1];
        str0[0] = "testing4.txt";
        TestableRandom.setNextBooleans(true, true, false);
        Point2.main(str0);
        assertEquals(systemOut().getHistory(), ""
            + "Point inserted: (p1, 4, 4)\r\n"
            + "Point not removed: 1\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This is the test main method.
     * 
     * @throws FileNotFoundException
     */
    @Test
    public void testMain7() throws FileNotFoundException {

        String[] str0 = new String[1];
        str0[0] = "testing5.txt";
        TestableRandom.setNextBooleans(true, true, false);
        Point2.main(str0);
        assertEquals(systemOut().getHistory(), ""
            + "Point rejected: (p1, -1, -1)\r\n"
            + "Point rejected: (p2, -1, 0)\r\n"
            + "Point rejected: (p3, 0, -1)\r\n"
            + "Point inserted: (p4, 0, 0)\r\n"
            + "Point rejected: (p5, 0, 1200)\r\n"
            + "Point rejected: (p6, 1200, 0)\r\n"
            + "Point rejected: (p7, 1200, 1200)\r\n"
            + "Point rejected: (p8, 1200, -1)\r\n"
            + "Point rejected: (p9, -1, 1200)\n");
        systemOut().clearHistory();
    }
    
    
    /////////////////////////////////LinkedNode test
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
    
    
    ////////////////////////////////////////////LinkList test
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
    public void testRemoveFly() {
        
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
    public void testRemove2Fly() {
        
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
    
    ////////////////////////////////Flyweight test
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
    
    //////////////////////////////////////////Internal test
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
    public void testRemoveInternal() {
        
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
    public void testRemove2Internal() {
        
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
    public void testRemove3Internal() {
        
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
    public void testRemove4Internal() {
        
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
        
        SkipList<String, Point> list = new SkipList<String, Point>();
        newInter.remove(point2, list);
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
        
        assertEquals(leaf.getDiffer(), 65);
        
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
    public void testGetLinkInternal() {
        
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
    public void testDuplicates1Internal() {
        
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
    public void testDuplicates2Internal() {
        
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
    public void testRegionSearchInternal() {
        
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
    public void testGetDifferInternal() {
        
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
    
    ///////////////////////////////////////KVPair test
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
    public void testToStringKVPair() {

        Point point1 = new Point(3, 3, "point1");
        KVPair<String, Point> newPair1 = 
            new KVPair<String, Point>("point1", point1);

        assertEquals(newPair1.toString(), "point1, 3, 3");
    }
    
    
    ////////////////////////////////////////////Leaf test
    /**
     * This will test getType().
     */
    public void testGetTypeLeaf() {
        
        Leaf leaf = new Leaf();
        assertEquals(leaf.getType(), 2);
    }
    
    
    /**
     * This will test getType().
     */
    public void testGetListSizeLeaf() {
        
        Point point1 = new Point(3, 3, "point1");
        Leaf leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        
        assertEquals(leaf.getListSize(), 1);
    }
    
    
    /**
     * This will test insert()
     */
    @Test
    public void testInsert1Leaf() {
        
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
    public void testInsert2Leaf() {
        
        Point point1 = new Point(3, 3, "point1");
        Leaf leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point1, 1024, 0, 0);
        //leaf.insert(point1, 1024, 0, 0);
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
    public void testInsert3Leaf() {
        
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
    public void testInsert4Leaf() {
        
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
    public void testInsert5Leaf() {
        
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
    public void testInsert6Leaf() {
        
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
    public void testInsert7Leaf() {
        
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
        leaf = leaf.insert(point4, 1024, 0, 0);
        leaf = leaf.insert(point5, 1024, 0, 0);
        leaf = leaf.insert(point6, 1024, 0, 0);
        leaf = leaf.insert(point7, 1024, 0, 0);
        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024: Internal\r\n"
            + "  Node at 0, 0, 512: Internal\r\n"
            + "    Node at 0, 0, 256:\r\n"
            + "    (p1, 4, 4)\r\n"
            + "    (P1, 4, 4)\r\n"
            + "    (p1, 4, 4)\r\n"
            + "    Node at 256, 0, 256:\r\n"
            + "    (p2, 300, 15)\r\n"
            + "    Node at 0, 256, 256: Empty\r\n"
            + "    Node at 256, 256, 256: Empty\r\n"
            + "  Node at 512, 0, 512:\r\n"
            + "  (p5, 700, 4)\r\n"
            + "  (p4, 700, 4)\r\n"
            + "  Node at 0, 512, 512:\r\n"
            + "  (pointy, 200, 900)\r\n"
            + "  Node at 512, 512, 512: Empty\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test insert()
     */
    @Test
    public void testInsert9() {
        
        Point point1 = new Point(0, 0, "point1");
        Point point2 = new Point(0, 1, "point2");
        Point point3 = new Point(1, 0, "point3");
        Point point4 = new Point(1, 1, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point4, 1024, 0, 0);
        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024: Internal\r\n"
            + "  Node at 0, 0, 512: Internal\r\n"
            + "    Node at 0, 0, 256: Internal\r\n"
            + "      Node at 0, 0, 128: Internal\r\n"
            + "        Node at 0, 0, 64: Internal\r\n"
            + "          Node at 0, 0, 32: Internal\r\n"
            + "            Node at 0, 0, 16: Internal\r\n"
            + "              Node at 0, 0, 8: Internal\r\n"
            + "                Node at 0, 0, 4: Internal\r\n"
            + "                  Node at 0, 0, 2: Internal\r\n"
            + "                    Node at 0, 0, 1:\r\n"
            + "                    (point1, 0, 0)\r\n"
            + "                    Node at 1, 0, 1:\r\n"
            + "                    (point3, 1, 0)\r\n"
            + "                    Node at 0, 1, 1:\r\n"
            + "                    (point2, 0, 1)\r\n"
            + "                    Node at 1, 1, 1:\r\n"
            + "                    (point4, 1, 1)\r\n"
            + "                  Node at 2, 0, 2: Empty\r\n"
            + "                  Node at 0, 2, 2: Empty\r\n"
            + "                  Node at 2, 2, 2: Empty\r\n"
            + "                Node at 4, 0, 4: Empty\r\n"
            + "                Node at 0, 4, 4: Empty\r\n"
            + "                Node at 4, 4, 4: Empty\r\n"
            + "              Node at 8, 0, 8: Empty\r\n"
            + "              Node at 0, 8, 8: Empty\r\n"
            + "              Node at 8, 8, 8: Empty\r\n"
            + "            Node at 16, 0, 16: Empty\r\n"
            + "            Node at 0, 16, 16: Empty\r\n"
            + "            Node at 16, 16, 16: Empty\r\n"
            + "          Node at 32, 0, 32: Empty\r\n"
            + "          Node at 0, 32, 32: Empty\r\n"
            + "          Node at 32, 32, 32: Empty\r\n"
            + "        Node at 64, 0, 64: Empty\r\n"
            + "        Node at 0, 64, 64: Empty\r\n"
            + "        Node at 64, 64, 64: Empty\r\n"
            + "      Node at 128, 0, 128: Empty\r\n"
            + "      Node at 0, 128, 128: Empty\r\n"
            + "      Node at 128, 128, 128: Empty\r\n"
            + "    Node at 256, 0, 256: Empty\r\n"
            + "    Node at 0, 256, 256: Empty\r\n"
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
    public void testInsert10() {
        
        Point point1 = new Point(0, 0, "point1");
        Point point2 = new Point(0, 1, "point2");
        Point point3 = new Point(1, 0, "point3");
        Point point4 = new Point(1, 1, "point4");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point4, 1024, 0, 0);
        leaf.dump(0, 0, 1024, 0, 0);
        assertEquals(systemOut().getHistory(), ""
            + "Node at 0, 0, 1024: Internal\r\n"
            + "  Node at 0, 0, 512: Internal\r\n"
            + "    Node at 0, 0, 256: Internal\r\n"
            + "      Node at 0, 0, 128: Internal\r\n"
            + "        Node at 0, 0, 64: Internal\r\n"
            + "          Node at 0, 0, 32: Internal\r\n"
            + "            Node at 0, 0, 16: Internal\r\n"
            + "              Node at 0, 0, 8: Internal\r\n"
            + "                Node at 0, 0, 4: Internal\r\n"
            + "                  Node at 0, 0, 2: Internal\r\n"
            + "                    Node at 0, 0, 1:\r\n"
            + "                    (point1, 0, 0)\r\n"
            + "                    Node at 1, 0, 1:\r\n"
            + "                    (point3, 1, 0)\r\n"
            + "                    Node at 0, 1, 1:\r\n"
            + "                    (point2, 0, 1)\r\n"
            + "                    Node at 1, 1, 1:\r\n"
            + "                    (point4, 1, 1)\r\n"
            + "                  Node at 2, 0, 2: Empty\r\n"
            + "                  Node at 0, 2, 2: Empty\r\n"
            + "                  Node at 2, 2, 2: Empty\r\n"
            + "                Node at 4, 0, 4: Empty\r\n"
            + "                Node at 0, 4, 4: Empty\r\n"
            + "                Node at 4, 4, 4: Empty\r\n"
            + "              Node at 8, 0, 8: Empty\r\n"
            + "              Node at 0, 8, 8: Empty\r\n"
            + "              Node at 8, 8, 8: Empty\r\n"
            + "            Node at 16, 0, 16: Empty\r\n"
            + "            Node at 0, 16, 16: Empty\r\n"
            + "            Node at 16, 16, 16: Empty\r\n"
            + "          Node at 32, 0, 32: Empty\r\n"
            + "          Node at 0, 32, 32: Empty\r\n"
            + "          Node at 32, 32, 32: Empty\r\n"
            + "        Node at 64, 0, 64: Empty\r\n"
            + "        Node at 0, 64, 64: Empty\r\n"
            + "        Node at 64, 64, 64: Empty\r\n"
            + "      Node at 128, 0, 128: Empty\r\n"
            + "      Node at 0, 128, 128: Empty\r\n"
            + "      Node at 128, 128, 128: Empty\r\n"
            + "    Node at 256, 0, 256: Empty\r\n"
            + "    Node at 0, 256, 256: Empty\r\n"
            + "    Node at 256, 256, 256: Empty\r\n"
            + "  Node at 512, 0, 512: Empty\r\n"
            + "  Node at 0, 512, 512: Empty\r\n"
            + "  Node at 512, 512, 512: Empty\n");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test dump().
     */
    @Test
    public void testDumpLeaf() {
        
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
    public void testRemoveLeaf() {
        
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
    public void testRemove2Leaf() {
        
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
     * This will test regionSearch().
     */
    public void testRegionSearchLeaf() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        int n1 = leaf.regionSearch(3, 3, 3, 3, 0);
        assertEquals(n1, 1);
        int n2 = leaf.regionSearch(3, 3, 1023, 1023, 0);
        assertEquals(n2, 1);
    }
    
    
    /**
     * This will test getDiffer().
     */
    public void testGetDifferLeaf() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        
        assertEquals(leaf.getDiffer(), 3);
    }
    
    
    /**
     * This will test getDiffer().
     */
    public void testGetLinkLeaf() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        
        assertEquals(leaf.getLink().getSize(), 3);
    }
    
    
    /**
     * This will test duplicates().
     */
    public void testDuplicates1Leaf() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(522, 422, "point3");
        Point point3 = new Point(522, 422, "point3");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf.duplicates();
        assertEquals(systemOut().getHistory(), "(522, 422)\n");
    }
    
    
    /**
     * This will test duplicates().
     */
    public void testDuplicates2Leaf() {
        
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(1020, 30, "point2");
        Point point3 = new Point(522, 422, "point3");
        Point point4 = new Point(522, 423, "point3");
        Node leaf = new Leaf();
        leaf.insert(point1, 1024, 0, 0);
        leaf.insert(point2, 1024, 0, 0);
        leaf.insert(point3, 1024, 0, 0);
        leaf = (Internal)leaf.insert(point4, 1024, 0, 0);
        leaf.duplicates();
        assertEquals(systemOut().getHistory(), "");
    }
    
    
    ////////////////////////////////////LinkedNode test
    /**
     * This will test getRec().
     */
    @Test
    public void testGetRecLinkedNode() {
        
        Point point1 = new Point(3, 3, "point1");
        LinkedNode<Point> node = new LinkedNode<Point>(point1);
        
        assertEquals(node.getRec(), point1);
    }
    
    
    /**
     * This will test setForward() and 
     * getForward().
     */
    @Test
    public void testSetForwardLinkedNode() {
        
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
    public void testToStringLinkedNode() {
        
        Point point1 = new Point(3, 3, "point1");
        LinkedNode<Point> node = new LinkedNode<Point>(point1);
        
        assertEquals(node.toString(), "point1, 3, 3");
    }
    
    
    ////////////////////////////////////LinkList
    /**
     * This will test getSize().
     */
    @Test
    public void testGetSize1LinkList() {
        
        LinkList<Point> link = new LinkList<Point>();
        Point point1 = new Point(3, 3, "point1");
        link.insert(point1);
        
        assertEquals(link.getSize(), 1);
    }
    
    
    /**
     * This will test getSize().
     */
    @Test
    public void testGetSize2LinkList() {
        
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
    }
    
    /**
     * This will test getRemove().
     */
    @Test
    public void testRemoveLinkList() {
        
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
    public void testRemove2LinkList() {
        
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
        
        link.removeCalled(point2);
        assertEquals(link.getSize(), 3);
        assertEquals(link.getDiffer(), 2);
    }
    
    
    /**
     * This will test getRemove().
     */
    @Test
    public void testRemove3LinkList() {
        
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
    public void testRemove4LinkList() {
        
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
     * This will test duplicates().
     */
    @Test
    public void testDuplicates1LinkList() {
        
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
    public void testDuplicates2LinkList() {
        
        LinkList<Point> link = new LinkList<Point>();
        link.duplicates();
        assertEquals(systemOut().getHistory(), "");
        systemOut().clearHistory();
    }
    
    
    /**
     * This will test duplicates().
     */
    @Test
    public void testDuplicates3LinkList() {
        
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
    
    ////////////////////////////////////Point test
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
    public void testToStringPoint() {
        Point point1 = new Point(3, 4, "point1");

        assertEquals(point1.toString(), "point1, 3, 4");
    }
    
    
    /**
     * This will test toString() method.
     */
    @Test
    public void testToString2Point() {
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
    
    
    //////////////////////////////QuadTree test
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
    public void testInsertQuadTree() {
        
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
    public void testInsert1QuadTree() {
        
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
    public void testInsert2QuadTree() {
        
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
    public void testRemoveQuadTree() {
        
        QuadTree<Point> tree = new QuadTree<Point>();
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(522, 30, "point2");
        tree.insert(point1);
        tree.insert(point2);
        
        SkipList<String, Point> list = new SkipList<String, Point>();
        list.insert("point1", point1);
        list.insert("point2", point2);
        
        tree.remove(522, 30, "point1", list);
    }
    
    
    /**
     * This will test removeCalled().
     */
    public void testRemove2QuadTree() {
        
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
    public void testRegionSearchQuadTree() {
        
        QuadTree<Point> tree = new QuadTree<Point>();
        Point point1 = new Point(522, 30, "point1");
        Point point2 = new Point(522, 33, "point2");
        tree.insert(point1);
        tree.insert(point2);
        
        int num = tree.regionSearch(1, 1, 600, 600, 0);
        assertEquals(num, 1); // Wrong
    }
    
    
    /**
     * This will test duplicates().
     */
    public void testDuplicatesQuadTree() {
        
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
    
    
    
    /////////////////////////////////////SkipList test
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
    public void testInsert1SkipList() {

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
    public void testInsert2SkipList() {

        SkipList<String, Point> list = new SkipList<>();
        
        assertEquals(list.getSize(), 0);
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
        int out = list.dump();
        
        assertEquals(out, 0);
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
        
        list.removeByName("point1");
        assertEquals(list.head.getForward()[0].getPair().value(), point2);
        assertEquals(list.head.getForward()[1].getPair().value(), point2);
        assertEquals(list.head.getForward()[2].getPair().value(), point3);
        assertEquals(list.head.getForward()[3].getPair().value(), point4);
        
        list.removeByName("point2");
        assertEquals(list.head.getForward()[0].getPair().value(), point3);
        assertEquals(list.head.getForward()[1].getPair().value(), point3);
        assertEquals(list.head.getForward()[2].getPair().value(), point3);
        assertEquals(list.head.getForward()[3].getPair().value(), point4);
        
        list.removeByName("point3");
        assertEquals(list.head.getForward()[0].getPair().value(), point4);
        assertEquals(list.head.getForward()[1].getPair().value(), point4);
        assertEquals(list.head.getForward()[2].getPair().value(), point4);
        assertEquals(list.head.getForward()[3].getPair().value(), point4);
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
    
    
    ///////////////////////////////SkipNode test
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
    public void testKeySkipNode() {

        Point point1 = new Point(3, 3, "point1");
        SkipNode<String, Point> newNode = 
            new SkipNode<String, Point>("point1", point1, 3);
        assertTrue(newNode.key().equals("point1"));
    }
}
