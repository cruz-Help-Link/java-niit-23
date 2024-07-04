import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertieSetDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        Set states;
        String str;
        capitals.put("Illinois", "Springfield");
        capitals.put("Missouri", "Jefferson City");
        capitals.put("Washington", "Olympia");
        capitals.put("California", "Sacramento");
        capitals.put("Indiana", "Indianapolis");
        // Show all states and capitals in hashtable.
        states = capitals.keySet(); // get set-view of keys
        Iterator itr = states.iterator();
        while (itr.hasNext()) {
            str = (String) itr.next();
            System.out.println("The capital of " + str + " is " + capitals.getProperty(str) +
                    ".");
        }
        // Properties envirnomentVariables = System.getProperties();
        // Set envinromentKeys = envirnomentVariables.keySet();
        // Iterator itr1 = envinromentKeys.iterator();
        // while (itr1.hasNext()) {
        //     str = (String) itr1.next();
        //     System.out.println("The Key :" + str + " Value is " +
        //             envirnomentVariables.getProperty(str) + ".");
        // }
    }
}
