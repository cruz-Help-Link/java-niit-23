import java.util.HashMap;

public class PracticeCollection{
    public static void main(String[] args) {
            //key       value
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("Nigeria", "Abuja");
        capitalCities.put("England", "London");
        capitalCities.put("France", "Paris");
        capitalCities.put("Russia", "Muscow");

        for (String map :  capitalCities.keySet()) { //keys
            System.out.println(map);
        }
        for (String map :  capitalCities.values()) { //value
            System.out.println(map);
        }
        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }
    }
}


