

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
//
// -- guangkai

/**
 * This is Point class.
 * 
 * @author guangkai guangkai@vt.edu
 * @version 1 9/13/2022 3:09 pm
 */
public class Point {

    private String name;
    private int x;
    private int y;

    /**
     * This will hold the value of input.
     * 
     * @param a as int
     * @param b as int
     * @param c as string
     */
    public Point(int a, int b, String c) {
        x = a;
        y = b;
        name = c;
    }


    /**
     * This will return x of the point.
     * 
     * @return x as int.
     */
    public int getX() {
        return x;
    }


    /**
     * This will return y of the point.
     * 
     * @return y as int.
     */
    public int getY() {
        return y;
    }
    
    
    /**
     * This will return y of the point.
     * 
     * @return name as the key.
     */
    public String getName() {
        return name;
    }
    
    
    /**
     * This will return y of the point.
     * 
     * @param str as the name.
     */
    public void setName(String str) {
        this.name = str;
    }


    /**
     * This will determine if 2 rectangle intersects.
     * 
     * @param regionX as x coord
     * @param regionY as y coord
     * @param width as width
     * @param height as height
     * 
     * @return true if 2 region intersected;
     *         false if not.
     */
    public boolean isInside(int regionX, int regionY, int width, int height) {

        return this.x > regionX &&
            this.x < regionX + width &&
            this.y > regionY &&
            this.y < regionY + height;
    }


    /**
     * This will return a string for the numbers.
     * 
     * @return str contains x, y, w, and h.
     */
    public String toString() {
        return name + ", " + x + ", " + y;
    }
    
    
    /**
     * This will return a string for the numbers.
     * 
     * @return str contains x, y, w, and h.
     */
    public String toString2() {
        return "(" + x + ", " + y + ")";
    }
}
