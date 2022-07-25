import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.Consumer;
public class ClassArrayList {
public static void main(String[] args) {
ArrayList<String> Week = new ArrayList<String>();
Week.add("Sun");
Week.add("Mon");
Week.add("Tue");
Week.add("Wed");
Week.add("Thurs");
Week.add("Fri");
Week.add("Sat");
//Creating an array
System.out.println(Week);
//Accessing an item
System.out.println(Week.get(2));
//Changing an item
Week.set(3, "Wednesday");
System.out.println(Week);
//Removing an item
Week.remove(0);
System.out.println(Week);
//Finding the size of the array
System.out.println(Week.size());
//Looping through an array using for loop
for (int i=0; i<Week.size(); i++)
{
System.out.println(Week.get(i));
}
//Looping through an array using foreach loop
for (String j : Week) {
System.out.println(j);
}
//Creating an array using numbers
ArrayList<Integer> OddNumbers = new ArrayList<Integer>();
OddNumbers.add(9);
OddNumbers.add(1);
OddNumbers.add(7);
OddNumbers.add(3);
OddNumbers.add(5);
for (int i : OddNumbers) {
System.out.println(i);
}
//Sorting the array
Collections.sort(Week);
for (String k: Week) {
System.out.println(k);
}
//Sorting the array of numbers
Collections.sort(OddNumbers);
for (int l: OddNumbers) {
System.out.println(l);
}
//Clear the array();
OddNumbers.clear();
System.out.println(OddNumbers);
//Creating iterator
Iterator <String> Iter = Week.iterator();
//Printing the first item
System.out.println(Iter.next());
//Looping through the iterator
while (Iter.hasNext()) {
System.out.println(Iter.next());
}
ArrayList<Integer> Numbers = new ArrayList<Integer>();
Numbers.add(12);
Numbers.add(22);
Numbers.add(27);
Numbers.add(32);
Numbers.add(15);
Iterator<Integer> Iterate = Numbers.iterator();
while (Iterate.hasNext()) {
Integer m = Iterate.next();
if (m<20) {
//Removing items through the collection
Iterate.remove();
}
}
System.out.println(Numbers);
//Declaring Lambda Expression -> forEach
ArrayList<Integer> num = new ArrayList<Integer>();
num.add(7);
num.add(2);
num.add(1);
num.add(8);
num.add(5);
num.forEach( (n) -> {
System.out.println(n);
});
//Declaring Lambda Expression -> Consumer
Consumer<Integer> ConsumerMethod = (n) -> {
System.out.println(n);
};
num.forEach(ConsumerMethod);
}
}