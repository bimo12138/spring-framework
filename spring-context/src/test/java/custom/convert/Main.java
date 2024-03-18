package custom.convert;

import custom.convert.entity.ActualEntity;
import custom.convert.entity.RequestEntity;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RequestEntity.class);
//		context.registerBean(RequestEntity.class);
//		context.refresh();
		ActualEntity bean = context.getBean(ActualEntity.class);
		System.out.println(bean);
	}
}
