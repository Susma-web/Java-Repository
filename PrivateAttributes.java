public class PrivateAttributes {
private String fname = "Susma";
private String lname = "Sureshkumar";
private String email = "suresh7sumathi@gmail.com";
private int age = 20;
public static void main(String[] args) {
PrivateAttributes objPrivate = new PrivateAttributes();
System.out.println("Name : " + objPrivate.fname + " " + objPrivate.lname);
System.out.println("Email : " + objPrivate.email);
System.out.println("Age : " + objPrivate.age);
}
}