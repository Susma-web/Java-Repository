public class Operator {
public static void main(String[] args) {
int sum1 = 655 + 874;
int sum2 = sum1 + 984;
int sum3 = sum1 + sum2;
System.out.println(sum1);
System.out.println(sum2);
System.out.println(sum3);
//Arithmetic Operators
System.out.println(sum1 + sum3);
System.out.println(sum1 - sum3);
System.out.println(sum1 * sum3);
System.out.println(sum1 / sum3);
System.out.println(sum1 % sum3);
++sum1;
System.out.println(sum1);
--sum2;
System.out.println(sum2);
//Assignment Operators
int x = 11;
System.out.println(x);
System.out.println(sum1+=10);
System.out.println(sum1-=10);
System.out.println(sum1*=10);
System.out.println(sum1/=10);
System.out.println(sum1%=10);
System.out.println(sum1&=10);
System.out.println(sum1|=10);
System.out.println(sum1^=10);
System.out.println(sum1>>=10);
System.out.println(sum1<<=10);
//Comparison Operators
System.out.println(sum1 == sum3);
System.out.println(sum1 != sum3);
System.out.println(sum1 > sum3);
System.out.println(sum1 < sum3);
System.out.println(sum1 >= sum3);
System.out.println(sum1 <= sum3);
//Logical Operators
System.out.println(sum1 > 1000 && sum1 <1000);
System.out.println(sum1 > 1000 || sum1 <1000);
System.out.println(!(sum1 > 1000 || sum1 <1000));
//String Methods
String txt = "Rakshana Dinesh";
System.out.println(txt.length());
System.out.println(txt.toUpperCase());
System.out.println(txt.toLowerCase());
System.out.println(txt.indexOf("Dinesh"));
//String Concatenation
String fname = "Surya ";
String lname = "Saravanan";
System.out.println(fname + " " + lname);
System.out.println(fname.concat(lname));
//Adding Numbers and Strings
System.out.println(sum1 + sum2);
String y = "11";
String z = "22";
int a = 33;
System.out.println(y+z);
System.out.println(z+a);
//Using Special Characters
String text1 = "My name is \"Susma\"";
System.out.println(text1);
String text2 = "My name is \'Susma\'";
System.out.println(text2);
String text3 = "My name is Susma\\";
System.out.println(text3);
String text4 = "My name is \nSusma";
System.out.println(text4);
String text5 = "My name \ris Susma";
System.out.println(text5);
String text6 = "My name is S\bSusma";
System.out.println(text6);
String text7 = "My name is \tSusma";
System.out.println(text7);
//Math methods
System.out.println(Math.max(sum1, sum3));
System.out.println(Math.min(sum2, sum3));
System.out.println(Math.sqrt(sum3));
System.out.println(Math.abs(sum2));
System.out.println(Math.random());
int randomNum = (int)(Math.random() * 200);
System.out.println(randomNum);

} 
}