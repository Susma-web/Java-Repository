public class CallEncapsulation {
public static void main(String[] args) {
Encapsulation objName = new Encapsulation();
//Private variable could not be accessed
objName.name = "Susma";
System.out.println(objName.name);
}
}