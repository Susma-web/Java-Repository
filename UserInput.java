import java.util.Scanner;
class UserInput {
public static void main(String[] args) {
Scanner objUser = new Scanner(System.in);
String name;
System.out.println("What's your name !!!");
name = objUser.nextLine();
System.out.println("Hi! " + name);
}
}