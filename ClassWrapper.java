public class ClassWrapper {
public static void main(String[] args) {
Integer Int = 8;
Double Doub = 3.11;
Character Char = 'S';
System.out.println(Int);
System.out.println(Doub);
System.out.println(Char);
System.out.println(Int.intValue());
System.out.println(Doub.doubleValue());
System.out.println(Char.charValue());
Integer IntegerValue = 2879;
String StringValue = IntegerValue.toString();
System.out.println(StringValue.length());
}
}