enum Level {
LOW,
MEDIUM,
HIGH
}
public class SwitchEnum {
public static void main(String[] args) {
Level enumval = Level.MEDIUM;
switch(enumval) {
case LOW:
System.out.println("Low Level");
break;
case MEDIUM:
System.out.println("Medium Level");
break;
case HIGH:
System.out.println("High Level");
break;
}
}
}