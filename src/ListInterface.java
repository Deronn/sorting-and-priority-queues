

public interface ListInterface<T> {

     /**
      * Determine whether list is empty
      *
      * @return true if list is empty
      */
     boolean isEmpty();

     /**
      * Inserts the data at the end of the list
      *
      * @param data the inserted data
      */
     void insert(T data);

     
     // @return head of the list
      
     Node<T> getHead();

     
     // @return tail of the list
      
     Node<T> getTail();

     
      
     
     // @return a Stringbuilder object with the data of the list
     
     String toString();
}