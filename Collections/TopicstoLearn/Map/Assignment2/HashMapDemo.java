package Collections.TopicstoLearn.Map.Assignment2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("IND", "India");
        map.put("USA", "United States");
        map.put("JPN", "Japan");
        map.put("AUS", "Australia");
        map.put("CAN", "Canada");

        String key = "IND";

        if (map.containsKey(key)) {

            System.out.println("Key \"" + key + "\" exists.");

        } else {

            System.out.println("Key \"" + key + "\" does not exist.");

        }

        String value = "Japan";

        if (map.containsValue(value)) {

            System.out.println("Value \"" + value + "\" exists.");

        } else {

            System.out.println("Value \"" + value + "\" does not exist.");

        }

        System.out.println();

        System.out.println("HashMap Elements");

        Iterator<Map.Entry<String, String>> iterator =
                map.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, String> entry = iterator.next();

            System.out.println(entry.getKey()
                    + " -> "
                    + entry.getValue());

        }

    }

}
