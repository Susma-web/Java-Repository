import java.util.Scanner;
public class AddUserInput {
public static void main(String[] args) {
int x, y, sum;
Scanner objInput = new Scanner(System.in);
System.out.println("Type the first number : ");
x = objInput.nextInt();
System.out.println("Type the next number : ");
y = objInput.nextInt();
sum = x + y;
System.out.println("The total is : " + sum);
}
}

