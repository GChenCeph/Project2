// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
//
// -- guangkai

/**
 * This is Flyweight class
 * 
 * @author guangkai guangkai@vt.edu
 * @version 1 9/26/2022 1:51 pm
 */
public class Flyweight implements Node {
    
    // private static Flyweight FLY = null;
    @SuppressWarnings("unused")
    private int rX;
    @SuppressWarnings("unused")
    private int rY;
    @SuppressWarnings("unused")
    private int rSize;
    
    
    /**
     * This is Flyweight constructor.
     */
    public Flyweight() {
        // No behavior
    }
    
    
    /**
     * This will return this class's type.
     * 
     * @return 0 as the type.
     */
    public int getType() {
        return 0;
    }

    
    /**
     * This will use the insert() in
     * leaf class.
     * 
     * @param point as the input
     * @return leaf as the new node to
     *         replace this FLY.
     */
    @Override
    public Node insert(Point point, int size, int regionX, int regionY) {
        
        rX = regionX;
        rY = regionY;
        rSize = size;
        
        Node leaf = new Leaf();
        leaf.insert(point, size, regionX, regionY);
        return leaf;
    }

    
    /**
     * This is remove().
     * 
     * @param point as the point needs
     *        to be removed.
     * @param list as the Skiplist
     * 
     * @return this as Flyweight has 
     *         nothing to remove.
     */
    @Override
    public Node remove(Point point, SkipList<String, Point> list) {
        
        System.out.println("Point not found: " + 
            point.toString2());
        return this;
    }
    
    
    /**
     * This is remove().
     * 
     * @param point as the point needs
     *        to be removed.
     *        
     * @return this as nothing for
     *         Flyweight to remove.
     */
    @Override
    public Node removeCalled(Point point) {
        
        return this;
    }

    
    /**
     * RegionSearch.
     * 
     * @param x as the x coordinate
     * @param y as the y coordinate
     * @param w as the weight
     * @param h as the height
     * @param numberOfNode as int
     * 
     * @return numberOfNode as int
     */
    @Override
    public int regionSearch(int x, int y, int w, int h, int numberOfNode) {
        
        return 1;
    }

    
    /**
     * This is dump().
     * 
     * @param x as the regionX
     * @param y as the regionY
     * @param size as the length of the region
     * @param numberOfNode as no use there
     * 
     * @return 1 as this node has visited.
     */
    @Override
    public int dump(int x, int y, int size, int level, int numberOfNode) {
        
        printBlanks(level);
        System.out.println("Node at " + x + ", " + y + ", " + size + ": Empty");
        return 1;
    }
    
    
    /**
     * This is a helper method for all
     * the method need to print certain+
     * amount of blanks.
     * 
     * @param a as the number of blanks.
     */
    public void printBlanks(int a) {
        
        for (int i = 0; i < a; i++) {
            System.out.print(" ");
            System.out.print(" ");
        }
    }


    /**
     * This is duplicates().
     */
    @Override
    public void duplicates() {
        
    }


    /**
     * This will return the size.
     * 
     * @return 0 as this is a Flyweight.
     */
    @Override
    public int getListSize() {
        
        return 0;
    }


    /**
     * This will return the size.
     * 
     * @return 0 as this is a Flyweight.
     */
    @Override
    public int getDiffer() {
        
        return 0;
    }


    /**
     * This will return link.
     */
    @Override
    public LinkList<Point> getLink() {
        
        return null;
    }
}
