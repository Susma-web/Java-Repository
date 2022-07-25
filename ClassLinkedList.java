import java.util.LinkedList;
public class ClassLinkedList {
public static void main(String[] args) {
LinkedList<String> Week = new LinkedList<String>();
Week.add("Mon");
Week.add("Tue");
Week.add("Wed");
Week.add("Thurs");
Week.add("Fri");
//Creating an linkedlist
System.out.println(Week);
//To add the item at the beginning
Week.addFirst("Sun");
System.out.println(Week);
//To add the item to the end
Week.addLast("Sat");
System.out.println(Week);
//To remove the first item from the list
Week.removeFirst();
System.out.println(Week);
//To remove the last item from the list
Week.removeLast();
System.out.println(Week);
//To display the first item in the list
System.out.println(Week.getFirst());
//To display the last item in the list
System.out.println(Week.getLast());
}
}