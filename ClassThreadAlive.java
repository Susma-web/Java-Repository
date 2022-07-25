public class ClassThreadAlive extends Thread {
public static int amount = 7;
public static void main(String[] args) {
ClassThreadAlive objThread = new ClassThreadAlive();
objThread.start();
while (objThread.isAlive()) {
System.out.println("It is running...");
}
System.out.println("Main : " + amount);
amount++;
System.out.println("Main : " + amount);
}
public void run() {
amount++;
}
}