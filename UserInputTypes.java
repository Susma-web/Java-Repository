import java.util.Scanner;
class UserInputTypes {
public static void main(String[] args) {
Scanner objInput = new Scanner(System.in);
System.out.println("Let's get into your personal info => Enter your Name, Age and Salary : ");
String name = objInput.nextLine();
int age = objInput.nextInt();
double salary = objInput.nextDouble();
System.out.println("Name : " + name);
System.out.println("Age : " + age);
System.out.println("Salary : " + salary);
}
}