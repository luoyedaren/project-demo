package lang.reflect;

import com.google.common.collect.Lists;
import domain.Cat;
import domain.Dog;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/11 0011. - 星期五
 * nickName louyedaren
 */
public class CompareObject {

	public static List<Field> getFileds(Object o) {
		return Lists.newArrayList(o.getClass().getDeclaredFields());

	}

	public static boolean compareData(Object o1, Object o2) throws IllegalAccessException {
		List<Field> fileds = getFileds(o1);
		for (Field field : fileds) {

			field.setAccessible(true);
			Object obj1 = field.get(o1);
			Object obj2 = field.get(o2);
			Objects.equals(obj1, obj2);
			com.google.common.base.Objects.equal(obj1, obj2);
		}
		return false;
	}

	public static void main(String[] args) throws IllegalAccessException {
		Cat c1 = new Cat().age(1).name("test");
		Cat c2 = new Cat().age(1).name("test");
		Cat c3 = new Cat();
		compareData(c1, c2);
		System.out.println(c1);
		System.out.println(c2);
		// 使用 @Data 注解  就是比较两个对象 因为 @Data 注解中包含 @ToString、@EqualsAndHashCode、@Getter、@Setter和@RequiredArgsConstrutor
		// 其中 @EqualsAndHashCode 重写了 equal 和 hash 方法
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));

		Dog dog1 = new Dog();
		Dog dog2 = new Dog();


		System.out.println("比较dog对象");
		System.out.println(dog1.equals(dog2));
		System.out.println(dog1.toString().equals(dog2.toString()));

	}
}
