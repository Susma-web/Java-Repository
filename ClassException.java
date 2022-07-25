public class ClassException {
public static void main(String[] args) {
try {
int[] Numbers = {1,2,3,4,5};
System.out.println(Numbers[10]);
}
catch (java.lang.Exception e) {
System.out.println("Something went wrong");
}
finally {
System.out.println("The 'try catch' is finished");
}
}
}