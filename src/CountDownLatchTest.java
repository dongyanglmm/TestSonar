import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

	public static void main(String[] args) {
		int threadCount = 10;
		final CountDownLatch latch = new CountDownLatch(threadCount);
		for (int i = 0; i < threadCount; i++) {
			new Thread(new Runnable() {

				@Override
				public void run() {
					System.out.println("线程" + Thread.currentThread().getId() + "开始出发");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("线程" + Thread.currentThread().getId() + "已到达终点");
					//线程数-1
					latch.countDown();
				}

			}).start();
		}
		
		try {
			//等待线程为0时，继续往下执行
			latch.await();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("10个线程已经执行完毕！开始计算排名");
	}

}
