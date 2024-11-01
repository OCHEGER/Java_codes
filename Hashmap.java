import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // Access values by keys
        System.out.println("Value of Apple: " + map.get("Apple")); // Output: Value of Apple: 1
        System.out.println("Value of Banana: " + map.get("Banana")); // Output: Value of Banana: 2
        System.out.println("Value of Cherry: " + map.get("Cherry")); // Output: Value of Cherry: 3

        // Check if a key exists in the HashMap
        if (map.containsKey("Apple")) {
            System.out.println("Apple exists in the HashMap.");
        } else {
            System.out.println("Apple does not exist in the HashMap.");
        }

        // Remove a key-value pair from the HashMap
        map.remove("Banana");

        // Check if a key exists in the HashMap after removal
        if (map.containsKey("Banana")) {
            System.out.println("Banana exists in the HashMap.");
        } else {
            System.out.println("Banana does not exist in the HashMap.");
        }
    }
}
