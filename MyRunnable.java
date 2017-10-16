/**
 * Created by Maria on 16.10.2017.
 */
public class MyRunnable implements Runnable
{
         long startTime = System.currentTimeMillis();
        public void run()
        {
            for (int i = 0; i < 5; i++)
            {
                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                StringContainer.addToSb("Thread1");
            }

            System.out.println("2: " + StringContainer.getSb());
            System.out.println("2 length: " + StringContainer.getSb().length());

            long endTime = System.currentTimeMillis();
            System.out.println("First test took " + (endTime - startTime) + " milliseconds");
        }
    }

