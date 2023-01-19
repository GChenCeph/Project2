// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
//
// -- guangkai

/**
 * This is Internal class.
 * 
 * @author guangkai guangkai@vt.edu
 * @version 1 9/26/2022 1:50 pm
 */
public class Internal implements Node {


    private Node nW;
    private Node nE;
    private Node sW;
    private Node sE;
    private int rX;
    private int rY;
    private int rSize;

    /**
     * This is the constructor of internal
     * node.
     */
    public Internal() { //Leaf leaf for parameter
        nW = QuadTree.FLY;
        nE = QuadTree.FLY;
        sW = QuadTree.FLY;
        sE = QuadTree.FLY;
    }
    
    
    /**
     * This will return this class's type.
     * 
     * @return 1 for Internal type.
     */
    public int getType() {
        return 1;
    }

    
    /**
     * This is insert()
     * 
     * @param point as the point want to insert.
     * @param size as the region size.
     * @param regionX as the center x.
     * @param regionY as the center y.
     * 
     * @return this as updating the node.
     */
    public Node insert(Point point, int size, 
            int regionX, int regionY) {

        rX = regionX;
        rY = regionY;
        rSize = size;
        
        int coord = determineCoord(point, size, regionX, regionY);
        if (coord == 1) {

            nW = nW.insert(point, size / 2, 
                regionX, regionY);
        }
        else if (coord == 2) {

            nE = nE.insert(point, size / 2, 
                regionX + size / 2, regionY);
        }
        else if (coord == 3) {

            sW = sW.insert(point, size / 2, 
                regionX, regionY + size / 2);
        }
        else {
            sE = sE.insert(point, size / 2, 
                regionX + size / 2, 
                regionY + size / 2);
        }
        
        return this;    
    }
    
    
    /**
     * This is a helper method for adjust head
     * forward every time this method is called
     * in insert() method.
     * 
     * @param x
     *            as int input
     * @param y
     *            as int input
     * @return
     */
    private int determineCoord(Point point, 
            int size, int regionX, int regionY) {

        int x = point.getX();
        int y = point.getY();

        if (x < regionX + size / 2) {
            if (y < regionY + size / 2) {
                
                return 1;
            }
            else {
                
                return 3;
            }
        }
        else {
            if (y < regionY + size / 2) {

                return 2;
            }
            else {

                return 4;
            }
        }
    }
    
    
    /**
     * This is search method.
     * 
     * @param x as a int.
     * @param y as a int.
     * @param w as a int.
     * @param h as a int.
     * @param numberOfNode as a int.
     * 
     * @return num as the number of the
     *         node.
     */
    @Override
    public int regionSearch(int x, int y, int w, int h, 
        int numberOfNode) {
        
        int num = 1;
        // Check that given rectangle intersects with each branch
        // Each branch, use size / 2
        if (isOverlapping(x, y, w, h, rSize / 2, rX, rY))
            num += nW.regionSearch(x, y, w, h, numberOfNode);
        if (isOverlapping(x, y, w, h, rSize, rX + rSize / 2, rY))
            num += nE.regionSearch(x, y, w, h, numberOfNode);
        if (isOverlapping(x, y, w, h, rSize, rX, rY + rSize / 2))        
            num += sW.regionSearch(x, y, w, h, numberOfNode);
        if (isOverlapping(x, y, w, h, rSize, rX + rSize / 2, 
                rY + rSize / 2))    
            num += sE.regionSearch(x, y, w, h, numberOfNode);
        
        return num;
    }    
    
    
    /**
     * This will determine if 2 rectangle intersects.
     * 
     * @param x as x coord.
     * @param y as y coord.
     * @param w as weight.
     * @param h as height.
     * @param regionSize as the size of the 
     *        region.
     * @param regionX as the x coord.
     * @param regionY as the y coord.
     * 
     * @return true if 2 region intersected;
     *         false if not.
     */
    public boolean isOverlapping(int x, int y, int w, 
            int h, int regionSize, int regionX, int regionY) {

        return (regionX < (x + w) && (regionX + regionSize / 2) > x
            && (regionY < (y + h)) && (regionY + regionSize / 2) > y);
    }


    /**
     * This is remove()
     * 
     * @param point we want to match.
     * @param list as the SkipList need to
     *        sync.
     * 
     * @return QuadTree.FLY set this leaf as
     *         FLY if all linkedNodes are
     *         deleted.
     *         newLeaf if split condition is not
     *         met.
     *         this if not ;'all linkedNodes are
     *         deleted.
     */
    @Override
    public Node remove(Point point, SkipList<String, Point> list) {

        int coord = determineCoord(point, rSize, rX, rY);
        if (coord == 1) 
            nW = nW.remove(point, list);
        else if (coord == 2) 
            nE = nE.remove(point, list);
        else if (coord == 3)
            sW = sW.remove(point, list);
        else 
            sE = sE.remove(point, list);
        
        int isFly = 0;
        int isLeaf = 0;
        // 1 is internal, 2 is leaf, 0 is fly
        if (nW.getType() == 0)
            isFly++;
        else if (nW.getType() == 2) {
            isLeaf++;
        }
        if (nE.getType() == 0)
            isFly++;
        else if (nE.getType() == 2) {
            isLeaf++;
        }
        if (sW.getType() == 0)
            isFly++;
        else if (sW.getType() == 2) {
            isLeaf++;
        }
        if (sE.getType() == 0)
            isFly++;
        else if (sE.getType() == 2) {
            isLeaf++;
        }

        int overAllSize = 0;
        overAllSize = overAllSize + nW.getListSize();
        overAllSize = overAllSize + nE.getListSize();
        overAllSize = overAllSize + sW.getListSize();
        overAllSize = overAllSize + sE.getListSize();
        
        if (isFly == 3 && isLeaf == 1) {
            
            // fold Internal back to leaf.
            Leaf newLeaf = new Leaf();
            LinkList<Point> newLink = this.getLink();
            LinkedNode<Point> newHead = newLink.head;
            while (newHead.getForward() != null) {
                
                newLeaf.insert(newHead.getForward().getRec(), rX, rY, rSize);
                newHead = newHead.getForward();
            }
            return newLeaf;
        }
        if (overAllSize <= 3) {
            
            // fold Internal back to leaf.
            Leaf newLeaf = new Leaf();
            LinkList<Point> newLink = this.getLink();
            LinkedNode<Point> newHead = newLink.head;
            while (newHead.getForward() != null) {
                
                newLeaf.insert(newHead.getForward().getRec(), rX, rY, rSize);
                newHead = newHead.getForward();
            }
            return newLeaf;
        }
        return this;
    }
    
    
    /**
     * This is removeCalled()
     * 
     * @param point we want to match
     * @return QuadTree.FLY set this leaf as
     *         FLY if all linkedNodes are
     *         deleted.
     *         this if not all linkedNodes are
     *         deleted.
     */
    @Override
    public Node removeCalled(Point point) {

        int coord = determineCoord(point, rSize, rX, rY);
        if (coord == 1) 
            nW = nW.removeCalled(point);
        else if (coord == 2) 
            nE = nE.removeCalled(point);
        else if (coord == 3)
            sW = sW.removeCalled(point);
        else 
            sE = sE.removeCalled(point);
        
        int isFly = 0;
        int isLeaf = 0;
        // 1 is internal, 2 is leaf, 0 is fly
        if (nW.getType() == 0)
            isFly++;
        else if (nW.getType() == 2) {
            isLeaf++;
        }
        if (nE.getType() == 0)
            isFly++;
        else if (nE.getType() == 2) {
            isLeaf++;
        }
        if (sW.getType() == 0)
            isFly++;
        else if (sW.getType() == 2) {
            isLeaf++;
        }
        if (sE.getType() == 0)
            isFly++;
        else if (sE.getType() == 2) {
            isLeaf++;
        }

        int overAllSize = 0;
        overAllSize = overAllSize + nW.getListSize();
        overAllSize = overAllSize + nE.getListSize();
        overAllSize = overAllSize + sW.getListSize();
        overAllSize = overAllSize + sE.getListSize();
        
        if (isFly == 3 && isLeaf == 1) {
            
            // fold Internal back to leaf.
            Leaf newLeaf = new Leaf();
            LinkList<Point> newLink = this.getLink();
            LinkedNode<Point> newHead = newLink.head;
            while (newHead.getForward() != null) {
                
                newLeaf.insert(newHead.getForward().getRec(), rX, rY, rSize);
                newHead = newHead.getForward();
            }
            return newLeaf;
        }
        if (overAllSize <= 3) {
            
            // fold Internal back to leaf.
            Leaf newLeaf = new Leaf();
            LinkList<Point> newLink = this.getLink();
            LinkedNode<Point> newHead = newLink.head;
            while (newHead.getForward() != null) {
                
                newLeaf.insert(newHead.getForward().getRec(), rX, rY, rSize);
                newHead = newHead.getForward();
            }
            return newLeaf;
        }
        return this;
    }
    
    
    /**
     * This is a helper method.
     * 
     * @return newLink as the overall link.
     */
    @Override
    public LinkList<Point> getLink() {
        
        LinkList<Point> newLink = new LinkList<Point>();
        LinkList<Point> nwLink = nW.getLink();
        LinkedNode<Point> newHead;
        if (nwLink != null) {
            newHead = nwLink.head;
            while (newHead.getForward() != null) {

                newLink.insert(newHead.getForward().getRec());
                newHead = newHead.getForward();
            }
        }
        LinkList<Point> neLink = nE.getLink();
        if (neLink != null) {
            newHead = neLink.head;
            while (newHead.getForward() != null) {

                newLink.insert(newHead.getForward().getRec());
                newHead = newHead.getForward();
            }
        }
        LinkList<Point> swLink = sW.getLink();
        if (swLink != null) {
            newHead = swLink.head;
            while (newHead.getForward() != null) {
                
                newLink.insert(newHead.getForward().getRec());
                newHead = newHead.getForward();
            }
        }
        LinkList<Point> seLink = sE.getLink();
        if (seLink != null) {
            newHead = seLink.head;
            while (newHead.getForward() != null) {
            
                newLink.insert(newHead.getForward().getRec());
                newHead = newHead.getForward();
            }
        }
        
        return newLink;
    }
    
    
    /**
     * This is a helper method.
     * 
     * @return as the overall size.
     */
    public int getListSize() {
        
        return nW.getListSize() + nE.getListSize() +
                sW.getListSize() + sE.getListSize();
    }
    
    
    /**
     * This is a helper method.
     * 
     * @return as the overall differ.
     */
    public int getDiffer() {
        return nW.getDiffer() + nE.getDiffer() +
                sW.getDiffer() + sE.getDiffer();
    }


    /**
     * This is dump() in Internal node.
     * 
     * @param regionX as x coord.
     * @param regionY as y coord.
     * @param size as the size of the region.
     * @param level as the height of the tree.
     * @param numberOfNode as the number of the
     *        node in this tree we have visited.
     * 
     * @return num as the as the number of the
     *         node in this tree we have visited.
     */
    @Override
    public int dump(int regionX, int regionY, int size, 
        int level, int numberOfNode) {
        
        printBlanks(level);
        int newSize = size / 2;
        int num = numberOfNode + 1;
        System.out.print("Node at " + regionX + ", " + regionY + ", " + 
            size + ": Internal\n");
        num += nW.dump(regionX, regionY, newSize, level + 1, 0);
        num += nE.dump(regionX + newSize, regionY, newSize, level + 1, 0);
        num += sW.dump(regionX, regionY + newSize, newSize, level + 1, 0);
        num += sE.dump(regionX + newSize, regionY + newSize, newSize, 
            level + 1, 0);
        return num;
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
        
        nW.duplicates();
        nE.duplicates();
        sW.duplicates();
        sE.duplicates();
    }
}
