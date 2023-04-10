import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class MyThread {
    Scanner scanner = new Scanner(System.in);
    private final Object lock = new Object();
    private boolean newNumNeeded = true;
    private boolean vectorIsFull = false;
    Vector<Integer> randNums = new Vector<Integer>();
private boolean repeat = true;
    public MyThread() {
        new Consumer().start();
        new Producer().start();
    }

    public class Producer extends Thread {
        public void run() {
            // rand nums erstellen und in Vector hinzufügen
            Random rand = new Random();

            while (repeat) {
                synchronized (lock) {
                    while (!newNumNeeded) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    for (int i = 0; i < 15; i++) {
                        int ran = rand.nextInt(1000);
                        System.out.println("Producing the number "+ran + " ,at the index "+ i);
                        try {
                            lock.wait(900);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        randNums.add(ran);
                    }
                    vectorIsFull = true;
                    newNumNeeded = false;
                    lock.notify();
                }
            }
        }
    }
    class Consumer extends Thread {
        public void run() {
                while (repeat){
                    synchronized (lock) {
                        while(!vectorIsFull){
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        for(int i : randNums){
                            System.out.println("Consuming number "+ i);
                            try {
                                lock.wait(900);
                            } catch (InterruptedException e) {

                                throw new RuntimeException(e);
                            }
                        }
                        randNums.clear();
                        vectorIsFull = false;
                        newNumNeeded = true;
                        System.out.println("Do you want to run it again? yes/no");
                        String input = scanner.nextLine();
                        if(input.equalsIgnoreCase("no")){
                            System.out.println("Ok, the program will stop");
                            repeat = false;
                        }
                        lock.notify();
                    }
                }
            }
        }
}

