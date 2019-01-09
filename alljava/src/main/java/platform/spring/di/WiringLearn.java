package platform.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.Configuration;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/8 0008. - 星期二
 * nickName louyedaren
 */
public class WiringLearn {

	public static void main(String[] args) {
		new WiringLearn().save();
	}

	void save() {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(PersonConfig.class);
		Girl bean = annotationConfigApplicationContext.getBean(Girl.class);
		Hero hero = new Hero(bean);
		System.out.println("person is "+bean);
		hero.savePerson();

	}
}
