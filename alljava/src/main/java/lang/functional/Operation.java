package lang.functional;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/23 0023. - 星期三
 * nickName louyedaren
 */
public class Operation {

	public static void main(String[] args) {
	}

	public static void operate(Function<Integer,Integer> function,int a ,int b){

		Integer apply = function.apply(a);
	}

//	public static void operateOne(Consumer consumer) {
//		consumer.accept();
//	}
}
