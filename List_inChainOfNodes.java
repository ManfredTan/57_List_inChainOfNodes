/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
      The default constructor is fine:
      take zero arguments
      do nothing
     */

    /**
      @return the number of elements in this list
     */
    public int size() {
        // recursive approach seems more perspicuous
        if( headReference == null) return 0;
        else return size( headReference);
    }

    // recursively-called helper
    private int size( Node startingAt) {
        Node next = startingAt.getReferenceToNextNode();
        if( next == null) return 1;
        else return 1+ size( next);
    }


     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,]
      */
    public String toString() {
        String stringRep = size() + " elements [";

        for( Node node = headReference
           ; node != null
           ; node = node.getReferenceToNextNode() )
            stringRep += node.getCargoReference() + ",";
        return stringRep + "]";
    }


    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
        headReference = new Node( val, headReference);
        return true;
     }


     /* 2019-03-25 methods */
     public Object set( int index, Object value) {
         int nodeIndex = 0;
         Node currentNode;
         Object oldCargo;
         for (currentNode = headReference; nodeIndex < index; currentNode = currentNode.getReferenceToNextNode() )
             nodeIndex++;
         oldCargo = currentNode.getCargoReference();
         currentNode.setCargoReference( value);
         return oldCargo;
     }

     public Object get(int index) {
         int nodeIndex = 0;
         Node currentNode;
         for (currentNode = headReference; nodeIndex < index; currentNode = currentNode.getReferenceToNextNode() )
            nodeIndex++;
         return currentNode.getCargoReference();
     }

     public void add (int index, Object value) {
         if (index == 0) addAsHead(value);
         else {
             Node nodeBefore = getNode(index);
             Node newNode = new Node( value, nodeBefore.getReferenceToNextNode() );
             nodeBefore.setReferenceToNextNode( newNode);
         }

     }

     public Object remove (int index) {
         Object oldCargo;
         if (index == 0) {
             oldCargo = headReference.getCargoReference();
             headReference = headReference.getReferenceToNextNode();
         }
         else {
             Node nodeBefore = getNode(index-1);
             Node nodeToRemove = nodeBefore.getReferenceToNextNode();
             oldCargo = nodeToRemove.getCargoReference();
             nodeBefore.setReferenceToNextNode( nodeToRemove.getReferenceToNextNode() );
         }
         return oldCargo;
     }


     /* 2019-03-26 Updates:
     - factor out iteration --> getNode( int index)
     - add(0,value) --> addAsHead
     */
     public Node getNode (int index) {
         int nodeIndex = 0;
         Node currentNode;
         for (currentNode = headReference; nodeIndex < index; nodeIndex++ , currentNode = currentNode.getReferenceToNextNode() ) {}
         return currentNode;
     }


}
