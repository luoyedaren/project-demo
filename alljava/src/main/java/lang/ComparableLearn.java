package lang;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import domain.Cat;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/10 0010. - 星期四
 * nickName louyedaren
 */
public class ComparableLearn {
	public static void main(String[] args) {
		List<Cat> list = Lists.newArrayList();
		IntStream.range(0,10).forEach(i -> {
			int nextInt = new Random().nextInt(100);
			list.add(new Cat().age(nextInt));
		});
		System.out.println(list);
		System.out.println("排序后");
		//降序
		List<Cat> collect = list.stream().sorted(Comparator.comparing(Cat::age,Comparator.reverseOrder())).collect(Collectors.toList());
		System.out.println(collect);
		list.sort(Comparator.comparing(Cat::age,Comparator.reverseOrder()));
		System.out.println(list);


		List<Map> listMap = Lists.newArrayList();
		IntStream.range(0,10).forEach(i->{
			Map map = Maps.newHashMap();
			map.put("count", new Random().nextInt(100));
			listMap.add(map);

		});


		System.out.println("map 排序-----");
		System.out.println(listMap);
		listMap.sort(Comparator.comparing(map -> (int) map.get("count")));
		System.out.println(listMap);
		listMap.sort(Comparator.comparing(map->(int)map.get("count"),Comparator.reverseOrder()));
		System.out.println(listMap);


	}
}
