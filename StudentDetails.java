abstract class AbstractClass {
public String fname = "Susma";
public String lname = "Sureshkumar";
public String email = "suresh7sumathi@gmail.com";
public int age = 20;
public abstract void Details();
}
class StudentDetails extends AbstractClass {
public int graduationYear = 2024;
public void Details() {
System.out.println("Student Details are displayed successfully");
}
}