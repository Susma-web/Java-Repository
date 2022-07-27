import java.util.Scanner;
class LinearSearch {
public static void main(String args[]) {
int i, userInput, searchValue, array[];
Scanner input = new Scanner(System.in);
System.out.println("Enter number of elements : ");
userInput = input.nextInt();
array = new int[userInput];
System.out.println("Enter " + userInput + " integers");
for (i=0; i<userInput; i++)
array[i] = input.nextInt();
System.out.println("Enter the value to be searched : ");
searchValue = input.nextInt();
for (i=0; i<userInput; i++) {
if (array[i] == searchValue) {
System.out.println(searchValue + " is present at location " + (i+1));
break;
}
}
if (i==userInput) 
System.out.println(searchValue + " is not in the array");
}
}
 