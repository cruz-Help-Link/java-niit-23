import java.util.ArrayList;
import java.util.List;

public class ListOfListsStream {
    public static void main(String[] args) {
        // Creating a List of Lists
        List<List<Integer>> listOfLists = new ArrayList<>();

        // Adding values using nested loops
        int numRows = 3;
        int numCols = 4;
        for (int i = 0; i < numRows; i++) {
            List<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < numCols; j++) {
                innerList.add(i * numCols + j); // Adding values incrementally
            }
            listOfLists.add(innerList); // Adding the inner list to the main list
        }

        // Printing the list of lists
        for (List<Integer> innerList : listOfLists) {
            for (Integer value : innerList) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        
    }
}
