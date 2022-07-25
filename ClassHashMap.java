import java.util.HashMap;
public class ClassHashMap {
public static void main(String[] args) {
//Creating a HashMap
HashMap<String, String> CapitalCities = new HashMap<String, String>();
CapitalCities.put("Tamilnadu", "Chennai");
CapitalCities.put("Kerala", "Trivandrum");
CapitalCities.put("Karnataka", "Bengaluru");
CapitalCities.put("Andhra Pradesh", "Hyderabad");
System.out.println(CapitalCities);
//Accessing an item
System.out.println(CapitalCities.get("Karnataka"));
//Removing an item
CapitalCities.remove("Andhra Pradesh");
System.out.println(CapitalCities);
//Getting size of the hashmap
System.out.println(CapitalCities.size());
//Looping through the hashmap
for (String i : CapitalCities.keySet()) {
System.out.println(i);
}
//Looping through the hashmap and get the values
for (String j : CapitalCities.values()) {
System.out.println(j);
}
//Looping through the hashmap
for (String k : CapitalCities.keySet()) {
System.out.println("key : " + k + " value : " + CapitalCities.get(k));
}
//Creating a HashMap using integers
HashMap<String, Integer> StudentAge = new HashMap<String, Integer>();
StudentAge.put("Susma", 20);
StudentAge.put("Prathiksha", 19);
StudentAge.put("Rakshana", 20);
for (String l : StudentAge.keySet()) {
System.out.println("Name : " + l + " Age : " + StudentAge.get(l));
}
//Clear the HashMap
StudentAge.clear();
System.out.println(StudentAge);
}
}