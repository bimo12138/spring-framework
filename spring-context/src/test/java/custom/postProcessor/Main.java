package custom.postProcessor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("custom/processor.xml");
		SimpleComp bean = applicationContext.getBean(SimpleComp.class);
		System.out.println(bean);
	}
}
