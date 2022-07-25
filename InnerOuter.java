//Declaring Inner and Outer Class
//If private is used in InnerClass, it could not be accessed
class OuterClass {
int a = 882;
class InnerClass {
int b = 352;
}
}
public class InnerOuter {
public static void main(String[] args) {
OuterClass objOuter = new OuterClass();
OuterClass.InnerClass objInner = objOuter.new InnerClass();
System.out.println(objInner.b + objOuter.a);
int c = objInner.b + objOuter.a;
System.out.println("Addition of " + objOuter.a + " and " + objInner.b + " = " + c);
}
}