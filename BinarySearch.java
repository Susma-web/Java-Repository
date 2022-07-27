import java.util.Scanner;
class BinarySearch {
public static void main(String args[]) {
int i, userInput, searchValue, array[], first, last, middle;
Scanner input = new Scanner(System.in);
System.out.println("Enter number of elements:");
userInput = input.nextInt(); 
array = new int[userInput];
System.out.println("Enter " + userInput + " integers");
for (i = 0; i < userInput; i++)
array[i] = input.nextInt();
System.out.println("Enter the search value:");
searchValue = input.nextInt();
first = 0;
last = userInput - 1;
middle = (first + last)/2;
while( first <= last ) {
if ( array[middle] < searchValue )
first = middle + 1;
else if ( array[middle] == searchValue ) {
System.out.println(searchValue + " found at location " + (middle + 1) + ".");
break;
}
else {
last = middle - 1;
}
middle = (first + last)/2;
}
if ( first > last )
System.out.println(searchValue + " is not found.\n");
}
}