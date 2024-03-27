package custom.bd.reader.anno;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigBeanDefinitionParser;

public class Main {
	public static void main(String[] args) {
		BeanDefinitionRegistry beanDefinitionRegistry = new SimpleBeanDefinitionRegistry();
		AnnotatedBeanDefinitionReader reader = new AnnotatedBeanDefinitionReader(beanDefinitionRegistry);
		reader.register(Simple.class);
		BeanDefinition beanDefinition = beanDefinitionRegistry.getBeanDefinition("simple");
		System.out.println(beanDefinition);
	}
}
