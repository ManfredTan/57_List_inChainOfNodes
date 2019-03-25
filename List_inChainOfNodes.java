/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference = new Node("END");

    /**
      Construct an empty list
     */



    /**
      @return the number of elements in this list
     */
    public int size() {
        return headReference.chainSize();
    }


     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,]
      */
    public String toString() {
        String temp = "";
        temp+= "Size: " + size() + System.lineSeparator();
        temp += headReference;
        return temp;
    }


    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
         Node newHead = new Node(val, headReference);
         headReference = newHead;
         return true;
     }
}
