class CallAbstractClass {
public static void main(String[] args) {
StudentDetails objAbstract = new StudentDetails();
System.out.println("Name : " + objAbstract.fname + " " + objAbstract.lname);
System.out.println("Email : " + objAbstract.email);
System.out.println("Age : " + objAbstract.age);
System.out.println("Graduation Year : " + objAbstract.graduationYear);
objAbstract.Details();
}
}  