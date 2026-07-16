package Collections.TopicstoLearn.Map.Assignment3;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

    public static void main(String[] args) {

        Properties states = new Properties();

        states.put("Andhra Pradesh", "Amaravati");
        states.put("Telangana", "Hyderabad");
        states.put("Karnataka", "Bengaluru");
        states.put("Tamil Nadu", "Chennai");
        states.put("Kerala", "Thiruvananthapuram");
        states.put("Maharashtra", "Mumbai");

        Set<Map.Entry<Object, Object>> entries = states.entrySet();

        Iterator<Map.Entry<Object, Object>> iterator = entries.iterator();

        System.out.println("States and their Capitals");

        while (iterator.hasNext()) {

            Map.Entry<Object, Object> entry = iterator.next();

            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }

    }

}
