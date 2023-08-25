// Create multiple threads.
class NovaThread implements Runnable {
String name; // name of thread
Thread t;
NovaThread(String threadname) {
name = threadname;
t = new Thread(this, name);
System.out.println("New thread: " + t);
}
// This is the entry point for thread.
public void run() {
try {
for(int i = 5; i > 0; i--) {
System.out.println(name + ": " + i);
Thread.sleep(1000);
}
} catch (InterruptedException e) {
System.out.println(name + "Interrupted");
}
System.out.println(name + " exiting.");
}
}
class MultiThreadDemo {
public static void main(String[] args) {
NovaThread nt1 = new NovaThread("One");
NovaThread nt2 = new NovaThread("Two");
NovaThread nt3 = new NovaThread("Three");
// Start the threads.
nt1.t.start();
nt2.t.start();
nt3.t.start();
try {
// wait for other threads to end
Thread.sleep(10000);
} catch (InterruptedException e) {
System.out.println("Main thread Interrupted");
}
System.out.println("Main thread exiting.");
}
}