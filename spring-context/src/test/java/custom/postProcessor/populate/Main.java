package custom.postProcessor.populate;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("custom/processor_populate.xml");
		User bean = applicationContext.getBean(User.class);
		System.out.println(bean);
	}
}
