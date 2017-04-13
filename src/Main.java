import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    static Queue<Ticket> queue = new Queue<>();
    static int count = 0;
    static Random rand = new Random();

    public static void main(String args[]) throws InterruptedException {

        while (true) {
            addToList();
            System.out.println("Queue is " + queue);
            Thread.sleep(3000);
            removeFromList();
            Thread.sleep(3000);
        }

    }

    private static void addToList() {
        int n = rand.nextInt(10);
        for (int i = 0; i < n; ++i) {
            Ticket ticket = new Ticket("Firstone", ++count);
            queue.add(ticket);
        }
    }

    private static void removeFromList() {
        rand = new Random();
        int n = rand.nextInt(10);
        for (int i = 0; i < n; ++i) {
            Ticket ticket = queue.remove();
            System.out.println("removed " + ticket);
        }
    }

}



