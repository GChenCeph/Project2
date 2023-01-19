

//Virginia Tech Honor Code Pledge:
//
//As a Hokie, I will conduct myself with honor and integrity at all times.
//I will not lie, cheat, or steal, nor will I accept the actions of those
//who do.
//
//-- guangkai

/**
* This is Node interface.
* 
* @author guangkai guangkai@vt.edu
* @version 1 9/26/2022 1:49 pm
*/
public interface Node {
    
    
    /**
     * This will transform from leaf to
     * internal node.
     * 
     * @param point as the input
     * @param size as a int
     * @param regionX as a int
     * @param regionY as a int
     * 
     * @return this if no split,
     *         split(this) as Internal if split.
     */
    public Node insert(Point point, int size, int regionX, int regionY);
    
    
    /**
     * This will remove the first node with
     * the matching coordinate.
     * 
     * @param point as the target point
     * @param list as the SkipList.
     * 
     * @return FLY if the matched point is
     *         the only node in the list.
     *         this if linklist still have 
     *         other points.
     */
    public Node remove(Point point, SkipList<String, Point> list);
    
    
    /**
     * This will remove the first node with
     * the matching coordinate.
     * 
     * @param point as the target point
     * 
     * @return QuadTree.FLY if all points are
     *         gone;
     *         this if not.
     */
    public Node removeCalled(Point point);
    
    
    /**
     * This is search().
     * 
     * @param x as a int
     * @param y as a int
     * @param w as a int
     * @param h as a int
     * @param numberOfNode as a int
     * 
     * @return point if point in such region
     *         is found.
     *         null if no such point is found.
     */
    public int regionSearch(int x, int y, int w, int h, 
        int numberOfNode);
    
    
    /**
     * This is dump() in Leaf.
     * 
     * @param x as a int
     * @param y as a int
     * @param size as a int
     * @param level as a int
     * @param numberOfNode as int.
     * 
     * @return 1 as a node output.
     */
    public int dump(int x, int y, int size, int level, int numberOfNode);
    
    
    /**
     * This is duplicates() method.
     */
    public void duplicates();
    
    
    /**
     * This is a helper method.
     * 
     * @return link.getSize() as the 
     *         size of link.
     */
    public int getListSize();
    
    
    /**
     * This is a helper method.
     * 
     * @return link.getDiffer() as the 
     *         number of different point
     *         in link.
     */
    public int getDiffer();
    
    
    /**
     * This is a helper method.
     * 
     * @return this.link as the link
     *         in this leaf.
     */
    public LinkList<Point> getLink();


    /**
     * This will return this class's type.
     * 
     * @return number as the type of Leaf.
     */
    public int getType();
}
