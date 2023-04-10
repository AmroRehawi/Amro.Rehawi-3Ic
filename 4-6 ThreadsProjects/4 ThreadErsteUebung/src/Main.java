public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("LBS");
        MyThread thread2 = new MyThread("Vier");

        thread1.start();
        thread2.start();
    }
}