class OuterClass {
int a = 882;
static class StaticClass {
int b = 352;
}
}
public class OuterStatic {
public static void main(String[] args) {
OuterClass.StaticClass objStatic =  new OuterClass.StaticClass();
System.out.println(objStatic.b);
}
}