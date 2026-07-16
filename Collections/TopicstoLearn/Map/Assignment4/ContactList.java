package Collections.TopicstoLearn.Map.Assignment4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList {

    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Meghana", 123456789);
        contacts.put("Rahul", 987654321);
        contacts.put("Anjali", 456789123);
        contacts.put("Harish", 741852963);
        contacts.put("Kiran", 369258147);

        String name = "Rahul";

        if (contacts.containsKey(name)) {

            System.out.println("Contact \"" + name + "\" exists.");

        } else {

            System.out.println("Contact \"" + name + "\" does not exist.");

        }

        int phone = 456789123;

        if (contacts.containsValue(phone)) {

            System.out.println("Phone Number " + phone + " exists.");

        } else {

            System.out.println("Phone Number " + phone + " does not exist.");

        }

        System.out.println();

        System.out.println("Contact List");

        Iterator<Map.Entry<String, Integer>> iterator =
                contacts.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, Integer> entry = iterator.next();

            System.out.println(entry.getKey()
                    + " -> "
                    + entry.getValue());

        }

    }

}