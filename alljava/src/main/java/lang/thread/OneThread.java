package lang.thread;

import lombok.Cleanup;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/22 0022. - 星期二
 * nickName louyedaren
 */
@Slf4j
public class OneThread {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();

		log.info(Thread.currentThread().getName());

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(()->{
			System.out.println("executorService.execute: "+Thread.currentThread().getName());
			try {
				TimeUnit.MINUTES.sleep(1L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			executorService.shutdownNow();
			log.info("executorService.execute end : "+Thread.currentThread().getName());
		});


//		Future<?> submit = executorService.submit(() -> {
//
//			System.out.println("executorService: "+Thread.currentThread().getName());
//			executorService.shutdownNow();
//		});



//		int  corePoolSize  =    5;
//		int  maxPoolSize   =   10;
//		long keepAliveTime = 5000;
//
//		ExecutorService threadPoolExecutor =
//				new ThreadPoolExecutor(
//						corePoolSize,
//						maxPoolSize,
//						keepAliveTime,
//						TimeUnit.MILLISECONDS,
//						new LinkedBlockingQueue<Runnable>()
//				);
//		threadPoolExecutor.submit(() -> {
//
//			System.out.println(Thread.currentThread().getName());
//		});



	}
}
