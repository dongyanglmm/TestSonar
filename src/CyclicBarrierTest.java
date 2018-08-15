import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierTest {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(3);
		final CyclicBarrier cyb = new CyclicBarrier(3);// 约定一个数字
		for (int i = 0; i < 3; i++) {
			Runnable runnable = new Runnable() {

				public void run() {
					try {
						Thread.sleep((long) (Math.random() * 10000));
						System.out.println("线程" + Thread.currentThread().getName() + "到达集合地点，当前已有"
								+ (cyb.getNumberWaiting() + 1) + "个已经到达，" + (cyb.getNumberWaiting() == 2
										? "人到齐了继续赶路" : "等待剩下" + (3 - (cyb.getNumberWaiting() + 1)) + "人"));
						cyb.await();// 等待所有到达
						Thread.sleep((long) (Math.random() * 10000));
						System.out.println(Thread.currentThread().getName() + "跑到终点....");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			exec.execute(runnable);
		}
		
		exec.shutdown();

	}

}
