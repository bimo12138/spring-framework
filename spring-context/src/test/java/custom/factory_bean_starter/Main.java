package custom.factory_bean_starter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("custom/factory_test_properties.xml");
		Contract bean = context.getBean(Contract.class);
		System.out.println(bean);
	}
}
