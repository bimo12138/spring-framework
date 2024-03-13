package custom.parent;

import custom.xml_starter.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryStarter {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("custom/test-properties.xml");
		applicationContext.setParent(xmlApplicationContext);
		applicationContext.refresh();
		Object simpleUser = applicationContext.getBean("simpleUser");
		if (simpleUser instanceof User) {
			System.out.println(simpleUser);
		}
	}
}
