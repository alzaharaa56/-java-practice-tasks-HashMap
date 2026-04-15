import java.util.HashMap;

public class CountryCapitalDemo {


    public static void main(String[] args) {

HashMap<String, String> countryCapitals = new HashMap<>();

countryCapitals.put("Oman", "Muscat");
countryCapitals.put("Japan", "Tokyo");
countryCapitals.put("France", "Paris");
countryCapitals.put("Turkey", "Ankara");
countryCapitals.put("Egypt", "Cairo");

System.out.println("All Records: " + countryCapitals);

System.out.println("Capital of Oman: " + countryCapitals.get("Oman"));

System.out.println("Does Japan exist? " + countryCapitals.containsKey("Japan"));

countryCapitals.put("Turkey", "Istanbul (Updated to Ankara)");

countryCapitals.put("France", "Lyon");
System.out.println("Updated Records: " + countryCapitals);

countryCapitals.remove("Egypt");
System.out.println("After removing Egypt: " + countryCapitals);

System.out.println("Total records remaining: " + countryCapitals.size());
}
}
