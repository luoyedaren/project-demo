package domain;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/8 0008. - 星期二
 * nickName louyedaren
 */
@Data
@Accessors(fluent = true)
public class Cat {

	private String name;
	private String color;
	private int age;



	private String callColor(){
		System.out.println("获取毛色");
		return color;
	}
}
