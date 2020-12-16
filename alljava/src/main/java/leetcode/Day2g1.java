package leetcode;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

/**
 * project alljava
 *
 * @author chenghai on 2020/12/16 0016. - 星期三
 * nickName louyedaren
 * 保证顺序执行 方法1 方法2 / 方法1 方法3
 */
public class Day2g1 {

    public static void main(String[] args) throws InterruptedException {
        ZeroEvenOdd zeroEvenOdd = new ZeroEvenOdd(5);
        IntConsumer intConsumer = (n)->{
            System.out.print(n);
        };
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 1, TimeUnit.HOURS, new LinkedBlockingQueue<>(10));
        threadPoolExecutor.execute(()->{
            try {
                TimeUnit.SECONDS.sleep(1);
                zeroEvenOdd.zero(intConsumer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        threadPoolExecutor.execute(()->{
            try {
                TimeUnit.SECONDS.sleep(1);
                zeroEvenOdd.even(intConsumer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        threadPoolExecutor.execute(()->{
            try {
                TimeUnit.SECONDS.sleep(1);
                zeroEvenOdd.odd(intConsumer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    static class ZeroEvenOdd {
        private int n;
        private AtomicInteger atomicInteger = new AtomicInteger(1);

        public ZeroEvenOdd(int n) {
            this.n = n;
        }

        // printNumber.accept(x) outputs "x", where x is an integer.
        public void zero(IntConsumer printNumber) throws InterruptedException {
            for (int i = 0; i < n; i++) {
                while (atomicInteger.get()!=1){

                }
                printNumber.accept(0);
                atomicInteger.incrementAndGet();
            }
        }

        //输出偶数
        public void even(IntConsumer printNumber) throws InterruptedException {
            while (atomicInteger.get()!=2){

            }
            printNumber.accept(n);
            atomicInteger.incrementAndGet();
        }

        //输出奇数
        public void odd(IntConsumer printNumber) throws InterruptedException {
            while (atomicInteger.get()!=3){

            }
            printNumber.accept(n);
            atomicInteger.set(1);
        }
    }
}
