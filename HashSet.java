import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<String>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // This will not be added as it's a duplicate

        // Print the HashSet
        System.out.println("HashSet: " + set);

        // Check if an element is present in the HashSet
        if (set.contains("Banana")) {
            System.out.println("Banana is present in the HashSet");
        } else {
            System.out.println("Banana is not present in the HashSet");
        }

        // Remove an element from the HashSet
        set.remove("Cherry");

        // Print the HashSet after removal
        System.out.println("HashSet after removal: " + set);
    }
}
