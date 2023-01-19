

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
//
// -- guangkai

/**
 * This is SkipNode class.
 * 
 * @author guangkai guangkai@vt.edu
 * @version 1 9/13/2022 3:12 pm
 *
 * @param <K>
 *            as the key.
 * @param <E>
 *            as the element
 */
class SkipNode<K extends Comparable<K>, E> {
    private KVPair<K, E> rec;
    
    /**
     * Forward will be visible for other
     * class.
     */
    private SkipNode<K, E>[] forward;
    private int depth;

    
    /**
     * This is getPair() method.
     * 
     * @return rec as record/element.
     */
    public SkipNode<K, E>[] getForward() {
        return forward;
    }
    
    /**
     * This is getPair() method.
     * 
     * @return rec as record/element.
     */
    public KVPair<K, E> getPair() {
        return rec;
    }


    /**
     * This is getDepth() method.
     * 
     * @return a str as the depth/level
     */
    public int getDepth() {
        return depth;
    }


    /**
     * This is element() method.
     * 
     * @return rec.value as the element
     */
    public E element() {
        return rec.value();
    }


    /**
     * This is key() method.
     * 
     * @return the key.
     */
    public K key() {
        return rec.key();
    }


    /**
     * This hold value.
     * 
     * @param key
     *            as key
     * @param elem
     *            as element
     * @param level
     *            as depth/level
     */
    @SuppressWarnings("unchecked")
    public SkipNode(K key, E elem, int level) {
        rec = new KVPair<K, E>(key, elem);
        forward = new SkipNode[level + 1];
        depth = level;
    }
}