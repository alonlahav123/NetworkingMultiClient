public class ThreadTester {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThreadedClass("A"));
        Thread thread2 = new Thread(new MyThreadedClass("B"));
        Thread thread3 = new Thread(new MyThreadedClass("C"));
        Thread thread4 = new Thread(new MyThreadedClass("D"));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}
