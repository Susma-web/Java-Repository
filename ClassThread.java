public class ClassThread extends Thread {
public static void main(String[] args) {
ClassThread objThread = new ClassThread();
objThread.start();
System.out.println("This code is outside of the thread");
}
public void run() {
System.out.println("This code is running in a thread");
}
}