// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
//
// -- guangkai

/**
 * This is LinkedNode class.
 * 
 * @author guangkai
 * @version 9/21/2022 7:14 pm 1
 * @param <T> Generic Type
 */
public class LinkedNode<T> {

    private LinkedNode<T> forward;
    private T rec;

    
    /**
     * This hold value.
     * 
     * @param obj as the record.
     */
    public LinkedNode(T obj) {
        rec = obj;
    }
    
    
    /**
     * This is element() method.
     * 
     * @return rec.value as the element
     */
    public T getRec() {
        return rec;
    }


    /**
     * This is getForward() method.
     * 
     * @return forward as record/element.
     */
    public LinkedNode<T> getForward() {
        return this.forward;
    }
    
    
    /**
     * This is setForward() method.
     * 
     * @param node  The node
     */
    public void setForward(LinkedNode<T> node) {
        forward = node;
    }
    
    
    /**
     * This will return number as a string.
     * 
     * @return string.
     */
    public String toString() {
        //if (rec != null)
        return rec.toString();
        //return null;
    }
}
