package Thread_test;

public class threadtest {
    public static void main(String[] args) throws InterruptedException {
        thread1 mythread = new thread1();
        mythread.start();


        new thread1("haha").start();
        for (int i = 0; i < 2; i++) {
            System.out.println("主线程正在执");
        }


        Thread th = Thread.currentThread();
        th.setName("主");
        Thread.sleep(50000);
        System.out.println(th.getName());
    }
}
