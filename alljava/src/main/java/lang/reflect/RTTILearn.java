package lang.reflect;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/8 0008. - 星期二
 * nickName louyedaren
 */
public class RTTILearn {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(Cat1.class);
		System.out.println("----------------------");
		System.out.println(Class.forName("lang.reflect.Cat1"));
	}
}


class Cat1{
	static {
		System.out.println("执行了 cat1");
	}
}

class Cat2{

}
