import java.util.HashSet;
public class ClassHashSet {
public static void main(String[] args) {
//Creating a hashset
HashSet<String> Week = new HashSet<String>();
Week.add("Mon");
Week.add("Tue");
Week.add("Wed");
Week.add("Thurs");
Week.add("Fri");
//Creating an linkedlist
System.out.println(Week);
//Check an item exists
System.out.println(Week.contains("Thurs"));
//Removing an item
Week.remove("Fri");
System.out.println(Week);
//Getting the size of the hashset
System.out.println(Week.size());
//Looping through the hashset
for (String i : Week) {
System.out.println(i); 
}
//Creating a hashset with numbers
HashSet<Integer> Number = new HashSet<Integer>();
Number.add(7);
Number.add(2);
Number.add(4);
Number.add(1);
for (int j=1; j<=10; j++) {
if (Number.contains(j)) {
System.out.println(j + " is in the set.");
}
else {
System.out.println(j + " is not in the set.");
}
}
//Clear the hashset
Number.clear();
System.out.println(Number); 
}
}