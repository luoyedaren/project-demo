package lang.collections;

import java.util.TreeMap;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/7 0007. - 星期一
 * nickName louyedaren
 */
public class TreeMapLearn {
	public static void main(String[] args) {
		TreeMap<Object, Object> treeMap = new TreeMap<>();
		treeMap.put("1", "one");
		treeMap.put("3", "two");
		treeMap.put("100", "three");
		System.out.println(treeMap);
	}
}
