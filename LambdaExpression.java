interface FuncStr {
String run(String str);
}
public class LambdaExpression {
public static void main(String[] args) {
FuncStr exclaim = (s) -> s + "!";
FuncStr ask = (s) -> s + "?";
printFormatted("Hello", exclaim);
printFormatted("Hello", ask);
}
public static void printFormatted(String str, FuncStr format) {
String res = format.run(str);
System.out.println(res);
}
}