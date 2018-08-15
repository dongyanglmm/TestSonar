import java.util.concurrent.Semaphore;

public class PrintABCUsingSemaphore {
	
	private Semaphore semaphoreA = new Semaphore(1);
    private Semaphore semaphoreB = new Semaphore(0);
    private Semaphore semaphoreC = new Semaphore(0);
    
    public void printA() {
        print("A", semaphoreA, semaphoreB);
    }

    public void printB() {
        print("B", semaphoreB, semaphoreC);
    }

    public void printC() {
        print("C", semaphoreC, semaphoreA);
    }
    
    private void print(String name, Semaphore currentSemaphore, Semaphore nextSemaphore) {
        for (int i = 0; i < 10; ) {
            try {
                currentSemaphore.acquire();
                System.out.println(Thread.currentThread().getName() +" print "+ name);
                i++;
                //把信号量传递给下一位
                nextSemaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    

}
