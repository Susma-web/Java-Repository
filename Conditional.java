public class Conditional {
public static void main(String args[]) {
int x = 30, y= 60;
//If statement
if(x>y) {
System.out.println("x is greater than y");
}
//Else if statement
else if(x<y) {
System.out.println("x is smaller than y");
}
//Else statement
else {
System.out.println("x is equal to y");
}
//Ternary operator
String result = (x>y) ? "x is greater than y" : "x is smaller than y";
System.out.println(result); 
//Switch statement
int mark = 80;
switch(mark) {
case 100:
System.out.println("A");
break;
case 90:
System.out.println("B");
break;
case 80:
System.out.println("C");
break;
case 70:
System.out.println("D");
break;
default:
System.out.println("E");
}
}
}