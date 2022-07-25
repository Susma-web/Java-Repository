final class FinalClass {
protected String fname = "Susma";
protected String lname = "Sureshkumar";
}
class Student extends FinalClass {
public static void main(String[] args) {
FinalClass objFinal = new FinalClass();
System.out.println("Name : " + objFinal.fname + " " + objFinal.lname);
}
}