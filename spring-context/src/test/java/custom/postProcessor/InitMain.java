package custom.postProcessor;

import org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitMain {

	// bean init = 或者 @PostConstract
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("custom/init.xml");
		InitEntity bean = applicationContext.getBean(InitEntity.class);
//		System.out.println(bean);
	}
}
