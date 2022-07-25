public class Variable {
public static void main(String[] args) {
//Types of Variable 
String name = "Susma";
float floatNum = 8.334f;
char letter = 'P';
boolean boolValue = false;
int num = 7;
//Change the value
num = 26;
//Declare the constant value
final int numValue = 8;
String firstName = "Rakshana ";
String lastName = "Dinesh";
//Adding two variables
String fullName = firstName + lastName;
//Declare multiple variables
int x=1, y=2, z=3;
/* byte => -128 to 127
short => -32768 to 32767
int => -2147483648 to 2147483647
long => -9223372036854775808 to 9223372036854775807
float => 9.99 or 3.14515 or 5.75f
double => 19.99d */
//Widening Casting : byte->short->char->int->long->float->double
//Narrowing Casting : double->float->long->int->char->short->byte
double doubleNum = num;
int intNum = (int) floatNum;
System.out.println(name);
System.out.println(num);
System.out.println(floatNum);
System.out.println(letter);
System.out.println(boolValue);
System.out.println(numValue);
System.out.println(fullName);
//Combine string and variable
System.out.println("Hello " + name);
//Add two int values using it's variables
System.out.println(num + numValue);
System.out.println(x+y+z);
System.out.println(doubleNum);
System.out.println(intNum);
}
}