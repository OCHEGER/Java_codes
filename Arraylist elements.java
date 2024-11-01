import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<String>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Display the elements in the ArrayList
        System.out.println("Elements in the ArrayList:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
