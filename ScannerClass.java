//To run the code at runtime, import Scanner package or all packages
//import java.util.Scanner;
import java.util.*;
class ScannerClass {
public static void main(String[] args) {
Scanner objScanner = new Scanner(System.in);
String name;
System.out.println("Enter Name : ");
name = objScanner.nextLine();
System.out.println("I am " + name);
}
}