//Virginia Tech Honor Code Pledge:
//
//As a Hokie, I will conduct myself with honor and integrity at all times.
//I will not lie, cheat, or steal, nor will I accept the actions of those
//who do.
//
//-- guangkai

/**
* This is Leaf class.
* 
* @author guangkai guangkai@vt.edu
* @version 1 9/26/2022 1:50 pm
*/
public class Leaf implements Node {
    
    
    private LinkList<Point> link;
    //private int listSize = 0;
    @SuppressWarnings("unused")
    private int rX;
    @SuppressWarnings("unused")
    private int rY;
    @SuppressWarnings("unused")
    private int rSize;
    
    
    /**
     * This is constructor.
     */
    public Leaf() {
        link = new LinkList<Point>();
    }
    
    
    /**
     * This will return this class's type.
     * 
     * @return 2 as the type of Leaf.
     */
    public int getType() {
        return 2;
    }
    
    
    /**
     * This will return listSize.
     * 
     * @return link.getSize() as the 
     *         size of link.
     */
    public int getListSize() {
        return link.getSize();
    }
    
    
    /**
     * This will return listSize.
     * 
     * @return link.getDiffer() as the 
     *         number of different point
     *         in link.
     */
    public int getDiffer() {
        return link.getDiffer();
    }
    
    
    /**
     * This is getLink().
     * 
     * @return this.link as the link
     *         in this leaf.
     */
    public LinkList<Point> getLink() {
        return this.link;
    }
    
    
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
    @Override
    public Node insert(Point point, int size, int regionX, int regionY) {
        
        rX = regionX;
        rY = regionY;
        rSize = size;
        
        LinkedNode<Point> node = link.head;
        int differ = link.getDiffer();
        int nodeSize = link.getSize();
        if (differ == 1) {
            while (node.getForward() != null) {
                
                node = node.getForward();
            }
            link.insert(point);
            return this;
        }
        else {
            if (nodeSize < 3) {
                while (node.getForward() != null) {
                    
                    node = node.getForward();
                }
                link.insert(point);
                return this;
            }
            else {
                
                return split(size, regionX, regionY, point);
            }
        }
    }
    
    
    /**
     * This will split a leaf to a 
     * internal node and replace the 
     * leaf with this internal.
     * 
     * @param size as a int
     * @param regionX as a int
     * @param regionY as a int
     * @param point as the 4th point
     *        try to insert.
     * 
     * @return newInter once split is done,
     *         and this leaf will be replaced
     *         by that internal.
     */
    public Internal split(int size, int regionX, int regionY, Point point) {
        
        Internal newInter = new Internal();
        LinkedNode<Point> x = link.head;
        while (x.getForward() != null) {
            
            x = x.getForward();
            newInter.insert(x.getRec(), size, regionX, regionY);
        }
        newInter.insert(point, size, regionX, regionY);
        return newInter;
    }
    
    
    /**
     * This will remove the first node with
     * the matching coordinate.
     * 
     * @param point as the target point.
     * @param list as the SkipList.
     * 
     * @return FLY if the matched point is
     *         the only node in the list.
     *         this if linklist still have 
     *         other points.
     */
    @Override
    public Node remove(Point point, SkipList<String, Point> list) {
        
        LinkedNode<Point> x = link.head;
        int flag = 0;
        while (x.getForward() != null) {
            
            if (x.getForward().getRec().getX() == point.getX() &&
                x.getForward().getRec().getY() == point.getY()) {
                
                link.remove(point, list);
                flag = 1;
                break;
            }
            else {
                
                x = x.getForward();
            }
        }
        
        if (flag == 0) {
            
            System.out.println("Point not found: " + 
                point.toString2());
        }
        
        if (link.getSize() == 0) {
            return QuadTree.FLY; // set this as FLY
        }
        return this;
    }
    
    
    /**
     * This will remove the first node with
     * the matching coordinate.
     * 
     * @param point as the target point.
     * 
     * @return QuadTree.FLY if all points are
     *         gone;
     *         this if not.
     */
    @Override
    public Node removeCalled(Point point) {
        
        LinkedNode<Point> x = link.head;
        while (x.getForward() != null) {
            
            if (x.getForward().getRec().getX() == point.getX() &&
                x.getForward().getRec().getY() == point.getY() &&
                x.getForward().getRec().getName() == point.getName()) {
                
                link.removeCalled(point);
                break;
            }
            else {
                
                x = x.getForward();
            }
        }
        
        if (link.getSize() == 0) {
            return QuadTree.FLY; // set this as FLY
        }
        return this;
    }
    
    
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
    @Override
    public int regionSearch(int x, int y, int w, int h, 
        int numberOfNode) {
        
        LinkedNode<Point> node = link.head;
        
        while (node.getForward() != null) {
            node = node.getForward();
            if (!(node.getRec().isInside(x, y, w, h))) {
                
                continue;
            }
            else {
                
                System.out.println("Point found: (" + node.getRec().
                    toString() + ")");
            }
        }
        return 1;
    }

    
    /**
     * This is dump() in Leaf.
     * 
     * @param x as a int
     * @param y as a int
     * @param size as a int
     * @param numberOfNode as a int
     * 
     * @return 1 as a node output.
     */
    @Override
    public int dump(int x, int y, int size, int level, int numberOfNode) {
        
        LinkedNode<Point> node = link.head;
        printBlanks(level);
        
        if (link.getSize() != 0) {
            System.out.print("Node at " + x + ", " + y + ", " + size + ":");
            System.out.print("\n");
            while (node.getForward() != null) {
                node = node.getForward();
                printBlanks(level);
                
                System.out.print("(" + node.getRec().toString() + ")\n");
            }
        }
        else {
            System.out.print("Node at " + x + ", " + 
                y + ", " + size + ": Empty\n");
        }
        return 1;
    }
    
    
    /**
     * This is a helper method for all
     * the method need to print certain
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
     * This is duplicates() method.
     */
    public void duplicates() {
        
        link.duplicates();
    }
}
