package lang.collections;

import java.util.ArrayDeque;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/7 0007. - 星期一
 * nickName louyedaren
 */
public class ArrayDequeLearn {

	public static void main(String[] args) {
		ArrayDeque arrayDeque = new ArrayDeque();
		arrayDeque.add(1);
		arrayDeque.add(2);
		arrayDeque.add(3);
		arrayDeque.add(4);

		System.out.println(arrayDeque);
		System.out.println(arrayDeque.pop());
		System.out.println(arrayDeque);
		System.out.println(arrayDeque.pollFirst());

		System.out.println(arrayDeque.pollLast());


		System.out.println(arrayDeque);

	}
}
