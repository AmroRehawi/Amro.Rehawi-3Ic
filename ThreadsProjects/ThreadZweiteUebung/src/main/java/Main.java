public class Main {
    public static void main(String[] args) {
MyThread first = new MyThread("First thread");
        MyThread second = new MyThread("Second thread");
first.start();
second.start();

    }
}