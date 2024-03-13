package custom.bd.reader.xml.intf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class InterfaceLoader {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(SimpleService.class);
		applicationContext.refresh();
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanDefinitionNames));
//		InterfaceLoader bean = applicationContext.getBean(SimpleService.class);
//		System.out.println(bean);
	}
}
