package leetcode;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * project alljava
 *
 * @author chenghai on 2020/12/16 0016. - 星期三
 * nickName louyedaren
 * 三个线程执行三个方法
 * 保证顺序执行 方法1 方法2 方法3
 */
public class Day2 {

    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        Runnable a = () -> {
            System.out.println("first");
        };
        Runnable b = () -> {
            System.out.println("second");
        };
        Runnable c = () -> {
            System.out.println("three");
        };



        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 100, 1, TimeUnit.HOURS, new LinkedBlockingQueue<>(100));
        for (int i = 0; i < 1000; i++) {
            start(foo, a, b, c, threadPoolExecutor);
            TimeUnit.SECONDS.sleep(3);
            System.out.println("=-------------------------------------------");
        }

    }

    private static void start(Foo foo, Runnable a, Runnable b, Runnable c, ThreadPoolExecutor threadPoolExecutor) {
        threadPoolExecutor.execute(()->{
            try {
                TimeUnit.SECONDS.sleep(1);
                foo.first(a);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadPoolExecutor.execute(()->{
            try {
                TimeUnit.SECONDS.sleep(1);
                foo.second(b);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        threadPoolExecutor.execute(()->{
            try {
                TimeUnit.SECONDS.sleep(1);
                foo.third(c);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

//        threadPoolExecutor.shutdown();
    }

    static class Foo {
        private final AtomicInteger atomicInteger = new AtomicInteger(1);

        public Foo() {

        }

        public void first(Runnable printFirst) throws InterruptedException {

            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            atomicInteger.incrementAndGet();
        }

        public void second(Runnable printSecond) throws InterruptedException {

            while (atomicInteger.get() != 2){

            }
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            atomicInteger.incrementAndGet();
        }

        public void third(Runnable printThird) throws InterruptedException {

            while (atomicInteger.get()!=3){

            }
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
            atomicInteger.set(1);
        }
    }
}
