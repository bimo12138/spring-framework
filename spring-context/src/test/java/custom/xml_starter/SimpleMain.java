package custom.xml_starter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("custom/test-properties.xml");
		int definitionCount = applicationContext.getBeanDefinitionCount();
		System.out.println(definitionCount);
	}
}
