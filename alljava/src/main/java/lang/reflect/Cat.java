package lang.reflect;

import lombok.Data;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/8 0008. - 星期二
 * nickName louyedaren
 */
@Data
public class Cat {

	private String name;
	private String color;

	private String callColor(){
		System.out.println("获取毛色");
		return color;
	}
}
