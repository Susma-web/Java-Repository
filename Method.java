public class Method {
//Declaring a method
static void myMethod() {
System.out.println("Method is executed");
}
//Declaring a method with parameters
static void myName(String name, int mark) {
System.out.println("My name is " + name + " and I got " + mark + " marks");
}
//Declaring a method for addition
static int add(int x, int y) {
//int z=x+y;
return x+y;
}
//Function with If-Else Condition
static void OddEven(int num) {
if (num%2==0) {
System.out.println(num + " is even");
}
else {
System.out.println(num + " is odd");
}
}
//Method Overloading
static int addMethod(int a, int b) {
return a+b;
}
static double addMethodDouble(double a, double b) {
return a+b;
}
static double addMethod(double a, double b) {
return a+b;
}
//Calling a method
public static void main(String[] args) {
myMethod();
myMethod();
myMethod();
myName("Susma", 98);
myName("Prathiksha", 97);
myName("Rakshana", 96);
System.out.println(add(8,9));
System.out.println(add(6,7));
int z = add(3,5);
System.out.println(z);
OddEven(87);
OddEven(34);
int addNum = addMethod(8,3);
double addNumDouble = addMethodDouble(9.43,7.61);
double addNum1 = addMethod(3.67,5.98);
System.out.println(addNum);
System.out.println(addNumDouble);
System.out.println(addNum1);
}
}