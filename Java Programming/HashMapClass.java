import java.util.HashMap;
public class HashMapClass {
    
   public static void main(String[] args) {
     HashMap<String, String> countryCapitals = new HashMap<String, String>();

    countryCapitals.put("India", "New Delhi");
    countryCapitals.put("Norway", "Oslo");
    countryCapitals.put("China", "Bejing");
    countryCapitals.put("Denmark","Copenhagan");
    System.out.println(countryCapitals);

    String checkCapital = countryCapitals.get("China");
    System.out.println(checkCapital);

    countryCapitals.remove("China");
    System.out.println(countryCapitals);

     for(String i : countryCapitals.keySet()){
        System.out.println(i + "*" + " " + countryCapitals.get(i));
     }
     for(String i: countryCapitals.values()){
        System.out.println(i + "$");
     }
}
}
