interface FirstInterface {
public void Welcome();
}
interface SecondInterface {
public void Self();
}
class Education implements FirstInterface, SecondInterface {
public void Welcome() {
System.out.println("Hi, I am Susma");
}
public void Self() {
System.out.println("I completed my schooling at CMS and doing my graduation at SNS");
}
}
class MultipleInterface {
public static void main(String[] args) {
Education objEdu = new Education();
objEdu.Welcome();
objEdu.Self();
}
}