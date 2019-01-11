package domain;

import java.util.Date;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/11 0011. - 星期五
 * nickName louyedaren
 */
public class Dog {
	private int age;
	private String name;
	private Date birthDay;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Dog{");
		sb.append("age=").append(age);
		sb.append(", name='").append(name).append('\'');
		sb.append(", birthDay=").append(birthDay);
		sb.append('}');
		return sb.toString();
	}
}
