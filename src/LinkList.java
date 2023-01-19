//Virginia Tech Honor Code Pledge:
//
//As a Hokie, I will conduct myself with honor 
//and integrity at all times.
//I will not lie, cheat, or steal, nor will I accept the actions of those
//who do.
//
//-- guangkai

/**
* This is LinkList class.
* 
* @author guangkai guangkai@vt.edu
* @version 1 9/21/2022 7:15 pm
* @param <T> Generic Type
*/
public class LinkList<T> {
    
    /**
     * Here classify LinkListedNode as protected.
     */
    protected LinkedNode<T> head;
    private int size;
    private int differ = 0;
    
    
    /**
     * Basic structure of SkipList.
     */
    public LinkList() {
        head = new LinkedNode<T>(null);
        size = 0;
    }

    
    /**
     * This will return the size of LinkList.
     * 
     * @return size as int
     */
    public int getSize() {
        return size;
    }
    
    
    /**
     * This will return the number of different
     * coordinate.
     * 
     * @return differ as int
     */
    public int getDiffer() {
        return differ;
    }
    
    
    /**
     * Insert a object to the list.
     * 
     * @param point as the rec
     */
    @SuppressWarnings("unchecked")
    public void insert(Point point) {
        
        LinkedNode<Point> x = (LinkedNode<Point>)head;
        boolean tmp = true;
        while (x.getForward() != null) {
            
            x = x.getForward();
            if (x.getRec().toString2().
                    equals(point.toString2())) {
                
                tmp = false;
            }
        }
        if (tmp) differ++;
        x = (LinkedNode<Point>)head;
        LinkedNode<Point> node = new LinkedNode<Point>(point);
        LinkedNode<Point> update = x.getForward();
        x.setForward(node);
        node.setForward(update);
        size++;
    }
    
    
    /**
     * This is dump().
     */
    public void dump() {
        
        @SuppressWarnings("unchecked")
        LinkedNode<Point> x = (LinkedNode<Point>)head;
        while (x.getForward() != null) {
            
            x = x.getForward();
            System.out.println(x.toString());
        }
        System.out.println(x.toString());
    }
    
    
    /**
     * Remove a object to the list.
     * 
     * @param list as the SkipList.
     * @param point as the point with the 
     *            matched coordinate.
     */
    @SuppressWarnings("unchecked")
    public void remove(Point point, SkipList<String, Point> list) {
        
        LinkedNode<Point> x = (LinkedNode<Point>)head;
        int flag = 0;
        while (x.getForward() != null) {
            
            if (x.getForward().getRec().getX() == 
                    point.getX() &&
                x.getForward().getRec().getY() == 
                    point.getY()) {
                
                LinkedNode<Point> curr = x.getForward();
                // remove from SkipList
                list.removeByName(curr.getRec().getName());
                
                System.out.println("Point removed: " + "(" + 
                    x.getForward().getRec().toString() + ")");
                size--;
                if (x.getForward().getForward() == null) {
                    x.setForward(null);
                }
                else
                    x.setForward(x.getForward().getForward());
                x = (LinkedNode<Point>)head;
                
                while (x.getForward() != null) {
                    if (x.getForward().getRec().getX() != 
                            curr.getRec().getX() ||
                        x.getForward().getRec().getY() != 
                            curr.getRec().getY()) {
                        
                        x = x.getForward();
                    }
                    else {
                        x = x.getForward();
                        flag = 1;
                    }
                }
                break;
                
            }
            else {
                x = x.getForward();
            }
        }
        x = (LinkedNode<Point>)head;
        if (flag == 0 && x.getForward() != null) {
            differ--;
        }
    }
    
    
    /**
     * Remove a object to the list.
     * 
     * @param point
     *            as the point with the 
     *            matched coordinate.
     */
    @SuppressWarnings("unchecked")
    public void removeCalled(Point point) {
        
        LinkedNode<Point> x = (LinkedNode<Point>)head;
        int flag = 0;
        while (x.getForward() != null) {
            
            if (x.getForward().getRec().getX() == 
                    point.getX() &&
                x.getForward().getRec().getY() == 
                    point.getY() &&
                x.getForward().getRec().getName() == 
                    point.getName()) {
                
                LinkedNode<Point> curr = x.getForward();
                size--;
                x.setForward(x.getForward().getForward());
                x = (LinkedNode<Point>)head;
                
                while (x.getForward() != null) {
                    if (x.getForward().getRec().getX() == 
                            curr.getRec().getX() &&
                        x.getForward().getRec().getY() == 
                            curr.getRec().getY()) {
                        
                        flag = 1;
                        break;
                    }
                    else {
                        x = x.getForward();
                    }
                }
                break;
                
            }
            else {
                x = x.getForward();
            }
        }
        x = (LinkedNode<Point>)head;
        if (flag == 0 && x.getForward() != null) {
            differ--;
        }
    }
    
    
    /**
     * This is duplicate() method.
     */
    public void duplicates() {
        
        @SuppressWarnings("unchecked")
        LinkedNode<Point> x = (LinkedNode<Point>)head;
        
        if (size > 3) {
            
            System.out.println(((Point)head.getForward().getRec()).toString2());
        }
        else {
            
            if (differ > 1) {
                
                Point[] points = new Point[size];
              
                int i = 0;
                while (x.getForward() != null) {
                  
                    x = x.getForward();
                    points[i] = x.getRec();
                    i++;
                }
                for (int j = 0; j < points.length; j++) {
                    
                    for (int k = j; k < points.length; k++) {
                        
                        if (points[j].getX() == points[k].getX() &&
                            points[j].getY() == points[k].getY() &&
                            j != k) {
                            
                            System.out.println(points[j].toString2());
                        }
                    }
                }
            }
            else if (differ == 1 && size != 1) {
                
                System.out.println(((Point)head.getForward().
                    getRec()).toString2());
            }
        }
    }
}