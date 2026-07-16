package Collections.TopicstoLearn.Map.Assignment1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountryMap {

    HashMap<String, String> M1 = new HashMap<>();

    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {

        M1.put(countryName, capital);

        return M1;

    }

    public String getCapital(String countryName) {

        return M1.get(countryName);

    }

    public String getCountry(String capitalName) {

        for (Map.Entry<String, String> entry : M1.entrySet()) {

            if (entry.getValue().equalsIgnoreCase(capitalName)) {

                return entry.getKey();

            }

        }

        return null;

    }

    public HashMap<String, String> swapKeyValue() {

        HashMap<String, String> M2 = new HashMap<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {

            M2.put(entry.getValue(), entry.getKey());

        }

        return M2;

    }

    public ArrayList<String> toArrayList() {

        ArrayList<String> countries = new ArrayList<>();

        for (String country : M1.keySet()) {

            countries.add(country);

        }

        return countries;

    }

    public static void main(String[] args) {

        CountryMap obj = new CountryMap();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("Australia", "Canberra");
        obj.saveCountryCapital("USA", "Washington");
        obj.saveCountryCapital("Canada", "Ottawa");

        System.out.println("Capital of India : "
                + obj.getCapital("India"));

        System.out.println("Country of Tokyo : "
                + obj.getCountry("Tokyo"));

        System.out.println();

        System.out.println("Original Map");

        System.out.println(obj.M1);

        System.out.println();

        System.out.println("Swapped Map");

        System.out.println(obj.swapKeyValue());

        System.out.println();

        System.out.println("Countries");

        System.out.println(obj.toArrayList());

    }

}