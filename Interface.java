interface Intro {
public void Welcome();
public void Self();
}
class Education implements Intro {
public void Welcome() {
System.out.println("I completed my schooling at CMS and doing my graduation at SNS");
}
public void Self() {
System.out.println("Hi, I am Susma");
}
}
class Interface {
public static void main(String[] args) {
Education objEdu = new Education();
objEdu.Welcome();
objEdu.Self();
}
}