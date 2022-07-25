//Using inheritance, inherit from subclass
//If used final keyword for class, not able to inherit from subclass. Eg : final class Self
class Self {
protected String fname = "Susma";
public void Intro() {
System.out.println("Hi! I am Susma");
}
}
class Education extends Self {
private String lname= "Sureshukumar";
public static void main(String[] args) {
Education objEducation = new Education();
objEducation.Intro();
System.out.println(objEducation.fname + " " + objEducation.lname);
}
}