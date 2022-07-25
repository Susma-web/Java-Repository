//Enums are used where values doesn't change, cannot be used to create objects and cannot extend other classes
public class EnumClass {
enum Level {
LOW,
MEDIUM,
HIGH
}
public static void main(String[] args) {
Level enumval = Level.MEDIUM;
System.out.println(enumval);
}
}