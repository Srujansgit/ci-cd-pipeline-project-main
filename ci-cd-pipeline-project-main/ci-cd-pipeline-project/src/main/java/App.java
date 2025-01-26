import java.lang.Thread;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Dockerized Java Application!");

        while (true) {
            try {
                Thread.sleep(1000); // Pause for 1 second
                System.out.println("Hello, Dockerized Java Application in loop!");
               }
            catch (InterruptedException e)
                {
                     System.out.println("Hello, Eception!");
                } 
            } //while
        }
}

