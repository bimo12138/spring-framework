package custom.bd.reader.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProxySimple.class, Simple.class);
		ProxySimple simple = context.getBean(ProxySimple.class);
		System.out.println(simple.getTime());
	}
}
