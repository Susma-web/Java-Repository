class OuterClass {
int a = 882;
class InnerClass {
public int InnerMethod() {
return a;
}
}
}
public class OuterInner {
public static void main(String[] args) {
OuterClass objOuter = new OuterClass();
OuterClass.InnerClass objInner = objOuter.new InnerClass();
System.out.println(objInner.InnerMethod());
}
}