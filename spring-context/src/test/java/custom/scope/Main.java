package custom.scope;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("custom/scope_demo.xml");
		Object bean = context.getBean("diffScope");
		System.out.println(bean);
		Object bean1 = context.getBean("diffScope");
		System.out.println(bean1);
		Object bean2 = context.getBean("diffScope");
		System.out.println(bean2);
		Object bean3 = context.getBean("diffScope");
		System.out.println(bean3);
		Object bean4 = context.getBean("diffScope");
		System.out.println(bean4);
	}
}
