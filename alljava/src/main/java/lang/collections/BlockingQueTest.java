package lang.collections;

import org.assertj.core.util.Lists;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * project alljava
 *
 * @author chenghai on 2020/12/16 0016. - 星期三
 * nickName louyedaren
 */
public class BlockingQueTest {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(2, true);
        new Thread(() -> {
            System.out.println("put start");
            for (int i = 0; i < 10; i++) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    arrayBlockingQueue.put("number:" + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "阻塞队列").start();
        new Thread(() -> {
            System.out.println("get start");
            Object take = null;
            try {
                while (true){
//                    take = arrayBlockingQueue.take();
                    System.out.println("get"+take);
                    List<String> list = Lists.newArrayList();
                    arrayBlockingQueue.drainTo(list);
                    System.out.println(list);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }).start();
    }
}
