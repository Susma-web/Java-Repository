public class ClassImplement implements Runnable {
public static void main(String[] args) {
ClassImplement objImplement = new ClassImplement();
Thread objThread = new Thread(objImplement);
objThread.start();
System.out.println("This code is outside of the thread");
}
public void run() {
System.out.println("This code is running in a thread");
}
}