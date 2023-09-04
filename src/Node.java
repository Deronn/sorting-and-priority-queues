
/**
 * Node represents a list node
 * Each node contains a generic type T as data and a reference to the next node in the list.
 */

public class Node<T> {

    private T data;
    private Node<T> next;

    /**
     * Constructor. Sets data
     *
     * @param data the data stored
     */ 

    public Node(T data) {
        this.data = data;
        next = null;
    }

     /**
     * Returns this node's data
     *
     * @return the reference to node's data
     */

    public T getData() {
        return data;
    }

    /**
     * Get reference to next node
     *
     * @return the next node
     */

    public Node<T> getNext() {
        return next;
    }

    /**
     * Sets the reference to the next node
     * 
     * @param next reference
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }

}