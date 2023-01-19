// import java.util.Random;
// import student.TestableRandom;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
//
// -- guangkai

/**
 * This is QuadTree class.
 * 
 * @author guangkai guangkai@vt.edu
 * @version 1 9/13/2022 3:34 pm
 * @param <T> Generic Type
 */
public class QuadTree<T> {
    
    
    private Node root;
    /**
     * This is FLY as static global value.
     */
    public static final Flyweight FLY = new Flyweight();
    
    
    /**
     * This will set root.
     */
    public QuadTree() {
        root = FLY;
    }
    
    
    /**
     * This will return root.
     * 
     * @return root as the root.
     */
    public Node getRoot() {
        return root;
    }
    
    
    /**
     * Insert a point of input coordination.
     * 
     * @param point as the x coordinate
     */
    public void insert(Point point) {
        
        root = root.insert(point, 1024, 0, 0);
    }
    
    
    /**
     * Remove a point of input coordination.
     * 
     * @param a as the x coordinate
     * @param b as the y coordinate
     * @param name  Name
     * @param list as a Skiplist.
     */
    public void remove(int a, int b, 
        String name, SkipList<String, Point> list) {

        Point point = new Point(a, b, name);
        root = root.remove(point, list);
    }
    
    
    /**
     * Remove a point of input coordination.
     * 
     * @param a as the x coordinate
     * @param b as the y coordinate
     * @param name as a string.
     * 
     * @return root as root
     */
    public Node removeCalled(int a, int b, String name) {

        Point point = new Point(a, b, name);
        root = root.removeCalled(point);
        return root;
    }
    
    
    /**
     * Remove a point of input coordination.
     * 
     * @param x as the x coordinate
     * @param y as the y coordinate
     * @param w as the weight
     * @param h as the height
     * @param numberOfNode as int
     * 
     * @return numberOfNode as int
     */
    public int regionSearch(int x, int y, int w, int h, int numberOfNode) {

        numberOfNode = root.regionSearch(x, y, w, h, 0);
        
        return numberOfNode;
    }
    
    
    /**
     * Remove a point of input coordination.
     * 
     * @param x as the x coordinate
     * @param y as the y coordinate
     * @param size as int
     * @param level as int
     * @param numberOfNode as int
     * 
     * @return numberOfNode as int
     */
    public int dump(int x, int y, int size, int level, int numberOfNode) {

        numberOfNode = root.dump(x, y, size, level, 0);
        return numberOfNode;
    }
    
    
    /**
     * This is duplicates() method.
     */
    public void duplicates() {
        
        root.duplicates();
    }
}
