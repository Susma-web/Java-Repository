enum Level {
LOW,
MEDIUM,
HIGH
}
public class LoopEnum {
public static void main(String[] args) {
for (Level enumval : Level.values()) {
System.out.println(enumval);
}
}
}