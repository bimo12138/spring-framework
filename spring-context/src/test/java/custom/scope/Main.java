package custom.scope;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("custom/scope_demo.xml");
		CustomScopeConfigurer customScopeConfigurer = new CustomScopeConfigurer();
		customScopeConfigurer.addScope("customScope", new CustomScope());
		context.addBeanFactoryPostProcessor(customScopeConfigurer);
		Object bean = context.getBean("scopeReq");
		System.out.println(bean);
//		Object bean1 = context.getBean("scopeReq");
//		System.out.println(bean1);
//		Object bean2 = context.getBean("scopeReq");
//		System.out.println(bean2);
//		Object bean3 = context.getBean("scopeReq");
//		System.out.println(bean3);
//		Object bean4 = context.getBean("scopeReq");
//		System.out.println(bean3);

//		context.getBean("")
	}
}
