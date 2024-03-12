package custom.xml_starter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("test-properties.xml");
		// 不需要 refresh
		//		applicationContext.refresh();
		int definitionCount = applicationContext.getBeanDefinitionCount();
		System.out.println(definitionCount);
	}


}
