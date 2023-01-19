
import java.util.Random;
import student.TestableRandom;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
//
// -- guangkai

/**
 * This is SkipList class.
 * 
 * @author guangkai guangkai@vt.edu
 * @version 1 9/13/2022 3:11 pm
 *
 * @param <K>
 *            as the key
 * @param <E>
 *            as the element
 */
public class SkipList<K extends Comparable<K>, E> {
    
    
    // Make this a private data member of the SkipList object
    private Random rnd; // Random number generator

    // Put this in the SkipList constructor
    // TestableRandom allows tests to be consistent instead of random. See
    // setNextBooleans()

    /**
     * Here classify SkipNode as protected.
     */
    protected SkipNode<K, E> head;
    private int level;
    private int size;

    /**
     * This will return the size of skiplist.
     * 
     * @param None
     * @return size as int
     */
    public int getSize() {
        return size;
    }


    /**
     * This will return the depth/level.
     * 
     * @param None
     * @return level as int
     */
    public int getLevel() {
        return level;
    }


    /**
     * Basic structure of SkipList.
     */
    public SkipList() {
        head = new SkipNode<K, E>(null, null, 1);
        level = -1;
        size = 0;
        rnd = new TestableRandom();
    }


    /**
     * Pick a level using a geometric distribution.
     * 
     * @param None
     * @return level as int
     */
    public int randomLevel() {

        int count = 0;
        for (@SuppressWarnings("unused")
            int lev = 0; rnd.nextBoolean(); lev++) {
            count++;
        }
        return count;
    }


    /**
     * Insert a key, element pair into the skip list as
     * where it should be.
     * 
     * @param key
     *            as the key
     * @param elem
     *            as the element
     */
    @SuppressWarnings("unchecked")
    public void insert(K key, E elem) {

        // New node's level
        int newLevel = randomLevel();
        // If new node is deeper
        if (newLevel > level) {
            // adjust the header
            adjustHead(newLevel);
        }
        SkipNode<K, E>[] update = new SkipNode[level + 1];
        // Start at header node
        SkipNode<K, E> x = head;
        for (int i = level; i >= 0; i--) {
            // Find insert position
            while ((x.getForward()[i] != null) && 
                x.getForward()[i].key().compareTo(key) < 0) {
                
                x = x.getForward()[i];
            }
            // Track end at level i
            update[i] = (SkipNode<K, E>)x;
        }
        x = new SkipNode<K, E>(key, elem, newLevel);

        // Splice into list
        for (int i = 0; i <= newLevel; i++) {
            // Who x points to
            x.getForward()[i] = (SkipNode<K, E>)update[i].getForward()[i];
            // Who points to x
            update[i].getForward()[i] = (SkipNode<K, E>)x;
        }
        // Increment dictionary size
        size++;
    }


    /**
     * This is a helper method for adjust head
     * forward every time this method is called
     * in insert() method.
     * 
     * @param newLevel
     *            as int
     */
    private void adjustHead(int newLevel) {
        SkipNode<K, E> temp = head;
        head = new SkipNode<K, E>(null, null, newLevel);
        for (int i = 0; i <= level; i++) {
            head.getForward()[i] = temp.getForward()[i];
        }
        level = newLevel;
    }


    /**
     * Return all the elements in the list with their
     * depth/level.
     * 
     * @return number as the size of skiplist.
     */
    public int dump() {

        System.out.println("Node has depth " + head.getDepth()
            + ", Value (null)");
        
        // Dummy header node
        SkipNode<K, E> x = head;
        int count = 0;
        if (size != 0) {
            while (x.getForward()[0] != null) {
                
                x = x.getForward()[0];
                System.out.println("Node has depth " + x.getDepth()
                    + ", Value (" + x.key() + ", " + 
                    x.getPair().toString() + ")");
                count++;
            }
        }
        return count;
    }


    /**
     * Return the (first) matching matching element if one exists,
     * null otherwise.
     * 
     * @param key
     *            as the input
     * @return key and element
     */
    @SuppressWarnings("unchecked")
    public KVPair<K, E> removeByName(K key) {

        // Dummy header node
        SkipNode<K, E> x = head;
        // kipNode<K, E> y = head;
        SkipNode<K, E>[] update = new SkipNode[level + 1];

        // For each level...
        for (int i = level; i >= 0; i--) {

            while ((x.getForward()[i] != null) && 
                    (x.getForward()[i].key().compareTo(key)) < 0) {
                
                // Go forward
                x = x.getForward()[i];
            }
            update[i] = x;
        }

        // Move to actual record, if it exists
        x = x.getForward()[0];
        if (x == null || 
            x.key().compareTo(key) != 0)
            return null; // rectangle not found
        
        KVPair<K, E> removed = x.getPair();
        for (int i = 0; i < x.getForward().length; i++) {
            
            update[i].getForward()[i] = x.getForward()[i];
        }
        
        //adjustMaxLevel();
        size--;
        return removed;
    }


    /**
     * Return the number of the node's key matched.
     * 
     * @param key
     *            as the input
     * @return i
     *              as a number
     */
    public int iterate(K key) {
        
        int i = 0;
        SkipNode<K, E> x = head;
        
        while (x.getForward()[0] != null) {

            if (x.getForward()[0].key().compareTo(key) != 0) {

                x = x.getForward()[0];
            }
            else {
                x = x.getForward()[0];
                i++;
            }
        }
        return i;
    }
    
    
    
    /**
     * Return the all matching matching element if its name matches,
     * null otherwise.
     * 
     * @param key as the input
     */
    public void search(K key) {

        // Dummy header node
        SkipNode<K, E> x = head;
        
        // For each level...
        int count = iterate(key);
        if (count == 0) {
            System.out.println("Point not found: "
                + key);
        }
        
        while (x.getForward()[0] != null) {

            if (x.getForward()[0].key().compareTo(key) != 0) {

                x = x.getForward()[0];
            }
            else {
                
                x = x.getForward()[0];
                System.out.println("Found: (" + x.getPair().toString() + ")");
            }
        }
    }
}

