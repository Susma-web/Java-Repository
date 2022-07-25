class ProtectedAttributes {
protected String fname = "Susma";
protected String lname = "Sureshkumar";
protected String email = "suresh7sumathi@gmail.com";
protected int age = 20;
}
class ProtectedAttributesClass extends ProtectedAttributes {
private int graduationYear = 2024;
public static void main(String[] args) {
ProtectedAttributesClass objProtected = new ProtectedAttributesClass();
System.out.println("Name : " + objProtected.fname + " " + objProtected.lname);
System.out.println("Email : " + objProtected.email);
System.out.println("Age : " + objProtected.age);
System.out.println("Graduation Year : " + objProtected.graduationYear);
}
}