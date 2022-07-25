abstract class Intro {
public abstract void Welcome();
public void Self() {
System.out.println("Hi, I am Susma");
}
}
class Education extends Intro {
public void Welcome() {
System.out.println("I completed my schooling at CMS and doing my graduation at SNS");
}
}
class SelfIntro {
public static void main(String[] args) {
Education objEdu = new Education();
objEdu.Welcome();
objEdu.Self();
}
}