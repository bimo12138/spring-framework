package custom.bd.reader.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProxyExampleMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProxySimple.class, Simple.class, ProxyService.class);
		ProxyService bean = context.getBean(ProxyService.class);
		System.out.println(bean.getProxyName());
	}

}
