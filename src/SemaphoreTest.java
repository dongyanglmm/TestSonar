
public class SemaphoreTest {

	public static void main(String[] args) {
		PrintABCUsingSemaphore printABC = new PrintABCUsingSemaphore();
        new Thread(() -> printABC.printA()).start();
        new Thread(() -> printABC.printB()).start();
        new Thread(() -> printABC.printC()).start();
	}

}
