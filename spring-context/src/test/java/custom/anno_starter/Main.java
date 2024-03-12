package custom.anno_starter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.refresh();
		int definitionCount = applicationContext.getBeanDefinitionCount();
		System.out.println(definitionCount);
	}
}
