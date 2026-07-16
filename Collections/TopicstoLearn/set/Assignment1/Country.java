package Collections.TopicstoLearn.set.Assignment1;

import java.util.HashSet;
import java.util.Iterator;

public class Country {

    HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String countryName) {

        H1.add(countryName);

        return H1;

    }

    public String getCountry(String countryName) {

        Iterator<String> iterator = H1.iterator();

        while (iterator.hasNext()) {

            String country = iterator.next();

            if (country.equalsIgnoreCase(countryName)) {

                return country;

            }

        }

        return null;

    }

    public static void main(String[] args) {

        Country country = new Country();

        country.saveCountryNames("India");
        country.saveCountryNames("USA");
        country.saveCountryNames("Australia");
        country.saveCountryNames("Japan");
        country.saveCountryNames("Canada");

        System.out.println(country.getCountry("India"));

        System.out.println(country.getCountry("USA"));

        System.out.println(country.getCountry("Germany"));

    }

}
