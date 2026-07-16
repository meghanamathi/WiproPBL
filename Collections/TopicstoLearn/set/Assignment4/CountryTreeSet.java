package Collections.TopicstoLearn.set.Assignment4;

import java.util.Iterator;
import java.util.TreeSet;

public class CountryTreeSet {

    TreeSet<String> T1 = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String countryName) {

        T1.add(countryName);

        return T1;

    }

    public String getCountry(String countryName) {

        Iterator<String> iterator = T1.iterator();

        while (iterator.hasNext()) {

            String country = iterator.next();

            if (country.equalsIgnoreCase(countryName)) {

                return country;

            }

        }

        return null;

    }

    public static void main(String[] args) {

        CountryTreeSet country = new CountryTreeSet();

        country.saveCountryNames("India");
        country.saveCountryNames("USA");
        country.saveCountryNames("Japan");
        country.saveCountryNames("Australia");
        country.saveCountryNames("Canada");

        System.out.println(country.getCountry("India"));

        System.out.println(country.getCountry("USA"));

        System.out.println(country.getCountry("Germany"));

    }

}