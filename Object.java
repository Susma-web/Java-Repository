//OOPs Concept
public class Object {
final int x=10;
int y=20;
int z;
int a;
String fname = "Susma";
String lname = "Sureshkumar";
int age = 20;
//Static Method
static void StaticMethod() {
System.out.println("Static methods can be called without creating objects");
}
//Public Method
public void PublicMethod() {
System.out.println("Public methods must be called by creating objects");
}
//Public Method with parameters
public void Bill(int billValue) {
System.out.println("The electricity bill is: " + billValue);
}
//Declare a Constructor for Object Class
public Object() {
a=9;
}
//Declare a Constructor with parameter
public Object(int b) {
a=b;
}
public static void main(String[] args) {
//Declaring Object and calling the variable
Object obj=new Object();
//Declaring multiple objects
Object obj2=new Object(7);
//Declaring value
obj.z = 30;
//Modifying the value
obj.y = 40;
//Calling the values and printing it
System.out.println(obj.x);
System.out.println(obj2.x);
System.out.println(obj.y);
System.out.println(obj2.y);
System.out.println(obj.z);
System.out.println("Name: " + obj.fname + " " + obj.lname);
System.out.println("Age: " + obj.age); 
StaticMethod();
obj.PublicMethod();
obj.Bill(500);
System.out.println(obj2.a);
System.out.println(obj2.a);
}
}