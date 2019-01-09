package lang.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/8 0008. - 星期二
 * nickName louyedaren
 */
public class ReflectLearn {
	public static final String className = "lang.reflect.Cat";

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
//		反射
		Class<?> aClass = Class.forName(className);
//		字面常量
		Class<Cat> catClass = Cat.class;

		Arrays.stream(aClass.getDeclaredMethods()).forEach(method -> System.out.println(method.getName()));
		Method method = aClass.getDeclaredMethod("callColor", null);
		System.out.println(method);
//		允许访问私有成员和方法;
		method.setAccessible(true);
		method.invoke(aClass.newInstance(), null);

		//类加载器  获取类型信息
		ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
		Class<?> aClass1 = contextClassLoader.loadClass(className);

	}
}
