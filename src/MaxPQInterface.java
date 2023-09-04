
// Defines the methods for a Max Priority Queue Data Structure 
 
public interface MaxPQInterface<T> {

     
     // @return true if MaxPQ is empty
     
     boolean isEmpty();

     /**
      * Inserts an item into this priority queue
      *
      * @param item that will be inserted in the queue
      */
     void insert(T item);

     /**
      * Retrieves, but does not remove,the item with the max priority
      *
      * @return item with max priority or null if queue is empty
      */
     T peek();

     /**
      * Retrieves and removes the item with the max priority.
      *
      * @return item with max priority
      */
     T getMax();

     
     // Sinks the element with the previous Max Priority
     
     void refresh();

     /**
      * Swaps elements in indexes i and j
      * 
      * @param i index of the first table, whose element will be swapped
      * @param j index of the second table, whose element will be swapped
      */
     void swap(int i, int j);

}
