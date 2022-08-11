public class Main {
    public static void main(String[] args){

        ThreadGroup mainThreadGroup = new ThreadGroup(" ");

        System.out.println("Создаю потоки! ");
        Thread thread1 = new MyThread(mainThreadGroup, "1");
        Thread thread2 = new MyThread(mainThreadGroup, "2");
        Thread thread3 = new MyThread(mainThreadGroup, "3");
        Thread thread4 = new MyThread(mainThreadGroup, "4");

        startThread(thread1, thread2, thread3, thread4);

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {

        }
        System.out.println("Завершаю все потоки");
        mainThreadGroup.interrupt();
    }

    private static void startThread(Thread... threads){
        for (Thread thread : threads) {
            thread.start();
        }
    }
}
