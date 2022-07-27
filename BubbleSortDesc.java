import java.util.Scanner;
class BubbleSortDesc {
public static void main(String[] args) {
int userInput, i, j, swapTerm;
Scanner input = new Scanner(System.in);
System.out.println("Enter the number of values to be sorted : ");
userInput = input.nextInt();
int array[] = new int[userInput];
System.out.println("Enter " + userInput + " integers : ");
for (i=0; i<userInput; i++)
array[i] = input.nextInt();
for (i=0; i<(userInput-1); i++) {
for (j=0; j<(userInput-i-1); j++) {
if (array[j] < array[j+1]) {
swapTerm = array[j];
array[j] = array[j+1];
array[j+1] = swapTerm;
}
}
}
System.out.println("Sorted values : ");
for (i=0; i<userInput; i++) 
System.out.println(array[i]);
}
}