/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println( "number of elements: " + list.size() );

        // the spec requests that toString include the size
        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        /* Populate the list with elements.
           Create the test data in an array, for the programming
           convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
               for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println( "populated list: " + list
                          + System.lineSeparator());

        /* 2019-03-25 tests:
        List_inArraySlots.addAsHead
        List_inChainOfNodes.set
        List_inChainOfNodes.get
        List_inChainOfNodes.add
        List_inChainOfNodes.remove
        */

        // List_inArraySlots.addAsHead
        List_inArraySlots listOne = new List_inArraySlots();

        for (int value = 0; value < 6; value++) {
            listOne.add(value);
        } System.out.println("Before add as head:" + System.lineSeparator() + listOne);

        listOne.addAsHead(10);
        System.out.println("After add as head:" + System.lineSeparator() + listOne + System.lineSeparator());

        //List_inChainOfNodes.set
        System.out.println( "Changing index 3: " + list.set(3,"b") + " to b" );
        System.out.println( "Changing index 0: " + list.set(0,"M") + " to M" );
        System.out.println( list + System.lineSeparator());

        //List_inChainOfNodes.get
        System.out.println( "Return index 3: " + list.get(3) + System.lineSeparator());
        System.out.println( "Return index 0: " + list.get(0) + System.lineSeparator());

        //List_inChainOfNodes.add
        list.add(2, "X");
        System.out.println( "Add at index 3: X" + System.lineSeparator() + list + System.lineSeparator() );
        list.add(0, "H");
        System.out.println( "Add at index 0: H" + System.lineSeparator() + list + System.lineSeparator() );

        //List_inChainOfNodes.remove
        System.out.println( "Remove index 2: " + list.remove(2) );
        System.out.println( list + System.lineSeparator() );
        System.out.println( "Remove index 0: " + list.remove(0) );
        System.out.println( list + System.lineSeparator() );



    }
}
