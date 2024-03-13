package custom.anno_starter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("custom.anno_starter");
//		applicationContext.refresh();
		int definitionCount = applicationContext.getBeanDefinitionCount();
		System.out.println(definitionCount);
		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
	}
}
