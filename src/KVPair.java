

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
//
// -- guangkai

/**
 * This is KVPair Class.
 * 
 * @author guangkai guangkai@vt.edu
 * @version 1 9/13/2022 3:11 pm
 *
 * @param <K> as key.
 * @param <E> as element.
 */
public class KVPair<K extends Comparable<K>, E>
    implements Comparable<KVPair<K, E>> {
    private K theKey;
    private E theVal;

    
    /**
     * This hold the key and element.
     * 
     * @param k as key
     * @param v as element
     */
    public KVPair(K k, E v) {
        theKey = k;
        theVal = v;
    }


    /**
     * This is compareTo() method.
     * 
     * @param it as another KVPair
     * @return a int as the result of the 
     *         comparsion.
     */
    public int compareTo(KVPair<K, E> it) {
        return theKey.compareTo(it.key());
    }


//    /**
//     * This is compareTo() method.
//     * 
//     * @param it
//     *            as key
//     * @return <0 for small case and alfabetical order
//     *         =0 for same
//     *         >0 for upper case
//     */
//    public int compareTo(K it) {
//        return theKey.compareTo(it);
//    }


    /**
     * This will return key.
     * 
     * @return the key
     */
    public K key() {
        return theKey;
    }


    /**
     * This will return the element.
     * 
     * @return the element.
     */
    public E value() {
        return theVal;
    }


    /**
     * This will return number as a string.
     * 
     * @return string.
     */
    public String toString() {
        return theVal.toString();
    }
}