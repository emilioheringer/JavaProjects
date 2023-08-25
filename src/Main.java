// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Thread Atual: "+ t);
        t.setName("Novo Nome");
        System.out.println("Thread Atual: "+ t);

        try{
            for(int i = 5; i> 0; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main Thread interrompida");
        }
    }
}