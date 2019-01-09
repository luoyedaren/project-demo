package lang.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/7 0007. - 星期一
 * nickName louyedaren
 */
public class SetLearn {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		IntStream.range(0,10).forEach(i->set.add(i));
		System.out.println(set);

		Set<Integer> treeSet = new TreeSet<>();
		IntStream.range(0, 10).forEach(i -> treeSet.add(i));
		System.out.println(treeSet);
		System.out.println(((TreeSet<Integer>) treeSet).first());
	}
}
