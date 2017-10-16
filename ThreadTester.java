/**
 * Created by Maria on 16.10.2017.
 */
public class ThreadTester {
    public static void main(String[] args) throws InterruptedException
    {
        long startTime = System.currentTimeMillis();
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);
        myThread.start();

        for (int i = 0; i < 5; i++)
        {
            Thread.sleep(100);
            StringContainer.addToSb("Thread2");
        }

        System.out.println("1: " + StringContainer.getSb());
        System.out.println("1 length: " + StringContainer.getSb().length());

        long endTime = System.currentTimeMillis();
        System.out.println("Second test took " + (endTime - startTime) + " milliseconds");
    }
}
