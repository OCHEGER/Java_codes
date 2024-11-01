import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<String>();

        // Adding elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        System.out.println("Initial ArrayList: " + list);

        // Removing an element from the ArrayList
        list.remove("Banana");

        System.out.println("ArrayList after removing 'Banana': " + list);

        // Accessing an element in the ArrayList
        String fruit = list.get(1);
        System.out.println("The second fruit in the ArrayList is: " + fruit);

        // Adding an element at a specific index in the ArrayList
        list.add(1, "Elderberry");

        System.out.println("ArrayList after adding 'Elderberry' at index 1: " + list);
    }
}
