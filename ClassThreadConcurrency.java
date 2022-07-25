public class ClassThreadConcurrency extends Thread {
public static int amount = 1;
public static void main(String[] args) {
ClassThreadConcurrency objThread = new ClassThreadConcurrency();
objThread.start();
System.out.println(amount);
amount++;
System.out.println(amount);
}
public void run() {
amount++;
}
}