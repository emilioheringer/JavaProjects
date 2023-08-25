public class ImplementRunnable implements Runnable{
    Thread t;
    ImplementRunnable(){
        t= new Thread(this, "Demo Thread");
        System.out.println("Child Thread:" + t);

    }

    @Override
    public void run() {
        try{
            for (int i =5;i>0;i--){
                System.out.println("Child thread: " +i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Child Interrupted");
        }
        System.out.println("exiting child thread.");
    }
}


class ThreadDemo {
    public static void main(String[] args){
        ImplementRunnable ir = new ImplementRunnable();
        ir.t.start();
        try{
            for (int i=5;i>0;i--){
                System.out.println("Main Thread: " +i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main Thread interrupted");
        }
        System.out.println("Main Thread Exiting");
    }
}
