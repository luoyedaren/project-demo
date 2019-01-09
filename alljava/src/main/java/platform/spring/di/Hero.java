package platform.spring.di;

import static org.easymock.EasyMock.mock;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/8 0008. - 星期二
 * nickName louyedaren
 */
public class Hero {
	private Animal p;

	public Hero(Animal p) {
		this.p = p;
	}

	void savePerson() {
		System.out.println("save person go!");
		p.fight();

	}

	public static void main(String[] args) {
		Animal p = mock(Animal.class);
		Hero hero = new Hero(p);
		hero.savePerson();

		System.out.println("------------------------");
		System.out.println("another save action ！");
		Hero hero1 = new Hero(new Girl());
		hero1.savePerson();

	}
}
