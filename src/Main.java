import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> groceryLine = new ArrayList<String>();
        // adding new objects to the List
        groceryLine.add("Jerome");
        groceryLine.add("Beth");
        groceryLine.add("Sam");
        groceryLine.add("Lisa");

        // printing out our list
        System.out.println(groceryLine);

        // removing an item using its index (index 1 would be Beth) [0 -> Jerome, 1 -> Beth, 2 -> Sam]
        groceryLine.remove(1);

        System.out.println(groceryLine);

        // removing an item using it's name
        groceryLine.remove("Jerome");

        System.out.println(groceryLine);

        // get() -> gets the objet's whose index we're looking for
        String sam = groceryLine.get(0);
        System.out.println(sam);

        // indexOf() -> gets us the index of the object we're looking for
        int lisaIndex = groceryLine.indexOf("Lisa");
        System.out.println(lisaIndex);

        System.out.println(groceryLine.size());

        for (String name : groceryLine){
            System.out.println(name);
        }

        // clear() -> removes all the items from the list
        groceryLine.clear();

        System.out.println(groceryLine);

    }
}
