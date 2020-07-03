package Thread_test;

public class thread1 extends Thread {
    public thread1() {
    }
    public thread1(String name) {
        super(name);
    }


    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("新线程");
        }
        System.out.println(getName());
        Thread t = thread1.currentThread();
        System.out.println(t.getName());
    }
}
