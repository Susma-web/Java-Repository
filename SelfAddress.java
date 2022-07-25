class Introduction {
public void IntroductionMethod() {
System.out.println("Hi! I am Susma");
}
}
class School extends Introduction {
public void IntroductionMethod() {
System.out.println("I completed my schooling at CMS");
}
}
class College extends Introduction {
public void IntroductionMethod() {
System.out.println("I am doing my graduation at SNS");
}
}
class SelfAddress {
public static void main(String[] args) {
Introduction objIntro = new Introduction();
Introduction objSchool = new School();
Introduction objCollege = new College();
objIntro.IntroductionMethod();
objSchool.IntroductionMethod();
objCollege.IntroductionMethod();
}
}