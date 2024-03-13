package custom.bd.reader.xml;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Main {

	public static void main(String[] args) {
		BeanDefinitionRegistry beanDefinitionRegistry = new SimpleBeanDefinitionRegistry();
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
		xmlBeanDefinitionReader.loadBeanDefinitions("custom/test-abstract-beans.xml");
		int definitionCount = beanDefinitionRegistry.getBeanDefinitionCount();
		System.out.println(definitionCount);
	}
}
